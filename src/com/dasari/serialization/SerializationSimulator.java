package com.dasari.serialization;

import java.io.Serializable;

public class SerializationSimulator{
	public static void main(String[] args) {
		Tour tour=new Tour().setTourId(504).setDestinationName("Nagol");
		SerializationProcessFactory factory=new SerializationProcessFactory<>();
		factory.processSeriallization(tour);
		
		Guide guide=new Guide().setGuideId(508).setGuideName("Shiva");
		factory.processSeriallization(guide);
		
		DeserializationProcessFactory<Tour> deserializationTour=new DeserializationProcessFactory<>();
		Tour oh=deserializationTour.processDeserialization(Tour.class.getName()+".ser");
		System.out.println(oh.getDestinationName());
		
		DeserializationProcessFactory<Guide> deserializationProcessFactory=new DeserializationProcessFactory<>();
		Guide guideDeserialization=deserializationProcessFactory.processDeserialization(Guide.class.getName()+".ser");
		System.out.println(guideDeserialization.getGuideName());
	}
	
	
}
