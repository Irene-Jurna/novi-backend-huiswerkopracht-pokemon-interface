import java.util.Arrays;
import java.util.List;

public class GrassPokemon extends Pokemon{
    private final String type;
    private final List<String> attacks = Arrays.asList("leafStorm", "solarBeam", "leechSeed", "leaveBlade");

    public GrassPokemon(String name, int level, int healthPoints, String food, String sound) {
        super(name, level, healthPoints, food, sound);
        this.type = "grass";
    }

    public String getType() {
        return type;
    }

    public List<String> getAttacks() {
        return attacks;
    }

    public void leafStorm(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() + " with leafStorm");
        switch (gymPokemon.getType()) {
            case "electric":
                gymPokemon.setHp(gymPokemon.getHp() -60);
                System.out.println(gymPokemon.getName() + " loses 60 health points!");
                break;

            case "fire":
                gymPokemon.setHp(gymPokemon.getHp() -40);
                System.out.println(gymPokemon.getName() + " loses 40 health points!");
                break;

            case "water":
                gymPokemon.setHp(gymPokemon.getHp() -30);
                System.out.println(gymPokemon.getName() + " loses 30 health points!");
                break;

            case "grass":
                gymPokemon.setHp(gymPokemon.getHp() -10);
                System.out.println(gymPokemon.getName() + " loses 10 health points!");
                break;
        }
        System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHp() + " health points left.");
    }

    public void solarBeam(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() + " with solarBeam");
        switch (gymPokemon.getType()) {
            case "electric":
                gymPokemon.setHp(gymPokemon.getHp() -30);
                System.out.println(gymPokemon.getName() + " loses 30 health points!");
                break;

            case "fire":
                gymPokemon.setHp(gymPokemon.getHp() -25);
                System.out.println(gymPokemon.getName() + " loses 25 health points!");
                break;

            case "water":
                gymPokemon.setHp(gymPokemon.getHp() -20);
                System.out.println(gymPokemon.getName() + " loses 20 health points!");
                break;

            case "grass":
                gymPokemon.setHp(gymPokemon.getHp() -15);
                System.out.println(gymPokemon.getName() + " loses 15 health points!");
                break;
        }
        System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHp() + " health points left.");
    }

    public void leechSeed(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() + " with leechSeed. \nLeechseed distracks health points from " + gymPokemon.getName() + " and adds those points to " + pokemon.getName());
        gymPokemon.setHp(gymPokemon.getHp() -25);
        pokemon.setHp(pokemon.getHp() +25);
        System.out.println("Current health points: \n" + gymPokemon.getName() + ": " + gymPokemon.getHp() + ".\n" + pokemon.getName() + ": " + pokemon.getHp() + ".");
    }

    public void leaveBlade(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() + " with leaveBlade");
        switch (gymPokemon.getType()) {
            case "electric":
                gymPokemon.setHp(gymPokemon.getHp() -50);
                System.out.println(gymPokemon.getName() + " loses 50 health points!");
                break;

            case "fire":
                gymPokemon.setHp(gymPokemon.getHp() -40);
                System.out.println(gymPokemon.getName() + " loses 40 health points!");
                break;

            case "water":
                gymPokemon.setHp(gymPokemon.getHp() -30);
                System.out.println(gymPokemon.getName() + " loses 30 health points!");
                break;

            case "grass":
                gymPokemon.setHp(gymPokemon.getHp() -20);
                System.out.println(gymPokemon.getName() + " loses 20 health points!");
                break;
        }
        System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHp() + " health points left.");
    }
}
