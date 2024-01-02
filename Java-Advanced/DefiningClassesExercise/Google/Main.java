package DefiningClassesExercise.Google;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //име на човека -> данни
        HashMap<String, Person> personData = new HashMap<>();
        String input = scanner.nextLine();

        while(!input.equals("End")) {
            String [] parameters = input.split("\\s+");
            String name = parameters[0];
            if(!personData.containsKey(name)) {
                personData.put(name, new Person());
            }
            String enteredData = parameters[1]; //company, pokemon, parents, children, car

            switch (enteredData) {
                case "company":
                    //•	[<Name>, "company", <companyName>, <department>, "34"] -> 5 парам
                    String companyName = parameters[2];
                    String department = parameters[3];
                    double salary = Double.parseDouble(parameters[4]);
                    Company company = new Company(companyName, department, salary);
                    personData.get(name).setCompany(company);
                    break;
                case "pokemon":
                    //•	[<Name>, pokemon, <pokemonName>, <pokemonType>] -> 4 парам
                    String pokemonName = parameters[2];
                    String pokemonType = parameters[3];
                    Pokemon pokemon = new Pokemon(pokemonName, pokemonType);
                    personData.get(name).getPokemons().add(pokemon);
                    break;
                case "parents":
                    //•	[<Name>, parents, <parentName>, <parentBirthday>]" -> 4 парам
                    String parentName = parameters[2];
                    String parentBirthday = parameters[3];
                    Parent parent = new Parent(parentName, parentBirthday);
                    personData.get(name).getParents().add(parent);
                    break;
                case "children":
                    //•	[<Name>, children, <childName>, <childBirthday>]" -> -> 4 парам
                    String childName = parameters[2];
                    String childBirthday = parameters[3];
                    Child child = new Child(childName, childBirthday);
                    personData.get(name).getChildren().add(child);
                    break;
                case "car":
                    //•	[<Name>, car, <carModel>, <carSpeed>] -> -> 4 парам
                    String carModel = parameters[2];
                    int carSpeed = Integer.parseInt(parameters[3]);
                    Car car = new Car(carModel, carSpeed);
                    personData.get(name).setCar(car);
                    break;
            }

            input = scanner.nextLine();
        }
        String searchedPerson = scanner.nextLine();
        System.out.println(searchedPerson);

        Person personalData = personData.get(searchedPerson);
        System.out.println(personalData);

    }
}
