import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p1 = sc.nextInt();
        switch (p1) {
            case 1:
                int x = sc.nextInt();
                int a1 = 2;
                while (x >= a1) {
                    if (x % a1 == 0) {
                        System.out.print("not prime");
                        break;
                    }
                    if (x - 1 == a1) {
                        System.out.print("prime number");
                        break;
                    } a1++; }
                break;

            case 2:
                int x1 = sc.nextInt(); int sum = 0; int b1 = x1;
                while (x1 > 0) {
                    int rem = x1 % 10; sum = (sum * 10) + rem; x1 = x1 / 10; }
                if (b1 == sum) { System.out.print("pallindrome"); } else {
                    System.out.print("not palindrome"); } break;

            case 4:
                int x2 = sc.nextInt(); int sum1 = 0; int b2 = x2;
                while (x2 > 0) { int rem = x2 % 10; sum1 = (sum1) + rem * rem * rem; x2 = x2 / 10; }
                if (b2 == sum1) { System.out.print("armstrong"); } else {
                    System.out.print("not armstrong"); } break;
            case 5:
                int x5 = sc.nextInt();
                int sum3 = 0;
                while (x5 > 0) {
                    int rem = x5 % 10;
                    sum3 = (sum3 * 10) + rem + 1;
                    x5 = x5 / 10;
                }

                System.out.print(sum3);
                break;

            case 6:
                char a = sc.next().charAt(0);
                if (a == 'r') {
                    String Retailername = sc.nextLine();
                    sc.nextLine();
                    int p = sc.nextInt();
                    sc.nextLine();
                    int pamt = sc.nextInt(); int amtpice = p * pamt;
                    double discount = 0; double totalpay = 0;

                    if (p > 1 && p <= 15) { discount = (0.15 * amtpice); totalpay = amtpice - discount; }
                    if (p > 16 && p <= 30) { discount = (0.35 * amtpice); totalpay = amtpice - discount; }
                    if (p >= 31 && p <= 50) { discount = (0.50 * amtpice); totalpay = amtpice - discount; }
                    System.out.print("Retalielername = "+ Retailername); System.out.println("peice = " + p);
                    System.out.println("discount = " + discount); System.out.println("totalpay =" + totalpay);
                }
                if (a == 'c') {
                    String customername = sc.nextLine();
                    sc.nextLine();
                    int contactno = sc.nextInt(); int pay = sc.nextInt();
                    double discount = 0; double tpay = 0;

                    if (pay >= 1000 && pay < 2000) { discount = 0.10 * pay; tpay = pay - discount; }
                    if (pay >= 2000 && pay < 3000) { discount = 0.15 * pay;tpay = pay - discount;}
                    if (pay > 3000) { discount = 0.30 * pay; tpay = pay - discount; }
                    System.out.println();
                    System.out.println("customer name = " + customername);
                    System.out.println("contact no = " + contactno);
                    System.out.println("payment = " + pay);
                    System.out.println("discount = " + discount);
                    System.out.println("total pay = " + tpay); }
                break;

        }

    }
}
