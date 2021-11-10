package com.algorithm.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class sortEx9 {
	 public static final int MAX_VALUE = 9;
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//9. 정렬 알고리즘 : 
		
		/**
		 * 정렬이란 ? 데이터를 특정한 기준에 따라 순서대로 나열하는것 
		 *
		 *	9. 안테나 문제
		 *	일진선 상의 마을에 여러채의 집이 위치해 있다. 이중에서 특정 위치의 집에 특히 한개의 안테나를 설치하기로 했다. 효율성을 위해 안테나로부터 모든 집까지의 거리의 총 합이 최소가 되도록 하려고 한다.
		 *	논리적으로 동일한 위치에 여러 채의 집이 존재하는 것은 불가능하다.
		 *	집들의 위치 값이 주어질 때, 안테나를 설치할 위치를 선택하는 프로그램을 작성해라.
		 *	예를 들어 N = 4 인경우,각 위치는 1,5,7,9라고 가정하자. 이 경우, 5의 위치에 설치했을 떄, 안테나로부터 모든 집까지의 거리의 총 합이 4+0+2+4 = 10 으로 최소가 된다.
		 */
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		ArrayList<Integer> array = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			array.add(sc.nextInt());
		}
		System.out.println(array);
		
		Collections.sort(array);
		
		System.out.println(array.get(n-1)/2);
	}

}
