package com.company;
import  java.util.Scanner;

public class Sum_Of_Digit {
    public static void main (String[] args) throws java.lang.Exception
    {
        int number, digit, sum = 0;
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=0;i<a;i++)
        {
            number = sc.nextInt();
            while(number > 0)
            {

                digit = number % 10;

                sum = sum + digit;

                number = number / 10;
            }

            System.out.println(sum);
            sum=0;
        }


    }
}
