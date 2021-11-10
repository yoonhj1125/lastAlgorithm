package com.algorithm.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;



public class graphhEx7 {
 
	//1. 그래프 알고리즘 : 
	
	/**
	 * 동물원에서 막 탈출한 원숭이 한 마리가 세상구경을 하고 있다. 그러다가 평화로운 마을에 가게 되었는데, 그곳에서는 알 수 없는 일이 벌어지고 있었다.
		마을은 N개의 집과 그 집들을 연결하는 M개의 길로 이루어져 있다. 길은 어느 방향으로든지 다닐 수 있는 편리한 길이다. 그리고 각 길마다 길을 유지하는데 드는 유지비가 있다.
		마을의 이장은 마을을 두 개의 분리된 마을로 분할할 계획을 가지고 있다. 마을이 너무 커서 혼자서는 관리할 수 없기 때문이다. 마을을 분할할 때는 각 분리된 마을 안에 집들이 서로 연결되도록 분할해야 한다.
		각 분리된 마을 안에 있는 임의의 두 집 사이에 경로가 항상 존재해야 한다는 뜻이다. 마을에는 집이 하나 이상 있어야 한다.
		그렇게 마을의 이장은 계획을 세우다가 마을 안에 길이 너무 많다는 생각을 하게 되었다. 일단 분리된 두 마을 사이에 있는 길들은 필요가 없으므로 없앨 수 있다. 
		그리고 각 분리된 마을 안에서도 임의의 두 집 사이에 경로가 항상 존재하게 하면서 길을 더 없앨 수 있다. 마을의 이장은 위 조건을 만족하도록 길들을 모두 없애고 나머지 길의 유지비의 합을 최소로 하고 싶다. 이것을 구하는 프로그램을 작성하시오.
	  => 크루스칼 알고리즘
	 */
	 // 노드의 개수(V)와 간선(Union 연산)의 개수(E)
    public static int v, e;
    public static int[] parent = new int[100001]; // 부모 테이블 초기화
    // 모든 간선을 담을 리스트와, 최종 비용을 담을 변수
    public static ArrayList<Edge> edges = new ArrayList<>();
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

	        v = sc.nextInt();
	        e = sc.nextInt();

	        // 부모 테이블상에서, 부모를 자기 자신으로 초기화
	        for (int i = 1; i <= v; i++) {
	            parent[i] = i;
	        }
	        // 모든 간선에 대한 정보를 입력 받기
	        for (int i = 0; i < e; i++) {
	            int a = sc.nextInt();
	            int b = sc.nextInt();
	            int cost = sc.nextInt();
	            // 비용순으로 정렬하기 위해서 튜플의 첫 번째 원소를 비용으로 설정
	            edges.add(new Edge(cost, a, b));
	        }

	        // 간선을 비용순으로 정렬
	        Collections.sort(edges);
	        int last = 0; // 최소 신장 트리에 포함되는 간선 중에서 가장 비용이 큰 간선

	        // 간선을 하나씩 확인하며
	        for (int i = 0; i < edges.size(); i++) {
	            int cost = edges.get(i).getDistance();
	            int a = edges.get(i).getNodeA();
	            int b = edges.get(i).getNodeB();
	            // 사이클이 발생하지 않는 경우에만 집합에 포함
	            if (findParent(a) != findParent(b)) {
	                unionParent(a, b);
	                result += cost;
	                last = cost;
	            }
	        }

	        System.out.println(result - last);
	}



}