public class Main {
    public static void main(String[] args) {

        Animal lion = new Animal("Felidae", "Lion", 5, true);
        //Animal renard = new Animal("chiien", "Renard", 19, false);

        Zoo myZoo = new Zoo("New York", "Safari Zoo", 25);
        myZoo.animals[0] = lion;

        System.out.println(myZoo);
        System.out.println(myZoo.toString());

        System.out.println(lion);
        System.out.println(lion.toString());
    }
}

