import java.util.Arrays;
import java.util.List;

public class ElectricPokemon extends Pokemon {
    private final String type;
    private final List<String> attacks = Arrays.asList("thunderPunch", "electroBall", "thunder", "voltTackle");

    public ElectricPokemon(String name, int level, int healthPoints, String food, String sound) {
        super(name, level, healthPoints, food, sound);
        this.type = "electric";
    }

    public String getType() {
        return type;
    }

    public List<String> getAttacks() {
        return attacks;
    }

    void thunderPunch(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() + " with thunderPunch");
        switch (gymPokemon.getType()) {
            case "water":
                gymPokemon.setHp(gymPokemon.getHp() -60);
                System.out.println(gymPokemon.getName() + " loses 60 health points!");
                break;

            case "grass":
                gymPokemon.setHp(gymPokemon.getHp() -40);
                System.out.println(gymPokemon.getName() + " loses 40 health points!");
                break;

            case "fire":
                gymPokemon.setHp(gymPokemon.getHp() -30);
                System.out.println(gymPokemon.getName() + " loses 30 health points!");
                break;

            case "electric":
                gymPokemon.setHp(gymPokemon.getHp() -10);
                System.out.println(gymPokemon.getName() + " loses 10 health points!");
                break;
        }
        System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHp() + " health points left.");
    }

    void electroBall(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() + " with electroBall");
        switch (gymPokemon.getType()) {
            case "water":
                gymPokemon.setHp(gymPokemon.getHp() -50);
                System.out.println(gymPokemon.getName() + " loses 50 health points!");
                break;

            case "grass":
                gymPokemon.setHp(gymPokemon.getHp() -30);
                System.out.println(gymPokemon.getName() + " loses 30 health points!");
                break;

            case "fire":
                gymPokemon.setHp(gymPokemon.getHp() -10);
                System.out.println(gymPokemon.getName() + " loses 10 health points!");
                break;

            case "electric":
                gymPokemon.setHp(gymPokemon.getHp() -5);
                System.out.println(gymPokemon.getName() + " loses 5 health points!");
                break;
        }
        System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHp() + " health points left.");
    }

    void thunder(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() + " with thunder");
        switch (gymPokemon.getType()) {
            case "water":
                gymPokemon.setHp(gymPokemon.getHp() -60);
                System.out.println(gymPokemon.getName() + " loses 60 health points!");
                break;

            case "grass":
                gymPokemon.setHp(gymPokemon.getHp() -40);
                System.out.println(gymPokemon.getName() + " loses 40 health points!");
                break;

            case "fire":
                gymPokemon.setHp(gymPokemon.getHp() -30);
                System.out.println(gymPokemon.getName() + " loses 30 health points!");
                break;

            case "electric":
                System.out.println("Thunder gives an hp boost to " + gymPokemon.getName() + ". " + gymPokemon.getName() + "'s health points were: " + gymPokemon.getHp() + ".");
                gymPokemon.setHp(gymPokemon.getHp() +25);
                System.out.println("After thunder, " + gymPokemon.getName() + "'s health points raised to: " + gymPokemon.getHp() + "!");
                break;
        }
        System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHp() + " health points left.");
    }

    void voltTackle(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() + " with voltTackle");
        switch (gymPokemon.getType()) {
            case "water":
                gymPokemon.setHp(gymPokemon.getHp() -45);
                System.out.println(gymPokemon.getName() + " loses 45 health points!");
                break;

            case "grass":
                gymPokemon.setHp(gymPokemon.getHp() -35);
                System.out.println(gymPokemon.getName() + " loses 35 health points!");
                break;

            case "fire":
                gymPokemon.setHp(gymPokemon.getHp() -25);
                System.out.println(gymPokemon.getName() + " loses 25 health points!");
                break;

            case "electric":
                gymPokemon.setHp(gymPokemon.getHp() -15);
                System.out.println(gymPokemon.getName() + " loses 15 health points!");
                break;
        }
        System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHp() + " health points left.");
    }
}
