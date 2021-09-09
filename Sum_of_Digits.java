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
		 int tc;
        long n,rem,cnt;
        Scanner sc=new Scanner(System.in);
        tc=sc.nextInt();
        while(tc-- >0){
            cnt=0;
            n=sc.nextLong();
            while(n>0){
                rem=n%10;
                //if(rem==4)
                cnt =cnt + rem;
                n=n/10;
                
            }
            System.out.println(cnt);
	}
}

}