package com.mycompany.firstandlast;

import java.util.*;
import java.lang.*;
import java.io.*;


class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int n = sc.nextInt();
            int last_digit=n%10;
            int first_digit=0;
            while (n!=0)
            {
                first_digit=n%10;
                n/=10;
            }
            System.out.println((first_digit+last_digit));
        }
	}
}
