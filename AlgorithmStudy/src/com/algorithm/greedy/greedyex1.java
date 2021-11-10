package com.algorithm.greedy;

import java.util.Scanner;

public class greedyex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. Greedy알고리즘 : 거스름돈문
		
		/**
		 * Question. 당신이 음식점 점원인 경우, 거스름으로 사용할 500, 100, 50, 10원이 무한히 존재한다.
		 * 손님에게 거슬러 주어야 할 돈이 N원일 때 거슬러 줘야할 동전의 최소 갯수를 구하라. 단, 거슬러 줘야 할 돈은 10의 배수이다.
		 * 
		 * HOW TO ? 
		 * '가장 큰 화폐의 동전부터 거슬러 주는 그리디알고리즘을 사용'
		 */

		
		Scanner sc = new Scanner(System.in);	// 입력받 돈 N
		int n = sc.nextInt();
		
		int[] coinType = {500,100,50,10};		//무한이 존재하는 동전타입
		int result = 0;							//결과값을 담을 변수
		
		
		for(int i = 0; i<coinType.length; i++) {
			result += n/coinType[i];
			n = n%coinType[i];
			System.out.println(result);
			System.out.println(n);
			System.out.println("------");
		}
		
		System.out.println("최소 동전 갯수 : "+result);
		
	}

}
