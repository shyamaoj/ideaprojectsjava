import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void array(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]+" ");
        }
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        /*int temp=0;
       int a[]=new int[]{10,30,40,20};
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if (a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;

                }
            }

        }
        System.out.println(Arrays.toString(a));*/
        int size= sc.nextInt();
        int a[]=new int[size];

        for(int i=0;i<a.length;i++)
        {
            a[i]= sc.nextInt();
        }
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length-i-1;j++)
            {
                if(a[j]<a[j+1])
                {
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        System.out.println("sorted f array are given below:-");
        array(a);

    }
}