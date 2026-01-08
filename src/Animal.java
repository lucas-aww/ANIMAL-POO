public abstract class Animal {
    private String nom;
    private int age;

    public Animal(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }

    public String getNom() {
        return nom;
    }

    // Méthode statique : Règle valable pour TOUS
    public static void afficherRegle() {
        System.out.println("Règle : Tous les animaux ont besoin d'oxygène.");
    }

    // C'est la façon de manger "par défaut" si l'enfant ne la change pas.
    public void eat() {
        System.out.println("Miam, je mange de la nourriture classique.");
    }

    // Méthode ABSTRAITE
    public abstract void produireSon();
}