import java.util.Scanner;
class A {
    void show1() {
        System.out.println("this is show 1");
    }

    void show2() {
        System.out.println("this is show 2");
    }

    void show3() {
        System.out.println("this is  show 3");
    }

}

class B{
   Scanner v1=new Scanner(System.in);

    void add(){
     int x1=v1.nextInt();
     int b1=v1.nextInt();
        System.out.println("sum= "+(x1+b1));

    }
    void sub(){
        int g1= v1.nextInt();
        int g2= v1.nextInt();
        System.out.println(g1-g2);
    }
    void mul(){
        int g3= v1.nextInt();
        int g4= v1.nextInt();
        System.out.println(g3*g4);
    }
    void divi(){
        int g5= v1.nextInt();
        int g6= v1.nextInt();
        System.out.println(g5/g6);
    }

}
class C{
    Scanner v1=new Scanner(System.in);
    void circle(){
        int r1= v1.nextByte();
        double area1=(3.14*(r1*r1));
        System.out.println(area1);
    }
    void triangle(){
        int b1= v1.nextInt();
        int h1=v1.nextInt();
        double areatriangle=(0.5*(b1*h1));
        System.out.println(areatriangle);
    }
    void rectangle(){
        int l1= v1.nextInt();
        int b1= v1.nextInt();
        System.out.println(l1*b1);
    }
    void square(){
        int s1=v1.nextInt();
        System.out.println(s1*s1);
    }
        }