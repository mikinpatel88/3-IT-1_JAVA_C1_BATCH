import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) 
	{
	    int testcase;
	    Scanner sc = new Scanner(System.in);
	    testcase = sc.nextInt();
	 
	    for(int i=0; i<testcase; i++)
	    {
	        int n;
	        n = sc.nextInt();
	        
	        System.out.println(n/2+1);
	    }
	}
}