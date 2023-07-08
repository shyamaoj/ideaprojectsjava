public class Main{
    public static void main(String[] args) {
//        new A().show(4,564,3,45,76,43,23,3);
        C c1=new C();
        c1.sub();
        B.add(6);
        c1.mul();
    }
}
/*
class A{
    void show(int x,int...a){
        System.out.println("the value of x = "+x);
        for(int i:a)
        {
            System.out.println(i);
        }
    }
        }*/
