import java.util.List;

// Opdracht: 2 "normale" klassen. Waarvan een klasse met 8 variabelen, constructor, getters en setters. De andere klasse extends de eerste klasse en heeft zelf nog 1 variabele, een getter, setter en een constructor die enkel de super aanroept.
// Note: ik heb de 2 "normale" klassen PokemonTrainer en PokemonGymOwner (extends). Hoe krijg ik hier 8 variabelen? (Ik heb er 2).
public class PokemonTrainer {
    private String name;
    private List<Pokemon> pokemons;

    public PokemonTrainer(String name, List<Pokemon> pokemons) {
        this.name = name;
        this.pokemons = pokemons;
    }

    public String getName() {
        return name;
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public void setPokemons(List<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }

}
