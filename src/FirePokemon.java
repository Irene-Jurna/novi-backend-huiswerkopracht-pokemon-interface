import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;

// 4 subklassen die, naast alles dat ze erven, zelf ook minimaal 2 private final variabelen, 1 constructor, 4 methodes, 1 getter bevatten;
public class FirePokemon extends Pokemon {
    private final String type;
    List<String> attacks = Arrays.asList("inferno", "pyroBall", "fireLash", "flameThrower");

    public FirePokemon(String name, int level, int healthPoints, String food, String sound) {
        super(name, level, healthPoints, food, sound);
        this.type = "fire";
    }

    @Override
    public String getType() {
        return type;
    }

    public void setAttacks(List<String> attacks) {
        this.attacks = attacks;
    }

    @Override
    public List<String> getAttacks() {
        return attacks;
    }

    // Kan je hier Pokemon pokemon vervangen voor this?
    void inferno(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() + " with inferno");
    }

    void pyroBall(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() + " with pyroBall");
    }

    void fireLash(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() + " with fireLash");
    }

    void flameThrower(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() + " with flameThrower");
    }
}