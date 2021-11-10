package com.algorithm.sort;

import java.util.ArrayList;
import java.util.Scanner;

public class sortEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//2. 정렬 알고리즘 : 
		
		/**
		 * 정렬이란 ? 데이터를 특정한 기준에 따라 순서대로 나열하는것 
		 *
		 *	2. 선택정렬 알고리즘 : 처리되지 않은 데이터중 가장 작은 데이터를 선택하여 맨앞에 있는 데이터와 바꾸는 것 !
		 */

		 int n = 10;
	        int[] arr = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8};
	        System.out.println(arr[0]);
	        for (int i = 0; i < n; i++) {
	            int min_index = i; // 가장 작은 원소의 인덱스 
	            for (int j = i + 1; j < n; j++) {
	                if (arr[min_index] > arr[j]) {
	                    min_index = j;
	                }
	            }
	            // 스와프
	            int temp = arr[i];
	            System.out.println( temp+ " : temp[i]");
	            
	            arr[i] = arr[min_index];
	            System.out.println( arr[i]+ " : arr[i]");
	            arr[min_index] = temp;
	            System.out.println( arr[min_index]+ " : arr[min_index]");
	        }

	        for(int i = 0; i < n; i++) {
	            System.out.print(arr[i] + " ");
	        }
		
	}

}
