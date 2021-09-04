import java.util.*;
import java.lang.*;
import java.io.*;

class CCTotalExpenses
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int i=0;i<T;i++){
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double exp;

            if(a>1000)
            {
                exp = (a*b) - (a*b)/10;
            }
            else
            {
                exp = a*b;
            }

            System.out.println(exp);
        }
    }
}