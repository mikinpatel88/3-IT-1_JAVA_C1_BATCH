/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class FirstAndLastDigit
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();

        for(int i=0;i<T;i++)
        {
            int N=sc.nextInt();
            int last = N%10;
            int first=0;
            while(N!=0)
            {
                first=N%10;
                N/=10;
            }
            System.out.println(first+last);
        }
    }
}
