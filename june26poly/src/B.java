class C {
    void add(){
        System.out.println("this is add of class c");
    }
}
public class B extends C {
    @Override
    void add() {
        super.add();
        System.out.println("this is addd of class b");}

    void displayB()
        {
            System.out.println("this is disllapy b of ckass b");
        }
    }

class D extends B{
    @Override
    void displayB() {
        super.displayB();
    }

    @Override
    void add() {
        super.add();
    }
}
