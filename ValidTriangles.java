import java.util.*;

class ValidTriangles{
    public static void main(String[] argd)
    {
        Scanner ip = new Scanner(System.in);

        int loop;
        loop = ip.nextInt();

        for(int i=0;i<loop;i++)
        {
            int[] a = new int[3];
            a[0] = ip.nextInt();
            a[1] = ip.nextInt();
            a[2] = ip.nextInt();

            if(a[0]+a[1]+a[2] == 180)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
