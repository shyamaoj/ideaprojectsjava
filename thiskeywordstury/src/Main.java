import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x534534= sc.nextInt();
        switch (x534534)
        {
            case 1:
                int a213= sc.nextInt();
                int b213= sc.nextInt();
                A a1=new A(a213,b213);
                a1.display();
                break;
            case  2:
                D p=new D(30);
            break;
            case 3:
                E e1=new E();


                System.out.println("a = "+e1.displaya(10).a);
        }
    }
}