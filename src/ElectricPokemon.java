import java.util.Arrays;
import java.util.List;

public class ElectricPokemon extends Pokemon {
    private final String type;
    List<String> attacks = Arrays.asList("thunderPunch", "electroBall", "thunder", "voltTackle");

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

    public void setAttacks(List<String> attacks) {
        this.attacks = attacks;
    }

    void thunderPunch(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() + " with thunderPunch");
    }

    void electroBall(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() + " with electroBall");
    }

    void thunder(Pokemon pokemon, Pokemon gymPokemon) {
        if (gymPokemon.getType().equalsIgnoreCase("electric")) {
            System.out.println("Thunder gives an hp boost to " + gymPokemon.getName() + ". " + gymPokemon.getName() + "'s health points were: " + gymPokemon.getHp() + ".");
            gymPokemon.setHp(+5);
            System.out.println("After thunder, " + gymPokemon.getName() + "'s health points raised to: " + gymPokemon.getHp() + "!");
        }
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() + " with thunder");
    }

    void voltTackle(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() + " with voltTackle");
    }
}
