import java.util.*;
        import java.lang.*;
        import java.io.*;

class CCFindingSquareRoots
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int i=1; i<=T; i++)
        {
            int n = sc.nextInt();
            int res = (int)Math.sqrt(n);
            System.out.println(res);
        }
    }
}
