


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
		Scanner input = new Scanner(System.in);
		try 
		{
		   int t = input.nextInt();
		   while(t-- > 0)
		   {
		       int n = input.nextInt();
		       int arr[][] = new int[n][n];
		       for(int i =0;i<n;i++)
		       {
		           for(int j=0;j<=i;j++)
		           {
		               arr[i][j] = input.nextInt();
		           }
		       }
		       int arr2[][] = new int [n][n];
		       for(int j=0;j<n;j++)
		       
	            arr2[n-1][j] = arr[n-1][j];
		       
               for(int i=n-2;i>=0;i--)
                {
                    for(int j=0;j<=i;j++)
                    {
                        arr2[i][j] = arr[i][j] + Math.max(arr2[i+1][j],arr2[i+1][j+1]);
                    }
                }
                System.out.println(arr2[0][0]);
		      
		       
		   }
		}
		catch(Exception e)
		{
		    return;
		}
	}
}
