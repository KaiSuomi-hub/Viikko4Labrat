package viikko4.lab;
public class DeviceUtils {
    private DeviceUtils(){}
    public static int averageBattery(Device[] ds) {
        if (ds == null || ds.length == 0) {
            throw new IllegalArgumentException("Virheellinen taulukko!");
        }

        int sum = 0;
        int count = 0;
        for (Device d : ds) {
            if (d != null ){
                Integer b = d.batteryPercent();
                if (b != null) {
                    sum += b;
                    count++;
                }
            }
        }
        if (count == 0) {
            throw new IllegalArgumentException("Ei ladattavia laitteita!");
        }
        return count > 0 ? sum / count : 0;
    }
}