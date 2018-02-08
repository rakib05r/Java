package First;

import java.util.Scanner;

public class Lab1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Student me=new Student("Rakib","140105","2014-15","3rd","01948130312","mdrokibulislam25@gmail.com");
		me.marks();
		me.show();
		me.resultCalculation();
		
		/*Scanner is=new Scanner(System.in);
		
		String ns,rs,sss,ys,ms,es;
		
		Student rakib=new Student();
		
		System.out.println("Enter Name:\n");
		ns=is.nextLine();
		System.out.println("Enter Roll:\n");
		rs=is.nextLine();
		System.out.println("Enter Session:\n");
		sss=is.nextLine();
		System.out.println("Enter Year:\n");
		ys=is.nextLine();
		System.out.println("Enter Mobile:\n");
		ms=is.nextLine();
		System.out.println("Enter Email:\n");
		es=is.nextLine();
				
		rakib.setName(ns);
		rakib.setRoll(rs);
		rakib.setSession(sss);
		rakib.setYear(ys);
		rakib.setMobile(ms);
		rakib.setEmail(es);
		
		rakib.marks();
		
		System.out.println("Name: "+rakib.getName()+"\nRoll: "+rakib.getRoll()+"\nSession: "+rakib.getSession()+"\nYear: "+rakib.getYear()+"\nMobile: "+rakib.getMobile()+"\nEmail: "+rakib.getEmail()+"\n\n");
		rakib.resultCalculation();*/
		
	}

}
