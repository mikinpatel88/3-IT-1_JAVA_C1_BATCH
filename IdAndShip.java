import java.io.*;
import java.util.*;
import java.lang.*;


public class IdAndShip {
    public static void main(String[] args) {

        try {
            Scanner scan = new Scanner(System.in);
            int t=scan.nextInt();
            while(t-->0){
                char ch=scan.next().charAt(0);
                if(ch=='B'||ch=='b')
                    System.out.println("BattleShip");
                else if(ch=='c'||ch=='C')
                    System.out.println("Cruiser");
                else if(ch=='d'||ch=='D')
                    System.out.println("Destroyer");
                else
                    System.out.println("Frigate");
            }
        } catch(Exception e) {
            return;
        }
    }
}
