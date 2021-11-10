package com.algorithm.shortestParh;
import java.util.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class shortestPathEx5 {
 
	//1. 최단경로 알고리즘 : 
	
	/**
	 * 플로이드 
	 * 
	 *	n(2 ≤ n ≤ 100)개의 도시가 있다. 그리고 한 도시에서 출발하여 다른 도시에 도착하는 m(1 ≤ m ≤ 100,000)개의 버스가 있다. 각 버스는 한 번 사용할 때 필요한 비용이 있다.
		모든 도시의 쌍 (A, B)에 대해서 도시 A에서 B로 가는데 필요한 비용의 최솟값을 구하는 프로그램을 작성하시오.
		
		첫째 줄에 도시의 개수 n이 주어지고 둘째 줄에는 버스의 개수 m이 주어진다. 그리고 셋째 줄부터 m+2줄까지 다음과 같은 버스의 정보가 주어진다. 
		먼저 처음에는 그 버스의 출발 도시의 번호가 주어진다. 버스의 정보는 버스의 시작 도시 a, 도착 도시 b, 한 번 타는데 필요한 비용 c로 이루어져 있다. 
		시작 도시와 도착 도시가 같은 경우는 없다. 비용은 100,000보다 작거나 같은 자연수이다.
		시작 도시와 도착 도시를 연결하는 노선은 하나가 아닐 수 있다.
	 */

    public static final int INF = (int) 1e9; // 무한을 의미하는 값으로 10억을 설정
    // 노드의 개수(N), 간선의 개수(M)
    public static int n, m;
    // 2차원 배열(그래프 표현)를 만들기
    public static int[][] graph = new int[101][101];

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);

	        n = sc.nextInt();
	        m = sc.nextInt();

	        // 최단 거리 테이블을 모두 무한으로 초기화
	        for (int i = 0; i < 101; i++) {
	            Arrays.fill(graph[i], INF);
	        }

	        // 자기 자신에서 자기 자신으로 가는 비용은 0으로 초기화
	        for (int a = 1; a <= n; a++) {
	            for (int b = 1; b <= n; b++) {
	                if (a == b) graph[a][b] = 0;
	            }
	        }

	        // 각 간선에 대한 정보를 입력 받아, 그 값으로 초기화
	        for (int i = 0; i < m; i++) {
	            // A에서 B로 가는 비용은 C라고 설정
	            int a = sc.nextInt();
	            int b = sc.nextInt();
	            int c = sc.nextInt();
	            // 가장 짧은 간선 정보만 저장
	            if (c < graph[a][b]) graph[a][b] = c;
	        }

	        // 점화식에 따라 플로이드 워셜 알고리즘을 수행
	        for (int k = 1; k <= n; k++) {
	            for (int a = 1; a <= n; a++) {
	                for (int b = 1; b <= n; b++) {
	                    graph[a][b] = Math.min(graph[a][b], graph[a][k] + graph[k][b]);
	                }
	            }
	        }

	        // 수행된 결과를 출력
	        for (int a = 1; a <= n; a++) {
	            for (int b = 1; b <= n; b++) {
	                // 도달할 수 없는 경우, 무한(INFINITY)이라고 출력
	                if (graph[a][b] == INF) {
	                    System.out.print(0 + " ");
	                }
	                // 도달할 수 있는 경우 거리를 출력
	                else {
	                    System.out.print(graph[a][b] + " ");
	                }
	            }
	            System.out.println();
	}
   }
	  
}

