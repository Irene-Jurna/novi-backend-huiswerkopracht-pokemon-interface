import java.util.Arrays;
import java.util.List;

public class WaterPokemon extends Pokemon {
    private final String type;
    private final List<String> attacks = Arrays.asList("surf", "hydroPump", "hydroCanon", "rainDance");

    public WaterPokemon(String name, int level, int healthPoints, String food, String sound) {
        super(name, level, healthPoints, food, sound);
        this.type = "water";
    }

    public String getType() {
        return type;
    }

    public List<String> getAttacks() {
        return attacks;
    }

    void surf(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() + " with surf");
        switch (gymPokemon.getType()) {
            case "fire":
                gymPokemon.setHp(gymPokemon.getHp() -45);
                System.out.println(gymPokemon.getName() + " loses 45 health points!");
                break;

            case "electric":
                gymPokemon.setHp(gymPokemon.getHp() -35);
                System.out.println(gymPokemon.getName() + " loses 35 health points!");
                break;

            case "grass":
                gymPokemon.setHp(gymPokemon.getHp() -25);
                System.out.println(gymPokemon.getName() + " loses 25 health points!");
                break;

            case "water":
                gymPokemon.setHp(gymPokemon.getHp() -15);
                System.out.println(gymPokemon.getName() + " loses 15 health points!");
                break;
        }
        System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHp() + " health points left.");
    }

    void hydroPump(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() + " with hydroPump");
        switch (gymPokemon.getType()) {
            case "fire":
                gymPokemon.setHp(gymPokemon.getHp() -55);
                System.out.println(gymPokemon.getName() + " loses 55 health points!");
                break;

            case "electric":
                gymPokemon.setHp(gymPokemon.getHp() -45);
                System.out.println(gymPokemon.getName() + " loses 45 health points!");
                break;

            case "grass":
                gymPokemon.setHp(gymPokemon.getHp() -35);
                System.out.println(gymPokemon.getName() + " loses 35 health points!");
                break;

            case "water":
                gymPokemon.setHp(gymPokemon.getHp() -25);
                System.out.println(gymPokemon.getName() + " loses 25 health points!");
                break;
        }
        System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHp() + " health points left.");
    }

    void hydroCanon(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() + " with hydroCanon");
        switch (gymPokemon.getType()) {
            case "fire":
                gymPokemon.setHp(gymPokemon.getHp() -40);
                System.out.println(gymPokemon.getName() + " loses 40 health points!");
                break;

            case "electric":
                gymPokemon.setHp(gymPokemon.getHp() -30);
                System.out.println(gymPokemon.getName() + " loses 30 health points!");
                break;

            case "grass":
                gymPokemon.setHp(gymPokemon.getHp() -20);
                System.out.println(gymPokemon.getName() + " loses 20 health points!");
                break;

            case "water":
                gymPokemon.setHp(gymPokemon.getHp() -10);
                System.out.println(gymPokemon.getName() + " loses 10 health points!");
                break;
        }
        System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHp() + " health points left.");
    }

    void rainDance(Pokemon pokemon, Pokemon gymPokemon) {
        if (gymPokemon.getType().equalsIgnoreCase("electric")) {
            System.out.println("Raindance has no effect on " + gymPokemon.getName());
        } else if (gymPokemon.getType().equalsIgnoreCase("grass")) {
            System.out.println("Raindance gives hp boost to" + gymPokemon.getName());
            gymPokemon.setHp(gymPokemon.getHp() +25);
        } else if (gymPokemon.getType().equalsIgnoreCase("water")){
            System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() + " with rainDance");
            gymPokemon.setHp(gymPokemon.getHp() -20);
            System.out.println(gymPokemon.getName() + " loses 20 health points!");
            System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHp() + " health points left.");
        } else if (gymPokemon.getType().equalsIgnoreCase("fire")) {
            System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() + " with rainDance");
            gymPokemon.setHp(gymPokemon.getHp() -30);
            System.out.println(gymPokemon.getName() + " loses 30 health points!");
            System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHp() + " health points left.");
        }
    }
}
