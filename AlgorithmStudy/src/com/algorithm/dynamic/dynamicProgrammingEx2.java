package com.algorithm.dynamic;

import java.util.Scanner;


public class dynamicProgrammingEx2 {


	//2. 다이나믹 알고리즘 : 
	
	/**
	 * 1.구현하는 것은 상향식, 하향식 방법
	 * 메모이제이션 : 작은문제에 대한 결과를 메모리에 메모하는 기법
	 *  -> 같은 문제를 다시 호출하면 결과를 그대로 가져온다.
	 *  값을 기록해 놓는다는 점에서 캐싱이라고도 한다.
	 *  
	 *  즉 재귀 함수를 이용한다. 
	 *  
	 *  다이나믹 프로그래밍의 전형적인 형태는 보텀업이다(for문)
	 *  엄밀이 말하면 메모이제이션은 이전에 계산된 결과를 일시적으로 기록해 놓는 개
	 */
	public static long fibo(int x) {
		if(x == 1 || x ==2) {
			return 1;
		}
		if(d[x] != 0) {
			return d[x];
		}else {
	        d[x] = fibo(x - 1) + fibo(x - 2);
	        return d[x];
		}
	}
	public static long[] d = new long[999];
	
	//해당문제는 탑다운 방식으로 구현한 피보나치이다. 
	public static void main(String[] args) {
		System.out.println(fibo(50));
		
	}	
}
	
	

