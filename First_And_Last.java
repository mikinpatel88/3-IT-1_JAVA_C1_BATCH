package com.company;
import java.util.Scanner;
public class First_N_Last {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        int a[]=new int[10];
        for(int i=0;i<t;i++) {
            System.out.println("Enter number" + (i + 1) + ":");
            a[i]=s.nextInt();
        }
        for(int j=0;j<t;j++)
        {
            int l=0,f=0;
            l=a[j]%10;
            f=a[j];

            while(f>=10)
            {
                f/=10;
            }
            System.out.println("Sum of first and last digit of number "+(j+1)+" = "+(f+l));

        }
    }
}
