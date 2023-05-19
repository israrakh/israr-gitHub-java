package github.java;

public class LoopsPractice {
	
	public static void main(String[] args) {
		
		// print a tringle from * Astrik sign 
		// length is optional
		int row = 3;
		for (int i = 0; i <= row; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
