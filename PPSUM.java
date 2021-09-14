/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	   Scanner sc =new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
		    int d=sc.nextInt();
		    int n=sc.nextInt();
		    int e=0;
		    while(d!=0)
		    {
		        e=(n*(n+1))/2;
		        n=e;
		        d--;
		    }
		    System.out.println(e);
		} 
	}
}
