public class PokemonTrainer {
    private String firstName;
    private String lastName;
    private String sex;
    private int age;

    public PokemonTrainer(String firstName, String lastName, String sex, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.age = age;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getSex(){
        return sex;
    }

    public int getAge(){
        return age;
    }

    public void displayTrainerInfo(){
        System.out.println("Trainer:\n" + firstName + " " + lastName + "\t\n" + sex + "\t" + age);
    }
}
