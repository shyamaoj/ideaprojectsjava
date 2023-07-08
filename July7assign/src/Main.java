import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int g23 = sc.nextInt();
        switch (g23) {
            case 1:
                int x1 = sc.nextInt();
                int y1 = sc.nextInt();
                constcal c01 = new constcal();
                c01.setA(x1);
                c01.setB(y1);
                new constcal(1);
                new constcal(1, 2);
                new constcal(1, 2, 3);
                break;

            case 2:
                A a1 = new B();
                a1.display();
                break;
            case 5:
                String st = sc.next();
                if (st.equals("p")) {
                    Fifth f1 = new Fifth();
                    f1.prime();
                } else if (st.equals("palindrome")) {
                    Fifth f1 = new Fifth();
                    f1.palindrome();
                } else if (st.equals("a")) {
                    Fifth f1 = new Fifth();
                    f1.armstrong();
                }
                break;
            case 6:
                String sc1 = sc.next();
                Sixth si = new Sixth();

                if (sc1.equals("facto")) {
                    si.facto();
                } else if (sc1.equals("reverse")){
                    si.reverse();}
                break;

            case 7:
            Seventh sevt=new Seventh();
            char sevt1=sc.next().charAt(0);
            if(sevt1=='e'){
            sevt.even();}
            else if(sevt1=='o')
            sevt.odd();
            break;

            case 8:
                char eight1=sc.next().charAt(0);
                if(eight1=='l'){
                E e8=new E();
                e8.leap();}
                else if(eight1=='t'){
                F f10=new F();
                f10.ctof();
                f10.ftoc();

                G g12=new G();
                //same here we use  if conditoin and call all the method
                g12.arearectangle();
                    g12.areasquare();
                    g12.areasquare();
                }

            case 9:
                A3 a21=new A3();
                int a321= sc.nextInt();
                int b321= sc.nextInt();
                a21.setA109(a321);a21.setB109(b321);a21.add();
                B3 a221=new B3();
                int a322= sc.nextInt();
                int b322= sc.nextInt();
                a221.setA209(a322);a221.setA209(b322);a221.sub();
                C3 a213=new C3();
                int a323= sc.nextInt();
                int b323= sc.nextInt();
                a213.setA309(a323);a213.setB309(b323);a213.mul();
                D3 a214=new D3();
                int a421= sc.nextInt();
                int b421= sc.nextInt();
                a214.setA409(a421);a214.setB409(b421);a214.divi();

        }



    }
    }
