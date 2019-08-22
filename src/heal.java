import java.util.*;
import java.util.concurrent.TimeUnit;
import java.io.*;

public class heal {
    public static void healed() throws InterruptedException{
        System.out.println("You choose to rest and heal.");
        if (PlayerClasses.stats[1] < 150) {
            System.out.println("\nYou are already at max health.");
            PlayerClasses.stats[1] += 15;
        } else {
            System.out.println("\nYou already feel rested and healed.");
        }
        adventure.travels();



    }
}
