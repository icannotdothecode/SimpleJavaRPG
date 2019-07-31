import java.util.*;
import java.util.concurrent.TimeUnit;
import java.io.*;

public class attacked {
    public static void attacker(int playerhealth) ///launches an attack sequence and chooses enemies
        throws InterruptedException {
        Scanner Myscan4 = new Scanner(System.in); ///just in case user input is required
        Random rand = new Random();
        int enemyvar = rand.nextInt(5) + 1;
        ///enemyprofiles
        String enemyname = null;
        if (enemyvar == 1) {
            enemyname = "an Orc";
            int attackdamage = 20;
            int agility = 1;
        } else if (enemyvar == 2) {
            enemyname = "an Ogre";
            int attackdamage = 30;
            int agility = 0;
        } else if (enemyvar == 3) {
            enemyname = "an Arachnid";
            int attackdamage = 25;
            int agility = 1;
        } else if (enemyvar == 4) {
            enemyname = "an Assassin hired by your rivals";
            int attackdamage = 20;
            int agility = 3;
        } else if (enemyvar == 5) {
            enemyname = "a Rogue";
            int attackdamage = 15;
            int agility = 2;
        } else {
            System.out.println("Somehow, an error was encountered.");
        }

        System.out.println("\nYou've been attacked by " + enemyname + ".");
        TimeUnit.SECONDS.sleep(1);
        ///battle goes here


    }

}
