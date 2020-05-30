package com.org.model;

import java.io.Serializable;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class ScheduledTrain implements Serializable{
@OneToOne
private Train train;
private int availableSeats;
@Id
@OneToOne
private Schedule schedule;
public Train getTrain() {
	return train;
}
public void setTrain(Train train) {
	this.train = train;
}
public int getAvailableSeats() {
	return availableSeats;
}
public void setAvailableSeats(int availableSeats) {
	this.availableSeats = availableSeats;
}
public Schedule getSchedule() {
	return schedule;
}
public void setSchedule(Schedule schedule) {
	this.schedule = schedule;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + availableSeats;
	result = prime * result + ((schedule == null) ? 0 : schedule.hashCode());
	result = prime * result + ((train == null) ? 0 : train.hashCode());
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
	ScheduledTrain other = (ScheduledTrain) obj;
	if (availableSeats != other.availableSeats)
		return false;
	if (schedule == null) {
		if (other.schedule != null)
			return false;
	} else if (!schedule.equals(other.schedule))
		return false;
	if (train == null) {
		if (other.train != null)
			return false;
	} else if (!train.equals(other.train))
		return false;
	return true;
}


}
