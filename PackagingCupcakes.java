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
		Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n;i++){
            int p = sc.nextInt();
            if(p%2==0){
                System.out.println((p/2)+1);
            }
            else{
                System.out.println((p+1)/2);
            }
        }
	}
}
