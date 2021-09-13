package com.company;
import java.util.*;
import java.lang.*;
import java.io.*;

public class ReverseTheNumber {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int i=1; i<=T; i++)
        {
            int N = sc.nextInt();
            int rev=0;
            while(N!=0)
            {
                int a=N%10;
                rev = (rev*10) + a;
                N = N/10;
            }
            System.out.println(rev);
        }
    }
}
