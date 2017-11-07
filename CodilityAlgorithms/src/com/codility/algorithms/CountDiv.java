package com.codility.algorithms;

public class CountDiv {
	public int solution(int A, int B, int K) {
		// write your code in Java SE 8

		int resp = 0;
		int bCount = B / K;
		int aCount = A / K;
		resp = bCount - aCount;

		if (A % K == 0) {
			resp++;
		}

		return resp;

	}
}
