package viikko4.lab;

/**
 * L1 —Vaatimukset: nimi ei saa olla null/tyhjä/whitespace; ikä ei saa olla null eikä negatiivinen; virheellisestä
syötteestä heitä IllegalArgumentException. (throw new IllegalArgumentException(”Väärä arvo!”); )
    */
public class Person {

    private final String name;
    private final int age;

    public Person(String name, Integer age) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Väärä arvo!");
        }
        if (age == null || age < 0) {
            throw new IllegalArgumentException("Väärä arvo!");
        }
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }
}
