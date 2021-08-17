package com.example.javalab;
import java.util.Scanner;
public class IncreDecre {
    public static void main(String[] args)
    {
        Scanner s =new Scanner(System.in);
        System.out.println("Enter a number: ");
        int N =s.nextInt();
        if(N%4==0)
        {
            System.out.println(++N);
        } else
        {
            System.out.println(--N);
        }
    }
}
