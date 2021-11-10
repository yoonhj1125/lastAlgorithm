package com.algorithm.greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class greedyex7 {

	public static void main(String[] args) {
		//8. Greedy알고리즘 :  만들수 있는 
		
		/**
		 * Question. 편의점 주인인 동빈이는 N개의 동전을 가지고 있다. 이때 N개의 동전을 이용해서 만들 수 없는 양의정수 금액 중 최솟값을 구하는 프로그램을 작성해라
		 * 
		 * ex) N = 5, 각 동전이 각각 3,2,1,1,9원짜리(화폐단위) 동전이라고 가정하면 만들수 없는 양의 정수 금액중 최솟값은 8원이다.
		 * ex) N = 3, 각 동전이 각각 3,5,7원짜리(화폐단위) 동전이라고 가정하면 만들수 없는 양의 정수 금액중 최솟값은 1원이다.
		 * 
		 * HOW TO ? 
		 * 0이거나 1인경우를 제외하면 모두 * 연산자를 쓴다.
		 * 입력 : 02984
		 */
	
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	int result = 0;
	ArrayList<Integer> array = new ArrayList<Integer>();
	
	for (int i = 0; i < N; i++) {
		array.add(sc.nextInt());
	}
	Collections.sort(array);
	
	int temp = 1;
	for (int i = 0; i < N; i++) {
		if(temp < array.get(i)) {
			break;
		}else {
			temp = temp + array.get(i);
		}
		
	}
	System.out.println(temp);
	
	}
	
		
}
