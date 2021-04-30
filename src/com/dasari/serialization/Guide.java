package com.dasari.serialization;

import java.io.Serializable;

public class Guide implements Serializable{
	private Integer guideId;
	private String guideName;

	public Guide() {

	}

	public Integer getGuideId() {
		return guideId;
	}

	public Guide setGuideId(Integer guideId) {
		this.guideId = guideId;
		return this;
	}

	public String getGuideName() {
		return guideName;
	}

	public Guide setGuideName(String guideName) {
		this.guideName = guideName;
		return this;
	}

}
