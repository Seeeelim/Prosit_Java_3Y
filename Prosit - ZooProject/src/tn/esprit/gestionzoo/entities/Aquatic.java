package tn.esprit.gestionzoo.entities;

public non-sealed class Aquatic extends Animal{
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

    public void swim()
    {
        System.out.println(getName() + " is swimming in " + getHabitat() + ".");
    }
}
