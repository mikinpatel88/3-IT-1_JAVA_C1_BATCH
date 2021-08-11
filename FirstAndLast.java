package com.charusat;

import java.util.Scanner;

public class FirstAndLast {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter number of cases: ");
        int T = sc.nextInt();
        int n [] = new int[10];
        for(int i = 0; i<T;i++)
        {
            System.out.println("Enter number "+(i+1)+": ");
             n[i] = sc.nextInt();
        }
        for(int j = 0;j<T;j++)
        {
            int last = 0 , first = 0;
            last = n[j]%10;
             first = n[j];
            while( first>=10)
            {
                first = first / 10;
            }
            System.out.println("Sum of first and last of number " + (j+1)+" = "+(last+first));
        }









    }
}
