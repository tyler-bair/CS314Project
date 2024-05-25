import React, { useState } from "react";
import { Button, Modal, ModalHeader, Input, Container } from "reactstrap";
import { placeToLatLng, latLngToText} from "../utils/transformers";

export default function SaveAs(props) {
    const [disallowLoad, setDisallowLoad] = useState(true);
    const [showValidityIcon, setShowValidityIcon] = useState(false);

    const [modal, setModal] = useState(false);
    const toggle = () => setModal(!modal);

    return (
        <div>
            <Button onClick={toggle} color='primary'>
                Save As
            </Button>
            <Modal isOpen={modal} toggle={toggle}>
                <SaveAsHeader/>
                <FileSavingApp
                    disallowLoad={disallowLoad}
                    setDisallowLoad={setDisallowLoad}
                    showValidityIcon={showValidityIcon}
                    setShowValidityIcon={setShowValidityIcon}
                    places={props.places}
                />
            </Modal>
        </div>
    );
}

function SaveAsHeader() {
    return (
        <ModalHeader className="ml-2">
            Save Trip As
        </ModalHeader>
    );
}

function FileSavingApp(props) {
    const [tripName, setTripName] = useState(null);
    function getData(val) { setTripName(val.target.value) }
    return (
        <Container places={props.places}>
            <div id="root"></div>
            <Input
                type="text"
                onChange={getData}
                placeholder = "Save File As"
                data-testid = "file-name-input"/>
            <div className="btn-group" places={props.places}>
                <Button places={props.places} color="primary" onClick={() => handleSave(props, "JSON", tripName)} >
                    JSON
                </Button>
                <Button places={props.places} color="primary" onClick={() => handleSave(props, "CSV", tripName)} >
                    CSV
                </Button>
                <Button places={props.places} color="primary" onClick={() => handleSave(props, "SVG", tripName)} >
                    SVG
                </Button>
                <Button places={props.places} color="primary" onClick={() => handleSave(props, "KML", tripName)} >
                    KML
                </Button> </div> </Container>
    );
}

function handleSave(props, type, tripName) {
    const MIME_TYPE = { JSON: "application/json", CSV: "text/csv", SVG: "image/svg+xml", KML: "applicaton/vnd.google-earth.kml+xml" }

    const fileName = tripName.replace(/ /g, "_").toLowerCase();
    switch (type) {
        case "CSV":
            const tripCSV = buildTripCSV(props.places);
            downloadFile(fileName + ".csv", MIME_TYPE.CSV, tripCSV)
            break
        case "SVG":
            const tripSVG = SVGAndKMLBuild(props.places, "SVG");
            downloadFile(fileName + ".svg", MIME_TYPE.SVG, tripSVG);
            break
        case "KML":
            const tripKML = SVGAndKMLBuild(props.places, "KML");
            downloadFile(fileName + ".kml", MIME_TYPE.KML, tripKML);
            break
        default:
            const tripJSON = buildTripJSON(props.places);
            downloadFile(fileName + ".json", MIME_TYPE.JSON, tripJSON);
    }
}

function downloadFile(fileNameWithExtension, mimeType, fileText) {
    const file = new Blob([fileText], { type: mimeType});
    const link = document.createElement("a");
    const url = URL.createObjectURL(file);
    link.href = url;
    link.download = fileNameWithExtension;
    document.body.appendChild(link);
    link.click();
    setTimeout(function() {
        document.body.removeChild(link);
        window.URL.revokeObjectURL(url);
    }, 0);
}

function buildTripJSON(places) {
    const tripJSON = {places:places};
    return JSON.stringify(tripJSON, null, 2);
}

function buildTripCSV(places) {
    const csvRows = [];
    const csvHeaders = Object.keys(places[0]);

    csvRows.push(csvHeaders.join(','));
    for(const row of places) {
        const trips = csvHeaders.map(header => {
            const trip = row[header]
            return `"${trip}"`;
        });
        csvRows.push(trips.join(','));
    }
    return csvRows.join('\n');
}

function SVGAndKMLBuild(places, fileType) {
    let temp = "";
    let outputSVG = "";
    let outputKML = "";
    let start = latLngToText(placeToLatLng(places[0]), 3, fileType);
    for(let i = 1; i < places.length; i++){
        temp += latLngToText(placeToLatLng(places[i]), 3, fileType);
    }
    switch(fileType) {
        case "SVG":
            outputSVG = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<svg xmlns=\"http://www.w3.org/2000/svg\" width=\"1440\" height=\"720\" viewBox=\"-180 -90 360 180\">\n<image href=\n\"https://instructor-uploaded-content.s3.amazonaws.com/MAP.svg-6983777\" x=\"-180\" y=\"-90\" height=\"180\" width=\"360\" />\n<g transform=\"scale(1,-1)\">\n<polyline points=\"" + start + temp + start +" \"\nstyle=\"fill:none; stroke:rgb(215, 42, 40); stroke-width:0.4\"/>\n</g>\n</svg>"
            return outputSVG
        case "KML":
            temp += start;
            temp = temp.substring(0, temp.length - 1);
            outputKML = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<kml xmlns=\"http://www.opengis.net/kml/2.2\" xmlns:gx=\"http://www.google.com/kml/ext/2.2\" xmlns:kml=\"http://www.opengis.net/kml/2.2\" xmlns:atom=\"http://www.w3.org/2005/Atom\">\n<Document>\n<name>Single Simple Line</name>\n<open>1</open>\n<description>Just a single blue line across Colorado</description>\n<Style id=\"CrossStyle\">\n<LineStyle>\n<color>ffffffb6</color>\n<width>4</width>\n</LineStyle>\n</Style>\n<Placemark>\n<name>Cross-corner line</name>\n<styleUrl>#CrossStyle</styleUrl>\n<LineString><coordinates> " + start + temp + " </coordinates>\n</LineString>\n</Placemark>\n</Document>\n</kml>"
            return outputKML;
        default:
            break;
    }
}