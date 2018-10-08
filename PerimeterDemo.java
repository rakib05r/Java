package my;

import java.util.Scanner;

public class PerimeterDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Area of Square : ");
		double a=s.nextDouble();
		double p=4*Math.sqrt(a);
		System.out.println("");
		System.out.print("Perimeter of the Square : "+p);
		System.out.println("");
		s.close();
	}

}
