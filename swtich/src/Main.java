// user input table 10..1 1..100 100..1 50..100 1000..50 1..10sum 1to 100 even 1 t0 100 odd
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        switch (m) {
            case 1:  int i = 1;
             int n = sc.nextInt();
                while (i <= n) {
                    System.out.println(i);
                    i++;
                }
                break;
            case 2:
                int i1 = 1;
                int x = sc.nextInt();
                while (i1 <= 10) {
                    System.out.println(x * i1);
                    i1++;
                }
                break;
            case 3:
                int n1 = sc.nextInt();
                while (n1 > 0) {
                    System.out.println(n1);
                    n1--;
                }
                break;
            case 4:
                System.out.println("enter the number from which you want to start");
                int x1 = sc.nextInt();
                System.out.println("enter the number from which you want to end");
                int x2 = sc.nextInt();
                if (x1 > x2) {
                    while (x1 <= x2) {
                        System.out.println(x1);
                        x1++;
                    }
                } else {
                    while (x1 <= x2) {
                        System.out.println(x2);
                        x2--;
                    }
                }
                break;
            case 5:
                int sum = 0;
                System.out.println("enter first number");
                int n2 = sc.nextInt();
                System.out.println("enter second number");
                int n3 = sc.nextInt();
                while (n2 <= n3) {
                    sum = sum + n2;
                    n2++;
                }
                System.out.println("sum" + sum);
                break;
            case 6:
                System.out.println("enter first number");
                int n4 = sc.nextInt();
                System.out.println("enter second number");
                int n5 = sc.nextInt();
                while (n4 <= n5) {
                    if (n4 % 2 == 0) {
                        System.out.println(n4);
                        n4++;
                    }


//                    int sum2=0;
//                    System.out.println("enter first number");int n6= sc.nextInt();
//                    System.out.println("enter second number"); int n7= sc.nextInt();
//                    while(n6<=n7) { sum2+n6; n6++; } System.out.println("sum"+sum2);
//                    break;
                }
        }
    }}