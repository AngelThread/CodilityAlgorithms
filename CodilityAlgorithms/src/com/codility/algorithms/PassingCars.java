package com.codility.algorithms;

public class PassingCars {
	public int solution(int[] A) {
		// write your code in Java SE 8
		int zeroCount = 0;
		long total = 0;
		for (int i = 0; i < A.length; i++) {
			if (A[i] == 0) {
				zeroCount++;
			} else {
				total += zeroCount;
			}

		}

		if (total > 1000000000) {
			return -1;
		}
		return (int)total;
	}
}
