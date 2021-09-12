import java.util.Scanner;

public class Sumofdigit {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int sum=0;
            int r=0;
            while(n!=0)
            {
                r=n%10;
                sum=sum+r;
                n=n/10;
            }
            System.out.println(sum);
        }
    }
}
