package my;

public class Th implements Runnable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName());
		
		Th maint=new Th();
		Thread t=new Thread(maint);
		t.start();
		System.out.println(t.getName());
		
		Thread t1=new Thread(maint);
		t1.setName("ok");
		//t1.start();
		t1.setPriority(5);
		System.out.println(t1.getName());
	}
	public void run(){
		
	}
}
