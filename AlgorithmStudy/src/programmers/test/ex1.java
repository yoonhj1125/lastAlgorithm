package programmers.test;

public class ex1 {
	
	  public static void main(String[] args) {
		  
		  int[] array= {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
		  String hand = "right";
		  test(array, hand);
	  }

	public static void test(int array[], String hand) {
		System.out.println(array.length);
		
		
		String answer = "";
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
			if(array[i] == 1 || array[i] == 4 || array[i] == 7) {
				answer += "L";
			}
		}
		
		
		
	}
}
