import java.util.*;
        import java.lang.*;
        import java.io.*;

class CCLuckyFour
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int T = sc.nextInt();

        for(int i=0;i<T;i++)
        {
            int N = sc.nextInt();
            int count=0;
            while (N>0)
            {
                int r=N%10;
                if(r==4)
                    count++;
                N=N/10;
            }
            System.out.println(count);
        }
    }
}

