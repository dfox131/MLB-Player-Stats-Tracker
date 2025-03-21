import java.util.Map;

public class Player {
    private String name;
    private String team;
    private String position;
    private Map<String, Object> stats; // A Map to hold player stats (e.g., batting average, home runs)

    // Constructor to initialize a Player object
    public Player(String name, String team, String position, Map<String, Object> stats) {
        this.name = name;
        this.team = team;
        this.position = position;
        this.stats = stats;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for team
    public String getTeam() {
        return team;
    }

    // Setter for team
    public void setTeam(String team) {
        this.team = team;
    }

    // Getter for position
    public String getPosition() {
        return position;
    }

    // Setter for position
    public void setPosition(String position) {
        this.position = position;
    }

    // Getter for stats
    public Map<String, Object> getStats() {
        return stats;
    }

    // Setter for stats
    public void setStats(Map<String, Object> stats) {
        this.stats = stats;
    }

}
