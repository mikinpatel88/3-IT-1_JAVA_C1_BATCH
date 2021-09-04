package com.company;
import java.util.Scanner;
public class Lucky_Four {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        long T=sc.nextLong();
        while(T-->0)
        {
            int counter=0;
            long num=sc.nextLong();

            while(num>0)
            {
                if((num%10)==4)
                    counter++;
                num=num/10;
            }

            System.out.println(counter);
        }
    }
}
