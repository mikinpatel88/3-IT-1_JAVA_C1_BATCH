import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
  public static void main (String[] args) throws java.lang.Exception
  {
       Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int c=0;
        for(int i=0;i<n;i++){
            int t=sc.nextInt();
            if(t%k==0){
                c=c+1;
            }
        }
        System.out.println(c);
  }
}