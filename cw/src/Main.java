import java.sql.SQLOutput;
import java.util.Scanner;
import static java.lang.Math.abs;
public class Main {  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
      /*  int number = sc.nextInt();
        switch (number) {
            case 1:
                int a = sc.nextInt(); int b = sc.nextInt();System.out.print(a + b); System.out.print(a - b);
                System.out.print(a * b); System.out.print(a / b); break;
            case 2:
                int d = sc.nextInt(); System.out.println(0.05 * d); System.out.println(0.1 * d);
                System.out.println(0.2 * d); System.out.println(0.25 * d); break;
            case 3:
                System.out.println("enter two number"); int x = sc.nextInt(); int y = sc.nextInt();
                if (x > y) { System.out.println("x is greater"); } else { System.out.println("y is greater"); } break;
            case 4:
                System.out.println("enter three number");int x1 = sc.nextInt(); int y1 = sc.nextInt();
                int z = sc.nextInt();if (x1 > y1 && x1 > z) { System.out.println(x1 + " is greater"); }
                else if (y1 > z) { System.out.println(y1 + " is greater"); }
                else { System.out.println(z + " is greater"); }
            case 5:
                int a2=sc.nextInt(); sc.next(); String a3=sc.next(); String a4=sc.next(); sc.next();String a5= sc.next();
                int a6= sc.nextInt(); System.out.println("Customer details");
                System.out.println("customerid = "+ a2); System.out.println("customerName = "+ a3);
                System.out.println("customerGender = "+ a4); System.out.println("customerEmail = "+ a5);
                System.out.println("customerMobile = "+ a6); break;
            case 6:
                System.out.println("enter two number"); int g= sc.nextInt(); String i= (g%2==0)?("Even"):("odd");
                System.out.println(i); break;
            case 7:
                System.out.println("enter the number = ");
                int n1= sc.nextInt(); String a1=(n1%5==0 && n1%11==0)?("yes"):("no");System.out.println(); break;
            case 8:
                System.out.println("enter character"); char g1 = sc.next().charAt(0);
                if(g1=='f')  { System.out.println("female"); } else if(g1=='m'){ System.out.println("male");}
                else System.out.println("other");break;
            case 9:
                System.out.println("enter the nmber = ");
                int x9= sc.nextInt(); if(x9<0) { System.out.println("negative");}
                else if(x9>0) { System.out.println("postive"); }  else  System.out.println("zero"); break;
            case 10:
            char z1 = sc.next().charAt(0);
            if(z1=='a'&&z1=='e'&&z1=='i'&&z1=='o'&&z1=='u'&&z1=='A'&&z1=='E'&&z1=='I'&&z1=='O'&&z1=='U')
                { System.out.println("vowel"); }
                else  System.out.println("consnant"); break;
            case 11:
                System.out.println("enter the age to check either you are validate for voting or not");
                int x6= sc.nextInt(); String x7= (x6>18)?("eligble"):("not eligble");
                System.out.println(x7); break;
            case 12:
                int max=0;int ans; for(int i2=1;i2<=10;i2++)
                {

                }
                break;
            case 13:
                char z3 = sc.next().charAt(0);
                if(z3>=97 &&z3<=122) {System.out.println("lowercase"); }
                else if(z3>=65 &&z3<=90)  { System.out.println("UPPERCASE"); }
                else if(z3>=48 &&z3<=57){System.out.println("digit");}
                else { System.out.println("please print in the range "); } break;
        }
    }
}*/
    System.out.println("1 for area (circle) 2 area square 3 for area rectangle 4 for area cylinder 5 for area sphere");
    System.out.println("6 for volume cylinder 7 for volume sphere 8 for celisus to fehraneit 9 for kelvin  to celsius 10 for volume cube");
    int solu = sc.nextInt();
    switch (solu) {
        case 1:
            System.out.print("Enter the radius = ");
            int a_of_c = sc.nextInt();
            double area = 3.14 * a_of_c * a_of_c;
            System.out.println("area of the circle = " + area);
            break;
        case 2:
            System.out.print("enter side = ");
            int a = sc.nextInt();
            float area_of_square = a * a;
            System.out.println("area of square= " + area_of_square);
            break;
        case 3:
            System.out.println("enter the length");
            int l = sc.nextInt();
            System.out.println("enter the breadth");
            int b = sc.nextInt();
            System.out.println("area of rectangle= " + (l * b));
            break;

        case 4:
            System.out.print("enter the radius");
            int r_o_c = sc.nextInt();
            System.out.print("enter the height");
            int h = sc.nextInt();
            double cyarea = 2 * 3.14 * h + 2 * 3.14 * r_o_c * r_o_c;
            System.out.println("Area of cylinder = " + cyarea);
            break;

        case 5:
            System.out.println("enter the radius");
            int r_of_s = sc.nextInt();
            System.out.print("arae of sphere" + (4 * 3.14 * r_of_s * r_of_s));
            break;
        case 6:
            System.out.print("enter the radius");
            int r_of_c = sc.nextInt();
            System.out.print("enter the height");
            int h_of_c = sc.nextInt();
            System.out.print("volume of cylider = " + (3.14 * r_of_c * r_of_c * h_of_c));
            break;

        case 7:
            System.out.print("enter the radius");
            int r_sphere = sc.nextInt();
            System.out.print("volume of sphere" + (4.186 * r_sphere * r_sphere * r_sphere));
            break;
        case 8:
            System.out.print("enter Celisus");
            double celsius = sc.nextInt();
            System.out.print("fehraneit = " + ((1.8 * celsius) + 32));
            break;
        case 9:
            System.out.print("enter kelvin = ");
            float kelvin = sc.nextInt();
            System.out.print("celsius = " + (kelvin - 273));
            break;
        case 10:
            System.out.println("enter side");
            int side = sc.nextInt();
            System.out.println("volume of cube" + (side * side * side));
            break;
        default:
            System.out.println("please enter 1 to 10");
    }
}}
                /* String a = "helo";
                System.out.print(a + " world");

                System.out.println();
                String b = "amit";
                System.out.print(b + " is developer");
                System.out.println();

                String c = "mangoe";
                System.out.print(c + " is king");
                System.out.println();

                String d = "hello";
                System.out.print(d + " how are you");
                System.out.println();

                String e = "java";
                System.out.print(e + " is a easy language");
                System.out.println();

                String f = "wrold";
                System.out.print("hello " + f);
                System.out.println();

                String g = "okay okay";
                System.out.print("how are you =>" + g);
                System.out.println();

                String h = "who are you";
                System.out.print("what " + h);
                System.out.println();

                String i = "you";
                System.out.print(i + " are the best person");
                System.out.println();

                String j = "earth";
                System.out.print(j);
                System.out.println();*/











       /* for(int i=1;i<=9;i++)
        {
                for(int j=1;j<=9;j++)
                {
                        for(int k=1;k<=2*i;i++)
                        {
                                if(j!=1 && j!=9)
                                        System.out.print(" ");
                                else
                                        System.out.print("*");

                        }*/


