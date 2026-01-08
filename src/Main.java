import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cow maVache = new Cow("Vache", "Blanche et noire", 500);
        Dog monChien = new Dog("Chien", "Marron", 30);
        Cat monChat = new Cat("Chat", "Roux", 5);

        System.out.println("=== Accès depuis Main ===");
        System.out.println("Public : " + maVache.espece);
        System.out.println("Private via getter : " + maVache.getPays());

        maVache.testerAcces();
        monChien.testerAcces();
        monChat.testerAcces();
        maVache.afficherInfos();

        System.out.println("\n=== Autres méthodes ===");
        maVache.eat();
        maVache.eat("de l'herbe");
        monChien.eat();
        Animal.afficherRegle();

        // --- TEST DE L'INTERFACE AVEC POLYMORPHISME ---
        System.out.println("\n=== Polymorphisme avec Pet ===");

        // Manipulation via référence de type Pet
        Pet pet1 = monChien;
        Pet pet2 = monChat;

        pet1.play();  // Appelle Dog.play()
        pet2.play();  // Appelle Cat.play()

        // --- LISTE D'ANIMAL AVEC CHIENS ET VACHES ---
        System.out.println("\n=== Liste d'Animal avec boucle for ===");

        List<Animal> listeAnimaux = new ArrayList<>();
        listeAnimaux.add(new Cow("Vache", "Blanche", 450));
        listeAnimaux.add(new Dog("Chien", "Noir", 25));
        listeAnimaux.add(new Cow("Vache", "Rouge", 480));
        listeAnimaux.add(new Dog("Chien", "Blanc", 28));
        listeAnimaux.add(new Cat("Chat", "Gris", 4));

        // Boucle for qui parcourt la liste
        for (int i = 0; i < listeAnimaux.size(); i++) {
            Animal animal = listeAnimaux.get(i);
            System.out.println("\nAnimal " + (i + 1) + " :");
            System.out.println("  Espèce : " + animal.espece);
            System.out.println("  Son : ");
            animal.produireSon();
        }

        // --- BOUCLE FOR-EACH (encore plus simple) ---
        System.out.println("\n=== Avec for-each ===");
        for (Animal animal : listeAnimaux) {
            System.out.println("- " + animal.espece + " (" + animal.couleur + ")");
        }
    }
}