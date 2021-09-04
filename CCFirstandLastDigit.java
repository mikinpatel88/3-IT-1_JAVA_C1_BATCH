import java.util.*;
        import java.lang.*;
        import java.io.*;


class CCFirstandLastDigit
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();

        for(int i=0;i<T;i++)
        {
            int N=sc.nextInt();
            int last = N%10;
            int first=0;
            while(N!=0)
            {
                first=N%10;
                N/=10;
            }
            System.out.println(first+last);
        }
    }
}
