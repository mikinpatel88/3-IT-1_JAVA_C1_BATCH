import java.util.*;
import java.lang.*;
import java.io.*;

class SmallestNumbersOfNotes
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr={1,2,5,10,50,100};
        for(int i=0;i<n;i++){
            int num=sc.nextInt();
            int ans=0;
            int j=arr.length-1;
            while(num>0){
                ans=ans+num/arr[j];
                num=num%arr[j];
                j--;

            }
            System.out.println(ans);
        }
    }
}
