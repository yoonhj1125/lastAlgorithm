package com.algorithm.dynamic;

import java.util.Arrays;
import java.util.Scanner;


public class dynamicProgrammingEx8 {


	//1. 다이나믹 알고리즘 : 금광문제 
	
	/**
	 * n x m 크기의 금광이 있다. 금광의 크기는 1 x 1 크기의 칸으로 나누어져 있으며, 각 칸은 특정한 크기의 금이 들어있다.
	 * 채굴자는 첫 번째 열부터 출발하여 금을 캐기 시작한다. 맨 처음에는 첫번째 열의 어느 행에서든 출발할수 있다. 이후에 m-1번에 걸쳐서 매번 오른쪽 위, 오른쪽, 오른쪽 아래 3가지중하나의 위치
	 * 로 이동한다. 결과적으로 채굴자가 얻을 수 있는 금의 최대크기를출력하는 프로그램을 작성해라. 
	 */
    // 앞서 계산된 결과를 저장하기 위한 DP 테이블 초기화 
    public static int [][]arr = new int [20][20];	//금광의 정보를 담을 2차원배
    public static int [][]dp = new int [20][20];	//업데이트된 정보를 담을 2차원 배열 
    public static int T = 0;
    public static int n, m;
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		T = sc.nextInt();
		
		for (int i = 0; i < T; i++) {
			n = sc.nextInt();
			m = sc.nextInt();
			
			for (int j = 0; j < n; j++) {
				for (int j2 = 0; j2 < m; j2++) {
					arr[j][j2] = sc.nextInt();
				}
			}
			
			
			for (int j = 0; j < n; j++) {
				for (int j2 = 0; j2 < m; j2++) {
					dp[j][j2] = arr[j][j2];
				}
			}
			
		}
		
		for (int i = 1; i < m; i++) {
			for (int j = 0; j < n; j++) {
				int leftup, left, leftdown;
				if(j==0)leftup = 0;
				else leftup = dp[j-1][i-1];
				
				if(j==n-1)leftdown= 0;
				else leftdown = dp[j+1][i-1];
				
				left = dp[j][i-1];
				dp[j][i] = dp[j][i] + Math.max(leftup, Math.max(left, leftdown));
				
				
			}
		}
		int result = 0;
		for (int i = 0; i < n; i++) {
			result = Math.max(result, dp[i][m-1]);
		}
		System.out.println(result);
		
	}
}
	
	

