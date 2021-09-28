import java.util.*;
import java.lang.*;
import java.io.*;


class PrimalityTest
{


    static Scanner sc = new Scanner(System.in);



    public static  boolean prime(int a) {
        int count=0;
        for(int i=1;i<=a;i++) {
            if(a%i==0) {
                count++;
            }

        }
        if(count==2)
            return true;
        else
            return false;
    }
    public static void main (String[] args) throws java.lang.Exception{
        try{
            int n=sc.nextInt();
            while(n!=0) {

                int ans=sc.nextInt();
                if(prime(ans)==true)
                    System.out.println("yes");
                else  if(prime(ans)==false)
                    System.out.println("no");
                n--;
            }}catch(Exception e){
            return;
        }



    }


}

