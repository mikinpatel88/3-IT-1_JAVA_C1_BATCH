package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    Scanner s= new Scanner(System.in);
	    int count = s.nextInt();
        String st[]= new String[count];
	    s.nextLine();
	    for(int a=0; a<count;a++)
        {
            st[a]= s.nextLine();
        }
	    for(int a=0; a<count;a++)
        {
            String t[]=st[a].split("");
            int r= Integer.parseInt(t[0]) % Integer.parseInt(t[1])+1;
            System.out.println(r);
        }
    }
}
