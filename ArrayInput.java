package My;

import java.util.Scanner;

public class ArrayInput {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int[] a=new int[10];
		for(int i=0;i<5;i++){
			a[i]=s.nextInt();
		}
		for(int i=0;i<5;i++){
			System.out.println(a[i]+",");
		}
	}

}
