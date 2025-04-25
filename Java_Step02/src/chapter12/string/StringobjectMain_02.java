package chapter12.string;

public class StringobjectMain_02 {

	public static void main(String[] args) {

		Stringobject v1 = new Stringobject();
		v1.setValue(v1);

		System.out.println(v1.getValue());

		// ----------------------------------
		Stringobject v2 = new Stringobject();
		v2.setValue(100); // AutoBoxing => 객체(Object)
		// Integer v2 = new Integer(100);
		System.out.println(v2.getValue());

		// 캐스팅
		int i = (int) v2.getValue(); // unBoxing
		System.out.println(i + 2);

	}

}
