import java.util.*;
import java.lang.*;
import java.io.*;
class CCFitSquaresinTriangle
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int i=0;i<T;i++){
            int A = sc.nextInt();
            int count = 0;
            while(A>2){
                count += (A-2)/2;
                A-=2;
            }
            System.out.println(count);
        }
    }
}