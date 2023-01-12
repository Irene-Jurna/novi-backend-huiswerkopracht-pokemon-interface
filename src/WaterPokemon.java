import java.util.Arrays;
import java.util.List;

public class WaterPokemon extends Pokemon {
    private final String type;
    List<String> attacks = Arrays.asList("surf", "hydroPump", "hydroCanon", "rainDance");

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

    public void setAttacks(List<String> attacks) {
        this.attacks = attacks;
    }

    void surf(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() + " with surf");
    }

    void hydroPump(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() + " with hydroPump");
    }

    void hydroCanon(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() + " with hydroCanon");
    }

    void rainDance(Pokemon pokemon, Pokemon gymPokemon) {
        if (gymPokemon.getType().equalsIgnoreCase("electric")) {
            System.out.println("Raindance has no effect on " + gymPokemon.getName());
        } else if (gymPokemon.getType().equalsIgnoreCase("grass")) {
            System.out.println("Raindance gives hp boost to" + gymPokemon.getName());
            gymPokemon.setHp(+5);
        } else {
            System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() + " with rainDance");
        }
    }
}
