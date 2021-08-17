import java.util.Scanner;

public class Chef_operator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of test cases");
        int t = sc.nextInt();
        for (int i = 0; i < t ;i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();

            if(A < B){
                System.out.println("<");
            } else if (A > B){
                System.out.println(">");
            }  else {
                System.out.println("=");
            }

        }
    }
}
