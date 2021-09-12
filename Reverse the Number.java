/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;


class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int i = 0; i < t; i++){
		    int n = sc.nextInt();
		    int x = 0;
		    while(n != 0){
		        int last = n % 10;
		        x = x*10 + last;
		        n /= 10;
		    }
		    System.out.println(x);}
	}
}
