package com.example.javalab;
import java.util.Scanner;
public class Codechef {
    public static void main(String[] args) {
        System.out.println("Enter two numbers: ");
        Scanner sc= new Scanner(System.in);
            int A = sc.nextInt();
            int B = sc.nextInt();
            if (A > B) {
                System.out.println(">");
            } else if (A < B) {
                System.out.println("<");
            } else {
                System.out.println("=");
            }
    }

}
