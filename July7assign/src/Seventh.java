import java.util.Scanner;
public class Seventh {
    Scanner sc98=new Scanner(System.in);

    void even(){
    int x10=sc98.nextInt();
    int x20= sc98.nextInt();

        for(int i=x10;i<=x20;i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

    }

    void odd(){
        int x11=sc98.nextInt();
        int x21= sc98.nextInt();

        for(int i=x11;i<=x21;i++)
        {
            if(i%2!=0)
            {
                System.out.println(i);
            }
        }
    }
    }

