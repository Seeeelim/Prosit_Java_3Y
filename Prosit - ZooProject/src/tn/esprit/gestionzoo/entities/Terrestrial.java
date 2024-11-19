package tn.esprit.gestionzoo.entities;
import tn.esprit.gestionzoo.entities.Food;

public non-sealed abstract class Terrestrial extends Animal implements Omnivore<Food>
{
    private int nbrLegs;

    public Terrestrial(){}

    public Terrestrial(String family, String name, int age, boolean isMammal, int nbrLegs)
    {
        super(family, name, age, isMammal);
        this.nbrLegs = nbrLegs;
    }

    public int getNbrLegs()
    {
        return nbrLegs;
    }

    public void setNbrLegs(int nbrLegs)
    {
        this.nbrLegs = nbrLegs;
    }

    @Override
    public String toString()
    {
        return super.toString() + ", nbrLegs=" + nbrLegs;
    }

    @Override
    public void eatPlantAndMeat(Food food) {
        if (food == Food.BOTH || food == Food.PLANT || food == Food.MEAT) {
            System.out.println(getName() + " is eating " + food.toString().toLowerCase() + ".");
        } else {
            System.out.println(getName() + " cannot eat this type of food.");
        }
    }
}
