import java.util.*;
import java.lang.*;
import java.io.*;
public class ChefandRemissnes
{


    /* Name of the class has to be "Main" only if the class is public. */

        public static void main (String[] args) throws java.lang.Exception
        {
            // your code goes here
            try{
                Scanner sc=new Scanner(System.in);
                int testCase=sc.nextInt();
                while(testCase-->0){
                    int numOne=sc.nextInt();
                    int numTwo=sc.nextInt();

                    if(numOne>numTwo){
                        System.out.println(numOne+" "+(numOne+numTwo));
                    }else{
                        System.out.println(numTwo+" "+(numOne+numTwo));
                    }

                }
            }catch(Exception e){
                return;
            }
        }
    }

