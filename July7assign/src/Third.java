interface A1{
    void adda();
}
interface B1{
    void  addb();
}
class C implements A1,B1{

    @Override
    public void adda() {
        System.out.println("this  is adda");
    }

    @Override
    public void addb() {
        System.out.println("this is b");
    }
}