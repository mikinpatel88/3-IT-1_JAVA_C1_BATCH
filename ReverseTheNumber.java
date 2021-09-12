package com.company;
import java.util.Scanner;

public class ReverseTheNumber {
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=0;i<n;i++) {
            int a = sc.nextInt();
            int b, sum = 0;
            while (a != 0) {
                b = a % 10;
                sum = (sum * 10) + b;
                a = a / 10;
            }
            System.out.println(sum);
        }
    }
}
