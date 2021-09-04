import java.util.*;
import java.lang.*;
import java.io.*;

class CCFarmerFeb
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++)
        {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int sum=x+y+1;

            int count=0;
            while (count!=2)
            {
                count=0;
                for (int j=1;j<=sum;j++)
                {
                    if (sum%j==0)
                    {
                        count++;
                    }
                }
                if(count!=2)
                    sum++;
                else
                    break;
            }
            System.out.println(sum-(x+y));
        }
    }
}