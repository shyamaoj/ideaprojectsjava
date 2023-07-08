import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        System.out.println("enter the number you want to see ");
      int x1=sc.nextInt();
      switch(x1)
      {
          case 1:
              A a1=new A();
              a1.show();a1.show1();a1.show2();a1.show3();a1.show4();
              break;
          case 2:
              System.out.print("enter first number = ");
              int x2= sc.nextInt();
              System.out.println("enter second number = ");
              int x3= sc.nextInt();
              Cal c1=new Cal();
              c1.add(x2,x3);c1.sub(x2,x3);c1.mul(x2,x3);c1.divi(x2,x3);c1.modu(x2,x3);
              break;
          case 3:

      }
    }
}