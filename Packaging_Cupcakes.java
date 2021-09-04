package com.company;
import java.util.Scanner;
public class Packaging_Cupcakes {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int T= sc.nextInt();
        for(int i=1 ; i<=T ; i++)
        {
            int N =sc.nextInt();
            System.out.println((N/2)+1);
        }
    }
}
