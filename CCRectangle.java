import java.util.*;
import java.lang.*;
import java.io.*;

class CCRectangle
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int i=1;i<=T;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int d=sc.nextInt();
            if((a==b && c==d) || (a==c && b==d) || (a==d && b==c))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}