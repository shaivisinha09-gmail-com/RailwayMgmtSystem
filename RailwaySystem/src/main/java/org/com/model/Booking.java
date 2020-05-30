package org.com.model;

import java.math.BigInteger;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
@Entity
public class Booking {
@Id
private BigInteger bookingId;
@ManyToOne
private User userId;
private Date bookingDate;
@OneToMany(mappedBy="booking")
private List<Passenger> passengerList;
private double ticketCost;
@OneToOne
private Train train;
private int noOfPassengers;
public BigInteger getBookingId() {
	return bookingId;
}
public void setBookingId(BigInteger bookingId) {
	this.bookingId = bookingId;
}
public Date getBookingDate() {
	return bookingDate;
}
public void setBookingDate(Date bookingDate) {
	this.bookingDate = bookingDate;
}
public double getTicketCost() {
	return ticketCost;
}
public void setTicketCost(double ticketCost) {
	this.ticketCost = ticketCost;
}
public int getNoOfPassengers() {
	return noOfPassengers;
}
public void setNoOfPassengers(int noOfPassengers) {
	this.noOfPassengers = noOfPassengers;
}
public List<Passenger> getPassengerList() {
	return passengerList;
}
public void setPassengerList(List<Passenger> passengerList) {
	this.passengerList = passengerList;
}
public Train getTrain() {
	return train;
}
public void setTrain(Train train) {
	this.train = train;
}
}