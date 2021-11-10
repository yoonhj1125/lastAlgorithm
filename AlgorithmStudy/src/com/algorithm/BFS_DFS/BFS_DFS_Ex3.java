package com.algorithm.BFS_DFS;


public class BFS_DFS_Ex3 {
	
	
	
	//무한히진행되는 재귀함
   public static void recursiveFunction() {
        System.out.println("재귀 함수를 호출합니다.");
        recursiveFunction();
    }
   


	//종료조건이 존재하는 재귀함
  public static void recursiveFunction2(int i) {
       if(i == 100) return;
       System.out.println(i + "번째 재귀 함수에서 " + (i + 1) + "번째 재귀함수를 호출합니다.");
       recursiveFunction2(i+1);
       System.out.println(i + "번째 재귀 함수를 종료합니다.");
  }
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//3. BFS/DFS 알고리즘 : 재귀함수  		
		/**
		 * 재귀함수? : 자기자신을 다시 호출하는 함수 (FOR 또는 While 문에 쓰임, 하지만 함수는 Stack	형태로 메모리에ㅐ 올라가기 때문에 깊이를 정해주거나, Stack 을 따로 구현하여 사용)
		 * 반드시, 종료조건을 명시해야 무한루프가 돌지않음
		 * Stack처럼 함수가 호출
		*/
	
	//	recursiveFunction();
		recursiveFunction2(1);
	}

}
