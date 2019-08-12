public class PlayerClasses {
    public static int[] stats = new int[4];
    public static String[] sstats = new String[4];
    /// TODO: add experience levels that change stats?


    public static void mage(){

        sstats[0] = "Damage: 55";
        sstats[1] = "Health: 100";
        sstats[2] = "Agility: 2";
        sstats[3] = "Regeneration: 15";

        stats[0] = 55;
        stats[1] = 100;
        stats[2] = 2;
        stats[3] = 15;

    }

    public static void warrior(){

        sstats[0] = "Damage: 45";
        sstats[1] = "Health: 125";
        sstats[2] = "Agility: 1";
        sstats[3] = "Regeneration: 10";

        stats[0] = 45;
        stats[1] = 125;
        stats[2] = 1;
        stats[3] = 10;

    }

    public static void assassin(){

        sstats[0] = "Damage: 60";
        sstats[1] = "Health: 75";
        sstats[2] = "Agility: 4";
        sstats[3] = "Regeneration: 10";

        stats[0] = 60;
        stats[1] = 75;
        stats[2] = 4;
        stats[3] = 10;

    }

}
