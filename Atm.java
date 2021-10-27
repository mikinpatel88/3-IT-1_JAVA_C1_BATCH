package com.company;
import java.util.Scanner;

public class Atm {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        double withdrawl_bal = sc.nextDouble();
        double curr_bal = sc.nextDouble();

        if (withdrawl_bal % 5 == 0 && curr_bal >= withdrawl_bal + 0.5){
            curr_bal = curr_bal - (withdrawl_bal + 0.5);
        }

        System.out.printf("%.2f",curr_bal);
    }
}
