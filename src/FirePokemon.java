import java.util.Arrays;
import java.util.List;

// Opdracht: 4 subklassen die, naast alles dat ze erven, zelf ook minimaal 2 private final variabelen, 1 constructor, 4 methodes, 1 getter bevatten;
// Note: mijn 4 subklassen (Fire-, Grass-, Electric- en WaterPokemon hebben 2 getters. Hoe had ik hier 1 van kunnen maken?)
public class FirePokemon extends Pokemon {
    private final String type;
    private final List<String> attacks = Arrays.asList("inferno", "pyroBall", "fireLash", "flameThrower");

    public FirePokemon(String name, int level, int healthPoints, String food, String sound) {
        super(name, level, healthPoints, food, sound);
        this.type = "fire";
    }

    @Override
    public String getType() {
        return type;
    }

    public List<String> getAttacks() {
        return attacks;
    }

    // Kan je hier Pokemon pokemon vervangen voor this?
    // Beter .concat-method gebruiken?
    void inferno(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() + " with inferno");
        switch (gymPokemon.getType()) {
            case "grass":
                gymPokemon.setHp(gymPokemon.getHp() -50);
                System.out.println(gymPokemon.getName() + " loses 50 health points!");
                break;

            case "water":
                gymPokemon.setHp(gymPokemon.getHp() -40);
                System.out.println(gymPokemon.getName() + " loses 40 health points!");
                break;

            case "electric":
                gymPokemon.setHp(gymPokemon.getHp() -30);
                System.out.println(gymPokemon.getName() + " loses 30 health points!");
                break;

            case "fire":
                gymPokemon.setHp(gymPokemon.getHp() -10);
                System.out.println(gymPokemon.getName() + " loses 10 health points!");
                break;
        }
        System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHp() + " health points left.");
    }

    void pyroBall(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() + " with pyroBall");
        switch (gymPokemon.getType()) {
            case "grass":
                gymPokemon.setHp(gymPokemon.getHp() -50);
                System.out.println(gymPokemon.getName() + " loses 50 health points!");
                break;

            case "water":
                gymPokemon.setHp(gymPokemon.getHp() -30);
                System.out.println(gymPokemon.getName() + " loses 30 health points!");
                break;

            case "electric":
                gymPokemon.setHp(gymPokemon.getHp() -20);
                System.out.println(gymPokemon.getName() + " loses 20 health points!");
                break;

            case "fire":
                gymPokemon.setHp(gymPokemon.getHp() -5);
                System.out.println(gymPokemon.getName() + " loses 5 health points!");
                break;
        }
        System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHp() + " health points left.");
    }

    void fireLash(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() + " with fireLash");
        switch (gymPokemon.getType()) {
            case "grass":
                gymPokemon.setHp(gymPokemon.getHp() -65);
                System.out.println(gymPokemon.getName() + " loses 65 health points!");
                break;

            case "water":
                gymPokemon.setHp(gymPokemon.getHp() -45);
                System.out.println(gymPokemon.getName() + " loses 45 health points!");
                break;

            case "electric":
                gymPokemon.setHp(gymPokemon.getHp() -35);
                System.out.println(gymPokemon.getName() + " loses 35 health points!");
                break;

            case "fire":
                gymPokemon.setHp(gymPokemon.getHp() -15);
                System.out.println(gymPokemon.getName() + " loses 15 health points!");
                break;
        }
        System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHp() + " health points left.");
    }

    void flameThrower(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() + " with flameThrower");
        switch (gymPokemon.getType()) {
            case "grass":
                gymPokemon.setHp(gymPokemon.getHp() -60);
                System.out.println(gymPokemon.getName() + " loses 60 health points!");
                break;

            case "water":
                gymPokemon.setHp(gymPokemon.getHp() -40);
                System.out.println(gymPokemon.getName() + " loses 40 health points!");
                break;

            case "electric":
                gymPokemon.setHp(gymPokemon.getHp() -30);
                System.out.println(gymPokemon.getName() + " loses 30 health points!");
                break;

            case "fire":
                gymPokemon.setHp(gymPokemon.getHp() -10);
                System.out.println(gymPokemon.getName() + " loses 10 health points!");
                break;
        }
        System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHp() + " health points left.");
    }
}