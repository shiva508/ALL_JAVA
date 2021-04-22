package com.dasari.enums;

public class EnumSimulator {
	public static void main(String[] args) {
		teamFunction();
		teamFunctionSwitch();
		teamFunctionValuesOrdinals();
		monthFunctionConstructor();
		classmateFunction();
	}

	private static void classmateFunction() {
		Classmate[] classmates = Classmate.values();
		for (Classmate classmate : classmates) {
			System.out.println(classmate + "===========" + classmate.ordinal()+"=="+classmate.getRollNumber());
		}
	}

	private static void monthFunctionConstructor() {
		Month month = Month.MAR;
	}

	private static void teamFunctionValuesOrdinals() {
		Team[] teams = Team.values();
		for (Team team : teams) {
			System.out.println(team + "=========" + team.ordinal());
		}

	}

	private static void teamFunctionSwitch() {
		Team team = Team.SRH;
		switch (team) {
		case SRH:
			System.out.println("SRH or Nothing");
			break;
		case MI:
			System.out.println("After SRH MI is my faverate");
			break;
		default:
			System.out.println("NO");
			break;
		}
	}

	private static void teamFunction() {
		Team team = Team.SRH;
		System.out.println(team);

	}
}
