package com.algorithm.BFS_DFS;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFS_DFS_Ex10 {
	
	
	//10. BFS/DFS 알고리즘 : 연구소   

	/*
	 * 인체에 치명적인 바이러스를 연구하던 연구소에서 바이러스가 유출되었다. 다행히 바이러스는 아직 퍼지지 않았고, 바이러스의 확산을 막기 위해서 연구소에 벽을 세우려고 한다.
		연구소는 크기가 N×M인 직사각형으로 나타낼 수 있으며, 직사각형은 1×1 크기의 정사각형으로 나누어져 있다. 연구소는 빈 칸, 벽으로 이루어져 있으며, 벽은 칸 하나를 가득 차지한다. 
		일부 칸은 바이러스가 존재하며, 이 바이러스는 상하좌우로 인접한 빈 칸으로 모두 퍼져나갈 수 있다. 새로 세울 수 있는 벽의 개수는 3개이며, 꼭 3개를 세워야 한다.
		예를 들어, 아래와 같이 연구소가 생긴 경우를 살펴보자.
		
		첫째 줄에 지도의 세로 크기 N과 가로 크기 M이 주어진다. (3 ≤ N, M ≤ 8)
		둘째 줄부터 N개의 줄에 지도의 모양이 주어진다. 0은 빈 칸, 1은 벽, 2는 바이러스가 있는 위치이다. 2의 개수는 2보다 크거나 같고, 10보다 작거나 같은 자연수이다.
		빈 칸의 개수는 3개 이상이다.
		
		
		모르게씀....ㅠ
		==> 풀이를 보면 BFS,DFS 같이 수행  벽세우는건 DFS,  참조 : https://yongku.tistory.com/entry/백준-알고리즘-백준-14502번-연구소-자바Java
	 */
	static class virus{
		int x, y;
		virus(int x, int y){
			this.x = x;
			this.y = y;
		}
	}
	
	static int M, N;
	
	static int[][] map;
	static int[][] copy_map;
	
    static int[] dx = { -1, 0, 1, 0 };
    static int[] dy = { 0, -1, 0, 1 };
    
    static int result = Integer.MIN_VALUE;	//안전지역의 갯수!!

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	N = sc.nextInt();
    	M = sc.nextInt();
    	
    	map = new int[N][M];
    	copy_map = new int [N][M];
    	//지도 입력 
    	for (int i = 0; i < N; i++) {
    		for (int j = 0; j < M; j++) {
    			map[i][j] = sc.nextInt();
				
			}
			
		}
    	
    	//카피지도 하나 입력
    	copy_map = map;
    	
    	//수행 
    	DFS(0);
    	
    }
}
