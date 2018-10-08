package my;

import java.util.Scanner;

public class WordCount {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String ss;
		System.out.println("Enter your sentence\n");
		ss=s.nextLine();
		int count = 1;
		for (int i = 1; i < ss.length() - 1; i++)
		{
			if ((ss.charAt(i) == ' ') && (ss.charAt(i + 1) != ' '))
			{
				count++;
			}
		}
 		System.out.println("Number of words in \""+ss+"\" is = " + count+"\n");
 		s.close();
	}

}
