import java.util.*;
        import java.lang.*;
        import java.io.*;

class CCPuppyandSum
{
    public static int sum(int N) {
        int s=0;
        for (int i=1;i<=N;i++)
        {
            s +=i;
        }
        return s;

    }
    public static int sumX(int D, int N) {

        for (int i = 0; i < D; i++)
        {
            N = sum(N);
        }
        return N;
    }
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++)
        {
            int D = sc.nextInt();
            int N = sc.nextInt();
            System.out.println(sumX(D, N));
        }

    }
}