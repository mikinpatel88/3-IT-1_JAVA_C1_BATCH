package com.company;
import java.util.*;
import java.lang.*;
import java.io.*;

public class Total_Expanses {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc=new Scanner(System.in);
        int TEST = sc.nextInt();
        while(TEST-->0)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            float dis=a*b;
            if(a>1000)
            {
                dis=dis-(dis/10);
                System.out.println(dis);
            }
            else
            {
                System.out.println(dis);
            }
        }
    }
}
