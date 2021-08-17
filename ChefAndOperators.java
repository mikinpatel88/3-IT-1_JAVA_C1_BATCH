package com.mycompany.chefandoperators;

import java.util.Scanner;
public class Main {
    public static void main(String[] arg){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i=0; i<t; i++)
        {
            int a = in.nextInt() , b=in.nextInt();
            if(a < b){
                System.out.println("<");
            }
            else if(a > b){
                System.out.println(">");
            }
            else{
                System.out.println("=");
            }
        }
    }    
}