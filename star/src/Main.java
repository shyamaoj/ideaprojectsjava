import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        for(int i=0;i<args.length;i++) {
            arr[i]= sc.nextInt();
        }
        for(int i=arr.length-1;i>=1;i--)
        {
            System.out.println(arr[i]);
        }
       /* int arr[]=new int[5];
        for(int i=0;i< arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int j=0;j<arr.length;j++)
        {
            System.out.println(arr[j]);
        }*/
        /*for(int i=1;i<=n;i++)
        {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || j == 1 || i == n || j == n) {
                    System.out.print("*");
                } else
                    System.out.print(" ");
            }
            System.out.println();*/
    }
}