package chapter05;

public class FunTest_Overload_main {

	public static void main(String[] args)
	{
		FunTest_OverLoad_08 obj = new FunTest_OverLoad_08();
		
		obj.getResult(5);
		
		obj.getResult("string");
		
		obj.getResult('a');
		
		obj.getResult(5,"string");
		
		obj.getResult("화이트");
		obj.getResult("레드");
	}
	

}
