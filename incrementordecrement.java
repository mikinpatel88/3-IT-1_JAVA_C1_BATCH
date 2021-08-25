import java.util.*;
import java.lang.*;
import java.io.*;

class incrementordecrement
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();

        if(N%4==0)
        {
            System.out.println(++N);
        }
        else
        {
            System.out.println(--N);
        }
    }
}
