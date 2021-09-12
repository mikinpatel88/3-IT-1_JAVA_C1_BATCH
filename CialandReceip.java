import java.util.*;
import java.lang.*;
import java.io.*;
public class CialandReceip {



    /* Name of the class has to be "Main" only if the class is public. */

        public static void main (String[] args) throws java.lang.Exception
        {
            // your code goes here
            Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();
            for(int i=0;i<t;i++){
                int count=0;
                int n=sc.nextInt();
                for(int j=11;j>=0;j--){
                    count +=n/(Math.pow(2,j));
                    n%=Math.pow(2,j);
                }
                System.out.println(count);
            }
        }
    

}
