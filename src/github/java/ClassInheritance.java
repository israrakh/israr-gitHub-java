package github.java;

public class ClassInheritance extends InheritancePractice {
	
	public ClassInheritance() {
		
	}
	
	public static void main(String[] args) {
		InheritancePractice obj = new InheritancePractice();
		obj.getAdditionResult(20, 30);
		obj.printResult();
		obj.getAdditionResult(100, -52);
		obj.printResult();
	}
}
