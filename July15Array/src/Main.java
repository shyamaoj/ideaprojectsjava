import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int x325465= sc.nextInt();
        int size= sc.nextInt();int temp=0;
      switch (x325465){
          case 1:
              int a1[]=new int[size];
              for(int i=0;i<a1.length;i++)
              {
                  a1[i]= sc.nextInt();
              }
              for(int i=0;i<a1.length;i++)
              {
                  for(int j=0;j<a1.length-i-1;j++)
                  {
                      if(a1[j]>a1[j+1])
                      {
                           temp=a1[j];
                          a1[j]=a1[j+1];
                          a1[j+1]=temp;
                      }
                  }
              }
              for(int i=0;i<= a1.length/2;i++)
              {     if(a1.length%2==0){
                  System.out.println(a1[i]);}
                  else {
                  System.out.println(a1[i]+1);
              }
              }

          break;
          case 2:
              int a2[]=new int[size];
              for(int i=0;i<a2.length;i++)
              {
                  a2[i]= sc.nextInt();
              }
              for(int i=a2.length-1;i>=0;i--)
              {
                  System.out.print(a2[i]+" ");
              }
              break;
          case 3:
              int a3[]=new int[size];
              for(int i=0;i<a3.length;i++)
              {
                  a3[i]= sc.nextInt();
              }
              for(int i=0;i<a3.length;i++)
              {
                  for(int j=0;j<a3.length-i-1;j++)
                  {
                      if(a3[j]>a3[j+1])
                      {
                          temp=a3[j];
                          a3[j]=a3[j+1];
                          a3[j+1]=temp;
                      }
                  }
              }
              System.out.println("reverse mid to first");
              for(int i=a3.length/2-1;i>=0;i--)
              {
                  System.out.println(a3[i]);
              }
              System.out.println("last from mid");
              for(int i=a3.length/2+1;i<a3.length;i++)
              {
                  System.out.println(a3[i]);
              }
              break;

          case 4:
              int a4[]=new int[size];
              for(int i=0;i<a4.length;i++)
              {
                  a4[i]= sc.nextInt();
              }
              for(int i=0;i<a4.length;i++)
              {
              for (int j=0;j<a4.length-i-1;j++)
              {
                  if(a4[j]>a4[j+1])
                  {
                      temp=a4[j];
                      a4[j]=a4[j+1];
                      a4[j+1]=temp;
                  }
              }
              }
              for(int i=0;i<a4.length/2;i++)
              {
                  System.out.print(a4[i]+" ");
              }
              for(int i=a4.length;i<a4.length/2;i++)
              {
                  System.out.println(" "+a4[i]+" ");
              }
              break;
          case 5:
              int a5[]=new int[size];
              for(int i=0;i<a5.length;i++)
              {
                  a5[i]= sc.nextInt();
              }
              for(int i=0;i<a5.length;i++)
              {
                  if(i==0 && i<a5.length)
                  {
                      int temp1=a5[0];
                      a5[0]=a5[a5.length];
                      a5[a5.length]=a5[0];
                  }
                  else {
                      System.out.print(a5[i]);
                  }
              }
              break;
          case 6:
              int a6[]=new int[size];
              int min=0;
              for(int i=0;i<a6.length;i++)
              {
                  a6[i]= sc.nextInt();
              }
              for (int i = 0; i <a6.length ; i++) {
                 for(int j=0;j<a6.length-i-1;j++)
                 {
                     if(a6[j]>a6[j+1])
                     {
                         temp=a6[j];
                         a6[j]=a6[j+1];
                         a6[j+1]=temp;
                     }
                 }
              }
              System.out.print("second max = "+a6[a6.length-2]);
              System.out.print("second min = "+a6[1]);
          break;
          //for binary search in array
          case 7:
              int a7[]=new int[size];
              for(int i=0;i<a7.length;i++)
              {
                  a7[i]= sc.nextInt();
              }
              System.out.println("INDEXING OF A NUMBER"+Arrays.binarySearch(a7,6));
              break;
          case 8:
              int a8[]=new int[size];
              for(int i=0;i<a8.length;i++)
              {
                  a8[i]= sc.nextInt();
              }
              int a9[]=new int[size];
              for(int i=0;i<a9.length;i++)
              {
                  a9[i]= sc.nextInt();
              }
              System.out.println("is it true"+Arrays.equals(a8,a9));
              break;
          case 9:
              int a10[]=new int[size];
              for(int i=0;i<a10.length;i++)
              {
                  a10[i]= sc.nextInt();
                  System.out.println( Arrays.sort(a10);
              }

//              for(int i:a10)
//                {
//                    System.out.println(Arrays.sort(a10);
//                }

              break;
//          case 10:
//              int a11[]=new int[size];
//              for(int i=0;i<a11.length;i++)
//              {
//                  a11[i]= sc.nextInt();
//              }
//             for(int i:a11)
//             {
////                 System.out.println(Arrays.sort(a11,1,5););
//             }



      }
    }
}