/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

class CCATM
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);

        double x = sc.nextDouble();
        double y = sc.nextDouble();

        if((x+0.5)<=y && x%5==0)
        {
            y-=(x+0.5);
        }
        System.out.printf("%.2f", y);
    }
}