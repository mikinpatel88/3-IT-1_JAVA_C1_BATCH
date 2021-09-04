import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class AddTwoNumbers
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc=new Scanner(System.in);
        int T = sc.nextInt();

        for(int i=0;i<T;i++)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();

            int sum=a+b;
            System.out.println(sum);
        }
    }
}