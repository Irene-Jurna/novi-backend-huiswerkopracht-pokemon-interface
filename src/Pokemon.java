// Opdracht: Een abstract super klasse met 5 private final variabelen, 1 private variabele, 1 constructor, 6 getters en 1 setter;

import java.util.List;

// 1 abstract super klasse
public abstract class Pokemon {

    // Opdracht: 5 private final variabelen + 1 private variabele
    // Note: ik heb 4 private final variabelen en 2 private variabelen. Hoe had ik hier 5 private final en 1 private van kunnen maken?
    private final int level;
    private final String food;
    private final String sound;
    private String type;
    private final String name;
    private int hp;

    // 1 Constructor
    public Pokemon(String name, int level, int healthPoints, String food, String sound) {
        this.name = name;
        this.level = level;
        this.hp = healthPoints;
        this.food = food;
        this.sound = sound;
    }

    // 6 getters
    public int getLevel() {
        return level;
    }

    public int getHp() {
        return hp;
    }

    public String getFood() {
        return food;
    }

    public String getSound() {
        return sound;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    // 1 setter
    public void setHp(int hp) {
        this.hp = hp;
    }

    // Bonusopdracht 1)
    public void foodBoost(Pokemon pokemon, String food) {
        if (food.equalsIgnoreCase(pokemon.getFood())) {
            pokemon.setHp(pokemon.getHp() + 30);
        }
        System.out.println(pokemon.getName() + " eats " + pokemon.getFood());
        System.out.println(pokemon.getName() + " boosts it's health points to " + pokemon.getHp());
    }
}
