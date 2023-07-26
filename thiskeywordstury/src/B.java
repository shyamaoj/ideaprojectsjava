class B {
    D p;
     B(D l) {
         p=l;
         System.out.println(p.a);
    }


}
class D{
    int a;
    D(int a){
        this.a=a;
        B p=new B(this);
    }
}

