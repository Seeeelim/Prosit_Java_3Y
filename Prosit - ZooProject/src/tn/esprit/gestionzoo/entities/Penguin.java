package tn.esprit.gestionzoo.entities;

public class Penguin extends Aquatic
{
    private float swimmingDepth;

    public Penguin(){}

    public Penguin(String habitat, String family, String name, int age, boolean isMammal, float swimmingDepth)
    {
        super(habitat, family, name, age, isMammal);
        this.swimmingDepth = swimmingDepth;
    }

    public float getSwimmingDepth() {
        return swimmingDepth;
    }

    public void setSwimmingDepth(float swimmingDepth)
    {
        this.swimmingDepth = swimmingDepth;
    }

    @Override
    public String toString(){
        return super.toString() + ", swimmingDepth:" + swimmingDepth;
    }

    @Override
    public void swim(){
        System.out.println("This penguin is swimming");
    }
}
