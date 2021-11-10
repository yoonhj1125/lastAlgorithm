package com.algorithm.sort;

import java.util.ArrayList;
import java.util.Scanner;

public class sortEx7 {
	 public static final int MAX_VALUE = 9;
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//6. 정렬 알고리즘 : 
		
		/**
		 * 정렬이란 ? 데이터를 특정한 기준에 따라 순서대로 나열하는것 
		 *
		 *	6. 계수 정렬 알고리즘 : 특정한 조건이 부합할 때만 사용할 수 있지만 매우 빠르게 동작하는 알고리즘 
		 *	데이터의 크기의 범위가 제한되어 정수형태로 표현할 수 있을때 사용한다.
		 *
		 */
		 int[] arr = {7, 5, 9, 0, 3, 1, 6, 2, 9, 1, 4, 8, 0, 5, 2};
		 int n = 15;
		 int [] result = new int[MAX_VALUE +1];
		 for (int i = 0; i < n; i++) {
			  result[arr[i]] += 1; // 각 데이터에 해당하는 인덱스의 값 증가
			
		}
		 
		   for (int i = 0; i <= MAX_VALUE; i++) { // 배열에 기록된 정렬 정보 확인
	            for (int j = 0; j < result[i]; j++) {
	                System.out.print(i + " "); // 띄어쓰기를 기준으로 등장한 횟수만큼 인덱스 출력
	            }
	        }
	
		 
		for (int i = 0; i < result.length; i++) {
			System.out.println("result : "+ i);
		}
	}

}
