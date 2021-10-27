package com.company;
import java.util.*;
import java.lang.*;
import java.io.*;

public class Sum_in_A_Triangle {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();
        for(int i=0;i<testcases;i++)
        {
            int rows = sc.nextInt();
            int sum=0;
            int triangle[][] = new int[rows][rows];
            for(int j=0;j<rows;j++)
                for(int k=0;k<=j;k++)
                    triangle[j][k]=sc.nextInt();
            for(int j=rows-2;j>=0;j--)
            {
                for(int k=0;k<=j;k++)
                {
                    triangle[j][k]+= Math.max(triangle[j+1][k],triangle[j+1][k+1]);
                }
            }
            System.out.println(triangle[0][0]);
        }
    }
}
