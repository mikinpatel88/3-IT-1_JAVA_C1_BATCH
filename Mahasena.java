import java.util.*;
import java.lang.*;
import java.io.*;

class Mahasena
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextInt())
        {
            int n=sc.nextInt();
            int count1=0;
            int count2=0;
            int[] arr=new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
                if(arr[i]%2==0)
                {
                    count1++;

                }
                else{
                    count2++;
                }
            }
            if(count1>count2)
            {
                System.out.println("READY FOR BATTLE");
            }
            else{
                System.out.println("NOT READY");
            }


        }
    }
}

