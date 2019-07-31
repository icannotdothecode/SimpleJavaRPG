import java.util.*;
import java.util.concurrent.TimeUnit;
import java.io.*;


public class adventure {
    public static void travels(int playerhealth) ///basically the starting point, choose an action and call other methods, etc.
        throws InterruptedException{
        Scanner Myscan2 = new Scanner(System.in);
        TimeUnit.SECONDS.sleep(1);
        System.out.println("\nChoose your next action");
        System.out.println("Enter 'M' to move on, and 'H' to heal yourself. ");
        String action = Myscan2.nextLine();
        TimeUnit.SECONDS.sleep(2);
        if (action.charAt(0) == 'M'){
            Random rand = new Random();
            int safeTrip = rand.nextInt(3) + 1;
            switch (safeTrip) {
                case 1:
                    System.out.println("\nYou find nothing, and continue on.");
                    adventure newtravels = new adventure();
                    newtravels.travels(playerhealth);
                    break;
                case 2:
                    System.out.println("\nYou are attacked by an enemy!");
                    attacked battle1 = new attacked();
                    battle1.attacker(playerhealth);
                    break;
                case 3:
                    if (playerhealth < 250){
                        System.out.println("\nYou find an object on the ground. Touching it makes you feel stronger, and powerful.");
                        playerhealth = playerhealth + 25;
                    }else{
                        System.out.println("\nYou find an object on the ground. After touching it, it instantly shatters.");
                    }
                    newtravels = new adventure();
                    newtravels.travels(playerhealth);
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + safeTrip);
            }
        }
    }
}
