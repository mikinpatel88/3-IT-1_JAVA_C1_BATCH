import java.util.ArrayList;
import java.util.Scanner;

class Codechef {
    static int number_of_recipes(int amt){
        int no=0;
        while(amt>2048){
            amt-=2048;
            no++;
        }
        while(amt>0){
            if(amt%2==1){
                no++;
            }
            amt/=2;
        }
        return no;
    }
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            ArrayList<Integer> recipe = new ArrayList<>();
            for (int i = 0; i < t; i++) {
                int temp = sc.nextInt();
                recipe.add(number_of_recipes(temp));
            }
            for (int i = 0; i < t; i++) {
                System.out.println(recipe.get(i));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
