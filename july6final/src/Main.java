//public class Main{
//    public static void main(String[] args) {
//      A b1=new A();
//      b1.dispaly(2);
//    }
//}
// class A{
//    final void dispaly(int x){
//        System.out.println("hello");
//    }
//    final void dispaly1(int x){
//        System.out.println("hello");
//    }
//    final void dispaly23(int x){
//        System.out.println("hello");
//    }  final void dispaly3(){
//        System.out.println("hello");
//    }
//
//}
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no to check the number is prime or not");
        int x= sc.nextInt();
        int a=2;
        while(x>a)
        {
            if(x%a==0)
            {
                System.out.println(x+" is noot prime");
                break;
            }
            if(x-1==a)
            {
                System.out.println(x+" is a prime no");
                break;
            }
            a++;
        }

    }
}