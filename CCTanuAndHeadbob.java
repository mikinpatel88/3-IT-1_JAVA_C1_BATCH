import java.util.*;
import java.lang.*;
import java.io.*;

class CCTanuAndHeadbob
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i=0;i<T;i++){
            int n = sc.nextInt();
            String s = sc.next();
            int j;
            for(j=0; j<n; j++){
                if(s.charAt(j) == 'Y'){
                    System.out.println("NOT INDIAN");
                    break;
                }
                else if(s.charAt(j) == 'I'){
                    System.out.println("INDIAN");
                    break;
                }
            }
            if(j == n){
                System.out.println("NOT SURE");
            }
        }
    }
}