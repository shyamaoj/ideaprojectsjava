import java.util.Scanner;
public class Fifth {
    Scanner sc2=new Scanner(System.in);

    void prime() {
        int a1 = sc2.nextInt();
        int a2 = 2;
        while (a1 > a2) {
            if (a1 % a2 == 0) {
                System.out.print("not prime");
                break;
            }
            if (a1 - 1 == a2) {
                System.out.print("prime");
                break;
            }
            a2++;
        }
    }
            void armstrong() {
                int x5 = sc2.nextInt();
                int sum = 0;
                int d = x5;
                while (x5 > 0) {
                    int rem = x5 % 10;
                    sum = sum + (rem * rem * rem);
                    x5 = x5 / 10;
                }
                if (d == sum) {
                    System.out.print("armstrong");
                } else {
                    System.out.print("not armstrong");
                }
            }

    void palindrome() {
        int x5 = sc2.nextInt();
        int sum = 0;
        int d1 = x5;
        while (x5 > 0) {
            int rem = x5 % 10;
            sum = (sum*10) + rem;
            x5 = x5 / 10;
        }
        if (d1== sum) {
            System.out.print("armstrong");
        } else {
            System.out.print("not armstrong");
        }}
    }


