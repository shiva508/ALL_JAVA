package com.dasari.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Java8Comparator {

public static void  compareTheList(List<String> names) {
	Collections.sort(names,(name1,name2)->name1.compareTo(name2));
}
	public static void main(String[] args) {
		List<String> names1 = new ArrayList<String>();
	      names1.add("Mahesh ");
	      names1.add("Suresh ");
	      names1.add("Ramesh ");
	      names1.add("Naresh ");
	      names1.add("Kalpesh ");
			
	      List<String> names2 = new ArrayList<String>();
	      names2.add("Mahesh ");
	      names2.add("Suresh ");
	      names2.add("Ramesh ");
	      names2.add("Naresh ");
	      names2.add("Kalpesh ");
	      System.out.println(names2);
	      compareTheList(names2);
	      System.out.println(names2);
	      
	}
}
