package com.algorithm.dynamic;

import java.util.Scanner;


public class dynamicProgrammingEx5 {


	//1. 다이나믹 알고리즘 : 개미전사 
	
	/**
	 * 
	 */
    // 앞서 계산된 결과를 저장하기 위한 DP 테이블 초기화 
    public static int[] d = new int[100];

	public static void solution(int n, int arr[]) {
		d[0] = arr[0];
		d[1] = Math.max(arr[0], arr[1]);
		
		for (int i = 2; i < n; i++) {
			d[i] = Math.max(d[i-1], d[i-2]+arr[i]);
		}
		System.out.println(d[n-1]);
	}
	
	//해당문제는 탑다운 방식으로 구현한 피보나치이다. 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		solution(n, arr);
	}	
}
	
	

