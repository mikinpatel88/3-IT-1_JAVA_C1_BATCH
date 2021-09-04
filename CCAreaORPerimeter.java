import java.util.*;
import java.lang.*;
import java.io.*;

class CCAreaORPerimeter
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int L= sc.nextInt();
        int B= sc.nextInt();
        int area=L*B;
        int perimeter=2*(L+B);
        if (area>perimeter)
        {
            System.out.println("Area");
            System.out.println(area);
        }
        if (perimeter>area)
        {
            System.out.println("Peri");
            System.out.println(perimeter);
        }
        if (perimeter==area)
        {
            System.out.println("Eq");
            System.out.println(area);
        }
    }
}