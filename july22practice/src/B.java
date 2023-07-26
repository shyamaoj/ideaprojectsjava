interface B {
    static int b=23;
    void add();
    default void add1()
    {
        System.out.println("Sasdf");
    }
}
interface C{
    static void sub(){
        System.out.println("this is sub body of interface c");
    };
}
abstract class D implements B,C{

}
class E extends D{
    @Override
    public void add() {

    }
}