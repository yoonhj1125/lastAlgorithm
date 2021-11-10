package com.algorithm.dynamic;

import java.util.Scanner;


public class dynamicProgrammingEx6 {


	//1. 다이나믹 알고리즘 : 바닥공사  
	
	/**
	 * 가로의 길이가 N, 세로의 길이가 2인 직사각형 형태의 얇은 바닥이있다. 태일이는 이 얇은 바닥을 1 x 2의 덮개, 2 x 1의 덮개, 2 x 2의 뎦개를 이용해 채우고자 한다. 
	 * 
	 * 
	 */
    // 앞서 계산된 결과를 저장하기 위한 DP 테이블 초기화 
    public static int[] d = new int[1001];

	public static void solution() {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		d[1] = 1;
		d[2] = 3;
		for (int i = 3; i < n+1; i++) {
			d[i] = (d[i-1] + 2 * d[i-2]) % 796796;
		}
		
		System.out.println(d[n]);
		
	}	
	public static void main(String args[]) {
		solution();
		}
}
	
	

