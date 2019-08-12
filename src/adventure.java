import java.util.*;
import java.util.concurrent.TimeUnit;
import java.io.*;


public class adventure {
    public static void travels() ///basically the starting point, choose an action and call other methods, etc.
        throws InterruptedException {
        Scanner Myscan2 = new Scanner(System.in);
        TimeUnit.SECONDS.sleep(1);
        System.out.println("\nChoose your next action");
        System.out.println("Enter 'M' to move on, 'H' to heal yourself, 'L' to list your health, and 'S' to list your stats. ");
        String action = Myscan2.nextLine();
        TimeUnit.SECONDS.sleep(2);
        if (action.charAt(0) == 'M') {
            Random rand = new Random();
            int safeTrip = rand.nextInt(3) + 1;
            if (safeTrip == 1) {
                System.out.println("\nYou find nothing, and continue on.");
                adventure.travels();
            } else if ((safeTrip == 2) || (safeTrip == 3)){
                attacked.attacker();
            } else {
                throw new IllegalStateException("Unexpected value: " + safeTrip);
            }
        } else if (action.charAt(0) == 'H') {
            heal.healed();
        } else if (action.charAt(0) == 'L') {
            System.out.println("Your health is: " + maingame.playerhealth + ".");
            adventure.travels();
        } else if (action.charAt(0) == 'S') {
            System.out.println("Your stats are: " + Arrays.toString(PlayerClasses.sstats));
            adventure.travels();
        } else {
            System.out.println("Unexpected input, please re-enter.");
            adventure.travels();
        }
    }
}
