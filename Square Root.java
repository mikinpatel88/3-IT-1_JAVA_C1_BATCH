package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner a= new Scanner(System.in);
        int x= a.nextInt();
        for(int i=0;i<x;i++)
        {
            int y= a.nextInt();
            int sq= (int)Math.sqrt(y);
            System.out.println(sq);
        }
    }
}
