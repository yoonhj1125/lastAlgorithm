package com.algorithm.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;



public class graphhEx6 {
 
	//1. 그래프 알고리즘 : 
	
	/**
	 * 팀결성 : 학교에서 학생들에게 0번부터 N번까지 번호를 부여했다. 처음에는 모든 학생이 서로 다른 팀으로 구분되어 총 N+1개의 팀이 존재한다. 이때 선생님이 '팀 합치기' 와 '같은 팀 여부 확인' 연산을할수있다.
	 * 1. 팀합치기 연산은 두 팀을 합치는 연산이다.
	 * 2. 같은 팀 확인 여부 연산은 특정한 두 학생이 같은 팀에 속하는 지 확인한다.
	 * 선생님이 M개의 연산을 수행할 때, 같은 팀 여부 확인연산에 대한 연산결과를 출력하는 프로그램을 작성하세요,.
	 * 
	 *  => 서로소 집합 문제 
	 */
	public static int n, m;
	public static int[] team = new int[100001];
	public static List<String> result = new ArrayList<>();
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		
		for (int i = 0; i <= n; i++) {
			team[i] = i;
		}
	
		for (int i = 0; i < m; i++) {
			int f = sc.nextInt();
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(f == 0) {
				//합치기
			unionTeam(a,b);
				
			}else {
				result.add(findTeam(a) == findTeam(b) ? "YES" : "NO");
			}
			
		}
	}

	private static void unionTeam(int a, int b) {
		a = findTeam(a);
		b = findTeam(b);
		if(a<b) team[b] = a;
		else team[a] = b;
		
	}

	private static int findTeam(int a) {
		if(team[a] == a) return a;
		return team[a] = findTeam(team[a]);
	}

}