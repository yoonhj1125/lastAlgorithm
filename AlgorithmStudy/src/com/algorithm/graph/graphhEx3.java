package com.algorithm.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;



public class graphhEx3 {
 
	//1. 그래프 알고리즘 : 
	
	/**
	 *  그래프 알고리즘 :
	 * 1-3. 사이클 판별 알고리즘 (DFS 알고리즘을 이용해서 판별할 수 있다.)
	 * 	서로소 집합은 무방향 그래스 내에서의 사이클을 판별할 때 사용할수 있다.
	 * 	1. 각 간선을 하나씩 확인하며 두 노드의 루트노드를 확한다.
	 * 	2. 루트 노드가 서로 다르다면, 두 노드에 대하여 합집합 연산을 수행한다.
	 * 	3. 로트 노드가 서로 같다면, 사이클이 발생한다.
	 * 
	 */

    // 두 원소가 속한 집합을 합치기
    public static void unionParent(int a, int b) {
        a = findParent(a);
        b = findParent(b);
        if (a < b) parent[b] = a;
        else parent[a] = b;
    }

    // 특정 원소가 속한 집합을 찾기
    public static int findParent(int x) {   
    	// 루트 노드가 아니라면, 루트 노드를 찾을 때까지 재귀적으로 호출
        if (x == parent[x]) return x;
        return parent[x] = findParent(parent[x]);
    }
	
    public static int v, e;	//노드의 갯수V, 간선의 갯수E
    public static int[] parent = new int[1000001];	//부모 테이블 초기
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		v = sc.nextInt();	//노드의 갯수 
		e = sc.nextInt();	//간선의 갯수 
		
		// 부모 테이블상에서, 부모를 자기 자신으로 초기화
        for (int i = 1; i <= v; i++) {
            parent[i] = i;
        }
        boolean cycle = false; // 사이클 발생 여부

        	
        for (int i = 0; i < e; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            // 사이클이 발생한 경우 종료
            if (findParent(a) == findParent(b)) {
                cycle = true;
                break;
            }
            // 사이클이 발생하지 않았다면 합집합(Union) 연산 수행
            else {
                unionParent(a, b);
            }
        }

        if (cycle) {
            System.out.println("사이클이 발생했습니다.");
        }
        else {
            System.out.println("사이클이 발생하지 않았습니다.");
        }
	}
}
