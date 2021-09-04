package com.company;
import  java.util.Scanner;
public class Finding_SquareRoots {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t=kb.nextInt();
        while(t-->0)
        {
            int n=kb.nextInt();
            System.out.println((int)Math.sqrt(n));
        }
    }
}
