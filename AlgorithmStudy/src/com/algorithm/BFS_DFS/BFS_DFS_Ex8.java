package com.algorithm.BFS_DFS;

import java.io.FileInputStream;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Dot {
    int x;
    int y;
 
    Dot(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println(x);
        System.out.println(y);
    }
}


public class BFS_DFS_Ex8 {
	  static int[][] arr;
	    static boolean[][] visited;
	    static int[] dx = { -1, 0, 1, 0 };
	    static int[] dy = { 0, -1, 0, 1 };
	    static int N;
	    static int M;
    
   
 
	    static public void BFS(int x, int y) {
	    	 
	        Queue<Dot> q = new LinkedList<Dot>();
	        q.add(new Dot(x, y));
	        //큐가 끝날때 까지
	        while (!q.isEmpty()) {
	            Dot d = q.poll();	//삭제하는 값 
	            for (int i = 0; i < 4; i++) {	//상하좌우이기 떄문에 4번 
	                //다음 방문할 좌표 nextX, nextY
	                int nextX = d.x + dx[i];
	                int nextY = d.y + dy[i];
	                
	                //다음 좌표가 범위를 넘어갈때 건너뛰기
	                if (nextX < 0 || nextY < 0 || nextX >= N || nextY >= M) {
	                    continue;
	                }
	                //이미 방문했던 점이면 건너뛰기
	                if (visited[nextX][nextY] || arr[nextX][nextY] == 0) {
	                    continue;
	                }
	                //다음에 방문할 좌표를 큐에 넣는다.
	                q.add(new Dot(nextX, nextY));
	                //배열안에 다음 방문할 곳은 현재 방문했던 점보다 1칸 더 가야하므로 +1
	                arr[nextX][nextY] = arr[d.x][d.y] + 1;
	                //다음 좌표는 방문했음으로 표시
	                visited[nextX][nextY] = true;
	                
	                ///////이부분 이해안감ㅜㅠ
	            }
	        }
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//8. BFS/DFS 알고리즘 : 미로탈출 설명  
		
		/*
		 * N x M크기의 미로에 갇혀있다. 미로에는 여러마리의 괴물이 잇어 이를피해 탈출해야한다. 동빈이의 위치는 (1,1)이며, 미로의 출구는 (N,M)의 위치에 존재하며 한번에 한칸씩 이동할 수 있다. 이때, 괴물이 있는 부분은 0으로
		 * 괴물이 없는 부분은 1로 표시되어있다. 
		 * 이때, 동빈이가 탈출하기위해 필요한 최소 칸의 개수를 구하세요. 칸을 셀 때는 시작 칸과 마지막 칸을 모두 포함해서 계산한다.   
		 *  
		 * 문제의 조건 : 첫째 줄에 두 정수 N,M(4<=N, M<=200) 각각 미로의 정보가 주어지고, 각각의 수들은 공백없이 제시, 시작칸과 마지막칸은 항상 1이다. 
		 * 
		 * 5, 6
		 * 101010
		 * 111111
		 * 000001
		 * 111111
		 * 111111
		 * 
		 * 
		 * 푸는 방법 : BFS	방법을 사용, 시작지점에서 가까운 노드부터 모든 노드를 탐색한다. 
		 * 상, 하, 좌, 우로 연결된 모든 노드로부터 거리가 1로 동일하다.
		 * 
		 * 즉, (1,1)로부터 넓이우선탐색을 하여 최단거리값을 기록하면 해결
		 */
		
		  // Scanner sc = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
 
        N = sc.nextInt();
        M = sc.nextInt();
        sc.nextLine();
        arr = new int[N][M];
        visited = new boolean[N][M];
        //2차원입력 받고 방문 확
        for (int i = 0; i < N; i++) {
            String str = sc.nextLine();
            for (int j = 0; j < M; j++) {
                arr[i][j] = str.charAt(j)-'0';
                visited[i][j] = false;
            }
        }
        visited[0][0] = true;
        BFS(0, 0);
        
        
        System.out.println(arr[N - 1][M - 1]); //0,0에서 시작했으므로 -1씩 해
	}
}
