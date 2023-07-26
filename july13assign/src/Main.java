import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
                int x1234= sc.nextInt();
                switch (x1234)
                {
                    case 1:
                        System.out.println("enter the array size");
                        int size1= sc.nextInt();int size2= sc.nextInt();
                        int []b[]=new int[size1] [size2];
                        for(int i=0;i<size1;i++) {
                            for (int j = 0; j < size2; j++) {
                                b[i][j] = sc.nextInt();
                            }
                        }
                        System.out.println("enter second array size");
                        int size3= sc.nextInt();int size4= sc.nextInt();
                        int []c[]=new int[size3] [size4];
                        for(int i=0;i<size3;i++) {
                            for (int j = 0; j < size4; j++) {
                                c[i][j] = sc.nextInt();
                            }
                        }

                        for(int i=0;i<size1;i++)
                        {
                            for(int j=0;j<size2;j++)
                            {
                                int result=b[i][j]+c[i][j];
                                System.out.print(result+" ");
                            }
                            System.out.println();
                        }
                    break;
                    case 2:

                    break;
        }
    }
}