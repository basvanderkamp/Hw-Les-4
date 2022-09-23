public class WaterPokemon extends PokemonSuper {

    private String watertype;
    private String mood;



    public WaterPokemon(String name, int level, int hp, String food, String sound, String watertype, String mood) {
        super(name, level, hp, food, sound);
        this.watertype = watertype;
        this.mood = mood;
    }

    @Override
    public void speaks() {
        System.out.println(getName() + " SCREAMS " + getSound());
    }
    @Override
    public void eats() {
        System.out.println(getName() + " eats " + getFood());
    }



    public void surf() {
        System.out.println(getName() + " uses surf");
    }

    public void hydroPump() {
        System.out.println(getName() + " uses hydropump");
    }

    public void hydroCanon() {
        System.out.println(getName() + " uses hydrocanon");
    }

    public void leaveBlade() {
        System.out.println(getName() + " uses leaveblade ");
    }

    public String toString() {
        return("the name of this pokemon is " + getName() + " his level is " + getLevel() + " and he has " + getHp() + " Healdpoints " + " give him some " + getFood() + ". "+ getName() + " says: " + getSound() + ". " + "he lives in the " + watertype + ". his mood is " + mood);
    }
}
