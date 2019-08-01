import java.util.*;
import java.util.concurrent.TimeUnit;
import java.io.*;

public class maingame {
    public static void main(String[] args)
            throws InterruptedException {
        Integer playerhealth = null;
        Scanner Myscan = new Scanner(System.in);
        TimeUnit.SECONDS.sleep(1);
        System.out.println("\nDungeoneer, a Java RPG by Vishal Singh");
        System.out.println("This is a game I made when I started learning Java, so it ain't perfect");
        System.out.println("Game Running...");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("\nWelcome to the dungeons.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("\nPlease enter your name to begin");
        TimeUnit.SECONDS.sleep(1);
        String playerName = Myscan.nextLine();
        System.out.println("\nYour name is: " + playerName);
        TimeUnit.SECONDS.sleep(1);
        ///begins the adventure before moving on to method adventure
        System.out.println("\nSTARTING YOUR ADVENTURE");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("\nYour character is in a dimly lit dungeon, possibly looking for gold, glory, or relics.");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("Choose your difficulty, 1 is Easy, 2 is Medium, and 3 is Difficult.");
        String difficulty = Myscan.nextLine();
        if (difficulty.charAt(0) == '1'){
            playerhealth = 150;
            System.out.println("You have chosen 'Easy' as your difficulty.");
        }
        else if (difficulty.charAt(0) == '2'){
            playerhealth = 100;
            System.out.println("You have chosen 'Medium' as your difficulty.");
        }
        else if (difficulty.charAt(0) == '3'){
            playerhealth = 50;
            System.out.println("You have chosen 'Difficult' as your difficulty.");
        }

        System.out.println("You start down the dungeon.");
        adventure.travels(playerhealth);
    }
}