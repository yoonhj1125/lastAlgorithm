package com.algorithm.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Student implements Comparable<Student>{
	private String name;
	private int kor;
	private int eng;
	private int math;
	
	public void Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
	}	
	
	public String getName() {
		return name;
	}

	@Override
	//점수가 낮은순서 
	public int compareTo(Student o) {
		if(this.kor == o.kor && this.eng == o.eng && this.math == o.math) {
			return this.name.compareTo(o.name);
		}
		if(this.kor == o.kor && this.eng == o.eng) {
			return Integer.compare(o.math, this.math);
			
		}
		if(this.kor == o.kor) {
			return Integer.compare(this.eng, o.eng);
		}
		return Integer.compare(o.kor, this.kor);
	}
	
}


public class sortEx8 {
	
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//8. 정렬 알고리즘 : 
		
		/**
		 * 정렬이란 ? 데이터를 특정한 기준에 따라 순서대로 나열하는것 
		 *
		 *	8. 국영수 문제
		 *
		 *	도현이네 반 학생 N명의 이름과 국어, 영어, 수학 점수가 주어진다. 
		 *
		 *	1. 국어점수가 감소하는 순서로
		 *	2. 국어 점수가 같으면 영어점수가 증가하는 순서로
		 *	3. 국어점수와 영어점수가 같으면 수학점수가 감소하는 순서로
		 *	4, 모든점수가 같으면 이름이 사전순으로 증가하는 순서로(단, 아스키에서 대문자는 소문자보다 작으므로 사전순으로 앞에 온다)
		 *
		 *
		 */
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();	//학생수
		
		ArrayList<Student> array = new ArrayList<Student>();
		for (int i = 0; i < n; i++) {
			String name = sc.next();
			int kor = sc.nextInt();
			int eng = sc.nextInt();
			int math = sc.nextInt();
			
		}

		Collections.sort(array);
		 
		for (int i = 0; i < n; i++) {
			System.out.println(array.get(i).getName());
		}
		
	}

}
