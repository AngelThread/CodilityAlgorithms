package com.codility.algorithms;

public class OddOccurrencesInArray {

	public int solution(int[] A) {
		int response = 0;
		for (int i = 0; i < A.length; i++) {
			response ^= A[i];
		}
		return response;

	}
}
