package My;

import java.util.Scanner;

public class second {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int add=sum(a,b);
		System.out.println(add);
	}
	public static int sum(int a,int b){
		return a+b;
	}
}
