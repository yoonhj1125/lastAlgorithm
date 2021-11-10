package com.algorithm.greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class greedyex5 {

	public static void main(String[] args) {
		//5. Greedy알고리즘 : 모험자 길 
		
		/**
		 * Question. 모험가 길드장인 동빈이는 모험가그룹을 안전하게 구성하고자 공포도가 X인 모험가는 만드시 X명 이상으로 구성한 모험가 그룹에 참여해야 여행을 떠날 수 있도록 규정
		 * N명의 모험가에 대한 정보가 주어졌을 때, 여행을 떠날 수 있는 그룹수를 구하여라
		 * 
		 * ex) 2,3,1,2,2 -> 2
		 * 
		 * HOW TO ? 
		 * '공포도가 낮을 수록 그룹을 짜기 쉬우므로 오름차순 정렬한'
		 * 그후 모험가들을 차례로 탐색한다. 즉, 현재 모험가의 공포도가 그룹인원보다 높으면, 그룹인원에 추가하고 다음 모험가를 탐색한다.
		 * 현재 모험가의 공포도가 그룹인원과 같다면 그룹과 여행을 떠난다. 
		 */
	
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	int result = 0;
	int ex = 0;	//모험가 
	ArrayList<Integer> array = new ArrayList<Integer>();
	
	for(int i = 0; i<N ; i++) {
		array.add(sc.nextInt());
	}
	
	Collections.sort(array);
	System.out.println(array);
	for(int i = 0; i<N ; i++) {
		ex++;
		if(array.get(i)== ex) {
			result ++;
			ex = 0;
		}
		
		
	}
	
	System.out.println(result);
	}
	
		
}
