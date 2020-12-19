package com.dasari;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	static class pair {
		int first, second;

		public pair(int first, int second) {
			this.first = first;
			this.second = second;
		}
	}

	static int getSubarraySum(int sum[], int i, int j) {
		if (i == 0)
			return sum[j];
		else
			return (sum[j] - sum[i - 1]);
	}

	static int maximumSumTwoNonOverlappingSubarray(int arr[], int N, int K) {
		int l = 0, m = 0;
		int a1[] = new int[N / 2];
		int a2[] = new int[N / 2];
		int prod = 0;
		int[] sum = new int[N];
		sum[0] = arr[0];

		for (int i = 1; i < N; i++)
			sum[i] = sum[i - 1] + arr[i];

		pair resIndex = new pair(N - 2 * K, N - K);

		int maxSum2Subarray = getSubarraySum(sum, N - 2 * K, N - K - 1) + getSubarraySum(sum, N - K, N - 1);

		pair secondSubarrayMax = new pair(N - K, getSubarraySum(sum, N - K, N - 1));

		for (int i = N - 2 * K - 1; i >= 0; i--) {
			int cur = getSubarraySum(sum, i + K, i + 2 * K - 1);
			if (cur >= secondSubarrayMax.second)
				secondSubarrayMax = new pair(i + K, cur);
			cur = getSubarraySum(sum, i, i + K - 1) + secondSubarrayMax.second;
			if (cur >= maxSum2Subarray) {
				maxSum2Subarray = cur;
				resIndex = new pair(i, secondSubarrayMax.first);
			}
		}

		for (int i = resIndex.first; i < resIndex.first + K; i++) {
			a1[l] = arr[i];
			l++;
		}

		for (int i = resIndex.second; i < resIndex.second + K; i++) {
			a2[m] = arr[i];
			m++;
		}

		for (int i = 0; i < m; i++) {
			if (a1[i] != 0 || a2[i] != 0) {
				prod = prod + a1[i] * a2[m - (i + 1)];
			}
		}
		return prod;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int k = 0;
		int arr[] = new int[a];

		for (int i = 0; i < a; i++) {
			arr[i] = sc.nextInt();
		}

		int l = arr.length;
		int ar[] = new int[a / 2];

		for (int i = 1; i <= a / 2; i++) {
			ar[k] = maximumSumTwoNonOverlappingSubarray(arr, l, i);
			k++;
		}

		Arrays.sort(ar);
		System.out.println(ar[k - 1]);
	}
}
