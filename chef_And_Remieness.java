package com.company;
import java.util.*;
import java.lang.*;
import java.io.*;

public class chef_And_Remieness {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int tc = 0; tc < T; tc++) {
            int A = sc.nextInt();
            int B = sc.nextInt();

            System.out.printf("%d %d\n", Math.max(A, B), A + B);
        }

        sc.close();
    }
}
