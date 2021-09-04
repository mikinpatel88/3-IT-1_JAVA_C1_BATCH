import java.util.*;
        import java.lang.*;
        import java.io.*;

class CCSumORDifference
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc= new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        if(A>B)
            System.out.println(A-B);
        else
            System.out.println(A+B);
    }
}