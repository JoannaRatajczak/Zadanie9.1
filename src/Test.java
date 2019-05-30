import java.util.Random;

public class Test {
    public Test(Random rand) {
        this.rand = rand;
    }

    Random rand = new Random();

    void randomArray(int[] tab) {
        for (int i = 0; i < tab.length - 1; i++) {
            tab[i] = rand.nextInt();
        }
    }
}