class A3 {
    int a10,b10;

    public void setA10(int a10) {
        this.a10 = a10;
    }

    public void setB10(int b10) {
        this.b10 = b10;
    }

    public int getA10() {
        return a10;
    }

    public int getB10() {
        return b10;
    }
}
class B3 extends A3 {
    int c10,d10;

    public int getC10() {
        return c10;
    }

    public int getD10() {
        return d10;
    }

    public void setC10(int c10) {
        this.c10 = c10;
    }

    public void setD10(int d10) {
        this.d10 = d10;
    }
}
class C3 extends B3{
    int e10;

    public int getE10() {
        return e10;
    }

    public void setE10(int e10) {
        this.e10 = e10;
    }
    void add(int a10,int b10,int c10,int d10,int e10){
        System.out.println("sum = "+(a10+b10+c10+d10+e10));
    }
}

