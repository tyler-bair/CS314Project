import React, { useEffect, useState } from 'react';
import {
	Button,
	Col,
	Modal,
	ModalBody,
	ModalHeader,
	Input,
	Collapse,
	ModalFooter,
} from 'reactstrap';
import Coordinates from 'coordinate-parser';
import { reverseGeocode } from '../../utils/reverseGeocode';
import useFind from "../../hooks/useFind";
import { IconBase } from 'react-icons/lib';
import { FaPlus } from 'react-icons/fa';

export default function AddPlace(props) {
	const [foundPlace, setFoundPlace] = useState();
	const [coordString, setCoordString] = useState('');
	const [inputString, setInputString] = useState('');
	const [foundPlaces, setFoundPlaces] = useState([]);
	
	return (
		<Modal isOpen={props.isOpen} toggle={props.toggleAddPlace}>
			<AddPlaceHeader toggleAddPlace={props.toggleAddPlace} />
			<PlaceSearch
				foundPlace={foundPlace}
				setFoundPlace={setFoundPlace}
				foundPlaces={foundPlaces}
				setFoundPlaces={setFoundPlaces}
				inputString={inputString}
				setInputString={setInputString}
				coordString={coordString}
				setCoordString={setCoordString}
				append={props.append}
			/>
			<StringSearch 
				foundPlaces={foundPlaces}
				setFoundPlaces={setFoundPlaces}
				inputString={inputString}
				setInputString={setInputString}
				append={props.append}
			/>
		</Modal>
	);
}

function AddPlaceHeader(props) {
	return (
		<ModalHeader className='ml-2' toggle={props.toggleAddPlace}>
			Add a Place
		</ModalHeader>
	);
}

function PlaceSearch(props) {
	
	useEffect(() => {
		verifyCoordinates(props.coordString, props.setFoundPlace);
	}, [props.coordString]);

	function handleChange(e){
		props.setCoordString(e.target.value)
	}
	return (
		<ModalBody>
			<Col>
				By coordinates:
				<Input
					onChange={(input)=> handleChange(input)}
					placeholder='Enter Coordinates'
					data-testid='coord-input'
					value={props.coordString}
				/>
				<CoordSearchDropdown 
					foundPlace={props.foundPlace}
					append={props.append}
					setCoordString={props.setCoordString}
				/>
			</Col>

		</ModalBody>
	);
}

function CoordSearchDropdown(props) {
	return (
		<Collapse isOpen={!!props.foundPlace}>
			<br />
			{props.foundPlace?.formatPlace()}
			<Button
				color='primary'
				onClick={() => {
					props.append(props.foundPlace);
					props.setCoordString('');
				}}
				data-testid='add-place-button'
				disabled={!props.foundPlace}
			>
				Add Place
			</Button>
		</Collapse>
	);
}

function StringSearch(props) {
	const { find } = useFind(props.inputString);

	return(
		<ModalBody>
			<Col>
			By name:
				<Input 
					onChange={(input)=> props.setInputString(input.target.value)}
					placeholder = 'Enter Destination'
					data-testid='string-input'
					value={props.inputString}
				/>
				<PlaceInfo 
					foundPlaces={find} 
					inputString={props.inputString}
					append={props.append}	
				/>
			</Col>
		</ModalBody>
	);
}

function PlaceInfo(props) {
	return (
		<ModalBody>
			<Collapse isOpen={props.inputString.length >= 3} data-testid='render-found-places'>
				{props.foundPlaces.findPlaces.map(place => (
					<PlaceSelector 
						place={place}
						inputString={props.inputString}
						append={props.append}
					/>
				))}
			</Collapse>
		</ModalBody>
		
	);
}

function PlaceSelector(props) {
	const [selected, toggleSelected] = useState(true);
	
	return (
			<ul>
				<li style={{display: 'flex', justifyContent: 'flex-start'}}>
					<div>					
					<Button
						color='primary'
						data-testid='select-place-button'
						onClick={() => {
							props.append(props.place);
							toggleSelected();
						}}
						disabled={!selected}
					>
					<FaPlus />
					</Button>
					</div>
					<div>{props.place.name}</div>
				</li>
			</ul>
	)
}

async function verifyCoordinates(inputString, setFoundPlace) {
	try {
		const latLngPlace = new Coordinates(inputString);
		const lat = latLngPlace.getLatitude();
		const lng = latLngPlace.getLongitude();
		if (isLatLngValid(lat,lng)) {
			const fullPlace = await reverseGeocode({ lat, lng });
			setFoundPlace(fullPlace);
		}
	} catch (error) {
		
		setFoundPlace(undefined);
	}
}


function isLatLngValid(lat,lng) {
	return (lat !== undefined && lng !== undefined);
}
