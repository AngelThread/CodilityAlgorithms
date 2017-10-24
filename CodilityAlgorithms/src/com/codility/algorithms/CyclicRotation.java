package com.codility.algorithms;

public class CyclicRotation {

	public int[] solution(int[] A, int K) {
		// write your code in Java SE 8
		for (int j = 0; j < K; j++) {

			int current = 0;
			int before = 0;
			for (int i = 0; i < A.length; i++) {
				if (i != 0) {
					current = A[i];
					A[i] = before;
					before = current;
				} else if (i == 0) {
					before = A[i];
					A[i] = A[A.length - 1];

				}

			}
		}
		return A;

	}
}
