public abstract class FirePokemon extends PokemonSuper {

    private String inferno;
    private String pyroBall;
    private String fireLash;
    private String flameThrower;

    public FirePokemon(String name, int level, int hp) {
        super(name,level,hp);


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
