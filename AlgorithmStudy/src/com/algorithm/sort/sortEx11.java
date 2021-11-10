package com.algorithm.sort;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;


public class sortEx11 {
	public static int n, result;
		
		//11. 정렬 알고리즘 : 
		
		/**
		 * 정렬이란 ? 데이터를 특정한 기준에 따라 순서대로 나열하는것 
		 *
		 *	11. 카드 정렬하기
		 *	정렬된 두 묶음의 숫자 카드가 있다고 하자. 각 묶음의 카드의 수를 A, B라 하면 두 묶음을 합쳐서 하나로 만드는데에는 A+b번의 비교를 해야한다. 이를테면 20장의 숫자 카드 묶음과 30
		 *	장의 숫자 카드묶음을 합치려면 50번의 비교가 필요하다.
		 *
		 * 	매우 많은 숫자 카드 묶음이 책상위 있다. 이들을 두 묶음씩 골라 서로 합쳐나간다면, 고르는 순서에 따라서 비교횟수가 매우 달라진다.
		 * 
		 *	예를 들어 10, 20, 40장의 묶음이 있다면 10장과 20장을 합친뒤, 30장 묶음과 합친다면 (10+20) + (30 + 40) 100번의 비교가 필요하다. 그러마 10장과 40 장을 합친 뒤,
		 *	30장을 합치면 12
		 */
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		PriorityQueue<Integer> q = new PriorityQueue<>();
		for (int i = 0; i < n; i++) {
			q.offer(sc.nextInt());
		}

		while(q.size()!=1) {
			int one = q.poll();
			int two = q.poll();
			
			int comp = one + two;
			result += comp;
			q.offer(comp);
		}
		
	}
	
}
