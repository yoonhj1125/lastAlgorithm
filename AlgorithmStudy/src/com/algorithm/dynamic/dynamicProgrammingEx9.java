package com.algorithm.dynamic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class dynamicProgrammingEx9 {


	//1. 다이나믹 알고리즘 : 병사배치하기  
	
	/**
	 * N명의 병사가 무작위로 정렬되어 있습니다. 각 병사는 특정한 값의 전투력을 보유하고 있습니다. 
	 * 병사를 배치할때ㅐ는 전투력이 높은 병사가 앞쪽에 오도록 내림차순으로 배치를 하고자 합니다. 다시말에 앞쪽의 병사의 전투력은 항상 뒤쪽에 있는 병사보다 높아야 합니다.
	 * 또한 배치 과정에서 특정한 위치에 있는 병사를 열외시키는 방법을 이용합니다. 그러면서 남은 병사의 수가 최대로 되도록 하려고 합니다
	 * 
	 * ???
	 */
    // 앞서 계산된 결과를 저장하기 위한 DP 테이블 초기화 
	 static int n;
	    static ArrayList<Integer> v = new ArrayList<Integer>();
	    static int[] dp = new int[2000];

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        n = sc.nextInt();

	        for (int i = 0; i < n; i++) {
	            v.add(sc.nextInt());
	        }

	        // 순서를 뒤집어 '최장 증가 부분 수열' 문제로 변환
	        Collections.reverse(v);

	        // 다이나믹 프로그래밍을 위한 1차원 DP 테이블 초기화
	        for (int i = 0; i < n; i++) {
	            dp[i] = 1;
	        }

	        // 가장 긴 증가하는 부분 수열(LIS) 알고리즘 수행
	        for (int i = 1; i < n; i++) {
	            for (int j = 0; j < i; j++) {
	                if (v.get(j) < v.get(i)) {
	                    dp[i] = Math.max(dp[i], dp[j] + 1);
	                }
	            }
	        }

	        // 열외해야 하는 병사의 최소 수를 출력
	        int maxValue = 0;
	        for (int i = 0; i < n; i++) {
	            maxValue = Math.max(maxValue, dp[i]);
	        }
	        System.out.println(n - maxValue);
	}
}
	
	

