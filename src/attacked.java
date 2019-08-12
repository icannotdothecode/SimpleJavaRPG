import java.util.*;
import java.util.concurrent.TimeUnit;
import java.io.*;

public class attacked {
    static ranroll newroll = new ranroll();
    private static String enemyname;
    private static Integer attackdamage;
    private static Integer agility;
    private static Integer enemyhealth;
    private static Integer damage;
    private static Integer ldmg = newroll.roll10();


    public static void attacker() ///launches an attack sequence and chooses enemies
            throws InterruptedException {

        Scanner Myscan4 = new Scanner(System.in); ///just in case user input is required
        Random rand = new Random();
        int enemyvar = rand.nextInt(5) + 1;

        ///enemy profiles

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
        combat();
    }

    public static void combat() throws InterruptedException {
        Scanner Myscan4 = new Scanner(System.in);
        while (enemyhealth > 0 && maingame.playerhealth > 0) {
            System.out.println("\nYou've been attacked by " + enemyname + ".");
            System.out.println("It has " + enemyhealth + " health remaining.");
            System.out.println("Enter 1 to attack, and 2 to try and dodge the attack.");
            System.out.println("Your health is: " + maingame.playerhealth + ".");
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
                            combat();
                        } else {
                            System.out.println("You strike forward.");
                        }
                        break;
                    case 2:
                        edodge = newroll.roll7();
                        if (edodge == 1) {
                            System.out.println("The enemy dodges your attack!");
                            combat();
                        } else {
                            System.out.println("You strike forward.");
                        }
                        break;
                    case 3:
                        edodge = newroll.roll5();
                        if (edodge == 1) {
                            System.out.println("The enemy dodges your attack!");
                            combat();
                        } else {
                            System.out.println("You strike forward.");
                        }
                        break;
                    case 4:
                        edodge = newroll.roll4();
                        if (edodge == 1) {
                            System.out.println("The enemy dodges your attack!");
                            combat();
                        } else {
                            System.out.println("You strike forward.");
                        }
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + agility);
                }

            } else if (action.charAt(0) == '2') {
                int edodge;
                switch (PlayerClasses.stats[2]) {
                    case 1:
                        edodge = newroll.roll10();
                        if (edodge == 1) {
                            System.out.println("You dodge the attack!");
                            combat();
                        } else {
                            nododge();
                        }
                        break;
                    case 2:
                        edodge = newroll.roll7();
                        if (edodge == 1) {
                            System.out.println("You dodge the attack!");
                            combat();
                        } else {
                            nododge();
                        }
                        break;
                    case 3:
                        edodge = newroll.roll5();
                        if (edodge == 1) {
                            System.out.println("You dodge the attack!");
                            combat();
                        } else {
                            nododge();
                        }
                        break;
                    case 4:
                        edodge = newroll.roll4();
                        if (edodge == 1) {
                            System.out.println("You dodge the attack!");
                            combat();
                        } else {
                            nododge();
                        }
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + agility);
                }

            } else {
                System.out.println("Unexpected input. Please re-enter.");
                combat();
            }

            Random rand2 = new Random();
            int cbt = rand2.nextInt(2) + 1;
            if (cbt == 1) {
                Random rand3 = new Random();
                int dodge;
                int pdamage;
                pdamage = rand3.nextInt(3) + 1;
                switch (pdamage) {
                    case 1:
                        damage = PlayerClasses.stats[0] - ldmg;
                        enemyhealth -= damage;
                        break;
                    case 2:
                        damage = PlayerClasses.stats[0];
                        enemyhealth -= damage;
                        break;
                    case 3:
                        damage = PlayerClasses.stats[0] + ldmg;
                        enemyhealth -= damage;
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + pdamage);
                }
                TimeUnit.SECONDS.sleep(1);
                System.out.println("You attack for " + damage + " damage!");
                combat();
            } else {
                Random rand3 = new Random();
                int edamage;
                edamage = rand3.nextInt(3) + 1;
                switch (edamage) {
                    case 1:
                        damage = attackdamage - ldmg;
                        maingame.playerhealth -= damage;
                        break;
                    case 2:
                        damage = attackdamage;
                        maingame.playerhealth -= damage;
                        break;
                    case 3:
                        damage = attackdamage + ldmg;
                        maingame.playerhealth -= damage;
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + edamage);
                }
                TimeUnit.SECONDS.sleep(1);
                System.out.println("\nThe enemy strikes and you take " + damage + " damage!");
                combat();

            }

        }

        if (maingame.playerhealth < 1){
            System.out.println("You Died");
            System.out.println("GAME OVER.");
            TimeUnit.SECONDS.sleep(1);
            maingame.main(null);
        }else if (enemyhealth < 1){
            System.out.println("You win the battle!");
            adventure.travels();
        }else{
            System.out.println("Error, unexpected problem. Returning to action menu.");
            adventure.travels();
        }

    }

    public static void nododge() throws InterruptedException {
        System.out.println("You aren't able to dodge the attack.");
        Random rand3 = new Random();
        int edamage;
        edamage = rand3.nextInt(3) + 1;
        switch (edamage) {
            case 1:
                damage = attackdamage - ldmg;
                maingame.playerhealth = maingame.playerhealth - damage;
                break;
            case 2:
                damage = attackdamage;
                break;
            case 3:
                damage = attackdamage + ldmg;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + edamage);
        }
        TimeUnit.SECONDS.sleep(1);
        System.out.println("You are hit and take " + damage + " damage!");
        combat();
    }
}

