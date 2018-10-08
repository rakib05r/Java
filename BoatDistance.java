package my;

import java.util.Scanner;

public class BoatDistance {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the width of the river (in meters) : ");
		double rw=s.nextDouble();
		System.out.println("Enter the river's speed (in meter/sec) : ");
		double rs=s.nextDouble();
		System.out.println("Enter the boat's speed (in meter/sec) : ");
		double bs=s.nextDouble();
		double time=rw/bs; //time takes to travel from shore to shore straight by the boat
		double w2=time*rs; //distance due to down stream
		double bd=Math.sqrt((rw*rw)+(w2*w2));
		System.out.println("");
		System.out.println("The distance travelled by boat (in meters) is : "+bd);
		s.close();
	}

}
