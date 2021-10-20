import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		int c=0;
		while(t>0)
		{   
		    int n=in.nextInt();
		    for(int i=1;i<=n;i++)
		    {
		        if(n%i==0)c++;
		    }
		    if(c==2)
		    System.out.println("yes");
		    else
		    System.out.println("no");
		    c=0;t--;
		}
	}
}
