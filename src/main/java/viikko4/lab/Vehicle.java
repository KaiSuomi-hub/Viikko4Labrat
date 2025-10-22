package viikko4.lab;

public abstract class Vehicle {

    private final String name;

    protected Vehicle(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Virhe! Nimi ei saa olla tyhjö.");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract double travelTime(double kilometers);
}
