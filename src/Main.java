public class Main {

    public static void main(String[] args) {
        String filePath = "../data/2024HitterData.csv";

        DataManager dataManager = new DataManager();

        dataManager.loadPlayerStats(filePath);

        for (Player player : dataManager.getPlayersByTeam("NYM")) {
            dataManager.displayPlayerStats(player);
            System.out.println();
        }
    }
}
