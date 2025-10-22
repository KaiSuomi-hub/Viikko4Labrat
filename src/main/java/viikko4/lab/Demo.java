package viikko4.lab;

public class Demo {
    public static void main(String[] args) {
        Vehicle[] arr = {
            new Bike("City bike", 20.0),
            null,
            new Car("Sedan", 100.0)
        };

        double total = TravelUtils.sumTravelTimes(arr, 200.0);
        System.out.println("Total hours = " + total); // Expected: 10 + 2 = 12.0
    }
}
