package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	      Scanner s1= new Scanner(System.in);
	      int cnt= s1.nextInt();
	      String d[]=new String[cnt];
	      s1.nextLine();
	      for(int b=0; b<cnt;b++)
          {
              d[b]=s1.nextLine();
          }
	      for(int b=0; b<cnt;b++) {
              int f = 1;
              for (int i = 1; i<=d[b]; i++) {
                  f = f * 1;
              }
              System.out.println(f);
          }
    }
}
