public class Cat extends Animal implements Pet {

    public Cat(String espece, String couleur, int poids) {
        super(espece, couleur, poids);
    }

    @Override
    public void produireSon() {
        System.out.println("Miaou !");
    }

    @Override
    public void eat() {
        System.out.println("Le chat mange des croquettes et du thon.");
    }

    @Override
    public void play() {
        System.out.println("Le chat poursuit une balle !");
    }

    public void testerAcces() {
        System.out.println("=== Dans Cat ===");
        System.out.println("Public : " + espece);
        System.out.println("Protected : " + couleur);
        System.out.println("Private via getter : " + getPays());
    }
}