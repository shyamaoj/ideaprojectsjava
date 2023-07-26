
class A {
    A()
    {
        System.out.println("a");
    }
    A(int a)
    {   this();
        System.out.println("a of int a");
    }
    A(int b,int c)
    {   this(3);
        System.out.println("A 0f a and b");
    }
    void add()
    {
        System.out.println("Add of func");
    }
    void add(int x)
    {this.add();
        System.out.println("yo");


    }
    void add(float y)
    {
        this.add(2);
        System.out.println();
    }
}
