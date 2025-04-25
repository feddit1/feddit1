package chapter05;

public class MethodTest_13 {

	public static void main(String[] args) {
		int sum = add(5,7);
		System.out.println("합계(int)"+sum);
		
		System.out.println("------------------------------");
		
		double sumDouble = add(3.4, 7.2);
		System.out.println("합계(double)" + sumDouble);
	}
	
	//정수의 합
	public static int add(int a , int b) {
		return a+b;
		
	}
	//실수의 합
	public static double add(double a , double b) {
		return a+b;
	}
}
