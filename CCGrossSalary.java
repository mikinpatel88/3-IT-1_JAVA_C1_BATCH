import java.util.*;
import java.lang.*;
import java.io.*;

class CCGrossSalary
{
    public static void main (String[] args) throws java.lang.Exception
    {

        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        double S,GS,HRA,DA;
        for(int i=0;i<T;i++)
        {
            S=sc.nextDouble();
            if(S<1500)
            {
                HRA=0.1*S;
                DA=0.9*S;
                GS=S+HRA+DA;
                System.out.println(GS);
            }
            else if(S>=1500)
            {
                HRA=500;
                DA=0.98*S;
                GS=S+HRA+DA;
                System.out.println(GS);
            }
        }
    }
}