package com.org.model;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Schedule{
	@Id
	private int scheduleId;
	@OneToOne
	private Station sourceStation;
	@OneToOne
	private Station destinationStation;
	private DateTime arrivalTime;
	private DateTime departureTime;
	public int getScheduleId() {
		return scheduleId;
	}
	public void setScheduleId(int scheduleId) {
		this.scheduleId = scheduleId;
	}
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
	public DateTime getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(DateTime arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public DateTime getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(DateTime departureTime) {
		this.departureTime = departureTime;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((arrivalTime == null) ? 0 : arrivalTime.hashCode());
		result = prime * result + ((departureTime == null) ? 0 : departureTime.hashCode());
		result = prime * result + ((destinationStation == null) ? 0 : destinationStation.hashCode());
		result = prime * result + scheduleId;
		result = prime * result + ((sourceStation == null) ? 0 : sourceStation.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Schedule other = (Schedule) obj;
		if (arrivalTime == null) {
			if (other.arrivalTime != null)
				return false;
		} else if (!arrivalTime.equals(other.arrivalTime))
			return false;
		if (departureTime == null) {
			if (other.departureTime != null)
				return false;
		} else if (!departureTime.equals(other.departureTime))
			return false;
		if (destinationStation == null) {
			if (other.destinationStation != null)
				return false;
		} else if (!destinationStation.equals(other.destinationStation))
			return false;
		if (scheduleId != other.scheduleId)
			return false;
		if (sourceStation == null) {
			if (other.sourceStation != null)
				return false;
		} else if (!sourceStation.equals(other.sourceStation))
			return false;
		return true;
	}
	
	
}
