import java.util.*;
import java.lang.*;
import java.io.*;

class CielAndReceipt
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=0; i<N; i++)
        {
            int num = sc.nextInt();
            int itemprice=2048;
            int ans=0;
            while (num>0)
            {
                ans+=num/itemprice;
                num%=itemprice;
                itemprice/=2;
            }
            System.out.println(ans);
        }
    }
}

