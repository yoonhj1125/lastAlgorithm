package com.algorithm.dynamic;

import java.util.Scanner;


public class dynamicProgrammingEx3 {


	//2. 다이나믹 알고리즘 : 
	
	/**
	 * 1.구현하는 것은 상향식, 하향식 방법
	 * 보텀업으로 구하는 방식(for문 이용)
	 */
	public static long fibo(int x, int n) {
		d[1] = 1;
		d[2] = 1;
		
		for (int i = 3; i <= n; i++) {
			d[i] = d[i-1] + d[i-2];
		}
		return d[x];
	}
	public static long[] d = new long[999];
	
	//해당문제는 탑다운 방식으로 구현한 피보나치이다. 
	public static void main(String[] args) {
		int n = 50;
		System.out.println(fibo(50, n));
		
	}	
}
	
	

