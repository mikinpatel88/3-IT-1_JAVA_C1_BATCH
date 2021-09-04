import java.util.*;
import java.lang.*;
import java.io.*;

class Firstandlastdigit {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();

        while(--t>=0)
        {
            int num = sc.nextInt();
            int last_digit = num%10;
            int first_digit = 0;
            while(num>0)
            {
                first_digit = num%10;
                num = num /10;
            }
            int sum = first_digit+last_digit;
            System.out.println(sum);
        }

    }
}
