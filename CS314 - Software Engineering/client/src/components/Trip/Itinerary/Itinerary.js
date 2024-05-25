import React from 'react';
import { useToggle } from '../../../hooks/useToggle';
import { Table, Collapse } from 'reactstrap';
import { latLngToText, placeToLatLng } from '../../../utils/transformers';
import { BsChevronDown } from 'react-icons/bs';
import PlaceActions from './PlaceActions';
import { useDistances } from '../../../hooks/useDistances';
import { getOriginalServerUrl } from '../../../utils/restfulAPI';
import { EARTH_RADIUS_UNITS_DEFAULT } from '../../../utils/constants';
import SaveAs from '../../SaveAs';

export default function Itinerary(props) {
	const [showFind, toggleFind] = useToggle(false);
	const serverURL = getOriginalServerUrl();
	const earthRadius = EARTH_RADIUS_UNITS_DEFAULT;
	const { distances } = useDistances(props.places, earthRadius, serverURL);
	const [showSaveAs, toggleSaveAs] = useToggle(false);

	
	return (
		<Table responsive>
			<TripHeader
				tripName={props.tripName}
				showFind={showFind}
				toggleFind={toggleFind}
				showSaveAs={showSaveAs}
				toggleSaveAs={toggleSaveAs}
				places={props.places}
			/>
			<PlaceList
				places={props.places}
				placeActions={props.placeActions}
				selectedIndex={props.selectedIndex}
				distances={props.distances}
				leg={props.leg}
				cumulative={distances.cumulative}
				total={distances.total}
			/>
		</Table>
	);
}



export function TripHeader(props) {
	return (		
		<thead>
			<tr>
				<th
					className='trip-header-title'
					data-testid='trip-header-title'
				>
					{props.tripName}
					<div className='hover-text'><img src="https://www.thesslstore.com/blog/wp-content/uploads/2017/05/circle-with-i-1.png" width="15" length="3"></img>
                        <span className='tooltip-text' id='fade'>Click a location on the map to add a destination to the trip.</span>
                    </div>
					{" "}
					<SaveAs
						isOpen={props.showSaveAs}
						toggleSaveAs={props.toggleSaveAs}
						places={props.places}
					/>
				</th>
				<th>
					Cumulative
				</th>
				<th>
					Miles
				</th>
				<th></th>
			</tr>
		</thead>
	);
}

function PlaceList(props) {
	return (
		<tbody>
			{props.places.map((place, index) => (
				<PlaceRow
					key={`table-${JSON.stringify(place)}-${index}`}
					place={place}
					placeActions={props.placeActions}
					selectedIndex={props.selectedIndex}
					index={index}
					distances={props.distances}
					leg={props.leg}
					cumulative={props.cumulative}
					total={props.total}
					distanceActions={props.distanceActions}
				/>
			))}
			<tr align="right"><td>Total Distance: {props.total}</td></tr>
		</tbody>
	);
}

function PlaceRow(props) {
	const [showFullName, toggleShowFullName] = useToggle(false);
	const name = props.place.defaultDisplayName;
	const location = latLngToText(placeToLatLng(props.place));
	return (
		<tr className={props.selectedIndex === props.index ? 'selected-row' : ''}>
			<td
				data-testid={`place-row-${props.index}`}
				onClick={() =>
					placeRowClicked(
						toggleShowFullName,
						props.placeActions.selectIndex,
						props.index
					)
				}
			>
				<strong>{name}</strong>
				<AdditionalPlaceInfo showFullName={showFullName} location={location} placeActions={props.placeActions} index={props.index} place={props.place}/>
			</td>
			<td>{props.cumulative[props.index]}</td>
			<td>{props.distances.leg[props.index]}</td>
			<RowArrow toggleShowFullName={toggleShowFullName} index={props.index}/>
		</tr>
	);
}

function AdditionalPlaceInfo(props) {
	return (
		<Collapse isOpen={props.showFullName}>
			{props.place.formatPlace().replace(`${props.place.defaultDisplayName}, `, '')}
			<br />
			{props.location}
			<br />
			<PlaceActions placeActions={props.placeActions} index={props.index} />
		</Collapse>
	);
}

function placeRowClicked(toggleShowFullName, selectIndex, placeIndex) {
	toggleShowFullName();
	selectIndex(placeIndex);
}

function RowArrow(props) {
	return (
		<td>
			<BsChevronDown data-testid={`place-row-toggle-${props.index}`} onClick={props.toggleShowFullName}/>
		</td>
	);
}
