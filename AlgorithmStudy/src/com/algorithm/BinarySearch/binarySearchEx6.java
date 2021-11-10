package com.algorithm.BinarySearch;

import java.util.Scanner;

public class binarySearchEx6 {
	

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//6. 이진탐색 알고리즘 : 
		
		/**
		 *	6. 고정점 찾기? 고정점이란, 수열의 원소 중에서 그 값이 인덱스와 동일한 원소를 의미한다. 예를 들어 수열 a = {-15, -4, 2, 8, 13} 이 있을 때, a[2] = 2이므로 고정점은
		 *	2가된다. 하나의 수열이 N개의 서로 다른 원소를 포함하고 있으며, 모든 원소가 오름차순으로 정렬되어있다.
		 *	이때, 이 수열에서 고정점이 있다면, 고정점을 출력하는 프로그램을 작성하세요.
		 *
		 *	
		 */
		
		
		Scanner sc = new Scanner(System.in);
		
		
		int n = sc.nextInt();	//숫자의 갯수 
		
		//떡 길이 정보 
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			System.out.println(arr[i]);
		}
		
		int result = solution(arr, 0, n-1);
	
		if(result == -1) {
			System.out.println("고정점이 없");
		}else {
			System.out.println("index : " + result);
		}
	}

	private static int solution(int[] arr, int start, int end) {
		int mid = (start + end)/2;
		
		if(start> end)return -1;
		if(arr[mid] == mid) return mid;
		else if(arr[mid] > mid) return solution(arr, start, mid-1);
		else {
			return solution(arr, mid+1, end);
		}
	}

}


