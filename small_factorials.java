import java.util.Scanner;
import java.lang.*;
import java.io.*;
import java.math.BigInteger;


/* Name of the class has to be "Main" only if the class is public. */
class small_factorials
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int numOfCases = sc.nextInt();
        while (numOfCases-- > 0) {
            int n = sc.nextInt();
            BigInteger factor = new BigInteger("1");
            for (int i = 2 ; i <= n; i++) {
                factor = factor.multiply(BigInteger.valueOf(i));

            }
            System.out.println(factor);
        }
        sc.close();
    }
}