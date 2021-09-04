package com.company;
import java.util.Scanner;
public class Second_Largest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int a,b,c;
        for(int i=0;i<t;i++){
            a=sc.nextInt();
            b=sc.nextInt();
            c=sc.nextInt();
            if(a>b && a<c || a>c && a<b){
                System.out.println(a);
            }else if(b>a && b<c || b>c && b<a){
                System.out.println(b);
            }else{
                System.out.println(c);
            }
        }

    }
}
