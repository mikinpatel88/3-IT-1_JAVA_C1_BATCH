import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            char str[] = new char[n];
            for (int i = 0; i < n; i++) {
                str[i] = sc.next().charAt(0);
            }
            for (int i = 0; i < n; i++) {
                if (str[i] == 'B' || str[i] == 'b') {
                    System.out.println("BattleShip");
                }
                if (str[i] == 'C' || str[i] == 'c') {
                    System.out.println("Cruiser");
                }
                if (str[i] == 'D' || str[i] == 'd') {
                    System.out.println("Destroyer");
                }
                if (str[i] == 'F' || str[i] == 'f') {
                    System.out.println("Frigate");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
