package com.algorithm.BFS_DFS;

import java.util.LinkedList;
import java.util.Queue;

public class BFS_DFS_Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//2. BFS/DFS 알고리즘 : 큐구현 		
		/**
		 *	Queue 이란? : 선입선출 즉, 입구와 출구가 모두 뚫린 터널이라고 생각하면 됨(LinkedList)
		*/
	
		
		Queue<Integer> q = new LinkedList<>();
		
		q.offer(5);
		q.offer(2);
		q.offer(3);
		q.offer(7);
		q.poll();
		q.offer(1);
		q.offer(4);
		q.poll();
		
		System.out.println(q);
		
		 // 먼저 들어온 원소부터 추출
        while (!q.isEmpty()) {
            System.out.println(q.poll());
        }
		
	}

}
