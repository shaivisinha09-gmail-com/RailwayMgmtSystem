package org.com.model;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Station {
public Station(String stationCode, String stationName, String stationLocation) {
		super();
		this.stationCode = stationCode;
		this.stationName = stationName;
		this.stationLocation = stationLocation;
	}
public Station()
{
}
@Id
private String stationCode;
private String stationName;
private String stationLocation;
public String getStationCode() {
	return stationCode;
}
public void setStationCode(String stationCode) {
	this.stationCode = stationCode;
}
public String getStationName() {
	return stationName;
}
public void setStationName(String stationName) {
	this.stationName = stationName;
}
public String getStationLocation() {
	return stationLocation;
}
public void setStationLocation(String stationLocation) {
	this.stationLocation = stationLocation;
}
}