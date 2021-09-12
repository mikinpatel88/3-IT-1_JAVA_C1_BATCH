package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int count= s.nextInt();
        String d[]= new String[count];
        for(int i=0;i<count;i++)
        {
            d[i]=s.next();
        }
        for(int j=0;j<count;j++)
        {
            int sum=(d[j].charAt(0)-'0')+(d[j].charAt(d[j].length()-1)-'0');
            System.out.println(sum);
        }
    }
}
