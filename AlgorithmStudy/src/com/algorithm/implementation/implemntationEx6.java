package com.algorithm.implementation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class implemntationEx6 {
		// TODO Auto-generated method stub
		
		//6. 구현 알고리즘 :  럭키 스트레이트    
		
		/**
		 * Question. 어딴 게임의 아웃복서 캐릭터에게는 럭키 스트레이트라는 기술이 존재한다. 이 기술은 매우 강력한 대신 항상 사용할 수 없는 사용할수는 없으며, 현재 게임 내에서 점수가 특정 조건을 만족할 때만 사용할 수 있다.
		 * 특정 조건이란 현재 캐릭터의 점수를 N이라고 할때 점수 N을 자릿수 기준으로 반 나누어 왼쪽 부분의 각 자릿수 합과 오른쪽 자릿수의 합을 더한 값이 동일한상황을 의미한다.
		 * 
		 * 예를들어, 123,402라고 할때 왼쪽 부분의 각 자릿수의 합은 1+2+3, 오른쪽 자릿수의 합은 4+0+2 이므로 두 합이 6으로 동일하여 럭키스트레이트를 사용할 수 있다.
		 * 
		 * 현재 점수 N이 주어졌을 때, 럭키 스트레이트를 사용할수 있는 상태인지 아닌지를 알려주는 프로그램을 작성하시오. 사용할 수 있다면 LUCKY 없다면 READY 라는 단어를 출력하게 하라.
		 * 단, 점수 N의 자릿수는 항상 짝수로만 주어진다. 
		 *		
		 * HOW TO ? 
		 *
		 * 
		 *  
		 */
	    public static void main(String[] args) {
	    	
	       Scanner sc = new Scanner(System.in);
	       String str = sc.next();
	       int left = 0;
	       int right = 0;
	       for (int i = 0; i < str.length() / 2; i++) {
	    	   left += str.charAt(i) -'0';
	       }
	       
	       for (int i = str.length()/2; i < str.length(); i++) {
	    	   right += str.charAt(i)-'0';
	       }
	       
	       System.out.println(left);
	       System.out.println(right);
	       
	       if(left == right) {
	    	   System.out.println("LUCKY");
	       }else {
	    	   System.out.println("READY");
	       }
	    }
	
}