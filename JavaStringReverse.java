import java.io.*;
import java.util.*;

public class JavaStringReverse {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        String B=new StringBuffer(A).reverse().toString();
        if(A.equals(B))
            System.out.print("Yes");
        else
            System.out.print("No");
    }
}



