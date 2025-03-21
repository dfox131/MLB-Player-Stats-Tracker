import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DataManager {

    private List<Player> players;
    private PlayerStats playerStats;

    public DataManager() {
        this.players = new ArrayList<>();
        this.playerStats = new PlayerStats();
    }

    public void loadPlayerStats(String filePath) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            br.readLine(); // Skip the header row

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");

                if (data.length < 32) {
                    System.out.println("Skipping invalid row: " + line);
                    continue;
                }

                Player player = createPlayerFromData(data);

                players.add(player);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("Error parsing number: " + e.getMessage());
        }
    }

    private Player createPlayerFromData(String[] data) {
        String playerId = data[0];
        String name = data[1];
        int age = parseInteger(data[2]);
        String team = data[3];
        String league = data[4];
        double war = parseDouble(data[5]);
        int gamesPlayed = parseInteger(data[6]);
        int plateAppearances = parseInteger(data[7]);
        int atBats = parseInteger(data[8]);
        int runs = parseInteger(data[9]);
        int hits = parseInteger(data[10]);
        int doubles = parseInteger(data[11]);
        int triples = parseInteger(data[12]);
        int homeRuns = parseInteger(data[13]);
        int rbi = parseInteger(data[14]);
        int stolenBases = parseInteger(data[15]);
        int caughtStealing = parseInteger(data[16]);
        int walks = parseInteger(data[17]);
        int strikeouts = parseInteger(data[18]);
        double battingAverage = parseDouble(data[19]);
        double onBasePercentage = parseDouble(data[20]);
        double sluggingPercentage = parseDouble(data[21]);
        double ops = parseDouble(data[22]);
        int opsPlus = parseInteger(data[23]);
        double rOBA = parseDouble(data[24]);
        int rbatPlus = parseInteger(data[25]);
        int totalBases = parseInteger(data[26]);
        int gidp = parseInteger(data[27]);
        int hitByPitch = parseInteger(data[28]);
        int sacrificeHits = parseInteger(data[29]);
        int sacrificeFlies = parseInteger(data[30]);
        int intentionalWalks = parseInteger(data[31]);

        return new Player(playerId, name, age, team, league, war, gamesPlayed,
                plateAppearances, atBats, runs, hits, doubles, triples,
                homeRuns, rbi, stolenBases, caughtStealing, walks, strikeouts,
                battingAverage, onBasePercentage, sluggingPercentage, ops,
                opsPlus, rOBA, rbatPlus, totalBases, gidp, hitByPitch,
                sacrificeHits, sacrificeFlies, intentionalWalks);
    }

    // Helper method to parse integers safely
    private int parseInteger(String value) {
        try {
            return value.trim().isEmpty() ? 0 : Integer.parseInt(value.trim());
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    // Helper method to parse doubles safely
    private double parseDouble(String value) {
        try {
            return value.trim().isEmpty() ? 0.0 : Double.parseDouble(value.trim());
        } catch (NumberFormatException e) {
            return 0.0;
        }
    }

    public void displayPlayerStats(Player player) {
        if (player != null) {
            playerStats.displayPlayerStats(player);
            System.out.println();
        } else {
            System.out.println("Player not found.");
        }
    }

    public List<Player> getPlayers() {
        return players;
    }

    public List<Player> getPlayersByTeam(String team) {
        List<Player> teamPlayers = new ArrayList<>();
        for (Player player : players) {
            if (player.getTeam().equals(team)) {
                teamPlayers.add(player);
            }
        }
        return teamPlayers;
    }
}
