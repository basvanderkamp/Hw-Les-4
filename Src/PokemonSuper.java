public abstract class PokemonSuper {

    private String name;
    private int level;
    private int hp;
    private String food;
    private String sound;

    public PokemonSuper(String name, int level, int hp) {
        this.name = name;
        this.level = level;
        this.hp = hp;

    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public abstract void Speaks();
    public abstract void Eats();


}
