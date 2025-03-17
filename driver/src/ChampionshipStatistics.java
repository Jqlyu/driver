// 8. ChampionshipStatistics.java (Static Utility Class)
class ChampionshipStatistics {
    public static int getTotalDrivers(ChampionshipManager cm) {
        return cm.getDrivers().size();
    }

    public static int getTotalRaces(ChampionshipManager cm) {
        return cm.getRaces().size();
    }
}
