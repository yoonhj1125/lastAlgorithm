package com.algorithm.greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class greedyex6 {

	public static void main(String[] args) {
		//6. Greedy알고리즘 :  곱하기 혹은 나누
		
		/**
		 * Question. 각 자리가 숫자(0~9) 로만 이루어진 문자열 s가 주어졌을 때, 왼쪽부터 오른쪽으로 하나씩 모든 숫자를 확인하며, 숫자사이에 
		 * * 혹은 + 연산을 넣어 만들어질 수 있는 가장 큰수를 구하는 프로그램을 작성하세요.
		 * 
		 * 
		 * HOW TO ? 
		 * 0이거나 1인경우를 제외하면 모두 * 연산자를 쓴다.
		 * 입력 : 02984
		 */
	
	Scanner sc = new Scanner(System.in);
	String S = sc.next();
	
	char c = S.charAt(0);
	int temp  = c - '0';
	int result = temp;	//결과값
	System.out.println(result);
	System.out.println(temp);

	for(int i = 1 ; i < S.length(); i++) {
		int num = S.charAt(i) - '0';
		if(result<=1 || num <=1) {
			result += num;
		}else {
			result *= num;
		}
	}
	System.out.println(result);
	}
	
		
}
