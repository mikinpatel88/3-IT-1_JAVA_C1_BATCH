package com.company;
import java.util.Scanner;
public class Decrement_OR_Increment{
    public static void main(String[] args) {

        Scanner s =  new Scanner(System.in);
        int N = s.nextInt();

        /*int a = s.nextInt();
        int b = s.nextInt();*/
        if (N%4==0) {
            System.out.println(++N);
        }
        else
        {
            System.out.println(--N);
        }
    }
}
