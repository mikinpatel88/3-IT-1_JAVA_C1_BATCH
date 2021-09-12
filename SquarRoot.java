package com.company;

import java.util.Scanner;

public class SquarRoot {
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int  t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int a=sc.nextInt();
            int res=(int)Math.sqrt(a);
            System.out.println(res);
        }
    }
}
