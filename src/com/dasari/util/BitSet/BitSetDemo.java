package com.dasari.util.BitSet;

import java.util.BitSet;
import java.util.Random;

public class BitSetDemo {
	 public static int N_BITS = 16;
	public static void main(String[] args) {
		BitSet bitSet1=new BitSet(N_BITS);
		BitSet bitSet2=new BitSet(N_BITS);
		printBits("inital bit pattern of b1: ",bitSet1);
		printBits("inital bit pattern of b2: ",bitSet2);
		setRandomBits(bitSet1);
		setRandomBits(bitSet2);
		printBits("After random bit set of b1: ", bitSet1);
	    printBits("After random bit set of b2: ", bitSet2);
	    bitSet2.and(bitSet1);
	    printBits("b2 AND b1, b2 = ", bitSet2);
	    System.out.println("No. of set values in b1=" + bitSet1.cardinality());
	    System.out.println("No. of set values in b2=" +bitSet2.cardinality());
	    
	    bitSet2.or(bitSet1);
	    printBits("b1 OR b2, b1 = ", bitSet1);
	    bitSet2.xor(bitSet1);
	    printBits("b2 XOR b1, b2 = ", bitSet2);
	    printBits("b1 = ", bitSet1);
	    System.out.println("indexes where bit is set in b1 " +bitSet1.toString());
	    printBits("b2 = ", bitSet2);
	    System.out.println("indexes where bit is set in b2 " +bitSet2.toString());
		//processBitSet(bitSet1, bitSet2);
		
	}

	private static void setRandomBits(BitSet bitSet1) {
		Random random=new Random();
		for (int i = 0; i < N_BITS/2; i++) {
			bitSet1.set(random.nextInt(N_BITS));
		}
		
	}

	private static void printBits(String string, BitSet bitSet1) {
	System.out.print(string+" ");
		for (int i = 0; i < N_BITS; i++) {
			System.out.print(bitSet1.get(i) ? "1":"0");
		}
		System.out.println();
	}

	/**
	 * @param args
	 * @param bitSet1
	 * @param bitSet2
	 */
	public static void processBitSet(BitSet bitSet1, BitSet bitSet2) {
		for(int i=0;i<16;i++) {
			if((i%2)==0) {
				bitSet1.set(i);
			}
			if((i%5)!=0) {
				bitSet2.set(i);
			}
		}
		System.out.println("Bit SET-1"+bitSet1);
		System.out.println("Bit SET-2"+bitSet2);
		System.out.println("AND");
		bitSet2.and(bitSet1);
		System.out.println(bitSet2);
		System.out.println("OR");
		bitSet2.or(bitSet1);
		System.out.println(bitSet2);
		System.out.println("XOR");
		bitSet2.xor(bitSet1);
		System.out.println(bitSet2);
	}

}
