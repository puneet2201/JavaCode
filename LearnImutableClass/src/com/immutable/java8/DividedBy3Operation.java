package com.immutable.java8;

import java.util.Arrays;

public class DividedBy3Operation {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12};
		//output will be {1,2,9,4,5,36,7,8,81,10,11,144}
		int[] arrays=Arrays.stream(arr).map( i -> {
			if(i%3==0)
				return arr[i-1]*arr[i-1];
			else {
				return arr[i-1];
			}
			
		}).toArray();
		
		System.out.println(Arrays.toString(arrays));
		//System.out.println(Arrays.toString(outputArrays(arr)));
	}
	
	/*public static int[] outputArrays(int arr[]) {
		for(int i=0; i<=arr.length-1; i++) {
			if(arr[i]%3==0) {
				arr[i]=(int) Math.pow(arr[i], 2);
			}
			
		}
		return arr;
	}*/

}
