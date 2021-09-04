import java.util.*;
import java.lang.*;
import java.io.*;

class CCHOWMANYDIGITSDOIHAVE
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int N=s.length();
        if(N==1)
        {
            System.out.println("1");
        }
        if( N==2)
        {
            System.out.println("2");
        }
        if(N==3)
        {
            System.out.println("3");
        }
        if(N>3)
        {
            System.out.println("More than 3 digits");
        }
    }
}