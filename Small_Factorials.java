package com.company;
import java.util.Scanner;
public class Small_Factorials {

    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[10];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter number" + (i + 1) + ":");
            a[i]=s.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            int fac=1;
            int j;
            for( j=1;j<=a[i];j++)
            {
                fac = fac *j;
            }
            System.out.println("Factorial of number "+(j)+"is = "+(fac));
        }


    }
}
