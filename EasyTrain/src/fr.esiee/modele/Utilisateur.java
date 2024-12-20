// Jeyron JEYARAJ
// 17/10/2024 TP EasyTRAIN

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
    private int login;

    public Utilisateur(int id, String nom, String prenom, String mdp, LocalDate dateEmbauche, Role role, int login) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.mdp = mdp;
        this.dateEmbauche = dateEmbauche;
        this.role = role;
        this.login = login;
    }
 }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getMdp() {
        return mdp;
    }
    public void setMdp(String mdp) {
        this.mdp = mdp;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public LocalDate getDateEmbauche() {
        return dateEmbauche;
    }
    public void setDateEmbauche(LocalDate dateEmbauche) {
        this.dateEmbauche = dateEmbauche;
    }
    public Role getRole() {
        return role;
    }
    public void setRole(Role role) {
        this.role = role;
    }
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }













}







