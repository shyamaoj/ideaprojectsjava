interface A{
    void add();
}
class B implements A {
    @Override
    public void add() {
        System.out.println("hi");
    }
}


