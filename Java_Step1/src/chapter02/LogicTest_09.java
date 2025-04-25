package chapter02;

public class LogicTest_09 {

	public static void main(String[] args) {
		// AND(&&) , OR(||) 논리연산
		
		char a,b;
		boolean c;
		
		a= 'A';
		b= 'B';
		
		c = true && true;
		System.out.println(c);
		c = true && false;
		System.out.println(c);
		System.out.println("------------------");
		
		//or
		c= true || true;
		System.out.println(c);
		c = true || false;
		System.out.println(c);
		System.out.println("------------------");
		
		//&& ||
		c= (true||true)&&false;
		System.out.println(c);
		c= (true&&true)||false;
		System.out.println(c);
		
		
		//관계연산을 활용한 논리연산
		c = a<b &&(a==b); // T && F > F
		System.out.println(c);
		c= a<b ||(a==b);    // t||F >T
		System.out.println(c);
	
		
	}

}
