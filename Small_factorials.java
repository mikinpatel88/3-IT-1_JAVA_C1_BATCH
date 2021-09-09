import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;
class Factorial
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0; i<t; i++)
		{
		    int n = sc.nextInt();
		    BigInteger fact = new BigInteger("1");
		    for(int j = n; j > 0; j--)
		    {
		        fact = fact.multiply(BigInteger.valueOf(j));
		    }
		    System.out.println(fact);
		}
	}
}