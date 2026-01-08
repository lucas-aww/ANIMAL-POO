public class Main {
    public static void main(String[] args) {
        // 1. Création des objets
        Cow maVache = new Cow("Vachette", 4);
        Dog monChien = new Dog("Rex", 2);

        // 2. Test de la Vache
        System.out.println("--- VACHE ---");
        maVache.eat();
        maVache.produireSon();

        // 3. Test du Chien
        System.out.println("\n--- CHIEN ---");
        // Il utilise SON propre eat() (car il l'a redéfini)
        monChien.eat();
        monChien.produireSon();

        System.out.println("\n--- RÈGLE ---");
        Animal.afficherRegle();
    }
}