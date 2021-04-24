package com.dasari.featurs8.stream;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.LinkedHashMap;
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
		operationsOnDuplicateObjectWithJava8();
		operationsOnObjectWithJava8Grouping();

	}

	public static void operationsOnObjectWithJava8Grouping() {
		List<User> userList=getAllUsers();
		String names=userList.stream().map(User::getName).collect(Collectors.joining(","));
		System.out.println("Names:"+names);
		//Group By
		
		Map<Boolean, List<User>> groupedUser=userList.stream().collect(Collectors.groupingBy(user->user.isActive()));
		System.out.println(groupedUser);
		
		//Count Active and in active user
		Map<Boolean, Long> countUsers=userList
				.stream()
				.collect(Collectors.groupingBy(User::isActive, Collectors.counting()));
		
		System.out.println(countUsers);
		
		Map<Boolean, List<User>> groupedParreleUser=userList.stream().parallel().collect(Collectors.groupingBy(user->user.isActive()));
		System.out.println(groupedParreleUser);
		
	}

	public static void operationsOnDuplicateObjectWithJava8() {
		List<Hosting> list = new ArrayList<>();
	    list.add(new Hosting(1, "liquidweb.com", 80000));
	    list.add(new Hosting(2, "linode.com", 90000));
	    list.add(new Hosting(3, "digitalocean.com", 120000));
	    list.add(new Hosting(4, "aws.amazon.com", 200000));
	    list.add(new Hosting(5, "mkyong.com", 1));
	    list.add(new Hosting(2, "linode.com", 90000));
	    list
	    .stream()
	    .sorted(Comparator.comparingLong(Hosting::getWebsites).reversed())
	    .collect(Collectors.toMap(h->h.getName(), h->h.getWebsites(),(oldKey,newKey)->newKey));
	    
	    list
	    .stream()
	    .sorted(Comparator.comparingLong(Hosting::getWebsites).reversed())
	    .collect(Collectors.toMap(h->h.getName(), h->h.getWebsites(),(oldKey,newKey)->oldKey));
	    
	  Map map= list
	    .stream()
	    .sorted(Comparator.comparingLong(Hosting::getWebsites).reversed())
	    .collect(Collectors.toMap(h->h.getName(), h->h.getWebsites(),(oldKey,newKey)->newKey,LinkedHashMap::new));
	  
	  System.out.println(map);
	    
	    
	}

	private static void operationsOnObjectWithJava8() {
		List<User> userList=getAllUsers();
		userList.stream()
		.sorted(Comparator.comparingInt(User::getAge).reversed())
		.limit(3)
		.map(User::getName)
		.forEach(System.out::print);
		
	List<String>username=userList.stream()
		.sorted(Comparator.comparingInt(User::getAge).reversed())
		.filter(user->user.isActive())
		.limit(3)
		.map(User::getName)
		.collect(Collectors.toList());
	
	Set<String>usernameSet=userList.stream()
			.sorted(Comparator.comparingInt(User::getAge).reversed())
			.filter(user->user.isActive())
			.limit(3)
			.map(User::getName)
			.collect(Collectors.toSet());
	
	Map<String,Integer> userMap=userList.stream()
	.sorted(Comparator.comparingInt(User::getAge).reversed())
	.filter(user->user.isActive())
	.limit(3)
	.collect(Collectors.toMap(u->u.getName(), u->u.getAge()));
	System.out.println(userMap);
	
	List<Hosting> list = new ArrayList<>();
    list.add(new Hosting(1, "liquidweb.com", 80000));
    list.add(new Hosting(2, "linode.com", 90000));
    list.add(new Hosting(3, "digitalocean.com", 120000));
    list.add(new Hosting(4, "aws.amazon.com", 200000));
    list.add(new Hosting(5, "mkyong.com", 1));
    Map<Integer, String> hostingMap=list
    		.stream()
    		.collect(Collectors.toMap(Hosting::getId, Hosting::getName));
    System.out.println(hostingMap);
    
    Map<String, Long> hostingMap1=list
    		.stream()
    		.collect(Collectors.toMap(Hosting::getName, Hosting::getWebsites));
    System.out.println(hostingMap1);
    Map<Integer, String> result3 = list.stream().collect(
            Collectors.toMap(x -> x.getId(), x -> x.getName()));
    System.out.println(list);
    list.stream().collect(Collectors.toMap(x->x.getId(),x->x.getWebsites()));
		
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

	public static List<User> getAllUsers() {
		return Arrays.asList(
				new User("A", 3,false),
				new User("B", 4,true),
				new User("C", 0,false),
				new User("D", 50,true),
				new User("E", 33,false),
				new User("F", 35,true)
				);
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
