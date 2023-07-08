import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

                B b1=new B();
                //b1.add();
                A a1=new A() {
                    @Override
                    public void add() {
                        System.out.println("hello");
                    }
                };
                a1.add();
        }
    }

