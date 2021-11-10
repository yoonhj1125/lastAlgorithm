package com.algorithm.BFS_DFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFS_DFS_Ex9 {
	
	//9. BFS/DFS 알고리즘 : 특정거리의 도시 찾기  

	/*
	 * 어떤 나라에는 1번부터 N번까지의 도시와 M개의 단방향 도로가 존재한다. 모든 도로의 거리는 1이다.
	 * 이 때 특정한 도시 X로부터 출발하여 도달할 수 있는 모든 도시 중에서, 최단 거리가 정확히 K인 모든 도시들의 번호를 출력하는 프로그램을 작성하시오. 또한 출발 도시 X에서 출발 도시 X로 가는 최단 거리는 항상 0이라고 가정한다.
	 * 예를 들어 N=4, K=2, X=1일 때 다음과 같이 그래프가 구성되어 있다고 가정하자.
	 * 
	 * 첫째줄에, 도시의 개수 N, 도로의 갯수 M, 거리정보 K, 출발도시 번호 X \
	 * 
	 * 원하는 값 X로부터 출발하여 도달할 수 있는 도시 중에서, 최단 거리가 K인 모든 도시의 번호를 한 줄에 하나씩 오름차순으로 출력한다.
		이 때 도달할 수 있는 도시 중에서, 최단 거리가 K인 도시가 하나도 존재하지 않으면 -1을 출력한다.
		
		===> BFS 문
	 */
	
	
	   // 도시의 개수, 도로의 개수, 거리 정보, 출발 도시 번호
    public static int n, m, k, x;
    public static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
    // 모든 도시에 대한 최단 거리 초기화
    public static int[] d = new int[300001];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();	//도시갯
        m = sc.nextInt();	//도로갯
        k = sc.nextInt();	//도로정
        x = sc.nextInt();	//출발위치 

        // 그래피 및 최단 거리 테이블 초기화
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<Integer>());
            d[i] = -1;
        }

        // 모든 도로 정보 입력 받기
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph.get(a).add(b);
        }

        // 출발 도시까지의 거리는 0으로 설정
        d[x] = 0;

        // 너비 우선 탐색(BFS) 수행
        Queue<Integer> q = new LinkedList<Integer>();
        q.offer(x);
        while (!q.isEmpty()) {
            int now = q.poll();
            // 현재 도시에서 이동할 수 있는 모든 도시를 확인
            for (int i = 0; i < graph.get(now).size(); i++) {
                int nextNode = graph.get(now).get(i);
                // 아직 방문하지 않은 도시라면
                if (d[nextNode] == -1) {
                    // 최단 거리 갱신
                    d[nextNode] = d[now] + 1;
                    q.offer(nextNode);
                }
            }
        }

        // 최단 거리가 K인 모든 도시의 번호를 오름차순으로 출력
        boolean check = false;
        for (int i = 1; i <= n; i++) {
            if (d[i] == k) {
                System.out.println(i);
                check = true;
            }
        }

        // 만약 최단 거리가 K인 도시가 없다면, -1 출력
        if (!check) System.out.println(-1);
    }
}
