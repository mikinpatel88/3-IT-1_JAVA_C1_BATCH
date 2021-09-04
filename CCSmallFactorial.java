import java.util.*;
        import java.lang.*;
        import java.io.*;

class CCSmallFactorial
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {
            int n=sc.nextInt();
            int fact=1;
            while(n>0)
            {
                fact=fact*n;
                n--;
            }
            System.out.println(fact);
        }
    }
}