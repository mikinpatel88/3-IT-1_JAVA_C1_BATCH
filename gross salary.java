/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes hereHRA = 10% of base salary and DA = 90% of basic salary.
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		while(t>0)
		{
		    int n=in.nextInt();
	          if(n<1500){
	        double b = n+(double)0.1*n+(double)0.9*n;
	        System.out.println(b);
	    }
	    else{
	         double b = n+500+(double)0.98*n;
	        System.out.println(b);
	    }
		    t--;
		}
	}
}
