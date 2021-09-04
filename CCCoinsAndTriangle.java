import java.util.*;
import java.lang.*;
import java.io.*;

class CCCoinsAndTriangle
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int i=0;i<T;i++){
            int N=sc.nextInt();
            int sum=0;
            int height=0;
            int count=1;
            while(sum<=N){
                sum=sum+count;
                count++;
                if(sum<=N){
                    height++;
                }
            }
            System.out.println(height);
        }
    }
}