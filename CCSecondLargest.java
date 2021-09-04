import java.util.*;
        import java.lang.*;
        import java.io.*;

class CCSecondLargest
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int T = sc.nextInt();
        int largest=0;

        for(int i=0;i<T;i++)
        {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();

            if(A>B && A<C || A<B && A>C)
            {
                largest=A;
            }
            else if(B>A && B<C || B<A && B>C)
            {
                largest=B;
            }
            if(C>A && C<B || C<A && C>B)
            {
                largest=C;
            }
            System.out.println(largest);
        }
    }
}