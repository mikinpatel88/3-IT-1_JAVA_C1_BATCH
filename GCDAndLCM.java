import java.io.*;
import java.util.*;
import java.lang.*;

public class GCDAndLCM {
    public static void main(String[] args) {

        try {
            Scanner scan = new Scanner(System.in);
            int t= scan.nextInt();
            while(t-->0){
                long a=scan.nextInt();
                long b=scan.nextInt();
                long gc=gcd(a,b);
                long lcm=(a*b)/gc;
                System.out.println(gc+" "+lcm);
            }
        } catch(Exception e) {
                return;
            }
    }

    public static long gcd(long a,long b){
        long gcd=0;
        if(a==0)
            return b;

            return gcd(b%a,a);
    }
}

