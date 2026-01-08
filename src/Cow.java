public class Cow extends Animal {

    public Cow(String nom, int age) {
        super(nom, age);
    }

    @Override
    public void produireSon() {
        System.out.println("Meuh !");
    }
}