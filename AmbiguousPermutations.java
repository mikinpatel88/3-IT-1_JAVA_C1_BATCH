import java.util.*;
import java.lang.*;
import java.io.*;


class CCAmbiguousPermutations
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int n;
        do{
            n = sc.nextInt();
            if(n==0){
                continue;
            }
            int []a = new int[n];
            int []b = new int[n] ;
            for(int i=0; i<n; i++){
                a[i] = sc.nextInt();
                b[(a[i]-1)] = i+1;
            }

            int i=0;
            for(i=0; i<n; i++){
                if(a[i] != b[i]){
                    break;
                }
            }
            if(i != n){
                System.out.println("not ambiguous");
            }
            else{
                System.out.println("ambiguous");
            }
        }while(n != 0);
    }
}