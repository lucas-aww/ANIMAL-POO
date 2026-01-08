public class Dog extends Animal {

    public Dog(String nom, int age) {
        super(nom, age);
    }

    @Override
    public void produireSon() {
        System.out.println("Wouf !");
    }

    @Override
    public void eat() {
        System.out.println("Croc croc ! Je mange des os.");
    }
}