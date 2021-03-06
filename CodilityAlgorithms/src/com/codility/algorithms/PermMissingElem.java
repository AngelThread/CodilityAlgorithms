package com.codility.algorithms;

public class PermMissingElem {

	class Solution {
		public int solution(int[] A) {

			long len = A.length;

			long sum = (len + 1) * (len + 2) / 2L;

			for (int i : A) {
				sum -= i;
			}
			return (int) sum;
		}
	}

}
