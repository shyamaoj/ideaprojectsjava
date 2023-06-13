//123...231 : ARMSTRONG NUMBER  2..10 TABLE(HINT WHILE INSIDE WHILE),prime ,
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        switch (x) {
            case 1:
                int c = sc.nextInt();
                int count = 0;
                while (c != 0) {
                    int rem = c / 10;
                    count++;
                    c = c / 10;
                }
                System.out.println("the digit = " + count);
                break;
            case 2:
                int sum = 0;
                int n = sc.nextInt();
                while (n != 0) {
                    int rem = n % 10;
                    sum = (sum * 10) + rem;
                    n = n / 10;
                }
                System.out.println(sum);
                break;
            case 3:
                int sum1 = 0;
                int b = sc.nextInt();
                int d = b;
                while (b != 0) {
                    int rem = b % 10;
                    sum1 = (sum1 * 10) + rem;
                    b = b / 10;
                }
                if (d == sum1) System.out.println("palindrome");
                else System.out.println("not palind");
                break;
            case 4:
                int i = 1;

                int n2 = sc.nextInt();
                while (i <= n2) {
                    int j = 1;
                    while (j <= n2) {

                        System.out.print("*");
                        j++;
                    }

                    System.out.println();i++;
                }
                break;
            case 5:
                int i1 = 1;
                int k = sc.nextInt();
                while (i1 <= k) {
                    int j1 = 1;
                    while (j1 <= i1) {
                        System.out.print("*");
                        j1++;
                    }
                    System.out.println();
                    i1++;
                }
            case 6:

                int l = sc.nextInt();int i4 = l;
                while (i4 <= l) {
                    int j4 = l;
                    while (j4 == i4) {
                        System.out.print("*");
                        j4--;
                    }
                    System.out.println();
                    i4--;
                }

                break;
            case 7:
                int x1 = sc.nextInt();
                int y1 = sc.nextInt();
                int sum2 = 0;
//                while(x1<=y1)  { System.out.println(x1); x1++; }
                while (x1 <= y1) {
                    if (x1 % 2 == 0)
                        System.out.println(x1);
                    x1++;
                }
                while (x1 <= y1) {
                    sum2 = sum2 + x1;
                    x1++;
                }
                System.out.println(sum2);
                break;
            case 8:
                int x3 = sc.nextInt();
                int rem = x3 % 10;
                while (x3 >= 10) {
                    x3 = x3 / 10;
                }
                System.out.println("the first digit=" + x3 + " last digit = " + rem);
                break;
            case 9:
                int z8 = sc.nextInt(); int z9 = sc.nextInt();
                while (z8 <= z9) {
                    int i6 = 1;
                    while (i6 <= 10) {
                        System.out.print(z8 * i6 +" ");
                        i6++;
                    }
                    z8++;
                    System.out.println();
                }
                break;
            case 10:
                int p= sc.nextInt();
                int a=2;
                while(p>=a){
                    if(p%a==0)
                    {a++;

                    }
                    System.out.println(" not prime");
                    break;

                    if(p=a-1){
                        System.out.println(" not prime");
                        break;
                    }

            }
        }
    }
}