package chapter10.MultiInterface;

public class CustomerMain_02 {

	public static void main(String[] args) {

		Customer cu = new Customer();
		System.out.println("-----Buy-----");
		Buy bu = cu;
		bu.buy();
		bu.order();

		System.out.println("-----sell-----");
		Sell se = cu;
		se.sell();
		se.order();
		se.sellorder();

		// seller 부모 | Customer 자식
		if (se instanceof Customer) {
			Customer cu2 = (Customer) se;
			cu2.buy();
			cu2.sell();
			cu2.sellorder();
		}

	}

}
