package my;

import java.util.Scanner;

public class Subsequence {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String s1,s2;
		System.out.println("Enter first string\n");
		s1=s.nextLine();
		System.out.println("Enter second string\n");
		s2=s.nextLine();
		String l=lcs(s1,s2);
		int len=l.length();
		System.out.println("Longest subsequence between \""+s1+"\" and \""+s2+"\" is "+l+" length of that subsequence is "+len+"\n");
		s.close();
	}
    public static String lcs(String str1, String str2)

    {

        int l1 = str1.length();

        int l2 = str2.length();

 

        int[][] arr = new int[l1 + 1][l2 + 1];

 

        for (int i = l1 - 1; i >= 0; i--)

        {

            for (int j = l2 - 1; j >= 0; j--)

            {

                if (str1.charAt(i) == str2.charAt(j))

                    arr[i][j] = arr[i + 1][j + 1] + 1;

                else 

                    arr[i][j] = Math.max(arr[i + 1][j], arr[i][j + 1]);

            }

        }

 

        int i = 0, j = 0;

        StringBuffer sb = new StringBuffer();

        while (i < l1 && j < l2) 

        {

            if (str1.charAt(i) == str2.charAt(j)) 

            {

                sb.append(str1.charAt(i));

                i++;

                j++;

            }

            else if (arr[i + 1][j] >= arr[i][j + 1]) 

                i++;

            else

                j++;

        }

        return sb.toString();

    }
}
