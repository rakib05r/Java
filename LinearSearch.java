package my;

import java.util.Scanner;

public class LinearSearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c, n, search, array[];
		 
	    Scanner in = new Scanner(System.in);
	    System.out.println("Enter number of elements:\n");
	    n = in.nextInt(); 
	    array = new int[n];
	 
	    System.out.println("Enter " + n + " integers");
	 
	    for (c = 0; c < n; c++)
	      array[c] = in.nextInt();
	 
	    System.out.println("Enter value to find:\n");
	    search = in.nextInt();
	 
	    for (c = 0; c < n; c++)
	    {
	      if (array[c] == search)     /* Searching element is present */
	      {
	         System.out.println(search + " is present at location " + (c + 1) + ".");
	          break;
	      }
	   }
	   if (c == n)  /* Element to search is not present */
	      System.out.println(search + " is not present in array.\n");
	   in.close();
	}

}
