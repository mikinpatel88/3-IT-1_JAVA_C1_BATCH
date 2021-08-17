package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	      Scanner s= new Scanner(System.in);
	      int a= s.nextInt();
	      for(int i=0;i<a;i++)
          {
              int b= s.nextInt();
              int r=0;
              while(b!=0)
              {
                  int rem=b%10;
                  r=r*10+rem;
                  b=b/10;
              }
              System.out.println(r);
          }
    }
}
