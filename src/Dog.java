public class Dog extends Animal implements Pet {

    public Dog(String espece, String couleur, int poids) {
        super(espece, couleur, poids);
    }

    @Override
    public void produireSon() {
        System.out.println("Wouf !");
    }

    @Override
    public void eat() {
        System.out.println("Croc croc ! Je mange des os.");
    }

    @Override
    public void play() {
        System.out.println("Le chien rapporte la balle !");
    }

    public void testerAcces() {
        System.out.println("=== Dans Dog ===");
        System.out.println("Public : " + espece);
        System.out.println("Protected : " + couleur);
        System.out.println("Private via getter : " + getPays());
    }
}