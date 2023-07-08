import java.util.Scanner;
public class Sixth {
    Scanner sc3=new Scanner(System.in);
void facto(){
    int number=sc3.nextInt();
    int facto=1;
    for(int i=1;i<=number;i++)
    {
      facto=facto*i;
    }
    System.out.println(facto);
    }

void reverse(){
    int number1= sc3.nextInt();
    int rem=0,sum12=0;
    while(number1>0){
        rem=number1%10;
        sum12=(sum12*10)+rem;
        number1=number1/10;
    }
    System.out.println("regverse = "+sum12);
}
}
