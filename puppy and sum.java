/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes her
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int d=sc.nextInt();
		    int n=sc.nextInt();
		    int sum=0;
		    for(int i=1;i<=d;i++){
		        sum=0;
		        for(int j=1;j<=n;j++){
		           sum=sum+j;
		        }
		        n=sum;
		    }
		    System.out.println(sum);
		}
	}
}
