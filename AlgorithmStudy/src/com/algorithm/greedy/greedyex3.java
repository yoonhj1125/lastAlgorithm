package com.algorithm.greedy;

import java.util.Scanner;

public class greedyex3 {

	public static void main(String[] args) {
		//3. Greedy알고리즘 : 숫자 카드 게임 
		
		/**
		 * Question. 여러 개의 숫자 카드 중에서 가장 높은 숫자가 쓰인 카드 한장을 뽑는 게임
		 * Rule!!!
		 * 1. 자가 쓰인 카드들이 N * M 형태로 놓여있다. 이때 N은 행의 갯수, M은 열의 갯수
		 * 2. 먼저 뽑고자 하는 카드가 포함되어 있는 행을 선택한다.
		 * 3. 다음 선택된 행에 포함된 카드들 중 가장 숫자가 낮은 카드를 뽑아야 한다.
		 * 4. 따라서 처음 카드를 골라낼 행을 선택할 때, 이후에 해당 행에서 가장 숫자가 낮은 카드를 뽑을 것을 고려하여 최종적으로 가장 높은 숫자의 카드를 뽑을 수 있도록 전략을 짜야한다.
		 * 
		 * HOW TO ? 
		 * '각 마다 가장 작은수를 찾은 후, 그 수 중에서 가장 큰수를 찾는다'
		 */
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int result = 0;
		
		for(int i = 0; i < n ; i++) {
			int temp = 10001;
			for (int j = 0; j < m ; j++) {
				int x = sc.nextInt();
				temp = Math.min(temp, x);
				System.out.println("temp "+temp);
			}
			result = Math.max(result, temp);
		}
		System.out.println("최종 : "+result);
	}
	
		
}
