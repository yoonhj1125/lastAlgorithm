package com.algorithm.greedy;

import java.util.Scanner;

public class greedyex4 {

	public static void main(String[] args) {
		//4. Greedy알고리즘 : 1이 될대 까지 
		
		/**
		 * Question. 어떠한 수 N이 1이 될때까지 두 과정 중 하나를 반복적으로 선택하여 수행하려고 한다.단, 두번째 연산은 N이 K로 나눠떨어질때만 선택한다.
		 * 
		 * 1. N에서 1을 뺀다.
		 * 2. N을 K로 나눈다.
		 * 
		 * N과 K가 주어질 때, N이 1이 될 떄까지 1번 혹은 2번의 과정을 수행하는 최소횟수를 구하는 프로그램 작성  
		 * 
		 * HOW TO ? 
		 * '최대한 많이 나누기!'
		 */
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int result = 0;
//		
//		while(N>=K) {
//			while(N % K !=0) {
//				N -= 1;
//				result++;
//				System.out.println(N);
//				System.out.println(K);
//			}
//		}
//		
//		while(N>1) {
//			N -= 1;
//			result++;
//		}
		
		while(true) {
			if(N==1) {
				break;
			}else if(N % K == 0) {
				result ++;
				N = N/K;
			}else {
				result ++;
				N -= 1;
			}
		}
		System.out.println("result : "+ result);
	}
	
		
}
