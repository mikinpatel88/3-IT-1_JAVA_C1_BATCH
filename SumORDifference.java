import java.util.*;
import java.lang.*;
import java.io.*;

class SumORDifference
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        if(num1>num2){
            System.out.println(num1-num2);
        }
        else{
            System.out.println(num1+num2);
        }
    }
}
