import java.util.*;
class TheLeadGame
{
    public static void main (String[] args)
    {
        Scanner s=new Scanner(System.in);
        int round=s.nextInt();
        int Score1=0,Score2=0,win=-1,lead=0;
        try {
            while(round!=0){
                int sc1=s.nextInt();
                int sc2=s.nextInt();
                Score1=sc1+Score1;
                Score2=sc2+Score2;
                if(Score1-Score2>lead){
                    win=1;
                    lead=Score1-Score2;
                }
                if(Score2-Score1>lead){
                    win=2;
                    lead=Score2-Score1;
                }
                round--;
            }
            System.out.println(win+" "+lead);

        } catch(Exception e) {
        }

    }
}


