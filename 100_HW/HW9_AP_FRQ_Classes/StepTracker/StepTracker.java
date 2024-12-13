public class StepTracker {
    private int activeDays;
    private int totalDays;
    private int totalSteps;
    private int activeThreshold;

    public StepTracker(int activeThreshold) {
        this.activeThreshold = activeThreshold;
        activeDays = 0;
        totalDays = 0;
        totalSteps = 0;
    }

    public void addDailySteps(int steps) {
        totalSteps += steps;
        totalDays++;

        if (steps >= activeThreshold) {
            activeDays++;
        }
    }

    public int activeDays() {
        return activeDays;
    }

    public double averageSteps() {
        if (totalDays == 0) {
            return 0.0;
        }
        return (double) totalSteps / totalDays;
    }
}
