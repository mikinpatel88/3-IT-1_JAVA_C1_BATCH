package com.greater.com.decrementincreament;
import java.util.Scanner;
public class DECREMENTINCREAMENT {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        if(n%4==0){
            System.out.println(++n);
        }else{
            System.out.println(--n);
        }
    }
}
