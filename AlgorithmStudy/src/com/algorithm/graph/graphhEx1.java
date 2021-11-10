package com.algorithm.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;



public class graphhEx1 {
 
	//1. 그래프 알고리즘 : 
	
	/**
	 *  그래프 알고리즘 :
	 *  1-1. 서로소 집합 자료구조 : 여러개의 합치기 연산이 주어졌을 때 서로소 집합 자료구조의 동작과정
	 *  	1. A, B의 루트노드 A', B'를 찾는다 (찾기연산)
	 *  	2. A', B'의 부모노드로 설정한다.
	 *  	3. 모든 합집합 연산을 처리할 때까지 1번의 과정을 반복한다(찾기연산)
	 *  * 기본적인 형태의 서로소 집합 자료구조에서는 로트노드에 직접 접근할 수 없다.
	 *  -> 로트 노드를 찾기 위해 부모 테이블을 계속해서 거슬러 올라가야한다.
	 *  
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
        return findParent(parent[x]);
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

        	
        // Union 연산을 각각 수행
        for (int i = 0; i < e; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            unionParent(a, b);
        }
        // 각 원소가 속한 집합 출력하기
        System.out.print("각 원소가 속한 집합: ");
        for (int i = 1; i <= v; i++) {
            System.out.print(findParent(i) + " ");
        }
        System.out.println();

        // 부모 테이블 내용 출력하기
        System.out.print("부모 테이블: ");
        for (int i = 1; i <= v; i++) {
            System.out.print(parent[i] + " ");
        }
        System.out.println();
		}
	}

