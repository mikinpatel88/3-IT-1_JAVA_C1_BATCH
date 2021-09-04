import java.util.*;
        import java.lang.*;
        import java.io.*;

class CCIdandShip
{
    public static void main (String[] args) throws java.lang.Exception
    {

        Scanner sc = new Scanner(System.in);
        int T=sc.nextInt();
        for (int i=0;i<T;i++) {
            String y=sc.next();
            if(y.equals("B")|| y.equals("b"))
            {
                System.out.println("BattleShip");
            }
            if(y.equals("C")|| y.equals("c"))
            {
                System.out.println("Cruiser");
            }
            if(y.equals("D")|| y.equals("d"))
            {
                System.out.println("Destroyer");
            }
            if(y.equals("F")|| y.equals("f"))
            {
                System.out.println("Frigate");
            }
        }
    }
}
