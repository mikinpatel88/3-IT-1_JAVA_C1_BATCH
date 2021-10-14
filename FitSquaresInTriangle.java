import java.util.*;
import java.lang.*;
import java.io.*;


class FitSquaresInTriangle
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int ans=0;
            n=(n-2)/2;
            ans=(n*(n+1)/2);
            System.out.println(ans);
        }
    }
}
