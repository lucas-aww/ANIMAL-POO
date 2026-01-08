public class Main {
    public static void main(String[] args) {
        // 1. Instancier un objet de classe Cow
        Cow maVache = new Cow("Vachette", 5);

        // 2. Afficher le nom de l'animal
        System.out.println("Nom de l'animal : " + maVache.getNom());

        // 3. Appeler la méthode permettant de produire un son
        System.out.print("Son de l'animal : ");
        maVache.produireSon();
    }
}