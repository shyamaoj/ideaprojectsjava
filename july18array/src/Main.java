import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x234=sc.nextInt();
        System.out.println("enter the size of an array = ");
        int size= sc.nextInt();
           switch (x234)
           {
               case 1:
                   int x[]= new int[size];
                   for(int i=0;i<x.length;i++)
                   {
                       x[i]= sc.nextInt();
                   }
                   Arrays.asList(x);
//                   Arrays.sort(x);
//                   for(int i:x)
//                   {
//                       System.out.println(i);
//                   }
                   break;

               case 2:
                   int x32[]=new int[size];
                   for (int i = 0; i <x32.length; i++) {
                       x32[i]= sc.nextInt();
                   }
                   for (int i = 0; i <x32.length; i++) {
                   }
                   System.out.println(Arrays.toString(x32)+" ");

                   break;

        }
    }
}