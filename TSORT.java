import java.util.Scanner;
import java.util.Arrays;
class turbosort
{
    public static void main (String[] args) {
        int number_of_array;
        Scanner input=new Scanner(System.in);
        number_of_array=input.nextInt();
        int array[]=new int[number_of_array];
       for (int i=0 ; i<number_of_array;i++) {
        array[i]=input.nextInt();
      }
         Arrays.sort(array);
            for (int i=0 ; i<number_of_array;i++) {
        System.out.println(array[i]);
      }
      
    }
}
