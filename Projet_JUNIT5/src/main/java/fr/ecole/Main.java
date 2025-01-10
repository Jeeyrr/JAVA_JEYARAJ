package fr.ecole;

public class Main {
    public static void main(String[] args) {
        Devise euro=new Devise(100,"euro");
        Devise euro2=new Devise(50,"euro");
        //tester les methodes = 1) les utiliser

        int qte = euro.getQuantite();
        String monnaie = euro.getMonnaie();
        // 2) vérifier si les valeurs attendues sont bonnes (ici c'est nos yeux)
        System.out.println("Ma devise : quantité "+qte+", et monnaie " + monnaie);
        System.out.println("Ma devise2 : quantité "+euro2.getQuantite()+", et monnaie " + monnaie);
        // tester la fonction add
        Devise somme=euro2.add(euro);
        // 2) vérifier si le résultat de la somme est ok
        System.out.println("Ma somme : qté "+somme.getQuantite()+", et monnaie "+somme.getMonnaie());
    }

}
