package viikko4.lab;

public final class TravelUtils {

    private TravelUtils() {
        throw new AssertionError("Ei instanssoitavissa");
    }


    public static double sumTravelTimes(Vehicle[] vehicles, Double kilometers) {
        if (vehicles == null || kilometers == null || kilometers <= 0) {
            throw new IllegalArgumentException("Virhe! Taulukko ei saa olla tyhjö ja kilometrimäärän on oltava positiivinen.");
        }

        double total = 0.0;
        for (Vehicle v : vehicles) {
            if (v == null) {
                continue; // ohita tyhjät
            }
            total += v.travelTime(kilometers);
        }
        return total;
    }
    
}
