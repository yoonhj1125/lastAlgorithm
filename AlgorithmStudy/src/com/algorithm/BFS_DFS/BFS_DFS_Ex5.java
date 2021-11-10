package com.algorithm.BFS_DFS;

import java.util.ArrayList;

public class BFS_DFS_Ex5 {
	
	public static boolean[] visited = new boolean[9];	//방문여부를 결정하는 불리안변수(0은 사용하지 않으므료 9개로 초기화)
	public static ArrayList<ArrayList<Integer>> g = new ArrayList<ArrayList<Integer>>();	//2차원의 배열형태로 지정 
	
	//DFS탐색 함수
	public static void dfs(int n) {
		visited[n] = true;	//방문처리한다.
		
		System.out.println(n+ "visited : "+visited[n]);
		
		//재귀적으로 다른 노드 방법 
		for (int i = 0; i < g.get(n).size() ; i++) {
			int y = g.get(n).get(i);
			System.out.println("Y는?"+y);
			if(!visited[y]) {
				dfs(y);
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//5. BFS/DFS 알고리즘 : DFS(Depth First Search) 깊이 우선 탐색 
		
		/*
		 * DFS는 깊이 우선탐색 이라고 부르며,깊은 부분을 우선적으로 탐색하는 알고리즘이다. 스택을 이용한다
		 * 1. 탐색 시작 노드를 스택에 삽입하고 방문처리를 한다.
		 * 2. 스택 최상단 노드에 방문하지 않은 인접한 노드가 하나라도 있느면, 그 노드를 스택에 넣고 방문처리한다. 방문하지 않은 인접 노드가 없으면 스택에서 최상단 노드를 꺼낸다.
		 * 3. 더이상 2번의 과정을 수행할 수 없을때까지 반복한다.
		 * 
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
		dfs(1);
		
	
	
	}

}
