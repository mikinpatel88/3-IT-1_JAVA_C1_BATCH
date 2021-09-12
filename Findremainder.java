import java.util.*;
public class Findremainder {

        public static void main(String args[]){
            Scanner sc = new Scanner(System.in)
                int cases = sc.nextInt();
                while (cases > 0) {
                    int x = sc.nextInt();
                    int y = sc.nextInt();
                    System.out.println(x % y);
                    cases--;
                }
            }

        }

}
