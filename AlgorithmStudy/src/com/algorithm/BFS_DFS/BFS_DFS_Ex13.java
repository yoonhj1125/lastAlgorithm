package com.algorithm.BFS_DFS;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class BFS_DFS_Ex13 {
	
	
	//13. BFS/DFS 알고리즘 : 연산자 끼워넣

	/*
	N개의 수로 이루어진 수열 A1, A2, ..., AN이 주어진다. 또, 수와 수 사이에 끼워넣을 수 있는 N-1개의 연산자가 주어진다. 연산자는 덧셈(+), 뺄셈(-), 곱셈(×), 나눗셈(÷)으로만 이루어져 있다.

		우리는 수와 수 사이에 연산자를 하나씩 넣어서, 수식을 하나 만들 수 있다. 이때, 주어진 수의 순서를 바꾸면 안 된다.
		
		예를 들어, 6개의 수로 이루어진 수열이 1, 2, 3, 4, 5, 6이고, 주어진 연산자가 덧셈(+) 2개, 뺄셈(-) 1개, 곱셈(×) 1개, 나눗셈(÷) 1개인 경우에는 총 60가지의 식을 만들 수 있다. 예를 들어, 아래와 같은 식을 만들 수 있다.
		
		1+2+3-4×5÷6
		1÷2+3+4-5×6
		1+2÷3×4-5+6
		1÷2×3-4+5+6
		식의 계산은 연산자 우선 순위를 무시하고 앞에서부터 진행해야 한다. 또, 나눗셈은 정수 나눗셈으로 몫만 취한다. 음수를 양수로 나눌 때는 C++14의 기준을 따른다. 즉, 양수로 바꾼 뒤 몫을 취하고, 그 몫을 음수로 바꾼 것과 같다. 이에 따라서, 위의 식 4개의 결과를 계산해보면 아래와 같다.
		
		1+2+3-4×5÷6 = 1
		1÷2+3+4-5×6 = 12
		1+2÷3×4-5+6 = 5
		1÷2×3-4+5+6 = 7
		N개의 수와 N-1개의 연산자가 주어졌을 때, 만들 수 있는 식의 결과가 최대인 것과 최소인 것을 구하는 프로그램을 작성하시오.
		  
		첫째 줄에 수의 개수 N(2 ≤ N ≤ 11)가 주어진다. 둘째 줄에는 A1, A2, ..., AN이 주어진다. (1 ≤ Ai ≤ 100) 셋째 줄에는 합이 N-1인 4개의 정수가 주어지는데, 차례대로 덧셈(+)의 개수, 뺄셈(-)의 개수, 곱셈(×)의 개수, 나눗셈(÷)의 개수이다. 


			
			=> https://www.youtube.com/watch?v=Bc34h7xPTL8 참조 
	 */
	
	 public static int n;
	    // 연산을 수행하고자 하는 수 리스트
	    public static ArrayList<Integer> arr = new ArrayList<>();
	    // 더하기, 빼기, 곱하기, 나누기 연산자 개수
	    public static int add, sub, mul, divi;
	    
	    // 최솟값과 최댓값 초기화
	    public static int minValue = (int) 1e9;
	    public static int maxValue = (int) -1e9;

	    // 깊이 우선 탐색 (DFS) 메서드
	    public static void dfs(int i, int now) {
	        // 모든 연산자를 다 사용한 경우, 최솟값과 최댓값 업데이트
	        if (i == n) {
	            minValue = Math.min(minValue, now);
	            maxValue = Math.max(maxValue, now);
	        }
	        else {
	            // 각 연산자에 대하여 재귀적으로 수행
	            if (add > 0) {
	                add -= 1;
	                dfs(i + 1, now + arr.get(i));
	                add += 1;
	            }
	            if (sub > 0) {
	                sub -= 1;
	                dfs(i + 1, now - arr.get(i));
	                sub += 1;
	            }
	            if (mul > 0) {
	                mul -= 1;
	                dfs(i + 1, now * arr.get(i));
	                mul += 1;
	            }
	            if (divi > 0) {
	                divi -= 1;
	                dfs(i + 1, now / arr.get(i));
	                divi += 1;
	            }
	        }
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        n = sc.nextInt();

	        for (int i = 0; i < n; i++) {
	            int x = sc.nextInt();
	            arr.add(x);
	        }

	        add = sc.nextInt();
	        sub = sc.nextInt();
	        mul = sc.nextInt();
	        divi = sc.nextInt();

	        // DFS 메서드 호출
	        dfs(1, arr.get(0));

	        // 최댓값과 최솟값 차례대로 출력
	        System.out.println(maxValue);
	        System.out.println(minValue);
	    }
    
    
}

