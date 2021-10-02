package com.company;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of the factorial you want");
        int loopcount = sc.nextInt();
        System.out.println("Enter the Factorial numbers");
        int data[] = new int[loopcount];

        for (int i = 0; i < loopcount; i++) {
            data[i] = sc.nextInt();
        }

        for (int i = 0; i < loopcount; i++) {
            int f=1;
            for(int j=1;j<=data[i];j++) {
                f = f * j;
            }
            System.out.println("the Factorial of the number"+" "+(i+1));
            System.out.println(f);
        }
    }
}
