import java.util.*;
import java.lang.*;
import java.io.*;

class TheSmallestPair
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner input = new Scanner (System.in);
        try
        {
            int t = input.nextInt();
            while(t-->0)
            {
                int n =input.nextInt();
                int arr[] = new int[n];
                int sum = 0;
                for(int i=0;i<n;i++)
                {
                    arr[i] = input.nextInt();

                }
                Arrays.sort(arr);

                sum = arr[0] +arr[1];
                System.out.println(sum);
            }
        }
        catch(Exception e)
        {
            return;
        }
    }
}
