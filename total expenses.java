/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
public class Main
{
	public static void main (String[] args)
	{
	    Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	while(t-->0){
	    int q=sc.nextInt();
	    int p=sc.nextInt();
	    double res=q*p;
	    double total=0.0;
	    if(q>1000){
	        total=0.90*res;
	        System.out.println(total);
	    }
	   else{
	       System.out.println(res);
	   }
	}
	}
}
