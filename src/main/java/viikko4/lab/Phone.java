package viikko4.lab;

public class Phone extends Device implements Rechargeable {

    private int battery;

    public Phone(String name, Integer b) {
        super(name);
        if (b == null || b < 0 || b > 100) {
            throw new IllegalArgumentException("Akkuvirhe!");
        }
        this.battery = b;
    }

    @Override
    public Integer batteryPercent() {
        return battery;
    }
    //käyttö kuluttaa akkua 5 minuutissa 1%
    public void use(Integer minutes) {
        if (minutes == null || minutes < 0) {
            throw new IllegalArgumentException("Virheellinen käyttöaika!");
        }
        int usage = minutes / 5;
        battery -= usage;
        if (battery < 0) {
            battery = 0;
        }
        if (battery > 100) {
            battery = 100;
        }
    }
    //lataus lataa akkua 2 minuutissa 1%

    public void recharge(Integer minutes) {
        if (minutes == null || minutes < 0) {
            throw new IllegalArgumentException("Virheellinen latausaika!");
        }
        
        battery += minutes / 2;
        if (battery > 100) {
            battery = 100;
        }
        if (battery < 0) {
            battery = 0;
        }
    }



    }