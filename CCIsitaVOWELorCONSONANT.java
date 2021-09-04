import java.util.*;
import java.lang.*;
import java.io.*;
class CCIsitaVOWELorCONSONANT
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' || ch=='a' || ch=='e' || ch=='i'|| ch=='o' || ch=='u')
            System.out.println("Vowel");
        else
            System.out.println("Consonant");
    }
}