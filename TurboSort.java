import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class TurboSort
{
    public static void main (String[] args) throws java.lang.Exception
    {
        try{
            int t;
            Scanner sc=new Scanner(System.in);
            t=sc.nextInt();
            int[] arr= new int[t];
            for(int i=0;i<t;i++)
            {
                arr[i]=sc.nextInt();
            }
            Arrays.sort(arr);
            for(int i=0;i<t;i++)
            {
                System.out.println(arr[i]);
            }
        }
        catch(Exception e)
        {
            return;
        }
    }
}
