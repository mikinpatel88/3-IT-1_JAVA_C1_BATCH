/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		StringBuffer sb = new StringBuffer();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		for(int i=0; i<n; i++) {
		    String number = in.next();
		    int sum = Character.getNumericValue(number.charAt(0)) + Character.getNumericValue(number.charAt(number.length()-1));
		    sb.append(sum+"\n");
		}
		
		System.out.print(sb);
	}
}
