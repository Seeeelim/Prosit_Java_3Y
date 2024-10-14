package tn.esprit.gestionzoo.entities;

public class Dolphin extends Aquatic
{
    private float swimmingSpeed;

    public Dolphin(){}

    public Dolphin(String habitat, String family, String name, int age, boolean isMammal, float swimmingSpeed){
        super(habitat, family, name, age, isMammal);
        this.swimmingSpeed = swimmingSpeed;
    }

    public float getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(float swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

    @Override
    public String toString(){
        return "Dolphin [family=" + getFamily() + ", name=" + getName() + ", age=" + getAge() + ", isMammal=" + isMammal() + ", habitat=" + getHabitat() + ", swimmingSpeed=" + swimmingSpeed + "]";
    }

    public void swim(){
        System.out.println(getName() + " is swimming.");
    }
}
