import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r= sc.nextInt();
        int c= sc.nextInt();
        int a=0;
        for(int i=1;i<=r;i++)
        {
            for(int j=1;j<=c;j++)
            {
                System.out.print(j+r);
            }System.out.println();
            c=i+1;
        }

        int a1 = sc.nextInt();
        switch (a1) {
            case 1:
                int a = sc.nextInt();
                for (int i = 1; i <= a; i++) {
                    for (int j = 1; j <= a; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            case 2:
                int b = sc.nextInt();
                for (int i = 1; i <= b; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 3:
                int c = sc.nextInt();
                for (int i = c; i >= 1; i--) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 4:
                int d = sc.nextInt();
                for (int i = 1; i <= d; i++) {
                    for (int j = 1; j <= d - i; j++) {
                        System.out.print(" ");
                    }
                    for (int k = 1; k <= i; k++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            case 5:
                int e = sc.nextInt();
                for (int i = e; i >= 1; i--) {
                    for (int j = 1; j <= e - i; j++) {
                        System.out.print(" ");
                    }
                    for (int k = 1; k <= e - i; k++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            case 6:
                int f = sc.nextInt();
                for (int i = 1; i <= f; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                for(int i1=f;i1>=1;i1--)
                {
                    for(int j1=i1;j1>=1;j1--)
                    {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 7:
                int g= sc.nextInt();
                for (int i = 1; i <= g; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                for(int i1=g;i1>=1;i1--)
                {
                    for(int j1=i1-1;j1>=1;j1--)
                    {
                        System.out.print("*");
                    }
                    System.out.println();
                }

                }
    }
    }


