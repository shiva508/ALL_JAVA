package com.dasari.interview.meetingproblem;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class HiCall {

	public static void main(String[] args) {
		List<Meeting> allMeating = Arrays.asList(new Meeting(0, 1), new Meeting(3, 5), new Meeting(4, 8),
				new Meeting(10, 12), new Meeting(9, 10));
		processMeating(allMeating);
	}

	private static void processMeating(List<Meeting> allMeating) {
		System.out.println(allMeating);
		Collections.sort(allMeating, new Comparator<Meeting>() {
			@Override
			public int compare(Meeting o1, Meeting o2) {
				return o1.getStartTime() - o2.getStartTime();
			}
		});
		System.out.println(allMeating);
	}

}
