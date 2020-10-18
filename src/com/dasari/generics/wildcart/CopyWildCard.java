package com.dasari.generics.wildcart;

import java.util.Collections;
import java.util.List;

public class CopyWildCard {

	public static void main(String[] args) {
		
	}

	
	public <T> void copyData(List<? super T> desination,List<? extends T> source) {
		desination.addAll(source);
		Collections.copy(desination, source);
	}
}
