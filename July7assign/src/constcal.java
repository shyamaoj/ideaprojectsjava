public class constcal {
    int a,b;
    void setA(int a)
    {
        this.a=a;
    }
    void setB(int b)
    {
        this.b=b;
    }
    int getA(int a)
    {
        return a;
    }
    int getB(int b)
    {
        return b;
    }


     constcal() {
        System.out.println(a+b);
    }
    constcal(int x) {
        System.out.println(a-b);
    }
    constcal(int x,int y) {
        System.out.println(a*b);
    }
     constcal(int x,int y,int z) {
        System.out.println(a/b);
    }
}
