import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x= sc.nextInt();
        int y= sc.nextInt();
        int z= sc.nextInt();
        int a= sc.nextInt();
        A a1=new A(x,y,z,a);
        a1.add();

    }
}