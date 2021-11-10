package com.algorithm.BFS_DFS;


public class BFS_DFS_Ex4 {
	
	//for문을 이용한 팩토리얼 
	public static int FactorialEx1(int i) {
		int result = 1;
		for (int j = 1; j <= i; j++) {
			result *= j;
		}
		
		return result;
	}
	
	//재귀함수를 이용한 팩토리얼 
	public static int FactorialEx2(int n) {
	    if (n <= 1) return 1;
	    return n * FactorialEx2(n-1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//4. BFS/DFS 알고리즘 : 재귀함수를 이용한 팩토리얼 구  		
		/**
		 * 5! = 5 * 4 * 3 * 2 * 1
		 * 참고로, 0!, 1! = 1
		 * n! = 1 * 2 * 3 * ~ (n-1) * n 
		*/
		 System.out.println("반복적으로 구현:" + FactorialEx1(5));
		 System.out.println("반복적으로 구현:" + FactorialEx2(5));
	}

}
