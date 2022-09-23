public class FirePokemon extends PokemonSuper {

    private int heat;
    private String mood;


    public FirePokemon(String name, int level, int hp, String sound, String food, int heat, String mood) {
        super(name,level,hp,sound,food);
        this.heat = heat;
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



    public void inferno() {
        System.out.println(getName() + " uses inferno");
    }

    public void pyroBall() {
        System.out.println(getName() + " uses pyroball");
    }

    public void fireLash() {
        System.out.println(getName() + " uses firelash");
    }

    public void flameThrower() {
        System.out.println(getName() + " uses flamethrower");
    }

    public String toString() {
        return("the name of this pokemon is " + getName() + " his level is " + getLevel() + " and he has " + getHp() + " Healdpoints " + " give him some " + getFood() + ". "+ getName() + " says: " + getSound() + ". " + "He is " + heat + " degrees " + " his mood is " + mood);
    }


}
