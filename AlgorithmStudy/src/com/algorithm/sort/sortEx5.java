package com.algorithm.sort;

import java.util.ArrayList;
import java.util.Scanner;

public class sortEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//5. 정렬 알고리즘 : 
		
		/**
		 * 정렬이란 ? 데이터를 특정한 기준에 따라 순서대로 나열하는것 
		 *
		 *	5. 삽입정렬 알고리즘 : 처리되지 않은 데이터를 하나씩 골라 적절한 위치에 삽입(선택정렬보다 빠름) 
		 */

		   int n = 10;
	        int[] arr = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8};

	        for (int i = 1; i < n; i++) {
	            // 인덱스 i부터 1까지 감소하며 반복하는 문법
	            for (int j = i; j > 0; j--) {
	                // 한 칸씩 왼쪽으로 이동
	                if (arr[j] < arr[j - 1]) {
	                    // 스와프(Swap)
	                    int temp = arr[j];
	                    arr[j] = arr[j - 1];
	                    arr[j - 1] = temp;
	                }
	                // 자기보다 작은 데이터를 만나면 그 위치에서 멈춤
	                else break;
	            }
	        }

	        for(int i = 0; i < n; i++) {
	            System.out.print(arr[i] + " ");
	        }

	       
		
	}

}
