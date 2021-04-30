package com.dasari.serialization;

import java.io.Serializable;

public class Tour implements Serializable {
	private Integer tourId;
	private String destinationName;
	public Tour() {
		
	}
	public Integer getTourId() {
		return tourId;
	}
	public Tour setTourId(Integer tourId) {
		this.tourId = tourId;
		return this;
	}
	public String getDestinationName() {
		return destinationName;
	}
	public Tour setDestinationName(String destinationName) {
		this.destinationName = destinationName;
		return this;
	}

}
