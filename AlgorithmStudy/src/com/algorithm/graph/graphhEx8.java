package com.algorithm.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;



public class graphhEx8 {
 
	//1. 그래프 알고리즘 : 
	
	/**
	 임의의 두 여행지 사이에는 양방향 도로가 있다. 여행계획은 여행지의 수 N과 여행 계획에 속한 도시의 수 M으로 이뤄진다. 
	 한울이는 하나의 여행 계획을 세운 뒤에 이 여행 계획이 가능한지의 여부를 판별하는 프로그램을 작성하시오. (1 ≤ N, M ≤ 500)
	 => 서로소 문제 
	 */
    // 여행지의 개수와 여행 계획에 속한 여행지의 개수
    public static int n, m;
    public static int[] parent = new int[501]; // 부모 테이블 초기화
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

        // Union 연산을 각각 수행
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int x = sc.nextInt();
                if (x == 1) { // 연결된 경우 합집합(Union) 연산 수행
                    unionParent(i + 1, j + 1);
                }
            }
        }

        // 여행 계획 입력받기
        ArrayList<Integer> plan = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            int x = sc.nextInt();
            plan.add(x);
        }

        boolean result = true;
        // 여행 계획에 속하는 모든 노드의 루트가 동일한지 확인
        for (int i = 0; i < m - 1; i++) {
            if (findParent(plan.get(i)) != findParent(plan.get(i + 1))) {
                result = false;
            }
        }

        // 여행 계획에 속하는 모든 노드가 서로 연결되어 있는지(루트가 동일한지) 확인
        if (result) System.out.println("YES");
        else System.out.println("NO");
	}
}