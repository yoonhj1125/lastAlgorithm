package com.algorithm.sort;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class sortEx10 {
		
		//9. 정렬 알고리즘 : 
		
		/**
		 * 정렬이란 ? 데이터를 특정한 기준에 따라 순서대로 나열하는것 
		 *
		 *	9. 실패율 문제
		 *	 스테이지에 도달했으나 아직 클리어하지 못한 플레이어의 수 / 스테이지에 도달한 플레이어 수
		 *
		 * 	전체스테이지의 수 N, 게임을 이용하는 이용자가 현재 멈춰있는 스테이지의 번호가 담긴 배연 stages가 매개변수로 주어질 때, 실패율이 높은 스테이지부터 내림차수능로 스테이지의 번호가 담겨있는
		 * 	실패율이 높은 스테이지부터 내림차순으로번호가 담겨있는 배열을 return 하는 함수를 작성해라 
		 * 
		 * https://www.youtube.com/watch?v=hmHparvw4Wo
		 */
	
	class Solution { 
			class Fail{
				int stage;
				double rate;
				
				Fail(int stage, double rate){
					this.stage = stage;
					this.rate = rate;
				}
			}
		
			
			Comparator<Fail> com = new Comparator(Fail) {
				public int compare(Fail a, Fail b) {
					if(a.rate < b.rate) {
						return 1;
					}else if(a.rate > b.rate) {
						return -1;
					}else {
						if(a.stage > b.stage) {
							return 1;
						}else if(a.stage < b.stage) {
							return -1;
						}else {
							0;
						}
					}
					
				}
			};
				
			
			
			public int[] solution(int N, int[] stages) {
	        int[] answer = new int[N];
	        java.util.List<Fail> fails = new ArrayList<Fail>();
	        int total = stages.length;
	        
	        int[] users = new int [N+1];
	        
	        for(int s: stages) {
	        	users[s-1] ++;
	        }
	        
	        for (int i = 0; i < N; i++) {
				if(users[i] == 0) {
					fails.add(new Fail(i+1, 0));
			 	}else {
			 		fails.add(new Fail(i+1, (double)users[i]/total));
			 		total -= users[i];
			 	}
			}
	        
	        Collections.sort(fails, com);
	        return answer;
	    }
	}

}
