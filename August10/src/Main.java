interface A{
    int a=10;
   static void add(){
        System.out.println("this is add");
    }
}
public class Main {
    public static void main(String[] args) {
     A.add();
        System.out.println(A.a);
    }
}