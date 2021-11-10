package com.algorithm.dynamic;

import java.util.Arrays;
import java.util.Scanner;


public class dynamicProgrammingEx7 {


	//1. 다이나믹 알고리즘 : 효율적인 화폐   
	
	/**
	 * N가지의 종류 화폐가 있다. 이 화폐들의 개수를 최소한으로 이용해서 그 가치의 합이 M원이 되도록 하려고 한다.
	 * 이때 각 종류의 화폐는 몇개라도 사용할 수 있다.
	 * 예를 들어, 2원 3원의 단위의 화폐가 있을때는 15원을 만들기 위해서 3원을 5개 이용하는 것이 최소한의 화폐의 개수이다.
	 * 
	 *  M원을 만들기 위한 최소한의 화폐의 개수를 출력하는 프로그램을 작성하세요 
	 */
    // 앞서 계산된 결과를 저장하기 위한 DP 테이블 초기화 
    public static int[] d = new int[1001];

	public static int solution(int n, int m, int arr[]) {
		
		
		int result = 0;
		int a[] = new int[m+1];
		Arrays.fill(a, 10001);

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < m+1; j++) {
				a[j] = Math.min(a[j], a[j - arr[i]] + 1);
			}
		}
		
		if(a[m] == 10001) {
			a[m] = -1;
		}
		return a[m];
		
	}	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int arr[] = new int[n];
		
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		solution(n, m, arr);
	}
}
	
	

