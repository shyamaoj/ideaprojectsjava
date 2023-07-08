class D {
    int l5;
    void displayx(int l5)
    {
        this.l5=l5;
    }
    void show1(int l5)
    {
        System.out.println("this is show 1");
    }
    void show2(int l5) {
        System.out.println("this is show 2");
    }

    void show3(int l5) {
        System.out.println("this is  show 3");
    }
}
class E{
    int xk,ky;
    void add(int xk,int ky){

        System.out.println("sum= "+(xk+ky));

    }
    void sub(int xk,int ky){
        System.out.println("sub= "+(xk-ky));
    }
    void mul(int xk,int ky){
        System.out.println("mul= "+(xk*ky));
    }
    void divi(int xk,int ky){
        System.out.println("divi= "+(xk/ky));
    }

}
    class F{
        void circle(int r8){
            double area1=(3.14*(r8*r8));
            System.out.println(area1);
        }
        void triangle(int b7,int q){

            double areatriangle=(0.5*(b7*q));
            System.out.println(areatriangle);
        }
        void rectangle(int l5,int b5){

            System.out.println(l5*b5);
        }
        void square(int s4){

            System.out.println(s4*s4);
        }
    }
