import java.util.Arrays;
import java.util.List;

public class GrassPokemon extends Pokemon{
    private final String type;
    List<String> attacks = Arrays.asList("leafStorm", "solarBeam", "leechSeed", "leaveBlade");

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

    public void setAttacks(List<String> attacks) {
        this.attacks = attacks;
    }

    public void leafStorm(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() + " with leafStorm");
    }

    public void solarBeam(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() + " with solarBeam");
    }

    public void leechSeed(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() + " with leechSeed. \nLeechseed distracks health points from " + gymPokemon.getName() + " and adds those points to " + pokemon.getName());
        gymPokemon.setHp(-5);
        pokemon.setHp(+5);
        System.out.println("Current health points: \n" + gymPokemon.getName() + ": " + gymPokemon.getHp() + ".\n" + pokemon.getName() + ": " + pokemon.getHp() + ".");
    }

    public void leaveBlade(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() + " with leaveBlade");
    }
}
