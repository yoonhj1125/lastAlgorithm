package com.algorithm.dynamic;

import java.util.Scanner;


public class dynamicProgrammingEx1 {

	//1. 다이나믹 알고리즘 : 
	
	/**
	 * 1. 최적 부분 구조 : 큰 문제를 작은문제로 나눌 수 있다.
	 * 2. 중복되는 부분 문제 : 동일한 작은문제를 반복적으로 해결한다.  
	 */
    // 피보나치 함수(Fibonacci Function)을 재귀함수로 구현
    public static int fibo(int x) {
        if (x == 1 || x == 2) {
            return 1;
        }
        return fibo(x - 1) + fibo(x - 2);
    }

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = 0;
		result = fibo(n);
		System.out.println(result);
	
	
		int[] arr = {3,4,5};
		int lentgh = arr.length;
		System.out.println(lentgh);
		
		for (int i = 0; i < arr.length; i++) {
			
		}
	}	
}
	
	

