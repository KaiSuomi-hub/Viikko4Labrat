package viikko4.lab;

public class Student {

    private String name;
    private Integer credits;

    public Student(String n, Integer c) {
        if (n == null || n.isBlank()) {
            throw new IllegalArgumentException("Väärä arvo!");
        }
        if (c == null || c < 0) {
            throw new IllegalArgumentException("Väärä arvo!");
        }
        this.name = n;
        this.credits = c;
    }

    public String getName() {
        return name;
    }

    public Integer getCredits() {
        return credits;
    }
}
