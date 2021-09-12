import java.util.Scanner;
class Reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            long n=sc.nextInt();
            int last=0;
            int r=0;
            while(n>0){
                last=(int)n%10;
                r=(r*10)+last;
                n=n/10;
            }
            System.out.println(r);

            t--;
        }
    }
}