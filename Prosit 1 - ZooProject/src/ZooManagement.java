// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.Scanner;

public class ZooManagement
{
    public int nbCages;
    public String zooName;


    public static void main(String[] args)
    {
        ZooManagement z = new ZooManagement();

        z.enterZooDetails();

        System.out.println(z.zooName + " comporte " + z.nbCages + " cages");
    }

    public void enterZooDetails()
    {
        Scanner scanner = new Scanner(System.in);

        // Demande du nom du zoo
        System.out.print("Entrez le nom du zoo : ");
        zooName = scanner.nextLine();

        // Demande du nombre de cages avec validation
        while (true)
        {
            System.out.print("Entrez le nombre de cages : ");
            if (scanner.hasNextInt())
            {
                nbCages = scanner.nextInt();

                if (nbCages > 0)
                {
                    break; // Sortir de la boucle si un nombre valide est saisi
                } else {
                    System.out.println("Veuillez entrer un nombre de cages positif.");
                }
            } else {
                System.out.println("Veuillez entrer un nombre entier valide.");
                scanner.next(); // lit uniquement un mot et arrête la lecture dès qu'il rencontre un espace
            }
        }
    }
}
