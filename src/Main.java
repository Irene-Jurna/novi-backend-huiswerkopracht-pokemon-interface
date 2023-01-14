import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

// Opdracht: Een main-klasse met een main-methode

/* Vragen over de opdracht:

1) Waar zijn de pokemons van de GymOwner gedefinieerd? Zijn dat nu dezelfde als die ik krijg als PokemonTrainer (hieronder gedefinieerd in main)? Zo ja, hoe kan ik de GymOwner andere pokemons toekennen?
2) Ik heb nu voor mijn gevoel veel dezelfde code geschreven om health points af te trekken en te printen. Kan dit korter? (bijv. door methodes te gebruiken?) En zo ja, hoe?
3) Als ik als PokemonTrainer win, loopt het programma goed. Maar als de PokemonGymOwner wint, dan loopt het programma 1 ronde teveel door (ik zie wel dat mijn pokemon's health points in de min staan, maar kan nog wel 1 ronde spelen voordat het programma zegt dat ik verslagen ben). Hoe kan ik deze fout oplossen?

 */

public class Main {
    // Kleurenset
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";

    // Dit zijn de Pokemons die je tot je beschikking hebt
    // Waarom worden deze boven de main-methode gezet? 
    private static final FirePokemon charizard = new FirePokemon("Charrizard", 76, 150, "firenougats", "GRRRRRRRRRRRRRRR");
    private static final WaterPokemon blastoise = new WaterPokemon("Blastoise", 40, 110, "Pokeflakes", "Blaaaaasssssstooooiiiiissss");
    private static final GrassPokemon venusaur = new GrassPokemon("Venusaur", 50, 135, "Pokeleafs", "Veeeeeeeeennnnnuuuuuusaur");
    private static final GrassPokemon ditto = new GrassPokemon("Ditto", 60, 140, "Everything", "Dittto diiiito ");
    private static final ElectricPokemon raichu = new ElectricPokemon("Raichu", 80, 160, "Pokebrocks", "Raaaaiiiiicccchhhhuuuuuuu!!!!");
    private static final WaterPokemon gyarados = new WaterPokemon("Gyarados", 90, 180, "Pokeflakes", "Gyaaaaaaaaarrrraaaadoooos");

    private static List<Pokemon> pokemons = Arrays.asList(charizard, blastoise, venusaur, ditto, raichu, gyarados);

    // Main-methode
    public static void main(String[] args) {

        // Test Bonusopdracht 1 (zie methode in abstracte klasse Pokemon)
//        charizard.foodBoost(charizard, charizard.getFood());

        Scanner speler_A = new Scanner(System.in);
        PokemonGymImpl pokemonGym = new PokemonGymImpl(pokemons);
        System.out.println("First player please enter your name: ");
        String userA = speler_A.nextLine();
        PokemonTrainer player1 = new PokemonTrainer(userA, pokemons);
        System.out.println("To start your game, we have given you 6 Pokemons use");
        System.out.println("these are the Pokemons you get:");
        pokemonGym.printPokemon(pokemons);
        System.out.println("Would you like to enter a gym looking for a fight?");
        System.out.println("Please enter yes or no");
        if (speler_A.nextLine().equals("yes")) {
            pokemonGym.enteredTheGym(player1);
        }
    }
}
