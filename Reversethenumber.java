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
		Scanner scanner =new Scanner(System.in);
		int size=scanner.nextInt();
		int arr[]=new int[size];
		int revarr[]=new int[size];
		for(int i=0;i<arr.length;i++)
		{
		    arr[i]=scanner.nextInt();
		}
		for(int j=0;j<arr.length;j++)
		{
		    int revnum=0;
    		while(arr[j]!=0)
    		{
    		    int digit=0;
    		    digit=digit+arr[j]%10;
    		    revnum=revnum*10+digit;
    		    arr[j]/=10;
    		}
    		arr[j]=revnum;
    		System.out.println(arr[j]);
		}
	}
}
