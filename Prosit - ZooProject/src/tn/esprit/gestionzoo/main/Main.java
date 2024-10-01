package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Zoo;

public class Main
{
    public static void main(String[] args)
    {

        Animal lion = new Animal("Felidae", "Lion", 5, true);
        Animal renard = new Animal("chiien", "Renard", 12, false);
        Animal baleine = new Animal("Marin", "Baleine", 50, true);

        //System.out.print("Enter the city name : ");
        //city = scanner.nextLine();
        Zoo Zoo1 = new Zoo("New York", "Safari");

        lion.setAge(6);
        Zoo1.setName("The new zoo");

        Zoo1.addAnimal(lion);
        Zoo1.addAnimal(renard);
        Zoo1.addAnimal(baleine);

        Zoo1.displayAnimaux();

        Zoo1.removeAnimal(renard);

        Zoo1.displayZoo();
        Zoo1.displayAnimaux();

        System.out.println("L'animal recherché se trouve dans la position : ");
        System.out.println(Zoo1.searchAnimal(baleine));

        Zoo1.isZooFull();

        Zoo Zoo2 = new tn.esprit.gestionzoo.entities.Zoo("Michigan", "Patron");
        Zoo2.addAnimal(lion);
        Zoo2.addAnimal(renard);
        Zoo2.addAnimal(baleine);

        Zoo Zoo3 = Zoo1.comparerZoo(Zoo1, Zoo2);

        //System.out.println(Zoo1.toString());
    }
}