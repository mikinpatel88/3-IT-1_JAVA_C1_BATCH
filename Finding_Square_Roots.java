package com.company;
import java.util.Scanner;

public class Finding_Square_Roots {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int tc = 0; tc < T; tc++) {
            int N = sc.nextInt();

            System.out.println(solve(N));
        }

        sc.close();
    }

    static int solve(int N) {
        int root = (int) Math.ceil(Math.sqrt(N));
        while (root * root > N) {
            root--;
        }
        return root;
     }

}
