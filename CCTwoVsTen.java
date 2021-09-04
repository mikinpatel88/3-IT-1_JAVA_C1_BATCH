import java.util.*;
import java.lang.*;
import java.io.*;
class CCTwoVsTen
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int i=1;i<=T;i++){
            int A=sc.nextInt();
            if(A%10==0){
                System.out.println("0");
            }
            else if(A%5==0){
                System.out.println("1");
            }
            else
                System.out.println("-1");
        }
    }
}
