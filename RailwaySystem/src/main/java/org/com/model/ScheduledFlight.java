package org.com.model;
import javax.persistence.*;

public class ScheduledFlight {
private Train flight;
private int availableSeats;
private Schedule schedule;
public Train getFlight() {
	return flight;
}
public void setFlight(Train flight) {
	this.flight = flight;
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
}
