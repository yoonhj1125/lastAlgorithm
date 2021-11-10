package com.algorithm.greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class greedyex8 {

	public static void main(String[] args) {
		//8. Greedy알고리즘 :  문자열 뒤집기  
		
		/**
		 * Question. 다솜이는 0과 1로 이루어진 문자열 S를 가지고 있습니다. 이 문자열 S에 들어있는 모든 숫자를 같게 만들려고 합니다. 
		 * 다솜이가 할 수 있는 행동은 S에서 연속된 하나이상의 숫자를 잡고 모두 뒤집는 것입니다. 뒤집는 다는 것은 1-> 0으로 0-> 1로 바꾸는 것을 의미합니다.
		 * 
		 * ex) S = 0001100
		 * 1. 전체를 뒤집으면 1110011이 됩니다.
		 * 2. 4번째 문자부터 5번째 문자까지 뒤집으면 1111111이 되어서 두번만에 모두 같은 숫자로 만들 수 있습니다.
		 * 		   
		 * 문자열이 주어졌을 때, 같은 숫자로 만들수있는 최소횟수를 구하세요
		 * 
		 * HOW TO ? 
		 * 0이거나 1인경우를 제외하면 모두 * 연산자를 쓴다.
		 * 입력 : 02984
		 */
	
	Scanner sc = new Scanner(System.in);
	String S = sc.next();
	int count0 = 0;
	int count1 = 1;
	
	int result = 0;

	if(S.charAt(0) == '1') {
		count0++;
	}else {
		count1++;
	}
	
	for(int i = 0; i < S.length() -1 ; i++) {
		//첫번째 문자열이랑 두번째 문자열이랑 다른경우,
		if(S.charAt(i) != S.charAt(i+1)) {
			if(S.charAt(i+1) =='1') {
				count0++;
			}else {
				count1++;
			}
		}
	}
	System.out.println(Math.min(count0, count1));
	}
	
		
}
