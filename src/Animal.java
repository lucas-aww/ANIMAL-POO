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

    // --- NOUVELLE MÉTHODE STATIQUE ---
    // Elle décrit une règle commune à TOUS les animaux (classe)
    public static void afficherRegle() {
        System.out.println("Règle commune : Tous les animaux ont besoin d'oxygène.");
    }

    // Méthode d'instance (abstraite)
    public abstract void produireSon();
}