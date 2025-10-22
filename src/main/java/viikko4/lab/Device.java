package viikko4.lab;

public abstract class Device {
    protected String name;
    public Device(String name){
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Väärä nimimuoto!");
        }
        this.name=name;
    }
    // palauttaa laitteen nimen
    public String getName(){
        return name;
    }
    // Palauttaa laitteen akun varaustason prosentteina
    public abstract Integer batteryPercent();
}