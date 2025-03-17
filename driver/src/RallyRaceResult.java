// 6. RallyRaceResult.java (Implements RaceResult)
import java.util.HashMap;
import java.util.Map;

class RallyRaceResult implements RaceResult {
    private String raceName;
    private Map<Driver, Integer> results = new HashMap<>();

    public RallyRaceResult(String raceName) {
        this.raceName = raceName;
    }

    @Override
    public void recordResult(Driver driver, int points) {
        results.put(driver, points);
        driver.addPoints(points);
    }

    @Override
    public void showResults() {
        System.out.println("Race: " + raceName);
        results.forEach((driver, points) ->
                System.out.println(driver.getName() + " - " + points + " points"));
    }
}
