package com.company;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.BigInteger;

public class SmallFactorials {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        double T = sc.nextInt();

        while(T>0)
        {
            int n = sc.nextInt();
            BigInteger m = new BigInteger("1");
            for(int i=1;i<=n;i++)
            {
                m = m.multiply(BigInteger.valueOf(i));
            }
            System.out.println(m);
            T--;
        }
    }
}