package com.algorithm.implementation;

import java.util.Scanner;

public class implemntationEx3 {
		// TODO Auto-generated method stub
		
		//3. 구현 알고리즘 :  왕실의 나이트  
		
		/**
		 * Question. 왕실 정원은 체스판과 같은 8*8 좌표 평면입니다. 왕실 정원의 특정한 칸에 나이트가 서있다. 나이트는 말을 타고있기 때문에 이동을 할때는 L자 형태만 이동하며,
		 * 정원 밖으로는 나갈 수 없다.
		 * 
		 * 1. 수평으로 두 칸 이동한 뒤에 수직으로 한칸 이동
		 * 2. 수직으로 두 칸 이동한 뒤에 수평으로 한칸 이동 
		 * 
		 * 1~8까지 행과 a~h까지 열로 이루어져 있으며, 이동할 경우의 수를 구하여라 
		 * 
		 * HOW TO ? 
		 * 리스트를 이용하여 8가지에 대한 방향벡터를 구한다
		 *  
		 */

		
		

	    public static void main(String[] args) {
	       Scanner sc = new Scanner(System.in);

	       String str = sc.next();
	       int row = str.charAt(1) -'0';
	       int col = str.charAt(0) - 'a' +1;
	       int result = 0;
	       //아스키 코드 ??????
	       
	        // 나이트가 이동할 수 있는 8가지 방향 정의
	        int[] dx = {-2, -1, 1, 2, 2, 1, -1, -2};
	        int[] dy = {-1, -2, -2, -1, 1, 2, 2, 1};
	       
	        for (int i = 0; i < 8 ; i++) {
	        	int nextRow = row + dx[i];
	        	int nextCol = col + dy[i];
	        
	        	if(nextRow >=1 && nextCol >=1 && nextRow <=8 && nextCol <=8) {
	        		result++;
	        	}
			}
	        System.out.println(result);

	    }
	
}