
public class GrassPokemon extends PokemonSuper {


    private String leafColor;
    private String mood;


    public GrassPokemon(String name, int level, int hp, String food, String sound, String leafColor, String mood) {
        super(name, level, hp, food, sound);
        this.leafColor = leafColor;
        this.mood = mood;

    }
    @Override
    public void speaks() {
        System.out.println(getName() + " Screams " + getSound());
    }
    @Override
    public void eats() {
        System.out.println(getName() + " doesnt eat, he uses photosynthesis");
    }




    public void leafStorm() {
        System.out.println(getName() + " uses leafstorm");
    }

    public void solarBeam() {
        System.out.println(getName() + " uses solarbeam");
    }

    public void leechSeed() {
        System.out.println(getName() + " uses leechseed");
    }

    public void leaveBlade() {
        System.out.println(getName() + " uses leaveblade");
    }

    public String toString() {
        return("the name of this pokemon is " + getName() + " his level is " + getLevel() + " and he has " + getHp() + " Healdpoints " + " he doesnt eat " + getFood() + ". "+ getName() + " says: " + getSound() + ". " + "his leaves are " + leafColor + ". his mood is " + mood);
    }


}
