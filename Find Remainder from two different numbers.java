//No template exists for this language. Erase this and please write full code.
import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
public class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner s1= new Scanner(System.in);
        int i=s1.nextInt();
        for(int a=0;a<i;a++)
        {
            int x=s1.nextInt();
            int y=s1.nextInt();
            
            System.out.println(x%y);
        }
    }
}