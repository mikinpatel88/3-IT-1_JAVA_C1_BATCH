import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.BigInteger;

class Main
        
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int x=0; x<t; x++){
		    int n = sc.nextInt();

		    BigInteger result = new BigInteger("1");
		    while(n > 0){
		        result = result.multiply(BigInteger.valueOf(n));
		        n--;
		    }
		    System.out.println(result);
		}
	}
}