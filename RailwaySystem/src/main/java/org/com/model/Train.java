package org.com.model;

import java.math.BigInteger;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Train {
public Train(BigInteger trainNumber, String trainName, String trainModel, int seatCapacity) {
		super();
		this.trainNumber = trainNumber;
		this.trainName = trainName;
		this.trainModel = trainModel;
		this.seatCapacity = seatCapacity;
	}
public Train()
{
	
}
@Id
private BigInteger trainNumber;
private String trainName;
private String trainModel;
private int seatCapacity;
public BigInteger getTrainNumber() {
	return trainNumber;
}
public void setTrainNumber(BigInteger trainNumber) {
	this.trainNumber = trainNumber;
}
public String getTrainName() {
	return trainName;
}
public void setTrainName(String trainName) {
	this.trainName = trainName;
}
public String getTrainModel() {
	return trainModel;
}
public void setTrainModel(String trainModel) {
	this.trainModel = trainModel;
}
public int getSeatCapacity() {
	return seatCapacity;
}
public void setSeatCapacity(int seatCapacity) {
	this.seatCapacity = seatCapacity;
}
}