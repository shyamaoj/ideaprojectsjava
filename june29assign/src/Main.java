import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        switch (x1) {
            case 1:
                A a1=new A();
                a1.show1();a1.show3();a1.show2();
                break;
            case 2:
                B b1 = new B();
                b1.add();
                break;
            case 3:
                C c12=new C();
                c12.circle();c12.rectangle();c12.square();c12.triangle();
                break;
            case 4:
                D d1=new D();
                int d5= sc.nextInt();
                d1.show1(d5);d1.show2(d5);d1.show3(d5);
                break;
            case 5:
                E e1=new E();
                int e3= sc.nextInt();
                int e4= sc.nextInt();
                e1.add(e3,e4);e1.sub(e3,e4);e1.mul(e3,e4);e1.divi(e3,e4);
                break;

            case 6:
                char x91=sc.next().charAt(0);
                F f1=new F();
                if(f1.equals('c')){
                    int r87= sc.nextInt();
                f1.circle(r87);}
                if(f1.equals('r')){
                    int l89= sc.nextInt();
                    int b87= sc.nextInt();
                f1.rectangle(l89,b87);}
                if(f1.equals('s')){
                    int s87= sc.nextInt();
                f1.square(s87);}
                if(f1.equals('t')){
                    int b981= sc.nextInt(); int h981= sc.nextInt();
                f1.triangle(b981,h981);}
        }
    }
}
