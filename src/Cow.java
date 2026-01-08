public class Cow extends Animal {

    public Cow(String espece, String couleur, int poids) {
        super(espece, couleur, poids);
    }

    @Override
    public void produireSon() {
        System.out.println("Meuh !");
    }

    public void testerAcces() {
        System.out.println("=== Dans Cow ===");
        System.out.println("Public : " + espece);
        System.out.println("Protected : " + couleur);
        System.out.println("Private via getter : " + getPays());
    }
}