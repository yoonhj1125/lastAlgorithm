package com.algorithm.BFS_DFS;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFS_DFS_Ex7 {
	public static int n, m;
	public static int[][] graph = new int[1000][1000];
	
	//true인경우에만 결과값에 +1
	public static boolean dfs(int x, int y) {

		//상,하,좌,우 계산시 2차원 배열을 벗어나는 경우 제외,
		if(x <= -1 ||x>=n || y <= -1 || y>=m) {
			return false;
		}
		
		//아직 방문하지 않은경우,
		if(graph[x][y] == 0) {
			graph[x][y] = 1;	//방문처리 
			
			//각각의 해당지점에서 상,하,좌,우의 제귀함수로 깊이우선탐색 수행
			dfs(x-1,y);
			dfs(x,y-1);
			dfs(x+1,y);
			dfs(x,y+1);
			return true;
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//7. BFS/DFS 알고리즘 : 음료수 얼려먹기 문제 
		
		/*
		 * N x M크기의 얼음틀이 있습니다. 구멍이 뚫려있는 부분은 0, 칸막이가 존재하는 부분은 1로 표시됩니다. 구멍이 뚫려있는 부분끼리 상, 하, 좌, 우로 붙어있는 경우, 서로 언결되어있는 것으로 간주
		 * 이때 얼음 틀의 모양이 주어졌을 때, 생성되는 총 아이스크림의 개수를 구하는 프로그램을 구하시오.
		 * ex) 
		 * 00110
		 * 00011
		 * 11111
		 * 00000 	    
		 *  
		 * 문제의 조건 : 세로길이 N과 가로의 길이 M이 주어진다, (1<=N, M<= 1000)
		 * 두번째줄부터 N+1번쨰줄까지 얼음 틀의 태가 주어진다.
		 * 
		 * 푼 방법 : DFS -> 특정한 지점의 주변 상, 하, 좌, 우를 살펴본 후에 주변 지점 중에 값이 아직 0이면서 방문하지 않은 지점이 있다면 해당 지점을 방문한다. 
		 * 방문한 지점에서 다시 상, 하, 좌, 우를 보면서 연결된 모든지점을 방문하고, 방문하지 않은 지점의 수를 카운트한다.   
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		m = sc.nextInt();	//가로길이 
		n = sc.nextInt();	//세로길이 
		sc.nextLine();		//버퍼지우기 

		//주어진 배열 초기화 
		int result = 0; //결과값 저장 
		
		
		//2차원 배열 정보 입력받기
		for (int i = 0; i < n; i++) {
			String str = sc.nextLine();
			for (int j = 0; j < m; j++) {
				graph[i][j] = str.charAt(j) -'0';
			}
			
		}
		System.out.println(graph[0][0]);
		
		//모든 지점에 대해서 음료수 채우기 
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if(dfs(i,j)) {
					result++;
				}
			}
		}
		
		System.out.println("result : "+ result);
	}

}
