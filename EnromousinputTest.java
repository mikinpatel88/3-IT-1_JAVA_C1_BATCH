import java.util.*;
import java.lang.*;
import java.io.*;

class CCEnromousinputTest
{
    public static void main (String[] args) throws java.lang.Exception
    {

        Scanner sc=new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int count=0;
        for(int i=0;i<n;i++)
        {
            int a=sc.nextInt();

            if(a%k==0)
                count++;
        }
        System.out.println(count);
    }
}