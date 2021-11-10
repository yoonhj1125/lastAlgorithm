package com.algorithm.BinarySearch;

import java.util.Scanner;

public class binarySearchEx5 {
	

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//5. 이진탐색 알고리즘 : 
		
		/**
		 *	N개의 원소를 포함하고 있는 수열이 오름차순으로 정렬되어 있습니다. 이떄 이 수열에서 x가 등장하는 횟수를 계산하세요,
		 *예를 들어 {1,1,2,2,2,2,3} 이 있을 떄,x= 2 라면 현재 수열에서 값이 2인 원소가 4개이므로 4를 출력한다.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		
		int n = sc.nextInt();	//숫자의 갯수 
		int x = sc.nextInt();	//x 
		
		//떡 길이 정보 
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			System.out.println(arr[i]);
		}
		
	
		solution(n, x, arr);
	}

	private static void solution(int n, int x, int[] arr) {
			int rightValue = upperBound(arr, x, 0, n);
			int leftValues = lowerBound(arr, x, 0, n);
			
			int result = rightValue - leftValues;
			
			System.out.println(result);
			
				
	}

	private static int lowerBound(int[] arr, int target, int start, int end) {
		while(start < end) {
			int mid = (start + end) /2;
			if(arr[mid] >= target) {
				end = mid;
			}else {
				start = mid +1;
			}
		}
		return end;
	}

	private static int upperBound(int[] arr, int target, int start, int end) {
		while(start < end) {
			int mid = (start + end) /2;
			if(arr[mid] > target) {
				end = mid;
			}else {
				start = mid +1;
			}
		}
		return end;
	}	
}


