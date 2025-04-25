package chapter04;

import javax.swing.JOptionPane;

public class ArrayTest_06 {

	public static void main(String[] args) {
		
		String str[] = {"1","2","3","4"};
		String result= "";
		
		for(int i =0;i<str.length;i++) {
			result +=str[i]+"\n";
		}
		
		System.out.println(result);
		JOptionPane.showMessageDialog(null, "[test]\n"+result);
	}

}
