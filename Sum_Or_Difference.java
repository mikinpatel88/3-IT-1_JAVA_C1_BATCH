package com.company;
import java.util.Scanner;
public class Sum_Or_Difference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a>b)
        {
            System.out.println(a-b);
        }
        else
        {
            System.out.println(a+b);
        }
    }
}