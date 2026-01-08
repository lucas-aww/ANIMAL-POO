public abstract class Animal {
    private String nom;
    private int age;

    // Constructeur
    public Animal(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }

    // Getter pour récupérer le nom
    public String getNom() {
        return nom;
    }

    // Méthode abstraite : chaque animal devra définir son propre son
    public abstract void produireSon();
}