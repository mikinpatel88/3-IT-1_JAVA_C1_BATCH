import java.util.*;
import java.lang.*;
import java.io.*;


class CCCielandReceipt
{
    public static void main (String[] args) throws java.lang.Exception
    {

        Scanner sc= new Scanner(System.in);
        int T=sc.nextInt();
        for(int i=1; i<=T; i++)
        {
            int count=0;
            double p = sc.nextDouble();
            for(int j=11; j>=0; j--)
            {
                double menu = Math.pow(2, j);
                while (p >= menu)
                {
                    p = p - menu;
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
