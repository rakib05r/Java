package my;

public class Overloading {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		disp(1,2);
		disp("\nName\n");
		
	}
	public static void disp(char c){
		System.out.println(c);
	}
	public  static void disp(int a,int b){
		System.out.println(a+" "+b);
	}
	public static  void disp(String c){
		System.out.println(c);
	}
}
