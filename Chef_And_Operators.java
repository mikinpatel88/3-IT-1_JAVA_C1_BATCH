package com.company;
import java.util.Scanner;
public class Chef_And_Operators {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();

        for(int i=0;i<N;i++) {
            int a = s.nextInt();
            int b = s.nextInt();
            if (a > b) {
                System.out.println(">");
            } else if(a<b){
                System.out.println("<");
            }
            else
            {
                System.out.println("=");
            }

        }
        }
    }
