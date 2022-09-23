import org.w3c.dom.DOMStringList;

public class ElectricPokemon extends PokemonSuper {

    private String lightningColor;
    private String habits;


    public ElectricPokemon(String name, int level, int hp, String food, String sound, String lightningColor, String habits) {
        super(name, level, hp, food, sound);
        this.lightningColor = lightningColor;
        this.habits = habits;
    }

    @Override
    public void speaks() {
        System.out.println(getName() + " SCREAMS " + getSound());
    }

    @Override
    public void eats() {
        System.out.println(getName() + " eats " + getFood());
    }


    public void thunderpunch() {
        System.out.println(getName() + " uses thunderpunch");
    }

    public void electroBall() {
        System.out.println(getName() + " uses electroball");
    }

    public void thunder() {
        System.out.println(getName() + " uses thunder");
    }

    public void voltTackle() {
        System.out.println(getName() + " uses voltTackle");
    }
}
