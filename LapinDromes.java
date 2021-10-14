import java.util.*;
import java.lang.*;
import java.io.*;

class Lapindromes
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            String str=sc.next();
            int mid=str.length()/2;
            char[] firstHalf=str.substring(0,mid).toCharArray();
            char[] secondHalf;
            if(str.length()%2==0)
                secondHalf=str.substring(mid).toCharArray();
            else
                secondHalf=str.substring(mid+1).toCharArray();

            Arrays.sort(firstHalf);
            Arrays.sort(secondHalf);

            if(Arrays.equals(firstHalf,secondHalf))
                System.out.println("YES");
            else
                System.out.println("NO");

        }
    }
}