package tn.esprit.gestionzoo.entities;

public class Zoo
{
    public String name;
    public String city;
    public static final int NB_CAGES = 25;
    public int nbAnimal;
    public Aquatic[] aquaticAnimals = new Aquatic[10];

    Animal[] animals;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name != null) {
            this.name = name;
        }
        else
        {
            System.out.println("Le nom du zoo ne peut pas etre null !");
        }
    }

    public int getNbAnimal() {
        return nbAnimal;
    }

    public void setNbAnimal(int nbAnimal) {
        this.nbAnimal = nbAnimal;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public Zoo(int taille)
    {
        animals = new Animal[taille];
        nbAnimal = 0;
    }

    public Zoo(String city, String name)
    {
        animals = new Animal[NB_CAGES];
        this.city = city;
        this.name = name;
    }

    public void displayZoo()
    {
        System.out.println("tn.esprit.gestionzoo.entities.Zoo Name: " + name);
        System.out.println("City: " + city);
        System.out.println("Number of Cages: " + NB_CAGES);
    }

    @Override
    public String toString()
    {
        return "tn.esprit.gestionzoo.entities.Animal [name=" + name + ", city=" + city + ", nbCages=" + NB_CAGES + ", animals=" + java.util.Arrays.toString(animals) + "]";
    }

    public boolean addAnimal(Animal animal)
    {
        if (searchAnimal(animal) == -1)
        {
            if (isZooFull())
            {
                animals[nbAnimal] = animal;
                nbAnimal++;
                return true;
            }
            else {
                System.out.println("La taille maximale du zoo a été atteinte !");
                return false;
            }
        } else {
            System.out.println("tn.esprit.gestionzoo.entities.Animal est déja existant dans le zoo !");
            return false;

        }
    }

    public void displayAnimaux()
    {
        for(int i = 0; i < nbAnimal; i++)
        {
            System.out.println(animals[i]);
        }
    }

    public int searchAnimal(Animal animal)
    {
        for(int i = 0; i < nbAnimal; i++)
        {
            if (animals[i].name.equals(animal.name))
            {
                return i;
            }
        }
        return -1;
    }

    public boolean removeAnimal(Animal animal)
    {
        int pos = searchAnimal(animal);

        if(pos != -1)
        {
            for(int i = pos; i < nbAnimal - 1; i++)
            {
                animals[i] = animals[i + 1];
            }
            animals[nbAnimal - 1] = null;
            nbAnimal--;
            return true;
        }
        return false;
    }

    public boolean isZooFull()
    {
        if(nbAnimal < NB_CAGES)
        {
            System.out.println("Le zoo n'est pas rempli au maximum !");
            return false;
        }
        else {
            System.out.println("Le zoo est rempli au maximum !");
            return true;
        }
    }

    public Zoo comparerZoo(Zoo z1, Zoo z2)
    {
        int comptZoo1 = 0;
        int comptZoo2 = 0;

        for(int i = 0; i < z1.nbAnimal; i++)
        {
            comptZoo1++;
        }

        for(int i = 0; i < z2.nbAnimal; i++)
        {
            comptZoo2++;
        }

        if(comptZoo1 > comptZoo2)
        {
            System.out.println("Le zoo 1 est plus rempli que le zoo 2");
            return z1;
        }
        else if(comptZoo1 < comptZoo2)
        {
            System.out.println("Le zoo 2 est plus rempli que le zoo 1");
            return z2;
        }
        else{
            System.out.println("Les deux zoo ont la meme quantité d'animaux");
            return null;
        }
    }

    public void addAquaticAnimal(Aquatic aquatic)
    {
        for(int i = 0; i < aquaticAnimals.length; i++)
        {
            if(aquaticAnimals[i] == null)
            {
                aquaticAnimals[i] = aquatic;
                return;
            }
        }
        System.out.println("Plus de place dans les cages d'aquatic.");
    }

    public float maxPenguinSwimmingDepth()
    {
        float maxPenguinSwimmingDepth = 0;

        for(int i = 0; i < aquaticAnimals.length; i++)
        {
            if(aquaticAnimals[i] instanceof Penguin penguin)
            {
                if(maxPenguinSwimmingDepth < penguin.getSwimmingDepth())
                {
                    maxPenguinSwimmingDepth = penguin.getSwimmingDepth();
                }
            }
        }
        return maxPenguinSwimmingDepth;
    }

    public void displayNumberOfAquaticsByType()
    {
        int comptPenguin = 0;
        int comptDoplhin = 0;

        for(int i = 0; i < aquaticAnimals.length; i++)
        {
            if (aquaticAnimals[i] instanceof Penguin penguin)
            {
                comptPenguin++;
            }

            if (aquaticAnimals[i] instanceof Dolphin dolphin)
            {
                comptDoplhin++;
            }
        }
        System.out.println("nb Penguin : " + comptPenguin + "nb Dauphins : " + comptDoplhin);
    }

    /*
    function displaySwimming()
    {

    }
    */
}