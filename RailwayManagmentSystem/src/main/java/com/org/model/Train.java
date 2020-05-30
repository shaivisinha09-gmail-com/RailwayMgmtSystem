package com.org.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Train{
	@Id
	private long trainNumber;
	private String carrierName;
	private String trainModel;
	private int seatCapacity;
	public long getTrainNumber() {
		return trainNumber;
	}
	public void setTrainNumber(long trainNumber) {
		this.trainNumber = trainNumber;
	}
	public String getCarrierName() {
		return carrierName;
	}
	public void setCarrierName(String carrierName) {
		this.carrierName = carrierName;
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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((carrierName == null) ? 0 : carrierName.hashCode());
		result = prime * result + seatCapacity;
		result = prime * result + ((trainModel == null) ? 0 : trainModel.hashCode());
		result = prime * result + (int) (trainNumber ^ (trainNumber >>> 32));
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
		Train other = (Train) obj;
		if (carrierName == null) {
			if (other.carrierName != null)
				return false;
		} else if (!carrierName.equals(other.carrierName))
			return false;
		if (seatCapacity != other.seatCapacity)
			return false;
		if (trainModel == null) {
			if (other.trainModel != null)
				return false;
		} else if (!trainModel.equals(other.trainModel))
			return false;
		if (trainNumber != other.trainNumber)
			return false;
		return true;
	}
	
	
}
