package chapter04;

public class EnhancedForLoop_11 {

	public static void main(String[] args) {

		String strArray[] = { "java", "oracle", "html5", "jsp", "spring", "phyton" };

		for (int i = 0; i < strArray.length; i++) {
			System.out.print(strArray[i] + " ");
		}
		System.out.println();
		
		//확장 for문
		for(String lang:strArray) {
			System.out.print(lang+" ");
		}
	}

}
