/* package codechef; // don't place package name! */


import java.util.Scanner;

class Codechef
{
	public static void main (String[] args) 
	{
		Scanner sc = new Scanner(System.in);
        int loopcount = sc.nextInt();
        int data[] = new int[loopcount];

        for(int i=0;i<loopcount;i++)
        {
            data[i] = sc.nextInt();
        }
        for(int i=0;i<loopcount;i++){
            int fact = 1;
            for(int j=1;j<=data[i];j++){
                fact = fact*j;
            }
            System.out.println(fact);
        }
	}
}
