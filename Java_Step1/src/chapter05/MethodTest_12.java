package chapter05;

public class MethodTest_12 {

	
	public static void main(String[] args) {
	
		int result = add(5,7);
		System.out.println("Result: " + result);
		
		MethodTest_11.greet("백설");
	}

	
	//메서드
	public static int add(int a ,int b) {
		
		return a+b;
	
	}		
	
}
