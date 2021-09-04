package com.company;
import java.util.Scanner;



public class SumOfDigit {
    public static void main(String[] args) {
        // write your code here
        Scanner sc=new Scanner(System.in);
        int lc=sc.nextInt();
        int  arr[]=new int[lc];
        for(int i=0;i<lc;i++)
        {
            arr[i]= sc.nextInt();
        }
        for(int i=0;i<lc;i++)
        {
            int sum=0;
           while(arr[i]>0)
           {
               sum += arr[i]%10;
               arr[i] /=10;
           }
            System.out.println(sum);
        }
    }
}
