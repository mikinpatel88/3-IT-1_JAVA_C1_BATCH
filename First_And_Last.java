package com.company;
import java.util.Scanner;

public class First_And_Last {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            int n=sc.nextInt();
            int [] a=new int[100];
            int i=0;
            while(n!=0){
                a[i]=n%10;
                n=n/10;
                i++;
            }
            int sum=a[0]+a[i-1];
            System.out.println(sum);
        }
    }
}
