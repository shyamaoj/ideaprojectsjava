import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int q= sc.nextInt();
        switch (q) {
            case 1:
            int n = sc.nextInt();
            for (int i = 1; i <= n; i++)
            { System.out.print(i); } break;
            case 2:
            int p= sc.nextInt(); for(int i=p;i>=1;i--)  { System.out.println(i); } break;
            case 3:
            int o= sc.nextInt();for(int i=1;i<=10;i++) { System.out.println(o*i);}break;
            case 4:
            int u= sc.nextInt();for(int i=1;i<=u;i--) {if(u%2==0) System.out.print(u +" ");}break;
            case 5: //work it on this
                System.out.println();
            int y= sc.nextInt();
            int t= sc.nextInt();
            for(int i=1;i<=y;i++)
            {
                for(int j=1;j<=10;j++)
                {
                    System.out.println(t*j);
                }

            }
            break;
            case 10:  int r= sc.nextInt(); int facto=1; for(int i=r;i>=1;i--)  { facto=facto*i;}
                System.out.println(facto);break;
            case 11:
                int y1= sc.nextInt(); int t1= sc.nextInt(); for(int i=y1;i<=t1;i++) {if (i % 2 == 0)
                {System.out.println(i); } }break;
            case 12:
                int y3= sc.nextInt(); int z3= sc.nextInt(); int sum2=0; for(int i=y3;i<=z3;i++)
                {sum2=sum2+i;} System.out.println(sum2);
        }
    }
}