package chapter05;

import java.util.Scanner;

public class PastryMain {

	
	
	public static void main(String[] args) {
		
		
		Pastry_09 bread = new Pastry_09();
		
		/*
		//Overload 활용
		bread.makeBread(); //스텍영역
		System.out.println("--------------------");
		bread.makeBread(3);
		System.out.println("--------------------");
		bread.makeBread(3,"크림");
		*/
		
		bread.order();
		
	}

}
