package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Zoo;
import tn.esprit.gestionzoo.entities.Aquatic;
import tn.esprit.gestionzoo.entities.Terrestrial;
import tn.esprit.gestionzoo.entities.Dolphin;
import tn.esprit.gestionzoo.entities.Penguin;
import tn.esprit.gestionzoo.entities.ZooFullException;

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

        try{
            Zoo1.addAnimal(lion);
            Zoo1.addAnimal(renard);
            Zoo1.addAnimal(baleine);
        } catch (ZooFullException e) {
            System.out.println(e.getMessage());
        }

        Zoo1.displayAnimaux();

        Zoo1.removeAnimal(renard);

        Zoo1.displayZoo();
        Zoo1.displayAnimaux();

        System.out.println("L'animal recherché se trouve dans la position : ");
        System.out.println(Zoo1.searchAnimal(baleine));

        Zoo1.isZooFull();

        Zoo Zoo2 = new tn.esprit.gestionzoo.entities.Zoo("Michigan", "Patron");
        try{
            Zoo2.addAnimal(lion);
            Zoo2.addAnimal(renard);
            Zoo2.addAnimal(baleine);
        } catch (ZooFullException e) {
            System.out.println(e.getMessage());
        }

        Zoo Zoo3 = Zoo1.comparerZoo(Zoo1, Zoo2);

        //System.out.println(Zoo1.toString());

        // Création des instances avec constructeurs par défaut

        Aquatic aquaticAnimal = new Dolphin();
        Terrestrial terrestrialAnimal = new Terrestrial();
        Dolphin dolphin = new Dolphin();
        Penguin penguin = new Penguin();

        // Affichage des objets (affichera par défaut les références car toString() n'est pas encore redéfini)
        System.out.println(aquaticAnimal);
        System.out.println(terrestrialAnimal);
        System.out.println(dolphin);
        System.out.println(penguin);

        // Création des instances avec des constructeurs paramétrés
        Aquatic aquaticAnimals = new Dolphin("marin", "Aquacc", "ocean", 0, true , 0.2f);
        Terrestrial terrestrialAnimals = new Terrestrial("Terrestrialss", "Mouse", 20, true, 4);
        Dolphin dolphins = new Dolphin("Dolphinss", "dessinn", "Mer", 7, false , 35.2f);
        Penguin penguins = new Penguin("Penguinss", "Pingsss", "Antarctica", 14, false, 30.02f);

        // Affichage des objets (appel de toString() automatiquement)
        System.out.println(aquaticAnimals);
        System.out.println(terrestrialAnimals);
        System.out.println(dolphins);
        System.out.println(penguins);

        aquaticAnimals.swim();  // Appel à la méthode swim() de Aquatic
        dolphins.swim();        // Appel à la méthode swim() de Dolphin
        penguins.swim();        // Appel à la méthode swim() hérité de Aquatic
    }
}