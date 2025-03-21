import java.util.Map;

public class PlayerStats {

    // Method to display the player's stats
    public void displayPlayerStats(Player player) {
        // Check if player is not null
        if (player != null) {
            System.out.println("Player Name: " + player.getName());
            System.out.println("Team: " + player.getTeam());
            System.out.println("Position: " + player.getPosition());

            // Assuming stats are stored in a Map (adjust based on actual Player class)
            Map<String, Object> stats = player.getStats();

            // Displaying batting average and other stats
            System.out.println("Batting Average: " + stats.get("battingAverage"));
            // Add more stats here as needed
        } else {
            System.out.println("Player not found.");
        }
    }

    // Other methods related to player stats can go here
}
