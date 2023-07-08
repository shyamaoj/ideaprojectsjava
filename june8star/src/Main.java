import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        switch (x) {
            case 1:
                int a = sc.nextInt();
                for (int i = 1; i <= a; i++) {
                    for (int j = 1; j <= a; j++) {
                        System.out.print(j);
                    }
                    System.out.println();
                }
                break;
            case 2:
                int b = sc.nextInt();
                for (int i = 1; i <= b; i++) {
                    for (int j = 1; j <= b; j++) {
                        System.out.print(i);
                    }
                    System.out.println();
                }
                break;
            case 3:
                int c = sc.nextInt();
                for (int i = 1; i <= c; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print(j);
                    }
                    System.out.println();
                }
                break;
            case 4:
                int d = sc.nextInt();
                for (int i = 1; i <= d; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print(i);
                    }
                    System.out.println();
                }
                break;
            case 5:
                int e = sc.nextInt();
                for (int i = e; i >= 1; i--) {
                    for (int j = e; j >= 1; j--) {
                        System.out.print(i);
                    }
                    System.out.println();
                }
                break;
            case 6:
                int f = sc.nextInt();
                for (int i = 1; i <= f; i++) {
                    for (int j = f; j >= 1; j--) {
                        System.out.print(j);
                    }
                    System.out.println();
                }
                break;

            case 7:
                int g = sc.nextInt();
                for (int i = 1; i <= g; i++) {
                    for (int j = 1; j <= g - i; j++) {
                        System.out.print(" ");
                    }
                    for (int k = 1; k <= i; k++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            case 8:
                int h = sc.nextInt();
                for (int i = h; i >= 1; i--) {
                    for (int j = 1; j <= h - i; j++) {
                        System.out.print(" ");
                    }
                    for (int k = 1; k <= i; k++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 9:
                int l = sc.nextInt();
                for (int i = 1; i <= l; i++) {
                    for (int j = 1; j <= l - i; j++) {
                        System.out.print(" ");
                    }
                    for (int k = 1; k <= i; k++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                for (int i = l; i >= 1; i--) {
                    for (int j = 1; j <= l - i; j++) {
                        System.out.print(" ");
                    }
                    for (int k = 1; k <= i; k++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 10:
                int m = sc.nextInt();
                for (int i = 1; i <= m; i++) {
                    for (int j = 1; j <= m - i; j++) {
                        System.out.print(" ");
                    }
                    for (int k = 1; k <= i; k++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                for (int i = m; i >= 1; i--) {
                    for (int j = m - 1; j <= m - i; j++) {
                        System.out.print(" ");
                    }
                    for (int k = 1; k <= i; k++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 11:
                int o = sc.nextInt();
                for (int i = 1; i <= o; i++) {
                    for (int j = 1; j <= o - i; j++) {
                        System.out.print(" ");
                    }
                    for (int k = 1; k <= i; k++) {
                        System.out.print(" *");
                    }
                    System.out.println();
                }
                break;
            case 12:
                int p = sc.nextInt();
                for (int i = 1; i <= p; i++) {
                    for (int j = 1; j <= p - i; j++) {
                        System.out.print("#");
                    }
                    for (int k = 1; k <= i; k++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 13:
                int q = sc.nextInt();
                for (int i = q; i >= 1; i--) {
                    for (int j = 1; j <= q - i; j++) {
                        System.out.print("#");
                    }
                    for (int k = 1; k <= i; k++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 14:
                int r = sc.nextInt();
                for (int i = 1; i <= r; i++) {
                    for (int j = 1; j <= r; j++) {
                        if (i % 2 == 0) {
                            System.out.print(1);
                        } else {
                            System.out.print(0);
                        }
                    }System.out.println();
                }
                break;
            case 15:
                int s = sc.nextInt();
                for (int i = 1; i <= s; i++) {
                    for (int j = 1; j <= s; j++) {
                        if (i % 2 != 0) {
                            System.out.print(1);
                        } else {
                            System.out.print(0);
                        }
                    }System.out.println();
                }
            case 16:
                int t= sc.nextInt();
                for (int i = 1; i <= t; i++) {
                    for (int j = 1; j <= t; j++) {
                        int p1=i+j;
                        if(p1%2==0)
                        {
                            System.out.print(0);
                        }
                        else
                            System.out.print(1);

                    }System.out.println();
                    }
                break;
            case 17:
                int u= sc.nextInt();
                for (int i = 1; i <= u; i++) {
                    for (int j = 1; j <= u; j++) {
                        int p2=i+j;
                        if(p2%2!=0)
                        {
                            System.out.print(0);
                        }
                        else
                            System.out.print(1);

                    }System.out.println();
                }
            case 18:
                System.out.println("enter the row ");
                int v= sc.nextInt();
                System.out.println("enter the table ");
                int v1= sc.nextInt();
                for (int i = 1; i <= v; i++) {
                    for (int j = 1; j <= v; j++) {
                        System.out.print(v1*j);
                    }
                    System.out.println();
                    v1++;
                }
            case 19:
                int w= sc.nextInt();
                int n5=1;
                for(int i=1; i <= w; i++) {
                    for (int j = 1; j <= w; j++) {
                        System.out.print(n5);n5++;
                    }
                    System.out.println();

                }
            case 20:
                int w1= sc.nextInt();
                int t1= sc.nextInt();
                int n6=1;
                for(int i=1; i <= w1; i++) {
                    for (int j = 1; j <= w1; j++) {
                        System.out.print(n6*t1);n6++;
                    }
                    System.out.println();

                }
            case 21:
                System.out.print("enter the row = ");
                int w3= sc.nextInt();
                System.out.print("enter the column = ");
                int w4= sc.nextInt();
                System.out.print("enter differnce betweeen ");
                int d9= sc.nextInt();
                int q1=1;
                for(int i=1;i<=w3;i++)
                {
                    for(int j=1;j<=w4;j++)
                    {
                        System.out.print(q1+5);
                    }
                    System.out.println();
                    q1=q1-19;
                }

        }
    }
}