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
int T = sc.nextInt();
for(int i =1 ; i<=T ; i++)
{
   int A = sc.nextInt();
   int B = sc.nextInt();
   if(A>B)
   {
       System.out.println(A + " " + (A+B));
   }
   else{
       System.out.println(B + " " + (B+A));
   }
}
	}
}