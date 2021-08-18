import java.util.*;
import java.lang.*;
import java.io.*;
class chefandoperator
{cd
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        int t= sc.nextInt();

        for(int i=0;i<t;i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();

            if (A < B)
            {System.out.println("<");
            }
            else if (A > B)
            {System.out.println(">");
            }
            else
            {System.out.println("=");
            }
        }
    }
}
