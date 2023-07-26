import java.util.Scanner;

public class Main extends Object {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int a[]=new int[x];

        for(int i=0;i< a.length;i++)
        {
            a[i]= sc.nextInt();
        }
        for(int i=0;i< a.length;i++)
        {
            for (int j = 0; j < a.length-i-1 ; j++) {
                if(a[j]<a[j+1])
                {
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
            System.out.println(a[i]);
        }

        }
    }
