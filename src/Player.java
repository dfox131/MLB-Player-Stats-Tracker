public class Player {

    private String playerId;
    private String name;
    private int age;
    private String team;
    private String league;
    private double war;
    private int gamesPlayed;
    private int plateAppearances;
    private int atBats;
    private int runs;
    private int hits;
    private int doubles;
    private int triples;
    private int homeRuns;
    private int rbi;
    private int stolenBases;
    private int caughtStealing;
    private int walks;
    private int strikeouts;
    private double battingAverage;
    private double onBasePercentage;
    private double sluggingPercentage;
    private double ops;
    private int opsPlus;
    private double rOBA;
    private int rbatPlus;
    private int totalBases;
    private int gidp;
    private int hitByPitch;
    private int sacrificeHits;
    private int sacrificeFlies;
    private int intentionalWalks;

    // Constructor
    public Player(String playerId, String name, int age, String team, String league, double war, int gamesPlayed,
            int plateAppearances, int atBats, int runs, int hits, int doubles, int triples,
            int homeRuns, int rbi, int stolenBases, int caughtStealing, int walks, int strikeouts,
            double battingAverage, double onBasePercentage, double sluggingPercentage, double ops,
            int opsPlus, double rOBA, int rbatPlus, int totalBases, int gidp, int hitByPitch,
            int sacrificeHits, int sacrificeFlies, int intentionalWalks) {
        this.playerId = playerId;
        this.name = name;
        this.age = age;
        this.team = team;
        this.league = league;
        this.war = war;
        this.gamesPlayed = gamesPlayed;
        this.plateAppearances = plateAppearances;
        this.atBats = atBats;
        this.runs = runs;
        this.hits = hits;
        this.doubles = doubles;
        this.triples = triples;
        this.homeRuns = homeRuns;
        this.rbi = rbi;
        this.stolenBases = stolenBases;
        this.caughtStealing = caughtStealing;
        this.walks = walks;
        this.strikeouts = strikeouts;
        this.battingAverage = battingAverage;
        this.onBasePercentage = onBasePercentage;
        this.sluggingPercentage = sluggingPercentage;
        this.ops = ops;
        this.opsPlus = opsPlus;
        this.rOBA = rOBA;
        this.rbatPlus = rbatPlus;
        this.totalBases = totalBases;
        this.gidp = gidp;
        this.hitByPitch = hitByPitch;
        this.sacrificeHits = sacrificeHits;
        this.sacrificeFlies = sacrificeFlies;
        this.intentionalWalks = intentionalWalks;

    }

    // Getters and Setters
    public String getPlayerId() {
        return playerId;
    }

    public void setPlayerId(String playerId) {
        this.playerId = playerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getLeague() {
        return league;
    }

    public void setLeague(String league) {
        this.league = league;
    }

    public double getWar() {
        return war;
    }

    public void setWar(double war) {
        this.war = war;
    }

    public int getGamesPlayed() {
        return gamesPlayed;
    }

    public void setGamesPlayed(int gamesPlayed) {
        this.gamesPlayed = gamesPlayed;
    }

    public int getPlateAppearances() {
        return plateAppearances;
    }

    public void setPlateAppearances(int plateAppearances) {
        this.plateAppearances = plateAppearances;
    }

    public int getAtBats() {
        return atBats;
    }

    public void setAtBats(int atBats) {
        this.atBats = atBats;
    }

    public int getRuns() {
        return runs;
    }

    public void setRuns(int runs) {
        this.runs = runs;
    }

    public int getHits() {
        return hits;
    }

    public void setHits(int hits) {
        this.hits = hits;
    }

    public int getDoubles() {
        return doubles;
    }

    public void setDoubles(int doubles) {
        this.doubles = doubles;
    }

    public int getTriples() {
        return triples;
    }

    public void setTriples(int triples) {
        this.triples = triples;
    }

    public int getHomeRuns() {
        return homeRuns;
    }

    public void setHomeRuns(int homeRuns) {
        this.homeRuns = homeRuns;
    }

    public int getRbi() {
        return rbi;
    }

    public void setRbi(int rbi) {
        this.rbi = rbi;
    }

    public int getStolenBases() {
        return stolenBases;
    }

    public void setStolenBases(int stolenBases) {
        this.stolenBases = stolenBases;
    }

    public int getCaughtStealing() {
        return caughtStealing;
    }

    public void setCaughtStealing(int caughtStealing) {
        this.caughtStealing = caughtStealing;
    }

    public int getWalks() {
        return walks;
    }

    public void setWalks(int walks) {
        this.walks = walks;
    }

    public int getStrikeouts() {
        return strikeouts;
    }

    public void setStrikeouts(int strikeouts) {
        this.strikeouts = strikeouts;
    }

    public double getBattingAverage() {
        return battingAverage;
    }

    public void setBattingAverage(double battingAverage) {
        this.battingAverage = battingAverage;
    }

    public double getOnBasePercentage() {
        return onBasePercentage;
    }

    public void setOnBasePercentage(double onBasePercentage) {
        this.onBasePercentage = onBasePercentage;
    }

    public double getSluggingPercentage() {
        return sluggingPercentage;
    }

    public void setSluggingPercentage(double sluggingPercentage) {
        this.sluggingPercentage = sluggingPercentage;
    }

    public double getOps() {
        return ops;
    }

    public void setOps(double ops) {
        this.ops = ops;
    }

    public int getOpsPlus() {
        return opsPlus;
    }

    public void setOpsPlus(int opsPlus) {
        this.opsPlus = opsPlus;
    }

    public double getROBA() {
        return rOBA;
    }

    public void setROBA(double rOBA) {
        this.rOBA = rOBA;
    }

    public int getRbatPlus() {
        return rbatPlus;
    }

    public void setRbatPlus(int rbatPlus) {
        this.rbatPlus = rbatPlus;
    }

    public int getTotalBases() {
        return totalBases;
    }

    public void setTotalBases(int totalBases) {
        this.totalBases = totalBases;
    }

    public int getGidp() {
        return gidp;
    }

    public void setGidp(int gidp) {
        this.gidp = gidp;
    }

    public int getHitByPitch() {
        return hitByPitch;
    }

    public void setHitByPitch(int hitByPitch) {
        this.hitByPitch = hitByPitch;
    }

    public int getSacrificeHits() {
        return sacrificeHits;
    }

    public void setSacrificeHits(int sacrificeHits) {
        this.sacrificeHits = sacrificeHits;
    }

    public int getSacrificeFlies() {
        return sacrificeFlies;
    }

    public void setSacrificeFlies(int sacrificeFlies) {
        this.sacrificeFlies = sacrificeFlies;
    }

    public int getIntentionalWalks() {
        return intentionalWalks;
    }

    public void setIntentionalWalks(int intentionalWalks) {
        this.intentionalWalks = intentionalWalks;
    }

}
