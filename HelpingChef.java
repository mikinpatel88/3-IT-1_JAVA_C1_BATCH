import java.util.*;

class HelpingChef{
    public static void main(String[] argd)
    {
        Scanner ip = new Scanner(System.in);

        int loop;
        loop = ip.nextInt();

        for(int i=0;i<loop;i++)
        {
            int a;
            a = ip.nextInt();
            if(a<10)
                System.out.println("Thanks for helping Chef!");
            else
                System.out.println("-1");
        }
    }
}
