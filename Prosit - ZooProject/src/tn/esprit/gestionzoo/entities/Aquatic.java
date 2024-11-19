package tn.esprit.gestionzoo.entities;
import tn.esprit.gestionzoo.entities.Food;

public abstract non-sealed class Aquatic extends Animal implements Carnivore<Food>
{
    protected String habitat;

    public Aquatic(){}

    public Aquatic(String habitat, String family, String name, int age, boolean isMammal)
    {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return super.toString() + ", habitat=" + habitat;
    }

    /*
    public void swim()
    {
        System.out.println(getName() + " is swimming in " + getHabitat() + ".");
    }
    */

    public abstract void swim();

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass())
        {
            return false;
        }
        Aquatic other = (Aquatic) obj;
        return this.getName().equals(other.getName()) &&
                this.getAge() == other.getAge() &&
                this.habitat.equals(other.habitat);
    }

    @Override
    public void eatMeat(Food meat) {
        if (meat == Food.MEAT) {
            System.out.println(getName() + " is eating meat.");
        } else {
            System.out.println(getName() + " does not eat this type of food.");
        }
    }
}

