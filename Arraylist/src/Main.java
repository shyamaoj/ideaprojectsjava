import java.util.ArrayList;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> list =new ArrayList<>();

        /*ArrayList<Integer> list=new ArrayList<>(4);

        list.add(1032);
        list.add(1230);
        list.add(1023);
        list.add(1230);
        list.add(1430);
        list.add(1054);
        list.add(1640);
        list.add(1623423440);
        list.add(165440);
        list.add(1654840);
        System.out.println(list);
        list.set(1,3245);
        list.remove(8);

        System.out.println(list);*/
        for (int i = 0; i <10; i++) {
            list.add(sc.nextInt());
        }
        for (int i = 0; i <10; i++) {

        }
        System.out.println(list.get(5));
        System.out.println(list);

        }
    }
