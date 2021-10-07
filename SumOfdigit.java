import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class SumOfdigit
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int n = sc.nextInt();
            int sum = 0;
            for(;n>0;n=n/10){
                sum = sum + n%10;
            }
            System.out.println(sum);
        }sc.close();
    }
}