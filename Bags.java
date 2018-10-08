package my;

import java.util.Scanner;

public class Bags {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int bag,r;
		System.out.println("Enter number of bags:\n");
		bag=s.nextInt();
		r=bag%5;
		System.out.println("Minimum small bag needed : "+r);
		s.close();
		
	}

}
