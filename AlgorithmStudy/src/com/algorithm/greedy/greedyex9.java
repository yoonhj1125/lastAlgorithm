package com.algorithm.greedy;

import java.util.Scanner;

public class greedyex9 {

	public static int n,m;
	public static int[] arr = new int [11];
	public static void main(String[] args) {
		//9. Greedy알고리즘 : 볼링공 고르
		
		/**
		 * Question. A, B 두사람이 볼링을 치고 있습니다. 두 사람은 서로 다른 볼링공을 고르려고 합니다.
		 * 볼링공은 총 N개가 있으며, 각 볼링공마다 부게가 적혀있고, 1번부터 순서대로 부여됩니다. 또한 같은 무게의 공이 여러개 있을수도 있지만, 서로다른공으로 간주합니다.
		 * 볼링공의 모게는 1부터 M까지의 자연수 형태로 존재합니다.
		 * 
		 *  ex)N 이 5이고, M이 3이며 각각의 무게가 차례로 1,3,2,3,2,일 때 각 공의 번호가 차례로 1번부터 5번까지 부여됩니다. 이때 두사람이 고를 수 있는 볼링공의 번호의 조합?
		 *  (1,2),(1,3),(1,4),(1,5),(2,3),(2,5).(3,4),(3,5)
		 *  즉, 두사람이 공을 고르는 경우의 수는 8이고, N개의 공의 무게가 각각 주어질 떄, 두사람이 볼링공을구하는 경우의 수를 구하는 프로그래밍을 작성하라. 
		 * 
		 * HOW TO ? 
		 * 0이거나 1인경우를 제외하면 모두 * 연산자를 쓴다.
		 * 입력 : 02984
		 */
	
	Scanner sc = new Scanner(System.in);
	n = sc.nextInt();
	m = sc.nextInt();
	for (int i = 0; i < n; i++) {
		int temp = sc.nextInt();
		arr[temp] +=1;  
		System.out.println(arr[i]);
	}
	
	}
	
		
}
