// 9. Main.java (Main Class to Simulate Championship)
public class Main {
    public static void main(String[] args) {
        ChampionshipManager cm = ChampionshipManager.getInstance();

        Driver d1 = new Driver("Sébastien Ogier", "France");
        Driver d2 = new Driver("Kalle Rovanperä", "Finland");
        Driver d3 = new Driver("Ott Tänak", "Estonia");
        Driver d4 = new Driver("Thierry Neuville", "Belgium");

        cm.registerDriver(d1);
        cm.registerDriver(d2);
        cm.registerDriver(d3);
        cm.registerDriver(d4);

        RallyRaceResult race1 = new RallyRaceResult("Rally Finland");
        race1.recordResult(d1, 25);
        race1.recordResult(d3, 18);
        race1.recordResult(d2, 15);
        race1.recordResult(d4, 12);
        cm.addRace(race1);

        RallyRaceResult race2 = new RallyRaceResult("Monte Carlo Rally");
        race2.recordResult(d2, 25);
        race2.recordResult(d4, 18);
        race2.recordResult(d1, 15);
        race2.recordResult(d3, 12);
        cm.addRace(race2);

        race1.showResults();
        race2.showResults();

        System.out.println("===== CHAMPIONSHIP STATISTICS =====");
        System.out.println("Total Drivers: " + ChampionshipStatistics.getTotalDrivers(cm));
        System.out.println("Total Races: " + ChampionshipStatistics.getTotalRaces(cm));
    }
}
