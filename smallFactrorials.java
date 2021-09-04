/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.BigInteger;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
	    double T = sc.nextInt();
		
		while(T>0)
		{
			int n = sc.nextInt();
			BigInteger m = new BigInteger("1");
		    for(int i=1;i<=n;i++)
		    {
		    	m = m.multiply(BigInteger.valueOf(i));
		    }
		    System.out.println(m);
			T--;
		}
	}
}
