
import  java.util.Scanner;
public class Chef_opt {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (a > b) {
                System.out.println(">");
            } else if (a < b) {
                System.out.println("<");
            } else {
                System.out.println("=");
            }
            sc.close();
        }
    }
}
