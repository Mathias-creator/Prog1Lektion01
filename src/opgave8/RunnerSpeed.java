package opgave8;

public class RunnerSpeed {
    public static void main(String[] args) {
        // Given values
        double distanceKm = 15.0; // distance in kilometers
        int minutes = 50;
        int seconds = 30;

        // Convert time to hours
        double timeHours = (minutes * 60 + seconds) / 3600.0;

        // Speed in km/h
        double speedKmPerHour = distanceKm / timeHours;

        // Convert km/h to mph (1 km = 1.6 miles)
        double speedMilesPerHour = speedKmPerHour / 1.6;

        // Print results
        System.out.printf("Speed in km/h: %.2f km/h%n", speedKmPerHour);
        System.out.printf("Speed in mph: %.2f mph%n", speedMilesPerHour);
        // % means number the .2f means two decimals after the result
    }
}

