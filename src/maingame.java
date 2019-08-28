import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
/// TODO: add experience?

public class maingame {
    ///constantly changing variables go here

    public static void main(String[] args)
            throws InterruptedException {
        System.out.println("\n\n ______            _        _______  _______  _        _______  _______  _______ \n" +
                "(  __  \\ |\\     /|( (    /|(  ____ \\(  ___  )( (    /|(  ____ \\(  ____ \\(  ____ )\n" +
                "| (  \\  )| )   ( ||  \\  ( || (    \\/| (   ) ||  \\  ( || (    \\/| (    \\/| (    )|\n" +
                "| |   ) || |   | ||   \\ | || (__    | |   | ||   \\ | || (__    | (__    | (____)|\n" +
                "| |   | || |   | || (\\ \\) ||  __)   | |   | || (\\ \\) ||  __)   |  __)   |     __)\n" +
                "| |   ) || |   | || | \\   || (      | |   | || | \\   || (      | (      | (\\ (   \n" +
                "| (__/  )| (___) || )  \\  || (____/\\| (___) || )  \\  || (____/\\| (____/\\| ) \\ \\__\n" +
                "(______/ (_______)|/    )_)(_______/(_______)|/    )_)(_______/(_______/|/   \\__/\n" +
                "                                                                                 ");
        Scanner Myscan = new Scanner(System.in);
        TimeUnit.SECONDS.sleep(1);
        System.out.println("\n\nDungeoneer, a Java RPG by Vishal Singh");
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
        System.out.println("\n-----------------------------------------------------");
        System.out.println("CHOOSE YOUR CLASS \n\n1: Mage\n2: Warrior\n3: Assassin.");
        System.out.println("-------------------------------------------------------");
        String difficulty = Myscan.nextLine();
        TimeUnit.SECONDS.sleep(1);
        if (difficulty.charAt(0) == '1'){

            System.out.println("\nYou have chosen 'Mage' as your class.");
            PlayerClasses.mage();
            System.out.println("The stats are: " + Arrays.toString(PlayerClasses.sstats));

        }else if (difficulty.charAt(0) == '2'){

            System.out.println("You have chosen 'Warrior' as your class.");
            PlayerClasses.warrior();
            System.out.println("The stats are: " + Arrays.toString(PlayerClasses.sstats));

        }else if (difficulty.charAt(0) == '3') {

            System.out.println("You have chosen 'Assassin' as your class.");
            PlayerClasses.assassin();
            System.out.println("The stats are: " + Arrays.toString(PlayerClasses.sstats));
        }
        System.out.println("You start down the dungeon.");

        adventure.travels();
    }
}