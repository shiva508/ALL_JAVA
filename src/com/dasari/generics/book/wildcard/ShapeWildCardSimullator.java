package com.dasari.generics.book.wildcard;

import java.util.Collection;

public class ShapeWildCardSimullator {
	public static void main(String[] args) {

	}

	public static Double totalArea(Shape[] shapeArray) {
		Double totalArea = 0.0;
		for (Shape shap : shapeArray) {
			totalArea+=shap.getShapeArea();
		}

		return totalArea;
	}
	public static Double totalAreaDoesNotWork(Collection<Shape> shapeCollection) {//dose not work 
		Double totalArea = 0.0;
		for (Shape shap : shapeCollection) {
			totalArea+=shap.getShapeArea();
		}

		return totalArea;
	}
	
	public static Double totalArea(Collection<? extends Shape> shapeCollection) {
		Double totalArea = 0.0;
		for (Shape shap : shapeCollection) {
			totalArea+=shap.getShapeArea();
		}

		return totalArea;
	}
	
	public static <T> Double totalAreaWildCard(Collection<? extends T> shapeCollection) {
		Double totalArea = 0.0;
		for (T shap : shapeCollection) {
			if(shap instanceof Shape) {
				
			}
		}
		return totalArea;
	}
	
}
