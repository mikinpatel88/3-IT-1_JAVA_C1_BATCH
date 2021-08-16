package com.greater;
import java.util.Scanner;
public class FirstAndLast {
    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        for(int i=0;i<a;i++)
        {
            int n = sc.nextInt();
            int last=n%10;
            int first=0;
            while (n!=0)
            {
                first=n%10;
                n/=10;
            }
            System.out.println((first+last));
        }
    }
}
