import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {

        Animal lion = new Animal("Felidae", "Lion", 5, true);
        Animal renard = new Animal("chiien", "Renard", 12, false);
        Animal baleine = new Animal("Marin", "Baleine", 50, true);

        //System.out.print("Enter the city name : ");
        //city = scanner.nextLine();
        Zoo Zoo1 = new Zoo("New York", "Safari Zoo");
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

        Zoo Zoo2 = new Zoo("Michigan", "Patron");
        Zoo2.addAnimal(lion);
        Zoo2.addAnimal(renard);
        Zoo2.addAnimal(baleine);

        Zoo Zoo3 = Zoo1.comparerZoo(Zoo1, Zoo2);

        //System.out.println(Zoo1.toString());
    }
}