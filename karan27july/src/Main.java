
class B
{
    B(){
        System.out.println("this is constructor");
    }
    {
        System.out.println("this is anoynyms");
    }
    static {
        System.out.println("this is static");
    }
    void add() {
        System.out.println("this is add of class b");
    }
}
public class Main {
    public static void main(String[] args) {
       new B();
        }
    }
