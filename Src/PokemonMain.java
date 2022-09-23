public class PokemonMain {

    public static void main(String[] args) {

        ElectricPokemon pikachu = new ElectricPokemon("Pikachu", 120, 280, "pokebrocks", "pika pika","gold", "shocking");
        FirePokemon charmender = new FirePokemon("Charmender", 60, 190, "pokebrocks", "Chaaarrrmanderr",1000, "burning");
        GrassPokemon bellsprout = new GrassPokemon("Bellsprout", 80, 220, "pokebrocks", "ritsel, ritsel", "yellow", "spikey");
        WaterPokemon squirtle = new WaterPokemon("Squirtle", 100, 250, "pokebrocks", "Splash", "sea", "slipery");


        System.out.println(pikachu.toString());
        System.out.println(charmender.toString());
        System.out.println(bellsprout.toString());
        System.out.println(squirtle.toString());

        bellsprout.eats();
        pikachu.speaks();




    }

}
