import java.util.*;

class CodeChef
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int t=0;t<T;t++)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int rem=a%b;
            System.out.println(rem);
        }
    }
}