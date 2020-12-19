package com.dasari.leetcode;

import java.util.HashMap;
import java.util.Map;

public class SumProblems {

	public static int[] twoSumBruthForce(int[] input, int target) {
		for (int i = 0; i < input.length; i++) {
			for (int j = i + 1; j < input.length; j++) {
				if (input[j] == target - input[i]) {
					return new int[] { i, j };
				}
			}
		}
		throw new IllegalArgumentException("No Two Sum found");
	}

	public static int[] twoSumTwoPassHashTable(int[] input, int target) {
		Map<Integer, Integer> hashTable=new HashMap<>();
		for (int i = 0; i < input.length; i++) {
			hashTable.put(input[i], i);
		}
		for (int i = 0; i < input.length; i++) {
			int complement=target-input[i];
			if(hashTable.containsValue(complement) && hashTable.get(complement) !=i){
				return new int [] {i,hashTable.get(complement)};
			}
		}
		throw new IllegalArgumentException("No Two Sum found");
	}

	public static int[] twoSumOnePassHashTable(int[] input, int target) {
		Map<Integer, Integer> hashTable=new HashMap<>();
		for (int i = 0; i < input.length; i++) {
			int complement=target-input[i];
			if(hashTable.containsKey(complement)) {
				return new int [] {hashTable.get(complement),i};
			}
			hashTable.put(input[i], i);
		}
		throw new IllegalArgumentException("No two sum solution");
	}

	public static void main(String[] args) {

	}
}
