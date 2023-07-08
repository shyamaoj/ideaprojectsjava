import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x1= sc.nextInt();
        switch (x1)
        {
            case 1:
                int x= sc.nextInt();
                int n=1;
                for(int i=x;i>=1;i--)
                {
                    for(int j=1;j<=i;j++)
                    {
                        System.out.print(n+" ");
                        n++;
                    }
                    System.out.println();
                }
                break;

            case 2:
                int a1= sc.nextInt();
                int a2=2;
                while(a1>a2)
                {
                    if(a1%a2==0)
                    {
                        System.out.print("not prime");
                        break;
                    }
                    if(a1-1==a2)
                    {
                        System.out.print("prime");
                        break;
                    }
                    a2++;
                }
                break;
            case 3:
                int x5= sc.nextInt();
                int sum=0;int d=x5;
                while(x5>0)
                {
                    int rem=x5%10;
                    sum=sum+(rem*rem*rem);
                    x5=x5/10;
                }
                if(d==sum)
                {
                    System.out.print("armstrong");
                }
                else
                {
                    System.out.print("not armstrong");
                }
                break;
            case 4:
                int a= sc.nextInt();
                int count=0;
                while(a!=0)
                {
                    int rem=a%10;
                    count++;
                    a=a/10;
                }
                System.out.print("total count = "+count);

                break;
            case  5:
                int sum1=0; int sum2=0;
                int a4= sc.nextInt();
                while(a4>0)
                {
                    int rem1=a4%10;
                    sum1=(sum1*10)+rem1+1;
                    a4=a4/10;
                }
                int e=sum1;

                while(e>0)
                {
                    int rem2=e%10;
                    sum2=(sum2*10)+rem2;
                    e=e/10;
                }
                System.out.println(sum2);


        }
    }
}