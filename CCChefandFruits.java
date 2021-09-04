import java.util.*;
import java.lang.*;
import java.io.*;

class CCChefandFruits
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T != 0) {
            int N=sc.nextInt();
            int M=sc.nextInt();
            int K=sc.nextInt();
            int Min=Math.abs(N-M);

            Min-=K;
            if(Min<=0)
            {
                Min=0;
            }
            System.out.println(Min);
            T--;
        }
    }
}