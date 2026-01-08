public class Cow extends Animal {

    // Constructeur
    public Cow(String nom, int age) {
        // Le mot-clé 'super' appelle le constructeur de la classe parente (Animal)
        super(nom, age);
    }

    // On remplace (override) la méthode abstraite pour donner un comportement spécifique
    @Override
    public void produireSon() {
        System.out.println("Meuh !");
    }
}