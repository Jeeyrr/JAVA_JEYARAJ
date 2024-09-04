// JEYARAJ
// 04/09/2024
// TP Exploratoire

public class Main  {
    public static void main(String[] args) {
        Voyage monVoyage = new Voyage(3000, 10,  "Sri Lanka");
        System.out.println("Votre vol est à destination de : " + monVoyage.getDestination());

        System.out.println("La durée de votre vol est de : " + monVoyage.getDuree() + " jours");

        System.out.println("Le prix du vol est de : " + monVoyage.getPrix() + " €");
    }
}