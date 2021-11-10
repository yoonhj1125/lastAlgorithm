package com.algorithm.dynamic;

import java.util.Scanner;


public class dynamicProgrammingEx4 {


	//1. 다이나믹 알고리즘 :1로 만들기  
	
	/**
	 * 정수 x가 주어질 때, 연산은 다음과 같이 4가지 이다.
	 * 
	 * 1. x가 5로 나누어떨어지면, 5로 나눈다
	 * 2. x가 3으로 나누어떨어지면, 3으로 나눈다,
	 * 3. x가 2로 나누어떨어지면, 2로 나눈다.
	 * 4. x에서 1을 뺸다. 
	 * 
	 * 이 연산을 적절히 이용하여 1을 만들려고 한다. 연산을 사용하는 횟수의 최솟값을 구하세요
	 * 
	 */
	public static int solution(int x) {

        // 다이나믹 프로그래밍(Dynamic Programming) 진행(보텀업)
        for (int i = 2; i <= x; i++) {
            // 현재의 수에서 1을 빼는 경우
        	System.out.println("i : "+ i);
           d[i] = d[i - 1] + 1;
           System.out.println(d[i]);
            // 현재의 수가 2로 나누어 떨어지는 경우
            if (i % 2 == 0) {
            	d[i] = Math.min(d[i], d[i / 2] + 1);
            	System.out.println("여기?1 : " + d[i]);
            }
            // 현재의 수가 3으로 나누어 떨어지는 경우
            if (i % 3 == 0) {
            	d[i] = Math.min(d[i], d[i / 3] + 1);
            	System.out.println("여기?2 : "+ d[i]);
            }
            // 현재의 수가 5로 나누어 떨어지는 경우
            if (i % 5 == 0) {
            	d[i] = Math.min(d[i], d[i / 5] + 1);
            	System.out.println("여기?3 : "+ d[i]);
            }
        }
		return d[x];
	}
	public static int[] d = new int[30001];
	
	//해당문제는 탑다운 방식으로 구현한 피보나치이다. 
	public static void main(String[] args) {
		//System.out.println(solution(26));
		solution(26);
	}	
}
	
	

