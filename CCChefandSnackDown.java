import java.util.*;
import java.lang.*;
import java.io.*;

class CCChefandSnackDown
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner s=new Scanner(System.in);
        int T=s.nextInt();
        for(int i=0;i<T;i++)
        {
            int n=s.nextInt();
            if(n==2010||n==2015||n==2016||n==2017||n==2019)
                System.out.println("HOSTED");
            else
                System.out.println("NOT HOSTED");
        }
    }
}