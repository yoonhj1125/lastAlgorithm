package com.algorithm.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;



public class graphhEx9 {
 
	//1. 그래프 알고리즘 : 
	
	/**
	공항에는 G개의 게이트가 있으며 각각은 1에서 G까지의 번호를 가지고 있다.
	공항에는 P개의 비행기가 순서대로 도착할 예정이며, 당신은 i번째 비행기를 1번부터 gi (1 ≤ gi ≤ G) 번째 게이트중 하나에 영구적으로 도킹하려 한다. 
	비행기가 어느 게이트에도 도킹할 수 없다면 공항이 폐쇄되고, 이후 어떤 비행기도 도착할 수 없다.
	신승원은 가장 많은 비행기를 공항에 도킹시켜서 박승원을 행복하게 하고 싶어한다. 승원이는 비행기를 최대 몇 대 도킹시킬 수 있는가?
	
	참조 :  https://chanhuiseok.github.io/posts/baek-25/
	 */
	// 탑승구의 개수와 비행기의 개수
    public static int g, p;
    public static int[] parent = new int[100001]; // 부모 테이블 초기화

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

        g = sc.nextInt();
        p = sc.nextInt();

        // 부모 테이블상에서, 부모를 자기 자신으로 초기화
        for (int i = 1; i <= g; i++) {
            parent[i] = i;
        }

        int result = 0;
        for (int i = 0; i < p; i++) {
            int x = sc.nextInt();
            int root = findParent(x); // 현재 비행기의 탑승구의 루트 확인
            if (root == 0) break; // 현재 루트가 0이라면, 종료
            unionParent(root, root - 1); // 그렇지 않다면 바로 왼쪽의 집합과 합치기
            result += 1;
        }
	}
}