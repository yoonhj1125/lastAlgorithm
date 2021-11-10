package com.algorithm.sort;

import java.util.ArrayList;
import java.util.Scanner;

public class sortEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. 정렬 알고리즘 : 
		
		/**
		 * 정렬이란 ? 데이터를 특정한 기준에 따라 순서대로 나열하는것 
		 *
		 *	1. Swap 알고리즘 : 
		 */
		 int[] arr = {3, 5};

	        // 스와프(Swap)
	        int temp = arr[0];
	        System.out.println(arr[0] +" ,"+ arr[1]);
	        arr[0] = arr[1];
	        System.out.println(arr[0] +" ,"+ arr[1]);
	        arr[1] = temp;

	        System.out.println(arr[0] + " " + arr[1]);
		
	}

}
