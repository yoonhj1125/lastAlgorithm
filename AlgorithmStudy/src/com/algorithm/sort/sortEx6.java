package com.algorithm.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class sortEx6 {
	 public static final int MAX_VALUE = 9;
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//7. 정렬 알고리즘 : 
		
		/**
		 * 정렬이란 ? 데이터를 특정한 기준에 따라 순서대로 나열하는것 
		 *
		 *	7. 두개의 배열 A B를 가지고 있다. 두 배열은 N개의 원소로 구성되어 있으며, 배열의 원소는 모두 자연수이다.
		 *	동빈이는 최대 K번 바꿔치기 연산을 수행할 수 있는데, 바꿔치기 연산이란 배열 A에 있는 원소 하나와 배열 B에 있는 원소 하나를 골라서 서로 바꾸는 것을 의미한다.
		 *
		 *	동빈이의 최종 목표는 배열 A의 모든 원소의 합이 최대가 되도록 하는 것이며, 여러분은 동빈이를도와야 한다.
		 *	N, K 그리고 배열 A와 B의 정보가 주어졌을 때, 최대 K번의 바꿔치기 연산을 수행하여 만들 수 있는 배열 A의 원소의 합이 최댓값이 되는 프로그램을 작성해라
		 *
		 */
		Scanner sc = new Scanner(System.in);
		
		int n = 0;
		int k = 0;
		
		n = sc.nextInt();
		k = sc.nextInt();
		
		Integer[] A = new Integer[n];
		Integer[] B = new Integer[n];

		for (int i = 0; i < n; i++) {
			A[i] = sc.nextInt();
			System.out.println(A[i]);
		}
		
		for (int i = 0; i < n; i++) {
			B[i] = sc.nextInt();
			System.out.println(B[i]);
		}

		Arrays.sort(A);
		Arrays.sort(B,Collections.reverseOrder());
		
		for (int i = 0; i < k; i++) {
			if(A[i]<B[i]) {
				int temp = A[i];
				A[i] = B[i];
				B[i] = temp;
			}
		}
		
		int result = 0;

		for (int i = 0; i < n; i++) {
			result +=A[i];
					
		}
		System.out.println(result);
	}

}
