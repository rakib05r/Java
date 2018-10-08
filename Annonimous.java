package my;

public class Annonimous {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Vehicle vh=new Vehicle(){
			public void type(){
				System.out.println("Ok\n");
				System.out.println(this.getClass().getName());
			}
		};
		vh.type();

	}
interface Vehicle{
	void type();
}
}
