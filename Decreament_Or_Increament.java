package com.charusat;

import java.util.Scanner;

public class Decreament_Or_Increament {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        if(n%4==0)
        {
            System.out.println(++n);
        }
        else
        {
            System.out.println(--n);
        }
    }
}
