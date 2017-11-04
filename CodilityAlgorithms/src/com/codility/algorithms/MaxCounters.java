package com.codility.algorithms;

public class MaxCounters {
	// you can also use imports, for example:
	// import java.util.*;

	// you can write to stdout for debugging purposes, e.g.
	// System.out.println("this is a debug message");
	
	public static void main(String[] args) {
		
		MaxCounters maxCounter = new MaxCounters();
		
		int[] finalArray = maxCounter.solution(5, new int[]{6,6,6,6,6,6});
		
		for (int i = 0; i < finalArray.length; i++) {
			System.out.print(finalArray[i]+"-");
		}
	}

	public int[] solution(int N, int[] A) {
		// write your code in Java SE 8
		int maxVal = 0;
		int lastMax = 0;

		int aLength = A.length;
		int[] responseArray = new int[N];

		int currentVal = 0;
		for (int i = 0; i < aLength; i++) {

			if (A[i] < N + 1) {
				currentVal = Math.max(responseArray[(A[i] - 1)],lastMax);
				responseArray[A[i] - 1] = currentVal + 1;
				maxVal = Math.max(responseArray[(A[i] - 1)], maxVal);
			} else if (A[i] == N + 1) {
				lastMax = maxVal;
			}
			

		}
		for (int i = 0; i < responseArray.length; i++) {
			responseArray[i] = Math.max(responseArray[i], lastMax);
		}
		return responseArray;
	}

	

}