import java.util.*;
        import java.lang.*;
        import java.io.*;

class CCPrimalityTest
{
    public static void main (String[] args) throws java.lang.Exception
    {

        Scanner sc= new Scanner(System.in);
        int T=sc.nextInt();
        for(int i=1; i<=T; i++)
        {
            int N = sc.nextInt();
            int flag=0;
            if(N==0||N==1)
            {
                System.out.println("no");
            }
            else
            {
                for (int j=2;j<=N/2;j++)
                {
                    if (N%j==0)
                    {
                        System.out.println("no");
                        flag=1;
                        break;
                    }
                }
                if(flag==0)
                {
                    System.out.println("yes");
                }
            }
        }
    }
}