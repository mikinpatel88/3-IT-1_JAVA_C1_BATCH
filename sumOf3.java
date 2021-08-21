package com.company

import java.util.Scanner;

public class sumOf3 {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter name");

        String name= sc.nextLine();
       // name= sc.nextLine();
        System.out.println(name);

        System.out.println("Enter 3 Nos");
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();

        float sum=(a+b+c);
        System.out.println(sum);


    }
}
