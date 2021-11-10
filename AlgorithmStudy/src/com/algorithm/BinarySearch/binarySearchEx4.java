package com.algorithm.BinarySearch;

import java.util.Scanner;

public class binarySearchEx4 {
	

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//4. 이진탐색 알고리즘 : 
		
		/**
		 * 
		 * 떡볶이 떡 만들기 문제
		 * 오늘은 떡볶이 떡을 만드는 날입니다. 동빈이네 떡볶이 떡은 재밌게도 떡볶이의 길이가 일정하지 않습니다. 대신에 한 봉지 안에 들어가는 떡의 총 길이는 절단기로 잘라서 맞춰줍니다.
		 * 절단기 높이(H)를 지정하면 줄지어진 떡은 한번에 절단합니다. 높이가 H보다 긴 떡은 H위의 부분이 잘릴것이도, 낮은 떡은 잘리지 않습니다.
		 * 예를 들어 높이가 19, 14, 10, 17 인 떡이 나란히 있고 절단기 높이를 15로 지정하면 다른 뒤 떡의 높이는 15, 14, 10, 15 가 될 것입니다. 잘린 떡의 길이는 차례로,
		 * 4, 0, 0, 2입니다. 손님은 5만큼의 길이를 가져갑니다.
		 * 
		 * 손님이 왔을때 총 길이가 M 일때 적어도 M만큼의 떡을 얻기 위해 절단기에 설정 할 수 있는 높이의 최댓값을 구하는 프로그램을 작성하세요.
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		
		int n = sc.nextInt();	//떡의 개수 
		int m = sc.nextInt();	//요청한 떡 길이 
		
		//떡 길이 정보 
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			System.out.println(arr[i]);
		}
		
		int start  = 0;
		int result = 0;	//결과값 저장
		int end = (int) 1e9;
		while(start <= end) {
			int total = 0;
			int mid = (start + end) /2;
			
			for (int i = 0; i < n; i++) {
				if(arr[i] > mid) {
					total += arr[i] - mid;
				}
			}
			if(total < m) {
				end = mid -1;
			}else {
				result = mid;
				start = mid + 1;
			}
			
		}
		  System.out.println(result);		
	}
	
}


