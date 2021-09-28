import java.util.Scanner;

class TotalExpenses
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        short t=sc.nextShort();
        while(t-->0)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();

            if(a>1000)
            {
                double c=(a-a*0.1)*b;
                System.out.println(c);
            }
            else
            {
                double c=a*b;
                System.out.println(c);
            }
        }
    }
}
