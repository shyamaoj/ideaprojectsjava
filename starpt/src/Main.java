import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=n;j++)
            {
                if(i==j)
                {
                    System.out.print("*");
                }
                else
                    System.out.print(" ");

            }
            System.out.println();

        }
    }
}


                /*for(int i=1;i<=n;i++)
                {
                    for(int j=1;j<=n-i;j++)
                    {
                        System.out.print(" ");
                    }
                    for(int k=1;k<=i;k++)
                    {
                        System.out.print(" * ");
                    }
                    System.out.println();
                }*/
       /* for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++) {
                if (i!=1&&i!=n |) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
            }
*/

       /* for (int i=1;i<5;i++)
        {
            for(int j=1;j<8;j++)
            {
                if(j<=5-i || j>=3+i)
                {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
        }
    }*/

/*class Cal {
    Cal(int a)
    {
        System.out.println(a);
    }
    Cal(int a,int b)
    {
        System.out.println(a+b);
    }*/
       /* Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
        for(int i=1;i<5;i++)
        {
            for(int j=1;j<8;j++)
            {
                if(j>=5-i && j<=3+i)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
        }*/
/*class A{
    static int count=0;
    A()
    {
        count++;
        System.out.println("the value of count is= "+count);
    }
}
  *//*  void show(int x,int...a)
    {
        System.out.println("the value of  x is"+x);
        for(int i:a)
            System.out.println("the value of i "+i);
    }
}*//*

}*/
/*class A
{
    A(){ }
    static void display()
    {
       new A();
    }
}
public class Main
{
    public static void main(String[] args) {
        A.display();
    }
}*/
       /* for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(i%2!=0 && j%2==0 || i%2==0 && j%2!=0)
                {
                    System.out.print(1);
                }
                else
                    System.out.print(0);
            }
            System.out.println(" ");
        }*/
        /*for(int i=1;i<=n;i++) {
            for (int j = 1; j <= n; j++) {
                if (i % 2 == 0)
                    System.out.print(1);
                else
                    System.out.print(0);
            }
            System.out.println();
        }*/
