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
        int rem;
        int t = sc.nextInt();
        for(int i=0;i<t;i++) {
            int count=0;
            int n = sc.nextInt();
            while (n > 0) {
                rem = n % 10;
                if (rem == 4) {
                    count++;
                }
                n = n / 10;
            }
            System.out.println(count);
        }
	}
}