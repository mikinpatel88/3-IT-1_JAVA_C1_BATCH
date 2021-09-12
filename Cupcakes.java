/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Cupcakes
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc=new Scanner(System.in);
        int T = sc.nextInt();
        int A=0;

        for(int i=0; i<T; i++)
        {
            int N = sc.nextInt();
            A = (N/2+1);
            System.out.println(A);
        }
    }
}
