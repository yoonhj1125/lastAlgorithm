package com.algorithm.shortestParh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

class Node3 implements Comparable<Node3>{
	 private int index;
	    private int distance;

	    public Node3(int index, int distance) {
	        this.index = index;
	        this.distance = distance;
	    }

	    public int getIndex() {
	        return this.index;
	    }

	    public int getDistance() {
	        return this.distance;
	    }

	    // 거리(비용)가 짧은 것이 높은 우선순위를 가지도록 설정
	    @Override
	    public int compareTo(Node3 other) {
	        if (this.distance < other.distance) {
	            return -1;
	        }
	        return 1;
	    }
	
	
}
public class shortestPathEx4 {
 
	//1. 최단경로 알고리즘 : 
	
	/**
	 *  최단경로 알고리즘 : 
	 *	전보 문제 
	 *	어떤 나라에서 N개의 도시가 있다. 그리고 각 도시는 보내고자 하는 메시지가 있는 경우, 다른 도시로 전보를 보내서 다른 도시로 해당 메시지를 전송할 수있따.
	 *	하지만 X라는 도시에서 Y라는 도시로 전보를 보내고자 한다면, 도시 X에서 Y로 향하는 통로가 설치되어 있어야 한다. 예를 들어 X에서 Y로 향하는 통로는 있지만, Y에서 X로 향하는 통로가 
	 *	없다면 Y는 X로 메시지를 보낼 수 없다. 또한 통로를 거쳐 메시지를 보낼 때는 일정 시간이 소요된다.
	 *	어느 날 C 라는 도시에서 위급상황이 발생했다. 그래서 최대한 많은 도시로 메시지를 보내고자 한다. 메시지는 도시C에서 출발하여 각 도시 사이에 설치된 통로를 거쳐, 최대한 많이 퍼져나갈 것이다.
	 *	각 도시의 번호와 통로가 설치되어있는 정보가 주어졌을 떄, 도시 C에서 보낸 메시지를 받게 되는 도시의 개수는 총 몇개이며 도시들이 모두 메시지를 받는 데까지 걸리는 시간은 얼마인지 계산하는 프로그램을 작성해라
	 *
	 *
	 */
	public static int n, m, c;
	public static ArrayList<ArrayList<Node3>> graph = new ArrayList<ArrayList<Node3>>();
	public static int INF = (int)1e9;
	public static int[] d = new int[300001];
	
	public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       n = sc.nextInt();
       m = sc.nextInt();
       c = sc.nextInt();
       
       for (int i = 0; i < n; i++) {
    	   graph.add(new ArrayList<Node3>());
       }
       
       // 모든 간선 정보를 입력받기
       for (int i = 0; i < m; i++) {
           int x = sc.nextInt();
           int y = sc.nextInt();
           int z = sc.nextInt(); 
           System.out.println(x);
           System.out.println(y);
           System.out.println(z);
           // X번 노드에서 Y번 노드로 가는 비용이 Z라는 의미
           graph.get(x).add(new Node3(y, z));
          
       }
       // 최단 거리 테이블을 모두 무한으로 초기화
       Arrays.fill(d, INF);
       // 다익스트라 알고리즘을 수행
       dijkstra(c);

       // 도달할 수 있는 노드의 개수
       int count = 0;
       // 도달할 수 있는 노드 중에서, 가장 멀리 있는 노드와의 최단 거리
       int maxDistance = 0;
       for (int i = 1; i <= n; i++) {
           // 도달할 수 있는 노드인 경우
           if (d[i] != INF) {
               count += 1;
               maxDistance = Math.max(maxDistance, d[i]);
           }
       }

       // 시작 노드는 제외해야 하므로 count - 1을 출력
       System.out.println((count - 1) + " " + maxDistance);
   }

	   public static void dijkstra(int start) {
	        PriorityQueue<Node3> pq = new PriorityQueue<>();
	        // 시작 노드로 가기 위한 최단 경로는 0으로 설정하여, 큐에 삽입
	        pq.offer(new Node3(start, 0));
	        d[start] = 0;
	        while(!pq.isEmpty()) { // 큐가 비어있지 않다면
	            // 가장 최단 거리가 짧은 노드에 대한 정보 꺼내기
	            Node3 node = pq.poll();
	            int dist = node.getDistance(); // 현재 노드까지의 비용 
	            int now = node.getIndex(); // 현재 노드
	            // 현재 노드가 이미 처리된 적이 있는 노드라면 무시
	            if (d[now] < dist) continue;
	            // 현재 노드와 연결된 다른 인접한 노드들을 확인
	            for (int i = 0; i < graph.get(now).size(); i++) {
	                int cost = d[now] + graph.get(now).get(i).getDistance();
	                // 현재 노드를 거쳐서, 다른 노드로 이동하는 거리가 더 짧은 경우
	                if (cost < d[graph.get(now).get(i).getIndex()]) {
	                    d[graph.get(now).get(i).getIndex()] = cost;
	                    pq.offer(new Node3(graph.get(now).get(i).getIndex(), cost));
	                }
	            }
	        }
	    }
}

