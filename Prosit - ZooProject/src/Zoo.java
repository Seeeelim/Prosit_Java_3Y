public class Zoo
{
    Animal[] animals;
    public String name;
    public String city;
    public int nbCages;
    public int nbAnimal;

    //static final int NUMBER_CAGES = 25;

    public Zoo(String city, String name, int nbCages)
    {
        animals = new Animal[nbCages];
        this.city = city;
        this.name = name;
        this.nbCages = nbCages;
    }

    public void displayZoo()
    {
        System.out.println("Zoo Name: " + name);
        System.out.println("City: " + city);
        System.out.println("Number of Cages: " + nbCages);
    }

    @Override
    public String toString()
    {
        return "Animal [name=" + name + ", city=" + city + ", nbCages=" + nbCages + ", animals=" + java.util.Arrays.toString(animals) + "]";
    }

    public boolean addAnimal(Animal animal)
    {
        if (nbAnimal == nbCages)
        {
            return false;
        }

        animals[nbAnimal] = animal;
        nbAnimal++;
        return true;
    }
}