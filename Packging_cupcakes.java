package com.company;
import java.util.*;
import java.lang.*;
import java.io.*;

public class Packging_cupcakes {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int tc = 0; tc < T; tc++) {
            int N = sc.nextInt();

            System.out.println(solve(N));
        }

        sc.close();
    }

    static int solve(int N) {
        return N / 2 + 1;
    }
}

