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

    // --- VERSION 1 de eat() : Sans paramètre ---
    public void eat() {
        System.out.println("Miam, je mange de la nourriture classique.");
    }

    // --- VERSION 2 de eat() : AVEC paramètre (Surcharge) ---
    public void eat(String nourriture) {
        System.out.println("Miam, je mange " + nourriture);
    }

    // Méthode ABSTRAITE
    public abstract void produireSon();
}