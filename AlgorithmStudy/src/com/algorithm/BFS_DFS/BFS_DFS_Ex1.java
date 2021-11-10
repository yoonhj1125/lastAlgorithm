package com.algorithm.BFS_DFS;

import java.util.Stack;

public class BFS_DFS_Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. BFS/DFS 알고리즘 : 스택 구
		
		/**
		 *	Stack 이란? : 선입후출 예를 들어, 박스채우기의 경
		*/
	
		Stack<Integer> stack = new Stack<>();
		
		stack.push(5);		//삽입 
		stack.push(2);
		stack.push(3);
		stack.push(7);
		stack.pop();		//삭제 
		stack.push(1);
		stack.push(4);
		stack.pop();
		
		System.out.println(stack);
		
		// 스택의 최상단 원소부터 출력
        while (!stack.empty()) {
            System.out.println(stack.peek());
            stack.pop();
        }
		
	}

}
