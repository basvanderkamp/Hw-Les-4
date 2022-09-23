
public abstract class GrassPokemon extends PokemonSuper {

    private String leafStorm;
    private String solarBeam;
    private String leechSeed;
    private String leaveBlade;


    public GrassPokemon(String name, int level, int hp) {
        super(name, level, hp);
    }

    @Override
    public void speaks() {
        System.out.println(getName() + " SCREAMS " + getSound());
    }
    @Override
    public void eats() {
        System.out.println(getName() + " eats " + getFood());
    }
}
