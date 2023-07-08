 class fouttheen {
   final void show(int x){
        System.out.println("one");
    }
   void show1(){
        System.out.println("Second");
    }
    void show2(String b){
        System.out.println("third");
    }
   final void show3(){
        System.out.println("fourth");
    }
}
public class Main{
    public static void main(String[] args) {
        fouttheen a1=new fouttheen();
        a1.show(1);a1.show1();a1.show2("modiji");a1.show3();
    }
}

//Hence if the class and all method in a class are final  can happily excuted.