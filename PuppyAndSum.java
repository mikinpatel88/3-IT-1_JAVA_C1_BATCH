import java.io.PrintWriter;
import java.util.*;

public class PuppyAndSum {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int l=obj.nextInt();
        while(l--!=0) {
            int d = obj.nextInt();
            int n = obj.nextInt();
            long sum = get(n);
            for (int i = 1; i < d; i++) {
                sum = get(sum);
            }
            out.println(sum);
        }
        out.flush();
    }
    public static long get(long n) {
        return (n * (n + 1)) / 2;
    }
}
