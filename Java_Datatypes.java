package com.company;
import java.util.Scanner;
public class Java_Datatypes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers you want to fit");
        int t=sc.nextInt();

        for(long i=0;i<t;i++)
        {

            try
            {
                System.out.println("Enter the number"+""+ i);
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127)
                {System.out.println("* byte");}

                if(x>=-Math.pow(2,15) && x<=Math.pow(2,15)-1)
                {System.out.println("* short");}

                if(x>=-Math.pow(2,31) && x<=Math.pow(2,31)-1)
                {System.out.println("* int");}

                if(x>=-Math.pow(2,63) && x<=Math.pow(2,63)-1)
                {System.out.println("* long");}
                //Complete the code
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}
