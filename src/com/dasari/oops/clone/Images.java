package com.dasari.oops.clone;

import java.util.Map;

public class Images implements Cloneable {
	private int imageId;
	private String imageName;
	private Map<String, String> imageProps;

	public int getImageId() {
		return imageId;
	}

	public Images setImageId(int imageId) {
		this.imageId = imageId;
		return this;
	}

	public String getImageName() {
		return imageName;
	}

	public Images setImageName(String imageName) {
		this.imageName = imageName;
		return this;
	}

	public Map<String, String> getImageProps() {
		return imageProps;
	}

	public Images setImageProps(Map<String, String> imageProps) {
		this.imageProps = imageProps;
		return this;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
