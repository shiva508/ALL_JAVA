package com.dasari.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamExample {
	public static void main(String[] args) {
		findMinNumberBeforeJava8();
		findMinNumberWithJava8();
		find3DistinctsmalletNumbersBeforeJava8();
		find3DistinctsmalletNumbersWithJava8();
		operationsOnObjectBeforeJava8();
		operationsOnObjectWithJava8();

	}

	private static void operationsOnObjectWithJava8() {
		List<User> userList=getAllUsers();
		userList.stream()
		.sorted(Comparator.comparingInt(User::getAge).reversed())
		.limit(3)
		.map(User::getName).forEach(System.out::print);
		
	List<String>username=userList.stream()
		.sorted(Comparator.comparingInt(User::getAge).reversed())
		.filter(user->user.isActive())
		.limit(3)
		.map(User::getName).collect(Collectors.toList());
	
	Set<String>usernameSet=userList.stream()
			.sorted(Comparator.comparingInt(User::getAge).reversed())
			.filter(user->user.isActive())
			.limit(3)
			.map(User::getName).collect(Collectors.toSet());
	
	Map<String,Integer>sa=userList.stream()
			.sorted()
			.sorted(Comparator.comparingInt(User::getAge).reversed())
			.filter(user->user.isActive())
			.limit(3)
			.collect(Collectors.toMap(User::getName,User::getAge));
		
	}

	private static void operationsOnObjectBeforeJava8() {
		List<User> userList=getAllUsers();
		//To avoid mutation create copy
		List<User> copyUsers=new ArrayList<User>(userList);
		copyUsers.sort((user1,user2)->user2.getAge()-user1.getAge());
		//Pick Top 3
		int count=0;
		for (int i = 0; i < 3; i++) {
			User user=copyUsers.get(i);
			System.out.println(user);
		}
		for (User user:copyUsers) {
			if(count<4&&user.isActive()) {
				System.out.println(user);
				count++;
			}
			
		}
		
	}

	private static List<User> getAllUsers() {
		return Arrays.asList(new User("A", 3,false),
				new User("B", 4,true),
				new User("C", 0,false),
				new User("D", 50,true),
				new User("E", 33,false),
				new User("F", 35,true));
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
		IntStream.range(404, 408).forEach(System.out::print);
		IntStream.range(408, 508).toArray();
		IntStream.range(408, 508).boxed().collect(Collectors.toList());
		IntStream.of(numArray).anyMatch(num->num%2==0);//boolean
		IntStream.of(numArray).allMatch(num->num%2==0);//boolean
		

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
