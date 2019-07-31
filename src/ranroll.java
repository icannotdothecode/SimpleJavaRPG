import java.util.*;
public class ranroll {

    public int roll4() {
        Random rand = new Random();
        int n = rand.nextInt(5);
        while (n == 0) {
            n = rand.nextInt(5);
        }//1-4 (lvl 4 agility)
        return n;
    }

    public int roll5() {
        Random rand = new Random();
        int n = rand.nextInt(6);
        while (n == 0) {
            n = rand.nextInt(6);
        }
        return n;
    }//1-5 (lvl 3 agility)

    public int roll7() {
        Random rand = new Random();
        int n = rand.nextInt(8);
        while (n == 0) {
            n = rand.nextInt(8);
        }//1-7 (lvl 2 agility)
        return n;
    }

    public int roll10() {
        Random rand = new Random();
        int n = rand.nextInt(11);
        while (n == 0) {
            n = rand.nextInt(11);
        }//1 - 10 (lvl 1 agility)
        return n;
    }
}