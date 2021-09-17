import java.util.*;
import java.lang.*;
import java.io.*;

class TheBlockGame
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int num=sc.nextInt();
            int rev=0,remainder;
            int tmp=num;
            while(num>0){
                remainder=num%10;
                rev=(rev*10)+remainder;
                num=num/10;
            }
            if(tmp==rev){
                System.out.println("wins");
            }
            else{
                System.out.println("loses");
            }
        }
    }
}
