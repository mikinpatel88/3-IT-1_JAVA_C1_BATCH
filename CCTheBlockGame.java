import java.util.*;
        import java.lang.*;
        import java.io.*;

class CCTheBlockGame
{
    public static void main (String[] args) throws java.lang.Exception
    {

        Scanner sc= new Scanner(System.in);
        int T = sc.nextInt();
        for(int i=0;i<T;i++)
        {
            int N=sc.nextInt();
            int r,rev=0;
            int temp=N;
            while(N>0)
            {
                r=N%10;
                rev=(rev*10)+r;
                N=N/10;
            }
            if(temp==rev)
                System.out.println("wins");
            else
                System.out.println("loses");
        }
    }
}