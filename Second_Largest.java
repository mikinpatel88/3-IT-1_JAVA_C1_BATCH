/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner s=new Scanner(System.in);
	    int t=s.nextInt();
	    for(int i=0;i<t;i++)
	    {
	      int a=s.nextInt();
	      int b=s.nextInt();
	      int c=s.nextInt();
	      int big;
	      if(a>b && a>c)
	      {
	          if(b>c)
	             System.out.println(b);
	          else
	             System.out.println(c);
	      }
	      else if(b>c)
	      {
	          if(a>c)
	             System.out.println(a);
	          else
	             System.out.println(c);
	      }
	      else
	      {
	          if(a>b)
	             System.out.println(a);
	          else 
	             System.out.println(b);
	      }
	    }
	}
}

