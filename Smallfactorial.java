import java.util.Scanner;

public class Smallfactorial {
    public static void main(String arg[])
    {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        for(int i=0;i<t;i++)
        {   int  fact=1;
            int n=s.nextInt();
           for(int j=1;j<=n;j++)
           {
               fact=fact*j;
           }
          System.out.println(fact);
        }
    }
}
