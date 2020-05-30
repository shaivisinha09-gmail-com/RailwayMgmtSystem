package org.com.model;

//@Entity
public class Schedule {


public Schedule(Station sourceStation, Station destinationStation, DateTime arivalTime, DateTime departureTime) {
		super();
		this.sourceStation = sourceStation;
		this.destinationStation = destinationStation;
		this.arivalTime = arivalTime;
		this.departureTime = departureTime;
	}
private Station sourceStation;
private Station destinationStation;
private DateTime arivalTime;
private DateTime departureTime;
public Station getSourceStation() {
	return sourceStation;
}
public void setSourceStation(Station sourceStation) {
	this.sourceStation = sourceStation;
}
public Station getDestinationStation() {
	return destinationStation;
}
public void setDestinationStation(Station destinationStation) {
	this.destinationStation = destinationStation;
}
public DateTime getArivalTime() {
	return arivalTime;
}
public void setArivalTime(DateTime arivalTime) {
	this.arivalTime = arivalTime;
}
public DateTime getDepartureTime() {
	return departureTime;
}
public void setDepartureTime(DateTime departureTime) {
	this.departureTime = departureTime;
}
}