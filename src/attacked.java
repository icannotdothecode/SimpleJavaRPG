import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.io.*;
import java.util.Random;

public class attacked {
    public static void attacked(int playerhealth) ///launches an attack sequence and chooses enemies
            throws InterruptedException{
        Scanner Myscan4 = new Scanner(System.in); ///just in case user input is required
        Random rand = new Random();
        int enemyvar = rand.nextInt(5) + 1;
        ///enemyprofiles
        switch (enemyvar) {
            case 1:
                String enemyname = "an Orc";
                int attackdamage = 20;
                int agility = 1;
                break;
            case 2:
                String enemyname = "an Ogre";
                int attackdamage = 30;
                int agility = 0;
                break;
            case 3:
                String enemyname = "an Arachnid";
                int attackdamage = 25;
                int agility = 1;
                break;
            case 4:
                String enemyname = "an Assassin hired by your rivals";
                int attackdamage = 20;
                int agility = 3;
                break;
            case 5:
                String enemyname = "a Rogue";
                int attackdamage = 15;
                int agility = 2;
                break;
            default:
                System.out.println("Somehow, an error was encountered.");
                break;
        }
        System.out.println("\nYou've been attacked by " + enemyname + ".");
        TimeUnit.SECONDS.sleep(1);
        ///battle goes here



    }

}
