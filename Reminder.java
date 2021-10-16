package com.company;
import java.util.Scanner;

public class Reminder {
    public static void main (String[] args) throws java.lang.Exception
    {
        int num1,num2,divi=0;
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=0;i<a;i++)
        {
            num1=sc.nextInt();
            num2=sc.nextInt();
            divi=num1%num2;
            System.out.println(divi);

        }
        // your code goes here
    }
}
