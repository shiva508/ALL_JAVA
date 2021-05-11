package com.dasari.string.reversestringrecursive;

public class StringReverseExample {

	public static void main(String[] args) {
		String string=new String("Shive");
		String buffer=new StringBuffer(string).reverse().toString();
		System.out.println(buffer);
		reverString("shiva");
		System.out.println(reverseRecursively("sh"));
		
	}

	private static String reverseRecursively(String string) {
		if (string.length() < 2) {
            return string;
        }

        return reverseRecursively(string.substring(1)) + string.charAt(0);
	}

	private static void reverString(String string) {
		char [] charString=string.toCharArray();
		StringBuffer buffer=new StringBuffer();
		for(int i=string.length()-1;i>=0; i--) {
			buffer.append(charString[i]);
		}
		System.out.println(buffer.toString());
	}

}
