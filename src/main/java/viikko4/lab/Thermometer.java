package viikko4.lab;

public class Thermometer implements Measurable {

    private final double celsius;

    public Thermometer(Double celsius) {
        if (celsius == null) {
            throw new IllegalArgumentException("Virhe! Lämpötila ei saa olla tyhjä.");
        }
        this.celsius = celsius;
    }

    @Override
    public double measure() {
        return celsius;
    }


}