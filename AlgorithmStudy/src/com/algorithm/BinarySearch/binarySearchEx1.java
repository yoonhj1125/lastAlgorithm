package com.algorithm.BinarySearch;

import java.util.Scanner;

public class binarySearchEx1 {
	
	public static int search(int n, String target, String[] arr) {
	
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]);
			if(arr[i].equals(target)) {
				return i+1;
			}
		}
		
		return 0;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. 이진탐색 알고리즘 : 
		
		/**
		 * 이진탐색이란? 
		 * 1. 순차탐색 : 리스트 안에 있는 특정한 데이터를 찾기 위해 앞에서부터 데이터를 하나씩 확인하는 방법	 
		 * 2. 이진탐색 : 정렬되어있는 리스트에서 탐색 범위를 절반씩 좁혀가며 데이터를 탐색하는 방
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("생성할 원소 개수를 입력한 다음 한칸 띄고 찾을 문자열을 입력하세요 : ");
		
		int n = sc.nextInt();
		
		String target = sc.next();
		
		System.out.println("앞서 적은 원소 개수만큼 문자열을 나열해주세요. ");
		String[] arr = new String[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.next();
		}

		System.out.println(search(n, target, arr));
		
	}

}
