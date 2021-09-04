import java.util.*;
import java.lang.*;
import java.io.*;

class CCSumsInATriangle
{
    public static void main (String[] args) throws java.lang.Exception
    {

        Scanner sc = new Scanner(System.in);
        int T= sc.nextInt();
        while(T-->0)
        {
            int n=sc.nextInt();
            int i,j;
            int a[][]=new int[n][n];
            for(i=0;i<n;i++)
            {
                for(j=0;j<=i;j++)
                {
                    a[i][j]=sc.nextInt();
                }
            }
            for(i=n-2;i>=0;i--)
            {
                for(j=0;j<=i;j++)
                {
                    if((a[i][j]+a[i+1][j])>(a[i][j]+a[i+1][j+1]))
                    {
                        a[i][j]=a[i][j]+a[i+1][j];
                    }
                    else
                        a[i][j]=a[i][j]+a[i+1][j+1];
                }
            }
            System.out.println(a[0][0]);
        }
    }
}
