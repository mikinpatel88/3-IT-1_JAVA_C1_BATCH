import java.util.Scanner;

public class DecrementOrIncrement
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        if(N%4==0)
        {
            System.out.println(++N);
        }
        else
        {
            System.out.println(--N);
        }
    }
}
