/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class DecrementORIncrement
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner s= new Scanner(System.in);
        int n = s.nextInt();
        if(n%4==0)
        {
            System.out.println(++n);
        }
        else
        {
            System.out.println(--n);
        }// your code goes here
    }
}
