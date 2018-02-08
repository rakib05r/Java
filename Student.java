package First;

import java.util.Scanner;

public class Student {
	int a;
	int[] mark=new int[10];
	int sum=0;
	String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRoll() {
		return roll;
	}
	public void setRoll(String roll) {
		this.roll = roll;
	}
	public String getSession() {
		return session;
	}
	public void setSession(String session) {
		this.session = session;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	String roll;
	String session;
	String year;
	String mobile;
	String email;
	
	Student(){
		
	}
	
	Student(String n,String r,String s,String y,String m,String e){
		name=n;
		roll=r;
		session=s;
		year=y;
		mobile=m;
		email=e;
	}
	public  void show(){
		System.out.println("\nName: "+name+"\nRoll: "+roll+"\nSession: "+session+"\nYear: "+year+"\nMobile: "+mobile+"\nEmail: "+email+"\n");
	}
	public void marks(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter How Many Course Marks Do You Want To Enter:\n");
		a=sc.nextInt();
		System.out.println("Enter "+a+" Course Marks\n");
		for(int i=0;i<a;i++){
			int m=i+1;
			System.out.println("\nEnter "+m+"th Course Marks:\n");
			mark[i]=sc.nextInt();
		}
		//for(int i=0;i<a;i++){
			//int j=i+1;
			//System.out.println("Marks in Course: "+j+": "+mark[i]+"\n");
		//}
		for(int i=0;i<a;i++){
			sum=sum+mark[i];
		}
		//System.out.println("Total Marks: "+sum+"\n");
	}
	
	public void resultCalculation()
	{
		int ck=0;
		int i;
		double[] cr=new double[10];
		double rr=0;
		double mainc;
		for( i=0;i<a;i++){
			if(mark[i]<=39){
				ck=1;
			}
		}
		if(ck==1){
			System.out.println("FAIL\n");
		}
		else
		for(i=0;i<a;i++){
			int z=i+1;
			if(mark[i]>=80 && mark[i]<=100){
				cr[i]=4.0;
				System.out.println("Getting Marks in Course "+z+": "+mark[i]+"    Getting CGPA:"+cr[i]);
			}
			else if(mark[i]>=75 && mark[i]<=79){
				cr[i]=3.75;
				System.out.println("Getting Marks in Course "+z+": "+mark[i]+"    Getting CGPA:"+cr[i]);
			}
			else if(mark[i]>=70 && mark[i]<=74){
				cr[i]=3.5;
				System.out.println("Getting Marks in Course "+z+": "+mark[i]+"    Getting CGPA:"+cr[i]);
			}
			else if(mark[i]>=65 && mark[i]<=69){
				cr[i]=3.25;
				System.out.println("Getting Marks in Course "+z+": "+mark[i]+"    Getting CGPA:"+cr[i]);
			}
			else if(mark[i]>=60 && mark[i]<=64){
				cr[i]=3.0;
				System.out.println("Getting Marks in Course "+z+": "+mark[i]+"    Getting CGPA:"+cr[i]);
			}
			else if(mark[i]>=55 && mark[i]<=59){
				cr[i]=2.75;
				System.out.println("Getting Marks in Course "+z+": "+mark[i]+"    Getting CGPA:"+cr[i]);
			}
			else if(mark[i]>=50 && mark[i]<=54){
				cr[i]=2.50;
				System.out.println("Getting Marks in Course "+z+": "+mark[i]+"    Getting CGPA:"+cr[i]);
			}
			else if(mark[i]>=45 && mark[i]<=49){
				cr[i]=2.25;
				System.out.println("Getting Marks in Course "+z+": "+mark[i]+"    Getting CGPA:"+cr[i]);
			}
			else if(mark[i]>=40 && mark[i]<=44){
				cr[i]=2.0;
				System.out.println("Getting Marks in Course "+z+": "+mark[i]+"    Getting CGPA:"+cr[i]);
			}
			rr=rr+cr[i];
		}
		mainc=rr/a;
		System.out.println("\nTotal Marks: "+sum+"\n");
		System.out.println("\nTotal earn CGPA:"+rr+"\n"+"Number of Course: "+a);
		System.out.println("\nSemester Cgpa:"+mainc);
		
	}

}
