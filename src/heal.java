import java.util.*;
import java.util.concurrent.TimeUnit;
import java.io.*;

public class heal {
    public static void healed() throws InterruptedException{
        adventure newtravels;
        System.out.println("You choose to rest and heal.");
        if (maingame.playerhealth < 150) {
            System.out.println("\nYou feel rested and ready to move on.");
            maingame.playerhealth = maingame.playerhealth + 15;
        } else {
            System.out.println("\nYou already feel rested and healed.");
        }

        newtravels = new adventure();
        adventure.travels();



    }
}
