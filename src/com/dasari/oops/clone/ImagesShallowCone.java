package com.dasari.oops.clone;

import java.util.Map;

public class ImagesShallowCone implements Cloneable {
	private int imageId;
	private String imageName;
	private Map<String, String> imageProps;

	public int getImageId() {
		return imageId;
	}

	public ImagesShallowCone setImageId(int imageId) {
		this.imageId = imageId;
		return this;
	}

	public String getImageName() {
		return imageName;
	}

	public ImagesShallowCone setImageName(String imageName) {
		this.imageName = imageName;
		return this;
	}

	public Map<String, String> getImageProps() {
		return imageProps;
	}

	public ImagesShallowCone setImageProps(Map<String, String> imageProps) {
		this.imageProps = imageProps;
		return this;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		ImagesShallowCone cone = new ImagesShallowCone();
		cone.setImageId(this.imageId).setImageName(this.imageName).setImageProps(this.imageProps);
		return cone;
	}

}
