package com.algorithm.greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class greedyex2 {

	public static void main(String[] args) {
		
		//2. Greedy알고리즘 : 큰수의 법
		
		/**
		 * Question. 동빈이의 큰수의 법칙을 다양한 수로 이루어진 배열이 있을 때, 주어진 수들을 M번 더하여 가장 큰 수를 만드는 것이다.
		 * 단, 배열의 특정한 인덱스에 해당하는 수가 연속해서 K번을 초과하여 더해질 수 없다.
		 *예를들어 순서대로 2, 4, 5, 4, 6으로 이루어진 배열이 있을 때 M이 8이고, K가 3이라고 가정하자. 이경우 특정한 인덱스의 수가 연속해서 세 번까지만 더해질 수 있으므로 큰수의 법칙에 따르면,
		 *6+6+6+5+6+6+6+5인 46인 셈이다.
		 *즉, 배열의 크기는 N, 숫자가 더해지는 횟수 M, K가 주어질 때 결과를 출력하시
		 * 
		 * HOW TO ? 
		 * '입력값 중 가장 큰수와 두번째로 큰수를 지정!'
		 */
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
		sc.nextLine();	//버퍼 초기
		ArrayList<Integer> array = new ArrayList<>();
		
		for(int i = 0 ; i < n ; i++) {
			array.add(sc.nextInt());
			System.out.println(array);
		}
		
		Collections.sort(array);
		System.out.println(array);
		
		int max = array.get(n-1);
		int min = array.get(n-2);
		System.out.println("max : "+max);
		System.out.println("min : "+min);
		
//		int result = 0;
//		result += max * m;
		int cnt = (m / (k+1))*k;
		cnt += m% (k+1);
		
		int result = 0;
		result += cnt * max;
		result += (m-cnt)*min;
		
		System.out.println("결과 : " + result);
		
	}

}
