package com.algorithm.implementation;

import java.util.Scanner;

public class implemntationEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. 구현 알고리즘 : 상하좌우 문
		
		/**
		 * Question. 여행가 A는 N*N 크기의 정사각형 공간위에 서있다. 이 공간은 1*1 크기의 정사각형으로 나누어져 있다. 가장 왼쪽 위 좌표는 (1,1) 이며, 가장 오른쪽 아래좌는 (N,N)
		 * 여행가는 상, 하, 좌, 우 방향으로 이동할 수 있으며, 시작좌표는 항상 (1,1)이다.
		 * 
		 * RULE 
		 * L : 왼쪽으로 이동
		 * R : 오른쪾으로 이동
		 * U : 위로 이동
		 * D : 아래로 이동 
		 * 
		 * 이때, 여생가 A가 N*N 정사각형 공간을 벗어나는 움직임은 무시된다. 예로 (1,1)에서 L 또는 U을 만나면 무시된다. 
		 * 
		 * HOW TO ? 
		 * 크기 N (1 <= N <= 100)
		 * 이동횟수(1 <= N <= 100)
		 * 전형적인 시뮬레이션 유형 
		 */

		
		Scanner sc = new Scanner(System.in);	// 입력받 돈 N
		int n = sc.nextInt();
		sc.nextLine();
		
		String[] plans = sc.nextLine().split(" ");
		int x = 1; int y = 1;
		
		int[] dx = {0,0,-1,1};
		int[] dy = {-1,1,0,0};
		char[] moveTypes = {'L', 'R', 'U', 'D'};
		
		for (int i = 0; i < plans.length; i++) {
			char plan = plans[i].charAt(0);
			int nx = -1, ny = -1;
			for (int j = 0; j < moveTypes.length; j++) {
				nx = x + dx[j];
				ny = y + dy[j];
			}
		
			// 공간을 벗어나는 경우 무시 
            if (nx < 1 || ny < 1 || nx > n || ny > n) continue;
            // 이동 수행 
            x = nx;
            y = ny;
		}
		
	
		int result = 0;
		
		
		System.out.println("최소 동전 갯수 : "+result);
		
	}

}
