class B {
    void add()
    {

    }
}
class C extends B{
    @Override
    void add() {
        super.add();
    }
}
class D extends C{
    @Override
    void add() {
        super.add();
    }
}