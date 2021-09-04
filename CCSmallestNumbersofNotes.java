import java.util.*;
import java.lang.*;
import java.io.*;

class CCSmallestNumbersofNotes
{
    public static void main (String[] args) throws java.lang.Exception
    {

        Scanner sc= new Scanner(System.in);
        int T=sc.nextInt();
        int count;
        for(int i=0;i<T;i++)
        {
            count=0;
            int N=sc.nextInt();
            while(N>0)
            {
                if(N>=100)
                {
                    N-=100;
                    count++;
                }
                else if(N>=50)
                {
                    N-=50;
                    count++;
                }
                else if(N>=10)
                {
                    N-=10;
                    count++;
                }
                else if(N>=5)
                {
                    N-=5;
                    count++;
                }
                else if(N>=2)
                {
                    N-=2;
                    count++;
                }
                else if(N>=1)
                {
                    N-=1;
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}