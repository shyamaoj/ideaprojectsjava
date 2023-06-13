import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the row and column = ");
        int r= sc.nextInt();
        int c= sc.nextInt();
       // System.out.print("enter the table = ");
        int t=0;

        for(int i=1;i<=r;i++)
        {
            for(int j=1;j<=c;j++)
            {
                System.out.print(t*2+" ");
                t++;
            }
            System.out.println();
        }
        /*for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(i*j);
            }

            System.out.println();
        }*/
       /* for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(i%2!=0)
                {
                    System.out.print(0);
                }
                else
                    System.out.print(1);

            }System.out.println();
        }*/
       /* int t= sc.nextInt();
        System.out.printf("enter the row and column = ");
        int r= sc.nextInt();int c= sc.nextInt();
        for(int i=1;i<=r;i++)
        {
            for(int j=1;j<=c;j++)
            {
                System.out.print(t*j);
            }
            System.out.println();
        }*/
    }
}