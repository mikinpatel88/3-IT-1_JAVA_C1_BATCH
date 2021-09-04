import java.util.*;
import java.lang.*;
import java.io.*;

class CCMahasena
{
    public static void main (String[] args) throws java.lang.Exception
    {

        Scanner sc= new Scanner(System.in);
        int N = sc.nextInt();
        int Array[] = new int[N];
        int counteven=0;
        int countodd=0;
        for(int i=0; i<N; i++)
        {
            Array[i]=sc.nextInt();
            if(Array[i]%2==0)
                counteven++;
            else
                countodd++;
        }
        if(counteven>countodd)
            System.out.println("READY FOR BATTLE");
        else
            System.out.println("NOT READY");
    }
}