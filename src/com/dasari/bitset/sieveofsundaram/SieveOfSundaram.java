package com.dasari.bitset.sieveofsundaram;

import java.util.BitSet;

public class SieveOfSundaram {

	public static void main(String[] args) {
		int max=500;
		 generatePrime(max);

	}

	private static void generatePrime(int max) {
		int counter=1;
		// Because the number can be 2n+2 for a given n
	      // and we want a prime number less than n,
	      // we reduce it to half
		int bitSize=(max-2)/2;
		// BitSet created with a specific size
	      // with default value initialized as false
		BitSet bitSet=new BitSet(bitSize);
		
		
		for(int i=0;i<= bitSize; i++) {
			for(int j=i;(i+j+2*i*j)<=bitSize;j++) {
				bitSet.set(i+j+2*i*j);
			}
		}
		for (int i = 1; i <= bitSize; i++) {
	         if (bitSet.get(i) == false) {
	            System.out.print((2 * i + 1));
	            System.out.print(++counter % 9 ==0 ? "\n" : "\t");
	         }
	      }
	}
}
