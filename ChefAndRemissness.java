package com.company;
import java.util.*;
import java.lang.*;
import java.io.*;

public class ChefAndRemissness {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc= new Scanner(System.in);
        int T=sc.nextInt();
        for(int i=1; i<=T; i++)
        {
            int A = sc.nextInt();
            int B = sc.nextInt();
            if(A>B)
                System.out.println(A+" "+(A+B));
            else
                System.out.println(B+" "+(A+B));
        }
    }
}
