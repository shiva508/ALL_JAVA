package com.dasari.generics;

import java.util.ArrayList;
import java.util.List;

public class NimberList {

	public static void main(String[] args) {
		
		List<Integer> integerList=display(new Integer[] {1,3,4});
		System.out.println(integerList);
		List<String> stringList=display(new String[] {"Shiva","Dasari"});
		System.out.println(stringList);
		List<Number> nums = new ArrayList<Number>();
		nums.add(2);
		nums.add(3.14);
		assert nums.toString().equals("[2, 3.14]");
	}

	public static<T> List<T> display(T[] datalist){
		List<T> list=new ArrayList<>();
		for (T t : datalist) {
			if(t instanceof String) {
				System.out.println("String ");
			}
			if(t instanceof Integer) {
				System.out.println("Integer");	
			}
			list.add(t);
		}
		return list;
		
	}
	
	public <T> List<T>  displaySorting(T ...varargs){
		List<T> list=new ArrayList<>();
		for (T t : varargs) {
			if(t instanceof String) {
				System.out.println("String ");
			}
			if(t instanceof Integer) {
				System.out.println("Integer");	
			}
			list.add(t);
		}
		return list;
	}
}
