package com.dasari.oops.clone;

import java.util.HashMap;
import java.util.Map;

public class CloningSimulator {
	public static void main(String[] args) throws CloneNotSupportedException {
		Images images=new Images();
		Map<String, String> props=new HashMap<>();
		props.put("Size","508MB");
		props.put("Format","jpg");
		images.setImageId(408)
			  .setImageName("Nithya.jpg")
		      .setImageProps(props);
		
		Images cloneImages=(Images) images.clone();
		System.out.println("Object Equality:"+(images==cloneImages));
		System.out.println("Props Equality:");
		System.out.println("ImageId:"+(images.getImageId()==cloneImages.getImageId()));
		System.out.println("ImageName:"+(images.getImageName().equals(cloneImages.getImageName())));
		
		//
		images.getImageProps().put("Lcation", "India");
		System.out.println(cloneImages.getImageProps());
		
		//Changing name
		images.setImageName("Nithya Name");
		System.out.println(cloneImages.getImageName());
		
	}
}
