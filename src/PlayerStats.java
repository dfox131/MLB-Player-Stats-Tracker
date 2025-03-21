public class PlayerStats {

    public void displayPlayerStats(Player player) {
        if (player != null) {
            System.out.println("Player ID: " + player.getPlayerId());
            System.out.println("Name: " + player.getName());
            System.out.println("Age: " + player.getAge());
            System.out.println("Team: " + player.getTeam());
            System.out.println("League: " + player.getLeague());
            System.out.println("WAR: " + player.getWar());
            System.out.println("Games Played: " + player.getGamesPlayed());
            System.out.println("Plate Appearances: " + player.getPlateAppearances());
            System.out.println("At-Bats: " + player.getAtBats());
            System.out.println("Runs: " + player.getRuns());
            System.out.println("Hits: " + player.getHits());
            System.out.println("Doubles: " + player.getDoubles());
            System.out.println("Triples: " + player.getTriples());
            System.out.println("Home Runs: " + player.getHomeRuns());
            System.out.println("RBIs: " + player.getRbi());
            System.out.println("Stolen Bases: " + player.getStolenBases());
            System.out.println("Caught Stealing: " + player.getCaughtStealing());
            System.out.println("Walks: " + player.getWalks());
            System.out.println("Strikeouts: " + player.getStrikeouts());
            System.out.println("Batting Average: " + player.getBattingAverage());
            System.out.println("On-Base Percentage: " + player.getOnBasePercentage());
            System.out.println("Slugging Percentage: " + player.getSluggingPercentage());
            System.out.println("OPS: " + player.getOps());
            System.out.println("OPS+: " + player.getOpsPlus());
            System.out.println("rOBA: " + player.getROBA());
            System.out.println("rBat+: " + player.getRbatPlus());
            System.out.println("Total Bases: " + player.getTotalBases());
            System.out.println("GIDP (Grounded into Double Play): " + player.getGidp());
            System.out.println("Hit By Pitch: " + player.getHitByPitch());
            System.out.println("Sacrifice Hits: " + player.getSacrificeHits());
            System.out.println("Sacrifice Flies: " + player.getSacrificeFlies());
            System.out.println("Intentional Walks: " + player.getIntentionalWalks());
        } else {
            System.out.println("Player not found.");
        }
    }
}
