import java.util.*;
        import java.lang.*;
        import java.io.*;

class CCTheLeadGame
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int p1[]= new int [n];
        int p2[]= new int [n];

        int sum1=0,sum2=0;
        int p=0,s=0,l=0,w=0;
        for(int i=0;i<n;i++) {
            p1[i] = sc.nextInt();
            sum1 += p1[i];
            p2[i] = sc.nextInt();
            sum2 += p2[i];

            if (sum1 > sum2) {
                s = sum1 - sum2;
                p= 1;
            }
            else
            {
                s = sum2 - sum1;
                p = 2;
            }
            if(s>l)
            {
                w=p;
                l=s;
            }
        }
        System.out.println(w + " " + l);
    }
}