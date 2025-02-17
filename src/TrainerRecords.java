import java.util.ArrayList;

public class TrainerRecords {

    private ArrayList<PokemonTrainer> pokemonTrainers;

    public TrainerRecords(){
        pokemonTrainers = new ArrayList<>();
    }

    public void addTrainer(PokemonTrainer pokemonTrainer){
        pokemonTrainers.add(pokemonTrainer);
    }

    public void displayTrainerRecords(){
        System.out.println("=================================");
        System.out.println("Pokemon Trainers");
        System.out.println("---------------------------------");
        for (PokemonTrainer pokemonTrainer : pokemonTrainers){
            System.out.println(pokemonTrainer.getFirstName() + " " + pokemonTrainer.getLastName() +
                    "     " + pokemonTrainer.getSex() + "     " + pokemonTrainer.getAge() + "\n");
        }
        System.out.println("=================================");
    }
}
