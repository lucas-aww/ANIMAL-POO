public class Main {
    public static void main(String[] args) {
        // Création des objets
        Cow maVache = new Cow("Vachette", 4);
        Dog monChien = new Dog("Rex", 2);

        // --- Test de la Vache ---
        System.out.println("--- VACHE ---");
        maVache.eat();                    // Version sans paramètre
        maVache.eat("de l'herbe");        // Version avec paramètre
        maVache.produireSon();

        // --- Test du Chien ---
        System.out.println("\n--- CHIEN ---");
        monChien.eat();                   // Version sans paramètre (redéfinie)
        monChien.eat("des croquettes");   // Version avec paramètre (celle du parent)
        monChien.produireSon();

        // --- Règle ---
        System.out.println("\n--- RÈGLE ---");
        Animal.afficherRegle();
    }
}