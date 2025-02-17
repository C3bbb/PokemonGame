public class Main {
    public static void main(String[] args){

        TrainerRecords trainerRecords = new TrainerRecords();

        PokemonTrainer pokemonTrainer = new PokemonTrainer("Ash", "Ketchum", "Male", 10);
        trainerRecords.addTrainer(pokemonTrainer);

        pokemonTrainer = new PokemonTrainer("Misty","Williams", "Female" , 10);
        trainerRecords.addTrainer(pokemonTrainer);

        pokemonTrainer = new PokemonTrainer("Brock","Harrison", "Male",15);
        trainerRecords.addTrainer(pokemonTrainer);

        trainerRecords.displayTrainerRecords();
    }
}
