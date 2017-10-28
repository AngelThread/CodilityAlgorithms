package com.codility.algorithms;

import com.codility.algorithms.PermMissingElem.Solution;

public class MaximumGap {
	public static void main(String[] args) {
		/*
		 * System.out.println( 11111110 & 1);
		 * System.out.println(Integer.toBinaryString(561892));
		 * System.out.println(Integer.toBinaryString(2>>>1));
		 * System.out.println(Integer.toBinaryString(2>>1));
		 * System.out.println(Integer.toBinaryString(2<<1));
		 * System.out.println("---------------------------");
		 * 
		 */
		System.out.println(Integer.toBinaryString(561892));

		System.out.println("Solution 529: " + solution(529));
		System.out.println("Solution 9: " + solution(9));
		System.out.println("Solution 15: " + solution(15));
		System.out.println("Solution 28: " + solution(28));
		System.out.println("Solution 74901729: " + solution(74901729));

	}

	public static int solution(int N) {
		// write your code in Java SE 8

		int modifiedNumber = N;
		while ((1 & modifiedNumber) == 0) {
			modifiedNumber = modifiedNumber >>> 1;
		}
		int maxGap = 0;
		int currentGap = 0;
		while ((0 | modifiedNumber) != 0) {

			if ((1 & modifiedNumber) == 0) {
				currentGap++;
			} else {
				if (currentGap > maxGap) {
					maxGap = currentGap;
				}
				currentGap = 0;

			}
			modifiedNumber >>= 1;

		}

		return maxGap;
	}

}
