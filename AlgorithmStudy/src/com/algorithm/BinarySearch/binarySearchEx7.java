package com.algorithm.BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class binarySearchEx7 {
	
	public static int n;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//7. 이진탐색 알고리즘 : 
		
		/**
		 *	7. 공유설치 문제
		 *	도현이의 집 N개가 수직선 위에 있다. 각각의 집의 좌표는 x1, x2, x...xn이고, 집 여러개가 같은좌표를 가지는 일은 없다. 
		 *	도현이는 언제 어디서나 와이파이를 즐기기 위해서 집에 공유기 c개를 설치하려고 한다. 최대한 많은 곳에서 와이파이를 사용하려고 하기때문에, 한 집에는
		 *	공유기를 한대만 설치할 수있고, 가장 인접한 두 공유기 사이의 거리를 가능한 크게하여 설치하려고 한다.
		 *	c개의 공유기를 n개의 집에 적당히 설치해서, 가장 인접한 공유기 사이의 거리를 최대로 하는 프로그램을 작성하라. 
		 *
		 *
		 *	
		 */
		
		
		Scanner sc = new Scanner(System.in);
		
		
		n = sc.nextInt();	//집의갯수 
		int c = sc.nextInt();	//공유기의 갯수  
		
		//집 좌표  정보 
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			System.out.println(arr[i]);
		}
		
		Arrays.sort(arr);
		int result = solution(arr, 1, arr[n-1]-arr[0], c);	//시작은무조건 1을 포함, 마지막값과 항상 비교해야함...
	
		System.out.println(result);
		
	}

	private static int solution(int[] arr, int start, int end, int c) {
		System.out.println(start +" : "+ end );
		int result = 0;
		while(start <= end) {
			int mid = (start + end)/2;
			int left = arr[0];
			int cnt = 1;	//공유기의 갯수 ( 맨 왼 쪽집에 하나 설치하고 시작하니까 1로 시작)
			
			for (int i = 0; i < n; i++) {
				if(arr[i] - left >= mid) {
					cnt ++;
					left = arr[i];
				}
			}
			
			if(cnt >= c) {//공유기의 갯수보다 많이설치하면,
				result = mid;
				start = mid +1;
			}else {
				end = mid -1;
			}
		}
		
		return result;
	}

}


