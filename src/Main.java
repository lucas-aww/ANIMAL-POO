public class Main {
    public static void main(String[] args) {
        // 1. Instanciation de l'objet Cow
        Cow maVache = new Cow("Vachette", 4);

        // 2. Appel de la méthode d'instance (sur l'objet 'maVache')
        System.out.print("L'animal " + maVache.getNom() + " fait : ");
        maVache.produireSon();

        // 3. Appel de la méthode statique (sur la classe 'Animal')
        Animal.afficherRegle();
    }
}