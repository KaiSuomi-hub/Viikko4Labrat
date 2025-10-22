package viikko4.lab;

public class PowerBank extends Device implements Rechargeable {

    private int battery;

    public PowerBank(String name, Integer b) {
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

    public void recharge(Integer minutes) {
        if (minutes == null || minutes < 0) {
            throw new IllegalArgumentException("Virheellinen latausaika!");
        }
        battery += minutes;
        if (battery > 100) {
            battery = 100;
        }
    }

    public void discharge(Integer minutes) {
        if (minutes == null || minutes < 0) {
            throw new IllegalArgumentException("Virheellinen purkuaika!");
        }
        battery -= minutes / 3;
        if (battery < 0) {
            battery = 0;
        }
    }


}