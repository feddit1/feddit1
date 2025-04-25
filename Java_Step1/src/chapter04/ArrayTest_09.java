package chapter04;

public class ArrayTest_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[][]= new int[2][3];
		int n =0;
		int arr1[][] = {{1,2,3},{4,5,6}};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print((arr[i][j]=n)+" ");
			}
			System.out.println();
		}
		System.out.println("----------------");
		System.out.println(arr.length+"행");//2
		System.out.println(arr[0].length+"행");//3
		
		
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[i].length;j++)
			{
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
