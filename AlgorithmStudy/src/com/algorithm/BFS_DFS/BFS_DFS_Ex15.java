package com.algorithm.BFS_DFS;

import java.awt.font.GraphicAttribute;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class BFS_DFS_Ex15 {
	public static int n,l, r = 0;//
	  
    public static int[][] graph = new int[50][50];  //전체 나라의 정보(N x N)를 입력받기
    public static int[][] unions = new int[50][50];	// 연합나라 
    public static int totalCount = 0;
    
    public static int[] dx = {-1, 0, 1, 0};
    public static int[] dy = {0, -1, 0, 1};
	//15. BFS/DFS 알고리즘 : 인구이동 

	/*
	N×N크기의 땅이 있고, 땅은 1×1개의 칸으로 나누어져 있다. 각각의 땅에는 나라가 하나씩 존재하며, r행 c열에 있는 나라에는 A[r][c]명이 살고 있다. 인접한 나라 사이에는 국경선이 존재한다. 모든 나라는 1×1 크기이기 때문에, 모든 국경선은 정사각형 형태이다.
	
	오늘부터 인구 이동이 시작되는 날이다.
	
	인구 이동은 하루 동안 다음과 같이 진행되고, 더 이상 아래 방법에 의해 인구 이동이 없을 때까지 지속된다.
	
	국경선을 공유하는 두 나라의 인구 차이가 L명 이상, R명 이하라면, 두 나라가 공유하는 국경선을 오늘 하루 동안 연다.
	위의 조건에 의해 열어야하는 국경선이 모두 열렸다면, 인구 이동을 시작한다.
	국경선이 열려있어 인접한 칸만을 이용해 이동할 수 있으면, 그 나라를 오늘 하루 동안은 연합이라고 한다.
	연합을 이루고 있는 각 칸의 인구수는 (연합의 인구수) / (연합을 이루고 있는 칸의 개수)가 된다. 편의상 소수점은 버린다.
	연합을 해체하고, 모든 국경선을 닫는다.
	각 나라의 인구수가 주어졌을 때, 인구 이동이 며칠 동안 발생하는지 구하는 프로그램을 작성하시오.

 	입력 : 첫째 줄에 N, L, R이 주어진다. (1 ≤ N ≤ 50, 1 ≤ L ≤ R ≤ 100)
	둘째 줄부터 	N개의 줄에 각 나라의 인구수가 주어진다. r행 c열에 주어지는 정수는 A[r][c]의 값이다. (0 ≤ A[r][c] ≤ 100)
	인구 이동이 발생하는 일수가 2,000번 보다 작거나 같은 입력만 주어진다.	
	
	푸는법 : BFS를 이용 
	 */
	
   
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        n = sc.nextInt();
        l = sc.nextInt();
        r = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                graph[i][j] = sc.nextInt();
                System.out.println(graph[i][j]);
            }
        }
        
     // 더 이상 인구 이동을 할 수 없을 때까지 반복
        while (true) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    unions[i][j] = -1;
                }
            }
            int index = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (unions[i][j] == -1) { // 해당 나라가 아직 처리되지 않았다면
                        process(i, j, index);
                        index += 1;
                    }
                }
            }
            // 모든 인구 이동이 끝난 경우
            if (index == n * n) break;
            totalCount += 1;
        }
        
        System.out.println(totalCount);
    }
    
    // 특정 위치에서 출발하여 모든 연합을 체크한 뒤에 데이터 갱신
    public static void process(int x, int y, int index) {
        // (x, y)의 위치와 연결된 나라(연합) 정보를 담는 리스트
        ArrayList<Dot2> united = new ArrayList<>();
        united.add(new Dot2(x, y));
        // 너비 우선 탐색 (BFS)을 위한 큐 라이브러리 사용
        Queue<Dot2> q = new LinkedList<>();
        q.offer(new Dot2(x, y));
        unions[x][y] = index; // 현재 연합의 번호 할당
        int summary = graph[x][y]; // 현재 연합의 전체 인구 수
        int count = 1; // 현재 연합의 국가 수
        // 큐가 빌 때까지 반복(BFS)
        while (!q.isEmpty()) {
            Dot2 pos = q.poll();
            x = pos.getX();
            y = pos.getY();
            // 현재 위치에서 4가지 방향을 확인하며
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                // 바로 옆에 있는 나라를 확인하여
                if (0 <= nx && nx < n && 0 <= ny && ny < n && unions[nx][ny] == -1) {
                    // 옆에 있는 나라와 인구 차이가 L명 이상, R명 이하라면
                    int gap = Math.abs(graph[nx][ny] - graph[x][y]);
                    if (l <= gap && gap <= r) {
                        q.offer(new Dot2(nx, ny));
                        // 연합에 추가하기
                        unions[nx][ny] = index;
                        summary += graph[nx][ny];
                        count += 1;
                        united.add(new Dot2(nx, ny));
                    }
                }
            }
        }
        // 연합 국가끼리 인구를 분배
        for (int i = 0; i < united.size(); i++) {
            x = united.get(i).getX();
            y = united.get(i).getY();
            graph[x][y] = summary / count;
        }
    }
}

