package com.dasari.oops.clone;

import java.util.HashMap;
import java.util.Map;

public class ImagesDeepClone implements Cloneable {
	private int imageId;
	private String imageName;
	private Map<String, String> imageProps;

	public int getImageId() {
		return imageId;
	}

	public ImagesDeepClone setImageId(int imageId) {
		this.imageId = imageId;
		return this;
	}

	public String getImageName() {
		return imageName;
	}

	public ImagesDeepClone setImageName(String imageName) {
		this.imageName = imageName;
		return this;
	}

	public Map<String, String> getImageProps() {
		return imageProps;
	}

	public ImagesDeepClone setImageProps(Map<String, String> imageProps) {
		this.imageProps = imageProps;
		return this;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Object imageObject = super.clone();
		ImagesDeepClone  clone=(ImagesDeepClone) imageObject;
		clone.setImageProps(null);
		Map<String, String> hashMap=new HashMap<>();
		
		clone.setImageProps(this.imageProps);
		return super.clone();
	}
}
