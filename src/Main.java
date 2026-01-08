public class Main {
    public static void main(String[] args) {
        Cow maVache = new Cow("Vache", "Blanche et noire", 500);
        Dog monChien = new Dog("Chien", "Marron", 30);

        System.out.println("=== Accès depuis Main ===");
        System.out.println("Public : " + maVache.espece);
        System.out.println("Private via getter : " + maVache.getPays());

        maVache.testerAcces();
        monChien.testerAcces();
        maVache.afficherInfos();

        System.out.println("\n=== Autres méthodes ===");
        maVache.eat();
        maVache.eat("de l'herbe");
        monChien.eat();
        Animal.afficherRegle();
    }
}