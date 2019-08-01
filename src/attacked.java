import java.util.*;
import java.util.concurrent.TimeUnit;
import java.io.*;

public class attacked {
    private static String enemyname;
    private static Integer attackdamage;
    private static Integer agility;
    private static Integer enemyhealth;
    static ranroll newroll = new ranroll();

    public static void attacker(int playerhealth) ///launches an attack sequence and chooses enemies
            throws InterruptedException {

        Scanner Myscan4 = new Scanner(System.in); ///just in case user input is required
        Random rand = new Random();
        int enemyvar = rand.nextInt(5) + 1;
        ///enemyprofiles
        if (enemyvar == 1) {
            enemyname = "an Orc";
            enemyhealth = 65;
            attackdamage = 20;
            agility = 2;
        } else if (enemyvar == 2) {
            enemyname = "an Ogre";
            enemyhealth = 70;
            attackdamage = 35;
            agility = 1;
        } else if (enemyvar == 3) {
            enemyname = "an Arachnid";
            enemyhealth = 60;
            attackdamage = 25;
            agility = 2;
        } else if (enemyvar == 4) {
            enemyname = "an Assassin hired by your rivals";
            enemyhealth = 50;
            attackdamage = 20;
            agility = 4;
        } else if (enemyvar == 5) {
            enemyname = "a Rogue";
            enemyhealth = 45;
            attackdamage = 15;
            agility = 3;
        } else {
            System.out.println("Somehow, an error was encountered.");
        }
        combat(playerhealth);
    }

    public static void combat(int playerhealth) throws InterruptedException {
        int damage;
        int ldmg = newroll.roll10();
        Scanner Myscan4 = new Scanner(System.in);
        while (enemyhealth > 0 && playerhealth > 0) {
            System.out.println("\nYou've been attacked by " + enemyname + ".");
            System.out.println("Enter 1 to attack, and 2 to try and dodge the attack.");
            System.out.println("Your health is: " + playerhealth + ".");
            String action = Myscan4.nextLine();
            TimeUnit.SECONDS.sleep(1);
            if (action.charAt(0) == '1') {
                System.out.println("You attempt to attack.");
                TimeUnit.SECONDS.sleep(1);
                int edodge;
                switch (agility) {
                    case 1:
                        edodge = newroll.roll10();
                        if (edodge == 1) {
                            System.out.println("The enemy dodges your attack!");
                            combat(playerhealth);
                        } else {
                            System.out.println("You strike forward.");
                        }
                        break;
                    case 2:
                        edodge = newroll.roll7();
                        if (edodge == 1) {
                            System.out.println("The enemy dodges your attack!");
                            combat(playerhealth);
                        } else {
                            System.out.println("You strike forward.");
                        }
                        break;
                    case 3:
                        edodge = newroll.roll5();
                        if (edodge == 1) {
                            System.out.println("The enemy dodges your attack!");
                            combat(playerhealth);
                        } else {
                            System.out.println("You strike forward.");
                        }
                        break;
                    case 4:
                        edodge = newroll.roll4();
                        if (edodge == 1) {
                            System.out.println("The enemy dodges your attack!");
                            combat(playerhealth);
                        } else {
                            System.out.println("You strike forward.");
                        }
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + agility);
                }

            } else if (action.charAt(0) == '2') {
                System.out.println("You try to dodge.");
                TimeUnit.SECONDS.sleep(1);
                int pdodge = newroll.roll7();
                if (pdodge == 1) {
                    System.out.println("You successfully dodge the attack.");
                } else {
                    System.out.println("You aren't able to dodge the attack.");
                    Random rand3 = new Random();
                    int edamage;
                    edamage = rand3.nextInt(3) + 1;
                    int playerdamage = 40;
                    switch (edamage) {
                        case 1:
                            damage = playerdamage - ldmg;
                            playerhealth = playerhealth - damage;
                            break;
                        case 2:
                            damage = playerdamage;
                            break;
                        case 3:
                            damage = playerdamage + ldmg;
                            break;
                        default:
                            throw new IllegalStateException("Unexpected value: " + edamage);
                    }
                    TimeUnit.SECONDS.sleep(1);
                    System.out.println("You are hit and take " + damage + " damage!");
                    combat(playerhealth);
                }
            } else {
                System.out.println("Unexpected input. Please re-enter.");
                combat(playerhealth);
            }
            Random rand2 = new Random();
            int cbt = rand2.nextInt(2) + 1;
            if (cbt == 1) {
                Random rand3 = new Random();
                int dodge;
                int pdamage;
                pdamage = rand3.nextInt(3) + 1;
                int playerdamage = 40;
                switch (pdamage) {
                    case 1:
                        damage = playerdamage - ldmg;
                        enemyhealth = enemyhealth - damage;
                        break;
                    case 2:
                        damage = playerdamage;
                        enemyhealth = enemyhealth - damage;
                        break;
                    case 3:
                        damage = playerdamage + ldmg;
                        enemyhealth = enemyhealth - damage;
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + pdamage);
                }
                TimeUnit.SECONDS.sleep(1);
                System.out.println("You attack for " + damage + " damage!");
                combat(playerhealth);
            } else {
                Random rand3 = new Random();
                int edamage;
                edamage = rand3.nextInt(3) + 1;
                int playerdamage = 40;
                switch (edamage) {
                    case 1:
                        damage = attackdamage - ldmg;
                        playerhealth = playerhealth - damage;
                        break;
                    case 2:
                        damage = attackdamage;
                        playerhealth = playerhealth - damage;
                        break;
                    case 3:
                        damage = attackdamage + ldmg;
                        playerhealth = playerhealth - damage;
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + edamage);
                }
                TimeUnit.SECONDS.sleep(1);
                System.out.println("You are hit first and take " + damage + " damage!");
                combat(playerhealth);

            }

        }

        if (playerhealth < 1){
            System.out.println("You Died");
            System.out.println("GAME OVER.");
            TimeUnit.SECONDS.sleep(1);
            maingame.main();
        }else if (enemyhealth < 1){
            System.out.println("You win the battle!");
            adventure.travels(playerhealth);
        }else{
            System.out.println("Error, unexpected problem. Returning to action menu.");
            adventure.travels(playerhealth);
        }

    }

}

