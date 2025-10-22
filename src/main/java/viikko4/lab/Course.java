package viikko4.lab;

public class Course {
    private String name;
    private Double credits;

    public Course(String n, Double c) {
        /* TODO */ this.name = n;
        this.credits = c;
    }

    public String getName() {
        return name;
    }

    public Double getCredits() {
        return credits;
    }
}