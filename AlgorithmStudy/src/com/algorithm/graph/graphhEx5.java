package com.algorithm.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;



public class graphhEx5 {
 
	//1. 그래프 알고리즘 : 
	
	/**
	 *  위상 정렬 :
	 *  사이클이 없는 방향 그래프의 모든 노드를 방향성에 거스르지 않도록 순서대로 나열하는 것을 의미
	 * 	1. 집입차수 : 특정한 노드로 들어오는 간선의 갯수
	 * 	2. 진출차수 :  특정한 노드에서 나가는 간선의 갯수 
	 * 
	 * 	큐를 이용하는 위상정렬
	 * 	1. 진입차수가 0인 노드를 모두큐에 넣는다.
	 * 	2. 큐에서 원소를 꺼내 해당 노드에서 나가는 간선을 그래프에서 제거한다.
	 * 	3. 새롭게 진입차수가 0이 된 노드를 큐에 넣는다.
	 * 	4. 결과적으로, 각 노드가 큐에 들어온 순서가 위상정렬을 수행한 결과이다.
	 * 
	 *  위상정렬은 DAG(Direct Acyclic Graph) 순환하지 않는 방향그래프에서만 수행가능하다.
	 *  여러개의 해답이 존재할 수 있다.
	 *  모든 원소를 방문하기 전에 큐가 빈다면 사이클이 존재한다고 단한다.
	 *  스택을 통한 DFS를 이용해도 해결할 수 있다.
	 */


    public static int v, e;
    public static int[] indegree = new int [1000001];
    public static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		v = sc.nextInt();
		e = sc.nextInt();
				
		for (int i = 0; i < v; i++) {
			graph.add(new ArrayList<Integer>());
		}
				
		for (int i = 0; i < e; i++) {
			int a = sc.nextInt();	
			int b = sc.nextInt();
			graph.get(a).add(b);
		}
			topologiSrot();
	}

	private static void topologiSrot() {
		ArrayList<Integer> result = new ArrayList<Integer>();
		Queue<Integer> q = new LinkedList<>();
		
		for (int i = 0; i < v; i++) {
			if (indegree[i] == 0) {
				q.offer(i);
			}
		}
		// 큐가 빌 때까지 반복
		while (!q.isEmpty()) {
		// 큐에서 원소 꺼내기
		int now = q.poll();
		            result.add(now);
		// 해당 원소와 연결된 노드들의 진입차수에서 1 빼기
		for (int i = 0; i < graph.get(now).size(); i++) {
		                indegree[graph.get(now).get(i)] -= 1;
		// 새롭게 진입차수가 0이 되는 노드를 큐에 삽입
		if (indegree[graph.get(now).get(i)] == 0) {
		                    q.offer(graph.get(now).get(i));
		                }
		            }
		        }
		// 위상 정렬을 수행한 결과 출력
		for (int i = 0; i < result.size(); i++) {
		System.out.print(result.get(i) + " ");
		        }
		    }

	}
