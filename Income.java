package my;

import java.util.Scanner;

public class Income {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number of Working Day:\n");
		double wd=s.nextDouble();
		
		System.out.println("Enter working hours in a day:\n");
		double wh=s.nextDouble();
		
		System.out.println("Enter Overtime hours:\n");
		double oh=s.nextDouble();
		
		System.out.println("Enter hours leave:\n");
		double lh=s.nextDouble();
		
		System.out.println("Enter per hour payment:\n");
		double py=s.nextDouble();
		
		double th=(wd*wh)+oh-lh;
		double salary=th*py;
		System.out.println("Enter % of salary for tax:\n");
		double tax=s.nextDouble();
		
		double rsalary=(tax*salary)/100;
		double ss=salary-rsalary;
		System.out.println("Goss salary: "+salary+"\nNet Salary: "+ss);
		s.close();
	}

}
