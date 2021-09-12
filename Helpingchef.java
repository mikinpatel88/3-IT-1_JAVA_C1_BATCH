import java.util.*;
import java.lang.*;
import java.io.*;
public class Helpingchef {



        public static void main (String[] args) throws java.lang.Exception
        {
            // your code goes here
            int t;
            Scanner sc = new Scanner(System.in);
            t = sc.nextInt();
            for(int i = 0;i<t;i++)
            {
                int n = sc.nextInt();
                if(n<10)
                {
                    System.out.println("Thanks for helping Chef!");
                }
                else{
                    System.out.println("-1");
                }
            }
        }
    }


