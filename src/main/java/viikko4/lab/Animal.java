// Vaatimukset: null/tyhjä nimi on virhe; äänimetodit palauttavat täsmälliset merkkijonot; ei tulostuksia.
package viikko4.lab;

public abstract class Animal {

    private final String name;

    protected Animal(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Väärä arvo!");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract String sound();
}
