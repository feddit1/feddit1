package chapter12.clone;

public class ObjextCloneMain_02 {

	public static void main(String[] args) throws CloneNotSupportedException{
		
		Circle ci = new Circle(10, 20, 30);
		Circle cic = (Circle) ci.clone();

		System.out.println(ci);
		System.out.println(cic);
		
		//hash
		System.out.println(System.identityHashCode(ci));
		System.out.println(System.identityHashCode(cic));
		
	}

}
