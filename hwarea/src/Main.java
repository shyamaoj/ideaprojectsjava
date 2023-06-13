import java.util.Scanner;

import static java.lang.Math.abs;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        a=a+b;
        b=a-b;
        a=b-a;
        System.out.println(abs(a)+" "+b);
//        int s=4;
//        System.out.println("area of square = "+(s*s));
//        int r=7;
//        System.out.println("area of circle + "+(3.14*r*r));
//        int l=5,b=7;
//        System.out.println("area of rectangle +"+(l*b));
//        int ra=7,h=7;
//        System.out.println("area of cylinder ="+(2*3.14*ra*h+(2*3.14*ra*ra)));
//        int radiusofsphere=5;
//        System.out.println("Area of sphere ="+(4*3.14*radiusofsphere*radiusofsphere));
//        int rofcy=5,hofcy=5;
//        System.out.println("volume of cylinder = "+3.14*rofcy*rofcy*hofcy)
       /* Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();

        for(int i=1;i<=(2*n)-i;i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=n-i;k++)
            {
                System.out.print("*");
            }
            System.out.println();

        }*/
        }
    }

