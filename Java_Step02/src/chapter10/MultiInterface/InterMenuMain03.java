package chapter10.MultiInterface;

public class InterMenuMain03 implements Inter_Menu3 {

	public static void main(String[] args) {

		InterMenuMain03 in = new InterMenuMain03();

		// 부모(Inter_Menu1) = 자식(InterMenuMain03)
		Inter_Menu1 in1 = in; // 업캐스팅
		Inter_Menu2 in2 = in; // 업캐스팅
		Inter_Menu3 in3 = in; // 업캐스팅

		System.out.println("-----InterMenu1-----");
		System.out.println(in1.jajang());
		System.out.println(in1.jjambbong());
		in1.show();
		System.out.println("-----InterMenu2-----");
		System.out.println(in2.tangsuyuck());
		in2.show();
		System.out.println("-----InterMenu3-----");
		System.out.println(in3.boggembab());
		in3.show();
		
		
	}

	@Override
	public String jajang() {
		return "자장면 주문 완료";
	}

	@Override
	public String jjambbong() {
		return "짬뽕 주문 완료";
	}

	@Override
	public String tangsuyuck() {
		return "탕수육 주문 완료";
	}

	@Override
	public String boggembab() {
		return "볶음밥 주문 완료";
	}

}
