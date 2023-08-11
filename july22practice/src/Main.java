class A{
    int a;
    A()
    {
        this.a=a;
    }
    void show()
    {
        System.out.println(a);
    }
}
class B {
    int b;

    void A(int b)
    {
        this.b=b;
    }
    void add()
    {
        System.out.println(A.a+b);
    }
}
public class Main{
    public static void main(String[] args)
    {
        B k=new B();
        k.add();
    }
}