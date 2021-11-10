package com.algorithm.sort;

import java.util.ArrayList;
import java.util.Scanner;

public class sortEx4 {

	public static void quickSort(int[] arr, int start, int end){
		int pivot = start;
		int left = start +1;
		int right = end;
		
		while (left <= right) {
			while (left <= end && arr[left] <= arr[pivot]) {
				left++;
			}
			
			while (right > end && arr[left] >= arr[pivot]) {
				right--;
			}
			
			if(left > right) {
				int temp = arr[pivot];
                arr[pivot] = arr[right];
                arr[right] = temp;
			}else {
			    int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
			}
		}
		
	     // 분할 이후 왼쪽 부분과 오른쪽 부분에서 각각 정렬 수행
        quickSort(arr, start, right - 1);
        quickSort(arr, right + 1, end);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. 정렬 알고리즘 : 
		
		/**
		 * 정렬이란 ? 데이터를 특정한 기준에 따라 순서대로 나열하는것 
		 *
		 *	1. 퀵정렬 알고리즘 : 기준 데이터를 설정하고 그기준보다 큰 데이터와 작은 데이터의 위치를 바꾸는 방법, 일반적인 상황에서 많이 사용되는 정렬 알고리즘
		 * 가장 기본적인 퀵 정렬은 첫 번째 데이터를 기준데이터(피벗)으로 설정한다. 
		 */

		int n = 10;
        int[] arr = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8};

        quickSort(arr, 0, n - 1);

        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

	       
		
	}
	
	

}
