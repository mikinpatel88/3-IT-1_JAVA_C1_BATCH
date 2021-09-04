import java.util.*;
import java.lang.*;
import java.io.*;

class CCGreedyPuppy
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0)
        {
            int max=0;
            int n=sc.nextInt();
            int k=sc.nextInt();
            for(int j=1;j<=k;j++)
            {
                int r=n%j;
                if(max<r)
                {
                    max=r;
                }
            }
            System.out.println(max);
        }
    }
}