import java.util.Random;

public class Table {
    public static void main(String[] args) {

        int[] testTable = new int[10];
        Table.randomArray(testTable);

        System.out.println("\nodwrotność:");

        Table.showReverseArray(testTable);


    }


    static Random rand = new Random();

    public static void randomArray(int[] tab) {

        for (int i = 0; i < tab.length; i++) {
            tab[i] = rand.nextInt(10);
            System.out.print(tab[i]);
        }
    }
    public static void showReverseArray(int[] tab){

        System.out.println(tab.length);

        for (int i = 0; i < tab.length*2; i++) {
            if (i<tab.length){
                System.out.print(tab[i]);
            }
            else {
                System.out.print(tab[tab.length*2-i-1]);
            }
        }

    }
}