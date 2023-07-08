import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner  sc=new Scanner(System.in);
        int x1= sc.nextInt();
        switch (x1)
        {
            case 1:
                System.out.println("enter the number = ");
                int x= sc.nextInt();
                System.out.println("enter the second number = ");
                int y= sc.nextInt();
                A a1=new A(x,y);
                a1.add();a1.sub();a1.mul();a1.divi();
                break;
            case 2:
                int palindromenumbercheck= sc.nextInt();
                int sum=0;int rem1=0; int d=palindromenumbercheck;
                while(palindromenumbercheck>0)
                {
                    rem1=palindromenumbercheck%10;
                    sum=(sum*10)+rem1;
                    palindromenumbercheck=palindromenumbercheck/10;
                }

                if(sum==d)
                {
                    System.out.println("pallindrome");
                }
                else System.out.println("not palindrome");
            break;
            case 3:
                int armstrongnumbercheck= sc.nextInt();
                int sum1=0;int rem2=0; int e=armstrongnumbercheck;
                while(armstrongnumbercheck>0)
                {
                    rem2=armstrongnumbercheck%10;
                    sum1=sum1+(rem2*rem2*rem2);
                    armstrongnumbercheck=armstrongnumbercheck/10;
                }
                if(sum1==e)
                {
                    System.out.println("armstrong");
                }
                else System.out.println("not armstrong");

                break;
            case 4:
                int fiboNumber= sc.nextInt();
               int a11=0,b11=1;
                System.out.println(a11+" "+b11+" ");
                for(int i=3;i<=fiboNumber;i++)
                {
                    int c11=a11+b11;
                    System.out.print(" "+c11+" ");
                    a11=b11;
                    b11=c11;
                }
                break;
            case 5:
                System.out.println("enter the numebr 1)int to double 2)float to int 3)double to int convert");
                int typecast1= sc.nextInt();
                switch (typecast1) {
                    case 1:
                        int num = sc.nextInt();
                        System.out.println("The integer value: " + num);

                        // convert into double type
                        double data = num;
                        System.out.println("The double value: " + data);
                        break;

                    case 2:
                        float floatnum = sc.nextFloat();
                        System.out.println("The float value: " + floatnum);

                        // convert into int type
                        int data1 = (int) floatnum;
                        System.out.println("The int value : " + data1);
                        break;

                    case 3:
                        double num2 = sc.nextInt();
                        System.out.println("The double value: " + num2);

                        // convert into double type
                        int data2 = (int) num2;
                        System.out.println("The double value: " + data2);
                        break;
                }
                break;
            case 6:
                A1 a123=new A1();
                B1 b123=new B1();
                C1 c123=new C1();
                D1 d123=new D1();
                break;
            case 7:
                C3 c324=new C3();
                int add1= sc.nextInt();
                int add2= sc.nextInt();
                int add3= sc.nextInt();
                int add4= sc.nextInt();
                int add5= sc.nextInt();
                c324.add(add1,add2,add3,add4,add5);
                break;
            case 8:
            char gdf= sc.next().charAt(0);
            if(gdf=='a'){
            A4 a324=new A4();
            int z1= sc.nextInt();
                int z2= sc.nextInt();
                int z3= sc.nextInt();
                int z4= sc.nextInt();
                int z5= sc.nextInt();
            a324.add(z1,z2,z3,z4,z5);}
            else{
            B4 b324=new B4();
                int z6= sc.nextInt();
                int z7= sc.nextInt();
                int z8= sc.nextInt();
                int z9= sc.nextInt();
                int z10= sc.nextInt();
            b324.add(z6,z7,z8,z9,z10);}
            break;

                }

        }
    }
