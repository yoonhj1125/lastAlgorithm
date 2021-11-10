package com.algorithm.BFS_DFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS_DFS_Ex6 {
	
	public static boolean[] visited = new boolean[9];	//방문여부를 결정하는 불리안변수(0은 사용하지 않으므료 9개로 초기화)
	public static ArrayList<ArrayList<Integer>> g = new ArrayList<ArrayList<Integer>>();	//2차원의 배열형태로 지정 
	
	
	public static void bfs(int n) {
		Queue<Integer> q = new LinkedList<>();
		q.offer(n);
		visited[n] = true;
		
		while(!q.isEmpty()) {
			int x = q.poll();
			System.out.println("큐에서 제거된 x의 값 : " + x);
			for (int i = 0; i < g.get(x).size(); i++) {
				int y = g.get(x).get(i);
				System.out.println("Y : " + y);
				if(!visited[y]) {
					q.offer(y);
					visited[y] = true;
					
				}
				
			}
			
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//6. BFS/DFS 알고리즘 : BFS(Breadth-First Search) 넓이 우선 탐
		
		/*
		 * BFS는 너비우선 탐색이라고도 하며, 그래프에서 가까운 노드부터 우선적으로 탐색하는 알고리즘이다.
		 * 큐 자료구조를 사용, 
		 * 1. 탐색 시작 노드를 큐에 삽입하고 방문처리
		 * 2. 큐에서 노드를 꺼낸 뒤에 해당 노드의 인접 노드중에서 방문하지 않은 노드를 모두 큐에 삽입하고 방문처리한다.
		 * 3. 더 이상 2번 과정을 수행할 수 없을 때까지 반복한다.
		 */
		
		
		// 그래프 초기화
        for (int i = 0; i < 9; i++) {
            g.add(new ArrayList<Integer>());
        }

        // 노드 1에 연결된 노드 정보 저장 
        g.get(1).add(2);
        g.get(1).add(3);
        g.get(1).add(8);
        
        // 노드 2에 연결된 노드 정보 저장 
        g.get(2).add(1);
        g.get(2).add(7);
        
        // 노드 3에 연결된 노드 정보 저장 
        g.get(3).add(1);
        g.get(3).add(4);
        g.get(3).add(5);
        
        // 노드 4에 연결된 노드 정보 저장 
        g.get(4).add(3);
        g.get(4).add(5);
        
        // 노드 5에 연결된 노드 정보 저장 
        g.get(5).add(3);
        g.get(5).add(4);
        
        // 노드 6에 연결된 노드 정보 저장 
        g.get(6).add(7);
        
        // 노드 7에 연결된 노드 정보 저장 
        g.get(7).add(2);
        g.get(7).add(6);
        g.get(7).add(8);
        
        // 노드 8에 연결된 노드 정보 저장 
        g.get(8).add(1);
        g.get(8).add(7);
		
		System.out.println("배열  : "+g);
		bfs(1);
		
	
	
	}

}
