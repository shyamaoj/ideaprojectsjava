 class A{
   static void add1()
    {
        System.out.println("this is static of class add1");
    }
class B{
   void add(){
        System.out.println("this is add of static class b");
    }
}
}
public class Main{
    public static void main(String[] args) {
        A.add1();
        A a1=new A();
        A.B b1=a1.new B();
        b1.add();
    }
}