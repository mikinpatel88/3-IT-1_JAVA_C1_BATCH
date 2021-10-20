import java.util.*;
class codechef
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int in[] = new int[n];
        int n1=0,temp1=0,temp2=0;
        String st = new String();
        for (int i=0;i<n;i++)
        {
            n1 = sc.nextInt();
            st = sc.next();
            for(int j=0;j<n1;j++)
            {
                if(st.charAt(j)==73)
                {
                    temp2 = 1;
                }
                else if(st.charAt(j)==89)
                {
                    temp1 = 1;
                }
            }
            if(temp2==1 && temp1==0)
            {
                System.out.println("INDIAN");
            }
            else if(temp1==1 && temp2==0)
            {
                System.out.println("NOT INDIAN");
            }
            else if((temp1==1 && temp2==1) || in[i]==0)
            {
                System.out.println("NOT SURE");
            }
            temp1=0;
            temp2=0;
        }
    }
}
