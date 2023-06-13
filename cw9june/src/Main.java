import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int x1= sc.nextInt();
        switch (x1) {
            case 1:
                System.out.println("enter the number you wan to print in fibonacci  serioes");
                int n = sc.nextInt();
                int a = 0;
                int b = 1;
                int c = a + b;
                System.out.print(a + " " + b);
                for (int i = 1; i <= n; i++) {
                    c = a + b;
                    System.out.print(" " + c + " ");
                    a = b;
                    b = c;
                }
                break;
            case 2:
                int d1= sc.nextInt();
                int n5=1;
                for(int i=1;i<=d1;i++)
                {
                    for(int j=1;j<=d1;j++)
                    {
                        System.out.print(n5);
                        n5++;
                    }
                    System.out.println();
                }
                break;
            case 3:
                System.out.print("enter the  row = ");
                int r1= sc.nextInt();
                System.out.print("enter the  column = ");
                int c1= sc.nextInt();

                for(int i=1;i<=r1;i++) {
                    int n6=0;
                    for (int j = 1; j <= c1; j++) {
                        System.out.print((n6+i)+" ");
                        n6=n6+r1;
                    }

                    System.out.println();
                }
                break;
            case 4:
                int r2= sc.nextInt();
                int c2= sc.nextInt();

                for(int i=r2;i>=1;i--)
                {
                    int n8=5;
                    for(int j=i;j<=c2;j++)
                    { System.out.print((n8+r2)+" "); }
                    System.out.println();
                }

        }


    }
}