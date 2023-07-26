import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x324= sc.nextInt();
        switch (x324)
        {
            case 1:  // ArithmeticException
                try{
            int a=45;
            int b=0;
            int c=a/b;
            System.out.println(c);
                }
                catch (ArithmeticException object)
                {
                    System.out.println("please valid answer");
                }
            break;
            case 2: // null pointer exceotion it came when variable having a null value.
                try{
                    String s1="Ghanshyam";
                    System.out.println(s1.length());
                }
                catch (NullPointerException obj2)
                {
                    System.out.println("please give value to variable");
                }
            break;
            case 3: //Number format excpetion
                try{
                String s2= "abc";
                int a=Integer.parseInt(s2);
                System.out.println(a);}
                catch(NumberFormatException obj3){
                    System.out.println("please enter the right value");
                }
                break;

            case 4: //ArrayIndexOutOfBoundsException
                try{
                int a[]=new int[6];
                a[10]=45;
                System.out.println(a[10]);}
                catch(ArrayIndexOutOfBoundsException obj4){
                System.out.println("please enter correct index length ");
            }
                break;
            case 5:
                int a8=23/0;
                System.out.println(a8);

                try{
                    try {
                        try {

                        }catch (Exception ex)
                        {

                        }
                    } catch (Exception ex)
                    {

                    }
                }
                catch (Exception ex)
                {

                }
                break;
            case 6:
                try{
                    int a=4/0;
                    System.out.println(a);
                }
                catch (Exception ex)
                {
                    System.out.println(ex);
                }
                break;;
        }

    }
}
