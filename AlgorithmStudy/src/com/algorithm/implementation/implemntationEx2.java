package com.algorithm.implementation;

import java.util.Scanner;

public class implemntationEx2 {
	 // 특정한 시각 안에 '3'이 포함되어 있는지의 여부
    public static boolean check(int h, int m, int s) {
        if (h % 10 == 3 || m / 10 == 3 || m % 10 == 3 || s / 10 == 3 || s % 10 == 3)
            return true;
        return false;
    }
    

		
		// TODO Auto-generated method stub
		
		//2. 구현 알고리즘 :  시각문제 
		
		/**
		 * Question. 정수 N이 입력되면 00시00분00초부터 N시 59분 59초까지의 모든 시각 중에서 3이 하나라도 포함되는 모든경우의 수를 구하는 프로그램을 작성하여.
		 * 예를 들어, 1을 입력했을 때 다음은 3이 하나라도 포함되어 있으므로 세어야한다.
		 * 
		 * 00시 00분 03초
		 * 00시 13분 30초
		 * 
		 * 반면에, 다음은 3이 하나도 없으므로 세면 안되는 시각
		 * 00시 02분 55
		 * 
		 * HOW TO ? 
		 * 첫째줄에 N (0<= N <= 23) 입력된다.
		 * 완전 탐색 알고리즘 유형이다. 하루는 86,400초 이므로 컴퓨터는 이를 충분히 완전탐색으로도 구현할 수 있다.
		 * 
		 */

		
		

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // H를 입력받기 
	        int h = sc.nextInt();
	        int cnt = 0;

	        for (int i = 0; i <= h; i++) {
	            for (int j = 0; j < 60; j++) {
	                for (int k = 0; k < 60; k++) {
	                    // 매 시각 안에 '3'이 포함되어 있다면 카운트 증가
	                    if (check(i, j, k)) cnt++;
	                }
	            }
	        }

	        System.out.println(cnt);
	    }
	
}