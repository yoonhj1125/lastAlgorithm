package com.algorithm.BinarySearch;

//8. 이진탐색 알고리즘 : 

/**
 *	8. 가사 검색 
 *	words	queries	result
 *	["frodo", "front", "frost", "frozen", "frame", "kakao"]	["fro??", "????o", "fr???", "fro???", "pro?"]
 *	result : [3, 2, 4, 1, 0]	
 *	
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class binarySearchEx8 {
	
	  // 모든 단어들을 길이마다 나누어서 저장하기 위한 리스트
    public ArrayList<ArrayList<String>> arr = new ArrayList<ArrayList<String>>();
    // 모든 단어들을 길이마다 나누어서 뒤집어 저장하기 위한 리스트
    public ArrayList<ArrayList<String>> reversedArr = new ArrayList<ArrayList<String>>();	
	
    public int[] solution(String[] words, String[] queries) {
    	Scanner sc = new Scanner(System.in);
		ArrayList<Integer> ans = new ArrayList<Integer>();
		for (int i = 0; i < 10001; i++) {
			arr.add(new ArrayList<String>());			//배열 선언 
			reversedArr.add(new ArrayList<String>());	//배열 선언 
		}

		for (int i = 0; i < words.length; i++) {
			String word = words[i];
			arr.get(word.length()).add(word);
			
			word = new StringBuffer().reverse().toString();
			reversedArr.get(word.length()).add(word);
		}
		
		
    	 // 배열로 바꾸어 반환
        int[] answer = new int[5];
        return answer;
	  
	}
}


