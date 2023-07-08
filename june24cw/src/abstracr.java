abstract class ab {
    static void add()
    {
        System.out.println("this is abstracr");
    }
    abstract void abs();
}
class B extends ab{
    @Override
    void abs() {
        System.out.println("this is  b of ab");
    }
}
class C{
    static C(){

    }
}