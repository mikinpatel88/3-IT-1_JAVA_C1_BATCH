import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        double X = sc.nextDouble();
        double Y = sc.nextDouble();

        if (X % 5 == 0 && Y >= X + 0.5){
            Y = Y - X - 0.5;
        }

        System.out.printf("%.2f",Y);

    }
}