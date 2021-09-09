
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);// your code goes here
        int t = sc.nextInt();
        for (int i=0; i<t; i++){
        int n= sc.nextInt();
        int rev=0;
        
        while(n!=0){
        rev=(rev*10) +(n%10);
        n=n/10;
        }
        System.out.println(rev);
        }
	}
}
