package com.dasari.util.tokenizer;

import java.util.StringTokenizer;

public class StringTokenizerEx1 {

	public static void main(String[] args) {
		String data="apple ball cat dog";
		StringTokenizer st=new StringTokenizer(data, " ");
		System.out.println();
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}

	}

}
