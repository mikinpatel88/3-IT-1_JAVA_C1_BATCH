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
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int c;
		int d=0;
		int e=0;
		for(int i=0;i<n;i++){
		    c=sc.nextInt();
		    if(c%2==0){
		        d++;
		    }
		    else{
		        e++;
		    }
		}
		if(e>=d){
		    System.out.println("NOT READY");
		}
		else{
		    System.out.println("READY FOR BATTLE");
		}
	}
}
