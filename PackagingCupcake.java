import java.util.*;
import java.lang.*;
import java.io.*;
public class PackagingCupcake {


    /* Name of the class has to be "Main" only if the class is public. */

        public static void main (String[] args) throws java.lang.Exception
        {
            // your code goes here
            Scanner ip = new Scanner(System.in);
            int n= ip.nextInt();
            while(n-- >0){
                int a=ip.nextInt();
                if(a%2==0)
                    System.out.println((a/2) + 1);
                else
                    System.out.println((a+1)/2);
            }
        }

}
