package com.company;
import java.util.Scanner;
import java.lang.*;
import java.io.*;
import java.util.*;


public class Turbo_Sort {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        Arrays.sort(a);
        for(int i=0;i<n;i++)
            System.out.println(a[i]);


    }
}
