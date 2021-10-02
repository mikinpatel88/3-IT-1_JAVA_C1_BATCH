package com.company;
import java.util.Scanner;

public class Reversed {
    public static void main (String[] args) throws java.lang.Exception
    {
        int reversed=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int num=sc.nextInt();
            while(num != 0)
            {


                int digit = num % 10;
                reversed = reversed * 10 + digit;
                num /= 10;
            }

            System.out.println(reversed);
            reversed=0;
        }
    }
}
