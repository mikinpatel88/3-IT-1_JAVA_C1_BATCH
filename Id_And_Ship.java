package com.company;
import java.util.*;
import java.lang.*;
import java.io.*;

public class Id_And_Ship {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner input =new Scanner(System.in);
        int t=input.nextInt();
        char ch;
        while(t-->0)
        {
            ch=input.next().charAt(0);
            if(ch=='B' || ch=='b')
                System.out.println("BattleShip");
            else if(ch=='C' || ch=='c')
                System.out.println("Cruiser");
            else if (ch=='D' || ch=='d')
                System.out.println("Destroyer");
            else if(ch=='F' || ch=='f')
                System.out.println("Frigate");
        }
    }
}
