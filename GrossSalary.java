import java.util.*;
import java.lang.*;
import java.io.*;


class GrossSalary
{
    public static void main (String[] args) throws java.lang.Exception
    {

        Scanner in = new Scanner(System.in);

        int t = in.nextInt();
        while(t-->0){
            int s = in.nextInt();
            double total = 0;

            if(s<1500){
                total = s+(s*0.1)+(s*0.9);
            }
            else{
                total = s+500+(s*0.98);


            }
            System.out.println(total);
        }

    }
}