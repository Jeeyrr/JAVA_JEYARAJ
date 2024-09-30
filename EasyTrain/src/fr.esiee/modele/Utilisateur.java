package fr.esiee.modele;

import javax.management.relation.Role;
import java.time.LocalDate;

public class Utilisateur {

    private int id ;
    private String nom ;
    private String prenom ;
    private String mdp ;
    private LocalDate dateEmbauche ;
    private Role role ;

    public Utilisateur(int id, String nom, String prenom, String mdp, LocalDate dateEmbauche, Role role) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.mdp = mdp;
        this.dateEmbauche = dateEmbauche;
        this.role = role;
    }














}







