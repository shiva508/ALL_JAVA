package com.dasari.algoritham.sorting.buble;

public class BubleSortSimulator {
	public static void main(String[] args) {
		int[] bubleSortInput = { 15, 16, 6, 9, 2 };
		BubleSortSimulator bubleSortSimulator = new BubleSortSimulator();
		bubleSortSimulator.processBubleSort(bubleSortInput);
		int[] impbubleSortInput = { 15, 16, 6, 9, 2 };
		bubleSortSimulator.processImprovedBubleSort(impbubleSortInput);
		for (int i = 0; i < bubleSortInput.length; i++) {
			System.out.println(bubleSortInput[i]);
		}
	}

	private void processImprovedBubleSort(int[] impbubleSortInput) {
		// TODO Auto-generated method stub

	}

	private void processBubleSort(int[] bubleSortInput) {
		int INPUT_ARRAY_LENGTH = bubleSortInput.length;
		for (int i = 0; i < INPUT_ARRAY_LENGTH - 1; i++) {
			for (int j = 0; j < INPUT_ARRAY_LENGTH - i - 1; j++) {
				if (bubleSortInput[j] > bubleSortInput[j + 1]) {
					int temp = bubleSortInput[j];
					bubleSortInput[j] = bubleSortInput[j + 1];
					bubleSortInput[j + 1] = temp;
				}
			}
		}

	}
}
