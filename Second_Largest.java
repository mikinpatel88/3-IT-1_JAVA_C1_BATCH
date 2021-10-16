package com.company;
import java.util.Scanner;

public class Second_Largest {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int a,b,c;
        for(int i=0;i<num;i++){
            a=sc.nextInt();
            b=sc.nextInt();
            c=sc.nextInt();
            if(a>b && b>c)
                System.out.println(b);
            else if(a<b && b<c)
                System.out.println(b);
            else if(b>c && c>a)
                System.out.println(c);
            else if(b<c && c<a)
                System.out.println(c);
            else if(c>a && a>b)
                System.out.println(a);
            else
                System.out.println(a);
        }
    }
}
