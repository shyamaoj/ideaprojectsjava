import java.util.Scanner;

import java.util.Scanner;
class E {
    Scanner sc981=new Scanner(System.in);


   int leap12=0;
    void leap(){
    int year =sc981.nextInt();
            if (year % 4 == 0 && year%100==0 && year%400==0) {


                leap12 = 1;}
            else{
                leap12 = 0;}

            if (leap12==1){
            System.out.println(year + " is a leap year.");}
            else{
                System.out.println(year + " is not a leap year.");
}
    }}

class F{
    Scanner sc982=new Scanner(System.in);
    void ftoc(){
    float Fahrenheit, Celsius;
        Fahrenheit = sc982.nextInt();
        Celsius  = ((Fahrenheit-32)*5)/9;
        System.out.println("Temperature in celsius is: "+Celsius);
    }
    void ctof(){
        float Fahrenheit, Celsius;
        Celsius= 13;
        Fahrenheit =((Celsius*9)/5)+32;
        System.out.println("Temperature in Fahrenheit is: "+Fahrenheit);
    }
}
class G{

    Scanner sc983=new Scanner(System.in);
    void trianglearea()
    {
        int b=sc983.nextInt();
        int h=sc983.nextInt();
        System.out.println(0.5*(b*h));
    }
    void areasquare()
    {
        int as=sc983.nextInt();
        System.out.println("area = "+(as*as));
    }
    void arearectangle()
    {
        int l= sc983.nextInt();
        int b= sc983.nextInt();
        System.out.println(l*b);
    }


}

