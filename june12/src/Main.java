import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("no of questiom you wanna see = ");
        int x1= sc.nextInt();
        System.out.print("enter the column = ");
        int c1= sc.nextInt();
        switch(x1) {
            case 1:
                int a = sc.nextInt();
                for (int i = a; i >= 1; i--) {
                    for (int j = a - i; j >= 1; j--) {
                        System.out.print(" ");
                    }
                    for (int k = 1; k <= i; k++) {
                        System.out.print(" *");
                    }
                    System.out.println();
                }
                break;
            case 2:
                int b = sc.nextInt();

                for (int i = 1; i <= b; i++) {
                    for (int j = 1; j <= c1; j--) {
                        System.out.print(" *");
                    }
                    System.out.println();
                }
                for (int i = b; i >= 1; i--) {
                    for (int j = b - i; j >= 1; j--) {
                        System.out.print(" ");
                    }
                    for (int k = 1; k <= i; k++) {
                        System.out.print(" *");
                    }
                    System.out.println();
                }
                break;
            case 3:
                int h = sc.nextInt();
                for (int i = 1; i <= c1; i++) {
                    for (int j = 1; j <= i; j++) {
                        if (i == 1 || i == h || j == 1 || j == c1 || i == j) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
                break;
            case 4:
                for (int i = 1; i <= c1; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print(i);
                    }
                    for (int k = 1; k <= c1 - i; k++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 5:
                for (int i = 1; i <= c1; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print(j);
                    }
                    for (int k = 1; k <= c1 - i; k++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 6:
                for (int i = 1; i <= c1; i++) {
                    for (int j = 1; j <= i; j++) {
                        if (i == j) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
                break;
            case 7:
                int g = sc.nextInt();
                for (int i = 1; i <= c1; i++) {
                    for (int j = 1; j <= i; j++) {
                        if (i == 1 || i == g || j == 1 || j == c1) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
                break;

            case 8:
                int h1 = sc.nextInt();
                for (int i = 1; i <= h1; i++) {
                    for (int j = 1; j <= c1; j++) {
                        if (i == 1 || i == h1 || j == 1 || j == c1 || i == j) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
                break;
            case 9:
                int k = sc.nextInt();
                for (int i = 1; i <= k; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print(i * i + " ");
                    }
                    System.out.println();
                }
                break;

            case 17:
                int l = sc.nextInt();
                for (int i = 1; i <= l; i++) {
                    for (int j = 1; j <= c1; j++) {
                        if (j == c1 && i == 1) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
                break;
            case 18:
                int l1 = sc.nextInt();
                for (int i = 1; i <= l1; i++) {
                    for (int j = l1; j >= 1; j--) {
                        if (i==j) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
                break;

            case 19:
                int p= sc.nextInt();
                for (int i = 1; i <= p; i++) {
                    int n=1;
                    for (int j = 1; j <= i; j++) {
                        System.out.print(n*n*n);
                        n=n+j;
                    }
                    System.out.println();n++;
                }
                break;
            case 20:
             int x3= sc.nextInt();
             for(int i=1;i<=x3;i++) {
                 int n = 1;
                 for (int j = 1; j <= i; j++) {
                     System.out.print((n * n) + " ");
                 }
                 n++;
                 System.out.println();
             }

             }


        }

        }
