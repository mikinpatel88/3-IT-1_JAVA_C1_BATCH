/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	     Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int a, b, c;
		// your code goes here
		for(int i = 0; i < n; i++){
		    a = sc.nextInt();
		    b = sc.nextInt();
		    c = sc.nextInt();
		    int d;
		    //  System.out.println((a>b && b>c)?b:(b>a && a>c)?a:c);
            if((a>b && b>c) || (a<b && b<c)){
                d = b;
            }
            else{
                if((b>a && a>c) || (b<a && a<c)){
                    d = a;
                }
                else{
                    d = c;
                }
            }
            // a = 120; b = 11; c = 400;
             System.out.println(d);
		}
		// your code goes here
	}
}
