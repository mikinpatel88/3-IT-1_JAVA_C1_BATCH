package com.company;
import java.util.*;
import java.lang.*;
import java.io.*;

public class primllity_Test {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            boolean prime = true;
            int n = sc.nextInt();
            if(n == 1){
                System.out.println("no");
                continue;
            }
            if(n == 2){
                System.out.println("yes");
                continue;
            }
            for(int i=2; i<=n/2+1; i++) {
                if(n%i == 0) {
                    System.out.println("no");
                    prime = false;
                    break;
                }
            }
            if(prime == true) {
                System.out.println("yes");
            }
        }
        sc.close();
    }
}
