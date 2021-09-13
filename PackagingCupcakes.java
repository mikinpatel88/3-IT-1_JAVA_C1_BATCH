package com.company;
import java.util.*;
import java.lang.*;
import java.io.*;

public class PackagingCupcakes {
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
