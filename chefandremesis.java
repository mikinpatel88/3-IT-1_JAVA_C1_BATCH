import java.util.*;
class Codechef {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            long min[] = new long[t];
            long max[] = new long[t];
            for (int i = 0; i < t; i++) {
                long a = sc.nextLong();
                long b = sc.nextLong();
                if (a > b) {
                    min[i] = a;
                } else {
                    min[i] = b;
                }
                max[i] = a + b;
            }
            for (int i = 0; i < t; i++) {
                System.out.println(min[i] + " " + max[i]);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
