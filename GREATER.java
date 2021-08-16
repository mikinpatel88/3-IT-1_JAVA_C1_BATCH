package com.greater;
import java.util.Scanner;
public class GREATER {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for(int i = 0; i < n; ++i) {
            int A = s.nextInt();
            int B = s.nextInt();
            if (A < B) {
                System.out.println("<");
            } else if (A > B) {
                System.out.println(">");
            } else {
                System.out.println("=");
            }
        }

    }

}
