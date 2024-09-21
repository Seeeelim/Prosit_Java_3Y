public class Zoo
{
    Animal[] animals;
    String name;
    String city;
    int nbCages;

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
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Zoo [name=").append(name)
                .append(", city=").append(city)
                .append(", nbCages=").append(nbCages)
                .append(", animals=").append(java.util.Arrays.toString(animals))
                .append("]");
        return sb.toString();
    }
}