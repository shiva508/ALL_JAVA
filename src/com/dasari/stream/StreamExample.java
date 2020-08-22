package com.dasari.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.IntStream;

public class StreamExample {
	public static void main(String[] args) {
		//findMinNumberBeforeJava8();
		//findMinNumberWithJava8();
		find3DistinctsmalletNumbersBeforeJava8();
		find3DistinctsmalletNumbersWithJava8();

	}

	public static void find3DistinctsmalletNumbersBeforeJava8() {
		int[] numArray = { 2, 7, 8, 3, 6, 2, 1 };
		int[] numArrayCopy = Arrays.copyOf(numArray, numArray.length);
		int[] sortArray=insertSort(numArrayCopy);
		int numberCount=0;
		int previousNumber = 0;
		for (int i = 0; i < numArrayCopy.length; i++) {
				if (!containsNumber(numArrayCopy[i], previousNumber)) {
					System.out.println(numArrayCopy[i]+"\n");
					previousNumber=numArrayCopy[i];
					numberCount++;
					if(numberCount>=3) {
						break;
					}
				}
		}

	}
	public static void find3DistinctsmalletNumbersWithJava8() {
		int[] numArray = { 2, 7, 8, 3, 6, 2, 1 };
		IntStream.of(numArray).distinct().sorted().limit(3).forEach(System.out::print);
		IntSummaryStatistics statistics= IntStream.of(numArray).distinct().sorted().limit(3).summaryStatistics();
		statistics.getAverage();
		statistics.getMax();
		statistics.getMin();
		statistics.getSum();
		
		IntStream.of(numArray).filter(num->num%2==0);
		IntStream.of(numArray).map(num->num*2);
		

	}

	public static int[] insertSort(int[] numArrayCopy) {
		int tempNumber;
		for (int i = 1; i < numArrayCopy.length; i++) {
			for (int j = i; j > 0; j--) {
				if(numArrayCopy[j]<numArrayCopy[j-1]) {
					tempNumber=numArrayCopy[j];
					numArrayCopy[j]=numArrayCopy[j-1];
					numArrayCopy[j-1]=tempNumber;
				}
				
			}
		}
		return numArrayCopy;
	}

	public static boolean containsNumber(int presentNumber, int previousNumber) {
		boolean isPresent = false;
		if (presentNumber == previousNumber) {
			isPresent=true;
		}
		return isPresent;
	}

	public static void findMinNumberBeforeJava8() {

		int[] numArray = { 2, 7, 8, 3, 6, 2, 1 };
		int minNumber = numArray[0];
		for (int i = 0; i < numArray.length; i++) {
			if (minNumber > numArray[i]) {
				minNumber = numArray[i];
			}
		}
		System.out.println(minNumber);
	}

	public static void findMinNumberWithJava8() {
		int[] numArray = { 2, 7, 8, 3, 6, 2, 1 };
		IntStream.of(numArray).min().ifPresent(System.out::print);
		int[] numArray_max = { 2, 7, 8, 3, 6, 2, 1 };
		IntStream.of(numArray_max).min().ifPresentOrElse(System.out::print, Exception::new);

		IntSummaryStatistics statistics = IntStream.of(numArray_max).summaryStatistics();
		statistics.getAverage();
		statistics.getCount();
		statistics.getMax();
		statistics.getMin();
		statistics.getSum();
	}
}
