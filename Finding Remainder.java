package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	   Scanner a1= new Scanner(System.in);
	   int c=a1.nextInt();
	   for(int i=0; i<c; i++)
       {
           int c1= a1.nextInt();
           int c2= c1/2+1;
           System.out.println(c2);
       }
    }
}
