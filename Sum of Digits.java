/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s= new Scanner(System.in);
		int x=s.nextInt();
			while(x-->0)
		{
		    int n=s.nextInt();
		    int sum=0;
		    int r=0;
		    while(n!=0)
		    {
		       r=n%10;
		       sum=sum+r;
		       n=n/10;
		    }
		    System.out.println(sum);
		}
	}
}
