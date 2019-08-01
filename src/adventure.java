import java.util.*;
import java.util.concurrent.TimeUnit;
import java.io.*;


public class adventure {
    public static void travels(int playerhealth) ///basically the starting point, choose an action and call other methods, etc.
        throws InterruptedException {
        Scanner Myscan2 = new Scanner(System.in);
        TimeUnit.SECONDS.sleep(1);
        System.out.println("\nChoose your next action");
        System.out.println("Enter 'M' to move on, 'H' to heal yourself, and 'L' to list your health. ");
        String action = Myscan2.nextLine();
        TimeUnit.SECONDS.sleep(2);
        adventure newtravels;
        if (action.charAt(0) == 'M') {
            Random rand = new Random();
            int safeTrip = rand.nextInt(2) + 1;
            switch (safeTrip) {
                case 1:
                    System.out.println("\nYou find nothing, and continue on.");
                    newtravels = new adventure();
                    travels(playerhealth);
                    break;
                case 2:
                    attacked.attacker(playerhealth);
                    break;
            }
        } else if (action.charAt(0) == 'H') {
            heal.healed(playerhealth);
        } else if (action.charAt(0) == 'L'){
            System.out.println("Your health is: " + playerhealth + ".");
            newtravels = new adventure();
            travels(playerhealth);
        } else {
            System.out.println("Unexpected input, please re-enter.");
            newtravels = new adventure();
            travels(playerhealth);
        }
    }
}
