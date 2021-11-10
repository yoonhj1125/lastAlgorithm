package com.algorithm.shortestParh;
import java.util.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class shortestPathEx6 {
 
	//1. 최단경로 알고리즘 : 
	
	/**
	 * 정확한 순위  
	 * 
	 *	학생들의 성적을 비교한 결과가 주어질 때, 성적 순위를 정확히 알 수 있는 학생은 모두 몇 명인지 계산하는 프로그램을 작성하세요.

		첫째 줄에 학생들의 수 N, 두 학생의 성적을 비교한 횟수 M
		다음 M개의 각 줄에는 두 학생의 성적을 비교한 결과를 나타내는 두 양의 정수 A와 B가 주어집니다. 이는 A번 학생의 성적이 B번 학생보다 낮다는 것을 의미합니다.


	 */

    public static final int INF = (int) 1e9; // 무한을 의미하는 값으로 10억을 설정
    // 노드의 개수(N), 간선의 개수(M)
    public static int n, m;
    // 2차원 배열(그래프 표현)를 만들기
    public static int[][] graph = new int[501][501];


	public static void main(String[] args) {
		 	Scanner sc = new Scanner(System.in);

	        n = sc.nextInt();
	        m = sc.nextInt();

	        // 최단 거리 테이블을 모두 무한으로 초기화
	        for (int i = 0; i < 501; i++) {
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
	            graph[a][b] = 1;
	        }

	        // 점화식에 따라 플로이드 워셜 알고리즘을 수행
	        for (int k = 1; k <= n; k++) {
	            for (int a = 1; a <= n; a++) {
	                for (int b = 1; b <= n; b++) {
	                    graph[a][b] = Math.min(graph[a][b], graph[a][k] + graph[k][b]);
	                }
	            }
	            
	        }
	        int result = 0;
	        // 각 학생을 번호에 따라 한 명씩 확인하며 도달 가능한지 체크
	        for (int i = 1; i <= n; i++) {
	            int cnt = 0;
	            for (int j = 1; j <= n; j++) {
	                if (graph[i][j] != INF || graph[j][i] != INF) {
	                    cnt += 1;
	                }
	            }
	            if (cnt == n) {
	                result += 1;
	            }
	        }
	        System.out.println(result);
	}
}

