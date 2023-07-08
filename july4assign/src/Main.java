import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x97= sc.nextInt();
        switch (x97) {
            case 1:
                int x = sc.nextInt();
                int sum = 0;
                for (int i = 1; i <= x; i++) {
                    sum = sum + i;
                }
                System.out.println("sum = " + sum);
                break;
            case 2:
                int y = sc.nextInt();
                if (y < 0) {
                    y = y * (-1);
                }

                for (int i = 1; i <= 10; i++) {
                    System.out.println(y + "*" + i + "=" + (y * i));
                }
                break;
            case 3:
                int i=2;int b= sc.nextInt();
                while(i<=b)
                {
                    System.out.print(i +" ");
                    i=i+2;
                }
                break;
            case 4:
                System.out.print("enter the name = ");
                String name1= sc.next();
                System.out.print("enter the age = ");
                int age= sc.nextInt();
                Person p1=new Person(name1,age);
                System.out.println("name = "+p1.name+" "+"age = "+p1.age);
                break;

            case 5:
                System.out.print("enter the name = ");
                String name= sc.next();
                System.out.print("enter the grade = ");
                char grade= sc.next().charAt(0);
                System.out.print("enter the course = ");
                String courseName= sc.nextLine();
                sc.next();

                System.out.println("name = "+name);
                System.out.println("grade = "+grade);
                System.out.println("courseName = "+courseName);
          /*  if(courseName.equals(courseName))
            {
                Student st=new Student(name,grade,courseName);
                st.addCourse();
            }
            if(courseName.equals(courseName))
            {
                Student st=new Student(name,grade,courseName);
                st.dropCourse();
            }
            break;*/
        }

        }
    }
