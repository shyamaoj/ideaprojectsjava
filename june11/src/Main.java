import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.print("enter the alaphat you want to print = ");
        int x1= sc.nextInt();
        System.out.print("enter the column you want = ");
        int c1= sc.nextInt();
        switch (x1){
            case 1:
            System.out.print("enter the row you want = ");
            int a= sc.nextInt();
            for (int i = 1; i <= a; i++) {
                for(int j=1;j<=c1;j++)
                {
                    if((i==1 || j==1 || j==c1 || i==a/2)){

                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                    }
                System.out.println();
                }
            break;
            case 2:
                System.out.print("enter the row you want = ");
                int b= sc.nextInt();
                for (int i = 1; i <= b; i++) {
                    for(int j=1;j<=c1;j++)
                    {
                        if((i==1 || i==b ||j==1|| j==c1 || i==b/2)){

                            System.out.print("*");
                        }
                        else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }

                break;

            case 3:
                System.out.print("enter the row you want = ");
                int c= sc.nextInt();
                for(int i=1;i<=c;i++)
                {
                    for(int j=1;j<=c1;j++)
                    {
                        if(i==1||i==c||j==c)
                        {
                            System.out.print("*");
                        }

                    }
                    System.out.println();
                }
                break;
            case 4:
                System.out.print("enter the row you want = ");
                int d= sc.nextInt();
                for(int i=1;i<=d;i++)
                {
                    for(int j=1;j<=c1;j++)
                    {
                        if(i==1||i==d||j==1||j==c1)
                        {
                            System.out.print("*");
                        }
                        else{
                            System.out.print(" ");
                        }

                    }
                    System.out.println();
                }
            break;
            case 5:
                System.out.print("enter the row you want = ");
                int e= sc.nextInt();
                for(int i=1;i<=e;i++)
                {
                    for(int j=1;j<=c1;j++)
                    {
                        if(i==1||i==e||j==1||i==e/2)
                        {
                            System.out.print("*");
                        }

                    }
                    System.out.println();
                }
            break;
            case 6:
                System.out.print("enter the row you want = ");
                int f= sc.nextInt();
                for(int i=1;i<=f;i++)
                {
                    for(int j=1;j<=c1;j++)
                    {
                        if(i==1||j==1||i==f/2)
                        {
                            System.out.print("*");
                        }

                    }
                    System.out.println();
                }
            break;
            case 7:
                System.out.print("enter the row you want = ");
                int g= sc.nextInt();
                for(int i=1;i<=g;i++)
                {
                    for(int j=1;j<=c1;j++)
                    {
                        if(i==1||j==1||i==g||(j==c1&&i>=(g/2)+1)||(i==g/2&&j>=c1/2))
                        {
                            System.out.print("*");
                        }
                        else {
                            System.out.print(" ");
                        }

                    }
                    System.out.println();
                }
                break;

            case 8:
                System.out.print("enter the row you want = ");
                int h= sc.nextInt();
                for(int i=1;i<=h;i++)
                {
                    for(int j=1;j<=c1;j++)
                    {
                        if(i==h/2||j==1||j==c1)
                        {
                            System.out.print("*");
                        }
                        else{
                            System.out.print(" ");
                        }

                    }
                    System.out.println();
                }
            break;
            case 9:
                System.out.print("enter the row you want = ");
                int i1= sc.nextInt();
                for(int i=1;i<=i1;i++)
                {
                    for(int j=1;j<=c1;j++)
                    {
                        if(i==1||j==c1/2||i==i1)
                        {
                            System.out.print("*");
                        }
                        else{
                            System.out.print(" ");
                        }

                    }
                    System.out.println();
                }
                break;
            case 10:
                System.out.print("enter the row you want = ");
                int j1= sc.nextInt();
                for(int i=1;i<=j1;i++)
                {
                    for(int j=1;j<=c1;j++)
                    {
                        if(i==1||j==c1/2||(i==j1 &&j<=c1/2)||(j==1&&i>=(j1/2)+1))
                        {
                            System.out.print("*");
                        }
                        else{
                            System.out.print(" ");
                        }

                    }
                    System.out.println();
                }
            break;
            case 11:
                System.out.print("enter the row you want = ");
                int k= sc.nextInt();
                for(int i=1;i<=k;i++)
                {
                    for(int j=1;j<=c1;j++)
                    {
                        if(j==1||i+j>=k/2)
                        {
                            System.out.print("*");
                        }
                        else{
                            System.out.print(" ");
                        }
                    } System.out.println();}
                break;
            case 12:
                System.out.print("enter the row you want = ");
                int l= sc.nextInt();
                for(int i=1;i<=l;i++)
                {
                    for(int j=1;j<=c1;j++)
                    {
                        if(j==1||i==l)
                        {
                            System.out.print("*");
                        }
                        else{
                            System.out.print(" ");
                        }

                    }
                    System.out.println();
                }
            break;
            case 13:
            System.out.print("enter the row you want = ");
            int m= sc.nextInt();
            for(int i=1;i<=m;i++)
            {
                for(int j=1;j<=c1;j++)
                {
                    if(j==1||j==c1||(i==j&&j==m/2)/*||(j>=i&&j==m/2)*/)
                    {
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }

                }
                System.out.println();
            }
            break;
            case 14:
                System.out.print("enter the row you want = ");
                int n= sc.nextInt();
                for(int i=1;i<=n;i++)
                {
                    for(int j=1;j<=c1;j++)
                    {
                        if(j==1||j==c1||i==j)
                        {
                            System.out.print("*");
                        }
                        else{
                            System.out.print(" ");
                        }
                    } System.out.println();
                }
                break;
            case 15:
                System.out.print("enter the row you want = ");
                int o= sc.nextInt();
                o=c1;
                for(int i=1;i<=o;i++)
                {
                     for(int j=1;j<=c1;j++)
                    {
                        if(i==1||i==o||j==1||j==c1)
                        {
                            System.out.print("*");
                        }
                        else{
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
                break;

            case 16:
                System.out.print("enter the row you want = ");
                int p= sc.nextInt();
                for(int i=1;i<=p;i++)
                {
                    for(int j=1;j<=c1;j++)
                    {
                        if(i==1||j==1||i==p/2||(j==c1 &&i<=p/2))
                        {
                                System.out.print("*");
                            }
                        else{
                            System.out.print(" ");
                        }
                    } System.out.println();}
                break;
            case 18:
                System.out.print("enter the row you want = ");
                int r= sc.nextInt();
                for(int i=1;i<=r;i++)
                {
                    for(int j=1;j<=c1;j++)
                    {
                        if(i==1||j==1||i==r/2||(j==c1 &&i<=r/2)||(i+j>=c1 &&i+j<2*c1))
                        {
                            System.out.print("*");
                        }
                        else{
                            System.out.print(" ");
                        }
                    } System.out.println();}
                break;

            case 19:
                System.out.print("enter the row you want = ");
                int s= sc.nextInt();
                for(int i=1;i<=s;i++)
                {
                    for(int j=1;j<=c1;j++)
                    {
                        if(i==1||i==s||i==s/2 || (j==1&&i<=s/2)||(j==c1 && i>=s/2))
                        {
                            System.out.print("*");
                        }
                        else{
                            System.out.print(" ");
                        }

                    }
                    System.out.println();
                }
                break;

            case 20:
                System.out.print("enter the row you want = ");
                int t= sc.nextInt();
                for(int i=1;i<=t;i++)
                {
                    for(int j=1;j<=c1;j++)
                    {
                        if(i==1||j==c1/2)
                        {
                            System.out.print("*");
                        }
                        else{
                            System.out.print(" ");
                        }

                    }
                    System.out.println();
                }
                break;
            case 21:
                System.out.print("enter the row you want = ");
                int u= sc.nextInt();
                for(int i=1;i<=u;i++)
                {
                    for(int j=1;j<=c1;j++)
                    {
                        if(j==1 || j==c1||i==u)
                        {
                            System.out.print("*");
                        }
                        else{
                            System.out.print(" ");
                        }

                    }
                    System.out.println();
                }
            break;
            case 24:
                System.out.print("enter the row you want = ");
                int x= sc.nextInt();
                for(int i=1;i<=x;i++)
                {
                    for(int j=1;j<=c1;j++)
                    {
                        if(i==j||i+j==7)
                        {
                            System.out.print("*");
                        }
                        else{
                            System.out.print(" ");
                        }

                    }
                    System.out.println();
                }
                break;
            case 26:
                System.out.print("enter the row you want = ");
                int z= sc.nextInt();
                for(int i=1;i<=z;i++)
                {
                    for(int j=1;j<=c1;j++)
                    {
                        if(i==1||i+j==7||i==z)
                        {
                            System.out.print("*");
                        }
                        else{
                            System.out.print(" ");
                        }

                    }
                    System.out.println();
                }
                break;

            case 27:
                String a1= sc.next();
                String a2= sc.next();

                System.out.print(int(a+b));
        }
    }
}