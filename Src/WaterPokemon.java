public abstract class WaterPokemon extends PokemonSuper {

    private String surf;
    private String hydroPump;
    private String hydroCanon;
    private String rainDance;


    public WaterPokemon(String name, int level, int hp) {
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
