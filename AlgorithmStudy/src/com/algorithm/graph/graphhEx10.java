package com.algorithm.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;



public class graphhEx10 {
 
	//1. 그래프 알고리즘 : 
	
	/**
	어두운길
	https://baejinsoo.github.io/알고리즘%20문제풀기/Dark_road/
	크루스칼 알고리즘 
	 */
	 // 노드의 개수와 간선의 개수
    public static int n, m;
    public static int[] parent = new int[200001]; // 부모 테이블 초기화하기
    // 모든 간선을 담을 리스트와, 최종 비용을 담을 변수
    public static ArrayList<Edge> edge = new ArrayList<>();
    public static int result = 0;

    // 특정 원소가 속한 집합을 찾기
    public static int findParent(int x) {
        // 루트 노드가 아니라면, 루트 노드를 찾을 때까지 재귀적으로 호출
        if (x == parent[x]) return x;
        return parent[x] = findParent(parent[x]);
    }
    
    // 두 원소가 속한 집합을 합치기
    public static void unionParent(int a, int b) {
        a = findParent(a);
        b = findParent(b);
        if (a < b) parent[b] = a;
        else parent[a] = b;
    }
	public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in);

	        n = sc.nextInt();
	        m = sc.nextInt();

	        // 부모 테이블상에서, 부모를 자기 자신으로 초기화
	        for (int i = 1; i <= n; i++) {
	            parent[i] = i;
	        }

	        // 모든 간선에 대한 정보를 입력 받기
	        for (int i = 0; i < m; i++) {
	            int x = sc.nextInt();
	            int y = sc.nextInt();
	            int z = sc.nextInt();
	            edge.add(new Edge(z, x, y));
	        }

	        // 간선을 비용순으로 정렬
	        Collections.sort(edge);
	        int total = 0; // 전체 가로등 비용

	        // 간선을 하나씩 확인하며
	        for (int i = 0; i < edge.size(); i++) {
	            int cost = edge.get(i).getDistance();
	            int a = edge.get(i).getNodeA();
	            int b = edge.get(i).getNodeB();
	            total += cost;
	            // 사이클이 발생하지 않는 경우에만 집합에 포함
	            if (findParent(a) != findParent(b)) {
	                unionParent(a, b);
	                result += cost;
	            }
	        }
	}
}
