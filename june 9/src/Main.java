import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x6 = sc.nextInt();
        switch (x6) {
            case 1:

                int a = sc.nextInt();
                int n = 1;
                for (int i = 1; i <= a; i++) {
                    for (int j = 1; j <= a; j++) {
                        System.out.print(n + " ");
                    }
                    System.out.println();
                    n++;
                }
            case 2:
                int b = sc.nextInt();
                int c = b;
                int sum = 0;
                while (b > 0) {
                    int rem = b % 10;
                    sum = sum * 10 + rem;
                    b = b / 10;
                }
                if (c == sum)
                    System.out.print("palin");
                else
                    System.out.print("nt pal");
                break;

            case 3:
                int c1 = sc.nextInt();
                int a1 = 2;
                while (c1 >= a1) {
                    if (c1 % a1 == 0) {
                        System.out.print("not prime");
                        break;
                    }
                    if (c1 - 1 == a1) {
                        System.out.print("priime");
                        break;
                    }
                    a1++;
                }
                break;

            case 4:
                int n6 = sc.nextInt();
                int a3 = 0;
                int a4 = 1;
                int c2;
                System.out.print(a3 + "  " + a4);
                for (int i = 3; i <= n6; i++) {
                    c2 = a3 + a4;
                    System.out.print("  " + c2 + " ");
                    a3 = a4;
                    a4 = c2;
                }
                break;
            case 5:
                int r1 = sc.nextInt();
                int c3 = sc.nextInt();
                int n7 = 1;
                for (int i = 1; i <= r1; i++) {
                    for (int j = 1; j <= c3; j++) {
                        System.out.print(n7 + "  ");
                        n7++;
                    }
                    System.out.println();
                }
                break;
            case 6:
                int r2 = sc.nextInt();
                int c4 = sc.nextInt();
                int t3 = sc.nextInt();
                int n8 = 1;
                for (int i = 1; i <= r2; i++) {
                    for (int j = 1; j <= c4; j++) {
                        System.out.print(t3 * n8);
                        n8++;
                    }
                    System.out.println();
                }
                break;
            case 7:
                int r3 = sc.nextInt();
                int c5 = sc.nextInt();

                for (int i = r3; i >=1 ; i--) {
                    int n9 = 0;
                    for (int j = 1; j <= c5; j++) {
                        System.out.print((i + n9) + " ");
                        n9 = n9 + r3;
                    }
                    System.out.println();}
                    break;
            case 8:
                int r7= sc.nextInt();
                int c7= sc.nextInt();

                for(int i=1;i<=r7;i++)
                { int n3=1;
                    for(int j=1;j<=c7;j++)
                    {
                        if(j%2!=0) {
                            System.out.print(n3);
                            n3=n3+(j*r7);
                        }
                        else
                        {
                            System.out.print((r7*j)-n3);
                        }
                }
                    r7++;
                    System.out.println();

                }
        }

    }}
