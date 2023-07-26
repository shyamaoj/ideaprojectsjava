import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        int [][]a={{10,20,30},{40,50,60},{70,80,90}};
        int size1= sc.nextInt();int size2= sc.nextInt();
        int [][]b=new int[size1][size2];
        for(int i=0;i<b.length;i++) {
            for (int j = 0; j < b.length; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<b.length;i++)
        {
            for(int j=0;j<b.length;j++)
            {
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
        }
    }
