package com.dasari.featurs8.BIFUNCTION;

public class StudentPoolLocater {
	private String latitude;
	private String longitude;

	public StudentPoolLocater(String latitude, String longitude) {
		super();
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	@Override
	public String toString() {
		return "StudentPoolLocater [latitude=" + latitude + ", longitude=" + longitude + "]";
	}

}
