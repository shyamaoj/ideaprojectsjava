abstract class A {
    void display(){
        System.out.println("this is cLass A");
    }
}
class B extends A{
    @Override
    void display() {
        super.display();
    }
}