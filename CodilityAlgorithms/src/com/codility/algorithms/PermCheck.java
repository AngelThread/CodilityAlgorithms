package com.codility.algorithms;

public class PermCheck {
	public int solution(int[] A) {
        // write your code in Java SE 8
        
		int arrayLength = A.length;
		
		boolean[] seen = new boolean[arrayLength+1];
		
		for(int i=0; i<arrayLength; i++){
			
			if(A[i]> arrayLength || A[i]<0){
				return 0;
			}
			
			if(seen[A[i]] == true){
				return 0;
			}else{
				seen[A[i]] = true;
			}
			
		}
		return 1;
    }
}
