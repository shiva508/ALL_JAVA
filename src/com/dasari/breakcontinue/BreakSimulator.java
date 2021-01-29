package com.dasari.breakcontinue;

public class BreakSimulator {
	public static void main(String[] args) {
		breakSimulatorSingleMethod();
		breakSimulatorDoubleLoopMethod();
	}

	private static void breakSimulatorSingleMethod() {
		for (int i = 1; i < 10; i++) {
			if (i == 4) {
				break;
			}
			System.out.println("" + i);
		}
	}

	private static void breakSimulatorDoubleLoopMethod() {
		for (int i = 1; i < 10; i++) {
			for(int j=1;j<10;j++) {
				if (i == 4 && j==4) {
					break;
				}
				System.out.println("i: " + i+" j:"+j);
			}
			
		}
	}
}
