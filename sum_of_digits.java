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
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		
		for(int t=0;t<T;t++)
		{
		    int num=sc.nextInt();
		    int sum=0;
		    do
		    {
		        int rem=num%10;
		        sum+=rem;
		        num/=10;
		    }while(num>0);
		    System.out.println(sum);
		}
	}
}
