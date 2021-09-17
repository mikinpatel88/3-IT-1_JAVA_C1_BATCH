import java.util.*;
class ChefAndRemissness
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner scanner=new Scanner(System.in);
        int test=scanner.nextInt();
        while(test-- >0)
        {
            int num = scanner.nextInt();
            int num2 = scanner.nextInt();
            System.out.println(Math.max(num, num2)+" "+(num+num2));
        }
        scanner.close();
    }
}
