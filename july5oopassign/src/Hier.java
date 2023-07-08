 class Hier {
    int a,b,c,d;

     public int getA() {
         return a;
     }

     public void setA(int a) {
         this.a = a;
     }

     public int getB() {
         return b;
     }

     public void setB(int b) {
         this.b = b;
     }

     public int getC() {
         return c;
     }

     public void setC(int c) {
         this.c = c;
     }

     public int getD() {
         return d;
     }

     public void setD(int d) {
         this.d = d;
     }
 }
class A4 extends Hier{
    int g1;

    public int getG1() {
        return g1;
    }

    public void setG1(int g1) {
        this.g1 = g1;
    }
    void add(int a,int b,int c,int d,int g1)
    {
        System.out.println(a+b+c+d+g1);
    }
}
 class B4 extends Hier{
int h1;

     public int getH1() {
         return h1;
     }

     public void setH1(int h1) {
         this.h1 = h1;
     }
     void add(int a,int b,int c,int d,int h1)
     {
         System.out.println(a+b+c+d+h1);
     }
 }