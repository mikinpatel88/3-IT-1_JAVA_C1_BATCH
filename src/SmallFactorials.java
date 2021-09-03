import java.util.Scanner;

public class SmallFactorials
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        int loopCount = sc.nextInt();

        int data[]=new int[loopCount];

        for(int i=0;i<loopCount;i++)
        {
            data[i] = sc.nextInt();
        }

        for(int i=0;i<loopCount;i++)
        {
            int fact = 1;
            for(int j = 1;j<=data[i];j++)
            {
                fact=fact*j;
            }
            System.out.println(fact);
        }
    }
}
