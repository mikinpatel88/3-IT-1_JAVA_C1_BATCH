import java.util.*;
import java.lang.Math;
import java.io.*;


class FindingSquareRoots
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc =new Scanner(System.in);
        int l=sc.nextInt();
        while(l!=0)
        {
            double a=sc.nextDouble();
            System.out.println(Math.round(Math.sqrt(a)));


            l--;
        }
    }
}
