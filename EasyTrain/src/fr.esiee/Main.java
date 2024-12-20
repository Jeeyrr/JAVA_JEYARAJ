// Jeyron JEYARAJ
// 17/10/2024 TP EasyTRAIN


package fr.esiee;

import fr.esiee.modele.Role;
import fr.esiee.modele.Utilisateur;
import fr.esiee.modele.Arret;
import fr.esiee.modele.Trajet;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Utilisateur utilisateur1 = new Utilisateur(1, "Reda", "mdpreda", "Aboudi", "Reda", LocalDate.of(2021, 11, 1), Role.EMPLOYE);
        Utilisateur utilisateur2 = new Utilisateur(2, "admin", "adminpass", "Jeyaraj", "Jeyron", LocalDate.of(2000, 9, 2), Role.ADMIN);

        utilisateur1.setNom("LALA");
        utilisateur2.setPrenom("POPO");

        utilisateur1.afficherUtilisateur();
        utilisateur2.afficherUtilisateur();

        Arret arret1 = new Arret(1, "Paris Gare de Lyon");
        Arret arret2 = new Arret(2, "Lyon Part Dieu");
        Arret arret3 = new Arret(3, "Marseille Saint-Charles");
        Arret arret4 = new Arret(4, "Nice Ville");

        Trajet trajet1 = new Trajet("001", LocalDateTime.of(2021, 11, 30, 10, 20),
                LocalDateTime.of(2021, 12, 3, 16, 0), arret1, arret2);

        Trajet trajet2 = new Trajet("002", LocalDateTime.of(2022, 11, 11, 11, 0),
                LocalDateTime.of(2022, 11, 11, 14, 0), arret3, arret4);

        trajet1.setCode("003");
        arret1.setNom("Paris Gare de Lyon");

        trajet1.afficherTrajet();
        trajet2.afficherTrajet();

        List<Trajet> listeTrajets = new ArrayList<>();
        listeTrajets.add(trajet1);
        listeTrajets.add(trajet2);

        for (Trajet trajet : listeTrajets) {
            trajet.afficherTrajet();
        }
    }
}
