package Java_Advanced._14_DefiningClassesExercise.Google;

public class Pokemon {
    //pokemonName, pokemonType
    private String pokemonName;
    private String pokemonType;

    public Pokemon(String pokemonName, String pokemonType){
        this.pokemonName = pokemonName;
        this.pokemonType = pokemonType;
    }

    @Override
    public String toString() {
        return pokemonName + " " + pokemonType;
    }

}
