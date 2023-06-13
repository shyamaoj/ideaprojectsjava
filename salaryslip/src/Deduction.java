public class Deduction extends Basicsalary{
    int Pf;
    int houserent;
    public void deduct(int pf,int houserent)
    {
        int ded=pf+houserent;
        System.out.println(ded);
    }
}
