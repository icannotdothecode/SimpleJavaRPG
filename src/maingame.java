import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.io.*;
import java.util.Random;
public class maingame {
    public static void main(String[] args)
            throws InterruptedException{
        Scanner Myscan = new Scanner(System.in);
        System.out.println("Dungeoneer, a Java RPG by Vishal Singh");
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
        System.out.println("You start down the dungeon.");
        new adventure();
    }