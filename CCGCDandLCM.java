import java.util.*;
        import java.lang.*;
        import java.io.*;

class CCGCDandLCM
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {
            long n1=sc.nextInt();
            long n2=sc.nextInt();
            System.out.println(GCD(n1,n2)+" "+LCM(n1,n2));
        }
    }
    static long GCD(long n1,long n2)
    {
        if(n1==0)
            return n2;
        return GCD(n2%n1 ,n1);
    }

    static long LCM(long n1,long n2)
    {
        return (n1/GCD(n1,n2))*n2;
    }
}