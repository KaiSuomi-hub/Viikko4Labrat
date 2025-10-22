package viikko4.lab;

public class Bike extends Vehicle {

    private final double speedKmPerHour;

    public Bike(String name, double speedKmPerHour) {
        super(name);
        if (speedKmPerHour <= 0) {
            throw new IllegalArgumentException("Virhe! Nopeus ei saa olla negatiivinen tai nolla.");
        }
        this.speedKmPerHour = speedKmPerHour;
    }

    public double getSpeedKmPerHour() {
        return speedKmPerHour;
    }

    @Override
    public double travelTime(double kilometers) {
        if (kilometers <= 0) {
            throw new IllegalArgumentException("Virhe! Matka ei saa olla negatiivinen.");
        }
        return kilometers / speedKmPerHour; 
    }
}
