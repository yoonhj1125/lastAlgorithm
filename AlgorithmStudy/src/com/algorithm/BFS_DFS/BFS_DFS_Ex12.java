package com.algorithm.BFS_DFS;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

class Solutions{
	
	int pos;
	//올바른 문자열인지 확인하는 함
	boolean isCorrect(String str) {
		
		boolean ret = true;
		int left = 0; int right = 0;
		Stack<Character> mystack = new Stack<Character>();
		
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i)=='(') {
				left++;
				mystack.push('(');
				
			}else {
				right++;
				if(mystack.isEmpty()) {
					//짝이 안맞는
					ret = false;
					
				}else {
					mystack.pop();
				}
			}
			
			if(left == right) {	//최초로 같았을 경우가 u
				pos = i + 1; //현재 위치 다음으로u의 렝스 
				return ret;
			}
		}
		return true;	//이경우는 없기 때문에 그냥 true 반환 
	}
	public String solution(String p) { //즉 p가 w가됨 
		if(p.isEmpty()) return p;
		
		boolean correct = isCorrect(p);
		String u = p.substring(0, pos); //3번째 조건 수행 
		String v = p.substring(pos, p.length());
		
		if(correct) {
			return u + solution(v);	//재귀적으로 부름 
		}
		
		//4번 조건 수행(올바른 문자열이 아님) 
		String answer = "("+solution(v)+")";	//4-3번가지 수행한것 
		
		//4-4
		for (int i = 1; i < u.length() -1 ; i++) {	//첫번째 문자 제거 
			if(u.charAt(i) == '(') {
				answer += ")";
			}else {
				answer += "(";
			}
		}
		
		
		
		//4-5
		return answer;
	}
} 
public class BFS_DFS_Ex12 {
	
	
	//12. BFS/DFS 알고리즘 : 괄호 변환 

	/*
	소스를 컴파일하여 로그를 보니 대부분 소스 코드 내 작성된 괄호가 개수는 맞지만 짝이 맞지 않은 형태로 작성되어 오류가 나는 것을 알게 되었습니다.
	수정해야 할 소스 파일이 너무 많아서 고민하던 "콘"은 소스 코드에 작성된 모든 괄호를 뽑아서 올바른 순서대로 배치된 괄호 문자열을 알려주는 프로그램을 다음과 같이 개발하려고 합니다.
	
	'(' 와 ')' 로만 이루어진 문자열이 있을 경우, '(' 의 개수와 ')' 의 개수가 같다면 이를 균형잡힌 괄호 문자열이라고 부릅니다.
	그리고 여기에 '('와 ')'의 괄호의 짝도 모두 맞을 경우에는 이를 올바른 괄호 문자열이라고 부릅니다.
	예를 들어, "(()))("와 같은 문자열은 "균형잡힌 괄호 문자열" 이지만 "올바른 괄호 문자열"은 아닙니다.
	반면에 "(())()"와 같은 문자열은 "균형잡힌 괄호 문자열" 이면서 동시에 "올바른 괄호 문자열" 입니다.
	'(' 와 ')' 로만 이루어진 문자열 w가 "균형잡힌 괄호 문자열" 이라면 다음과 같은 과정을 통해 "올바른 괄호 문자열"로 변환할 수 있습니다.
	
		1. 입력이 빈 문자열인 경우, 빈 문자열을 반환합니다. 
		2. 문자열 w를 두 "균형잡힌 괄호 문자열" u, v로 분리합니다. 단, u는 "균형잡힌 괄호 문자열"로 더 이상 분리할 수 없어야 하며, v는 빈 문자열이 될 수 있습니다. 
		3. 문자열 u가 "올바른 괄호 문자열" 이라면 문자열 v에 대해 1단계부터 다시 수행합니다. 
		  3-1. 수행한 결과 문자열을 u에 이어 붙인 후 반환합니다. 
		4. 문자열 u가 "올바른 괄호 문자열"이 아니라면 아래 과정을 수행합니다. 
		  4-1. 빈 문자열에 첫 번째 문자로 '('를 붙입니다. 
		  4-2. 문자열 v에 대해 1단계부터 재귀적으로 수행한 결과 문자열을 이어 붙입니다. 
		  4-3. ')'를 다시 붙입니다. 
		  4-4. u의 첫 번째와 마지막 문자를 제거하고, 나머지 문자열의 괄호 방향을 뒤집어서 뒤에 붙입니다. 
		  4-5. 생성된 문자열을 반환합니다.
		  
		  매개변수 설명
			p는 '(' 와 ')' 로만 이루어진 문자열이며 길이는 2 이상 1,000 이하인 짝수입니다.
			문자열 p를 이루는 '(' 와 ')' 의 개수는 항상 같습니다.
			만약 p가 이미 "올바른 괄호 문자열"이라면 그대로 return 하면 됩니다.
			
			=> https://www.youtube.com/watch?v=Bc34h7xPTL8 참조 
	 */
	
    public static void main(String[] args) {
    	
    	
    }
    
    
}

