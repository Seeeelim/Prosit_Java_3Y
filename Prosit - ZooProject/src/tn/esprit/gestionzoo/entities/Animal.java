package tn.esprit.gestionzoo.entities;

public class Animal
{
    public String family;
    public String name;
    public int age;
    public boolean isMammal;

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age > 0){
            this.age = age;
        }
        else{
            System.out.println("The age have to be positive !");
        }
    }

    public boolean isMammal() {
        return isMammal;
    }

    public void setMammal(boolean mammal) {
        isMammal = mammal;
    }

    public Animal()
    {
        this.family = "";
        this.name = "";
        this.age = 0;
        this.isMammal = false;
    }

    public Animal(String family, String name, int age, boolean isMammal)
    {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }

    @Override
    public String toString() {
        return "tn.esprit.gestionzoo.entities.Animal [family=" + family + ", name=" + name + ", age=" + age + ", isMammal=" + isMammal + "]";
    }
}