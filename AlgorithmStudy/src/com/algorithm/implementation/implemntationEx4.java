package com.algorithm.implementation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class implemntationEx4 {
		// TODO Auto-generated method stub
		
		//4. 구현 알고리즘 :  문자열 재정렬   
		
		/**
		 * Question. 알파벳 대문자와 숫자(0~9)로만 구성된 문자열이 입력으로 주어짐. 이때 모든 알파벳을 오름차순으로 정렬하여 출력한 후, 그 뒤에 모든 숫자를 더한 값을 이어서 출력한다.
		 * 예를 들어, K1KA5CB7 라는 값이 들어오면 ABCKK13을 출력한
		 * 
		 * HOW TO ? 
		 * 문자연이 입력되었을 때, 문자를 하나씩 확인한다.
		 * 1. 숫자인 경우, 따로 합계를 계산한다.
		 * 2. 알파벳은 경우 별도의 리스트에 저장한다.
		 * 
		 *  
		 */
	public static ArrayList<Character> array = new ArrayList<Character>();
	public static int result = 0;	
	    public static void main(String[] args) {
	    	
	       Scanner sc = new Scanner(System.in);
	       String str = sc.next();
	       
	       for (int i = 0; i < str.length(); i++) {
	    	   if(Character.isLetter(str.charAt(i))) {
	    		   array.add(str.charAt(i)); //알파벳이면 리스트에 담
	    	   }else {
		    	   result += str.charAt(i) -'0';
		       }
	    	   
	       }
	       
	       Collections.sort(array);
	       for (int i = 0; i < array.size(); i++) {
	    	   System.out.print(array.get(i));
	       }

	       if(result != 0 ) {System.out.print(result);
	    	   
	       }
	       System.out.println();
	    }
	
}