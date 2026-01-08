public abstract class Animal {
    public String espece;
    protected String couleur;
    private int poids;

    public Animal(String espece, String couleur, int poids) {
        this.espece = espece;
        this.couleur = couleur;
        this.poids = poids;
    }

    public int getPays() {
        return poids;
    }

    public void afficherInfos() {
        System.out.println("=== Dans Animal ===");
        System.out.println("Public : " + espece);
        System.out.println("Protected : " + couleur);
        System.out.println("Private : " + poids + " kg");
    }

    public static void afficherRegle() {
        System.out.println("Règle : Tous les animaux ont besoin d'oxygène.");
    }

    public void eat() {
        System.out.println("Miam, je mange de la nourriture classique.");
    }

    public void eat(String nourriture) {
        System.out.println("Miam, je mange " + nourriture);
    }

    public abstract void produireSon();
}