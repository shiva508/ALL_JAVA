package com.dasari.string.stringtokenizer;

import java.util.StringTokenizer;

public class StringTokenizerSimullator {
	public static void main(String[] args) {
		StringTokenizer stringTokenizer = new StringTokenizer("s;", ",;", false);
		while (stringTokenizer.hasMoreElements()) {
			String object = (String) stringTokenizer.nextElement();
			System.out.println(object);

		}

	}
}
