import java.util.ArrayList;
import java.util.List;

public class Owner {
    private String nom;
    private List<Animal> listeAnimaux;

    public Owner(String nom) {
        this.nom = nom;
        this.listeAnimaux = new ArrayList<>();
    }

    public void ajouterAnimal(Animal animal) {
        listeAnimaux.add(animal);
    }

    public void presenterAnimaux() {
        System.out.println("\n=== Animaux de " + nom + " ===");
        for (Animal animal : listeAnimaux) {
            System.out.println("- " + animal.espece + " : ");
            animal.produireSon();
        }
    }
}