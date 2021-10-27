package com.company;
import java.util.*;
import java.lang.*;
import java.io.*;

public class Sum_or_Difference {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        try{
            int a= sc.nextInt();
            int b= sc.nextInt();
            if(a>b)
                System.out.println(a-b);
            else
                System.out.println(a+b);
        }catch(Exception e) {

        }
    }
}
