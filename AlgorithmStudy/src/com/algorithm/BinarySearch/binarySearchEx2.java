package com.algorithm.BinarySearch;

import java.util.Scanner;

public class binarySearchEx2 {
	

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//2. 이진탐색 알고리즘 : 
		
		/**
		 * 이진탐색이란? 
		 * 1. 순차탐색 : 리스트 안에 있는 특정한 데이터를 찾기 위해 앞에서부터 데이터를 하나씩 확인하는 방법	 
		 * 2. 이진탐색 : 정렬되어있는 리스트에서 탐색 범위를 절반씩 좁혀가며 데이터를 탐색하는 방
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("생성할 원소 개수를 입력한 다음 한칸 띄고 찾을 문자열을 입력하세요 : ");
		
		int n = sc.nextInt();
		
		int target = sc.nextInt();
		
		System.out.println("앞서 적은 원소 개수만큼 문자열을 나열해주세요. ");
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int result = binarySearch(arr, target, 0, n);
		if(result == -1) {
			System.out.println("결과값 없음");
		}else {
			int trueResult = result +1;
			System.out.println("결과값 : "+trueResult);
		}
	}

	public static int binarySearch(int[] arr, int target, int start, int end) {
		int mid = (start + end) / 2;
		if(start > end) {
			return -1;
		}
		if (arr[mid] == target) return mid;
		if(arr[mid] > target) {
			return binarySearch(arr, target, start, mid - 1);
		}else {
			return binarySearch(arr, target, mid+1, end);
		}
		

		
	}

}
