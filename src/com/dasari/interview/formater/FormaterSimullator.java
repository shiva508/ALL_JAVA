package com.dasari.interview.formater;

public class FormaterSimullator {
	public static void main(String[] args) {
		double data = 2.15552381;
		System.out.println(processTest(data));
	}

	public static String processTest(double data) {
		System.out.println(data);
		String result = "0.0";
		String dataModified = "";
		String textFormated = String.valueOf(data);
		System.out.println(textFormated);
		String textArray[] = textFormated.split("\\.");
		if (textArray.length > 1) {
			if (textArray[1].length() >= 3) {
				char initialPlaceHolder = textArray[1].charAt(0);
				char firstPlaceholder = textArray[1].charAt(1);
				char secondPlaceHolder = textArray[1].charAt(2);
				if (Integer.parseInt(new String(new char[] { firstPlaceholder })) >= 5
						&& Integer.parseInt(new String(new char[] { secondPlaceHolder })) >= 5) {
					int firstModified = Integer.parseInt(new String(new char[] { firstPlaceholder }));
					firstModified = firstModified + 1;
					dataModified = textArray[0] + "." + initialPlaceHolder + firstModified + "0";
					result = dataModified;
				} else if (Integer.parseInt(new String(new char[] { firstPlaceholder })) < 5) {
					result = textArray[0] + "." + initialPlaceHolder + firstPlaceholder + secondPlaceHolder;
				}
			} else {
				result = String.valueOf(data);
			}
		} else {
			result = String.valueOf(data);
		}

		return result;
	}

}
