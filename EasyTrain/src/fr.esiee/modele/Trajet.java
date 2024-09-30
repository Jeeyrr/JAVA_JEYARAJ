package fr.esiee.modele;

import java.time.LocalDateTime;

public class Trajet {
    private String code ;
    private LocalDateTime tempsDepart;
    private LocalDateTime tempsArrive;

    public Trajet(String code, LocalDateTime tempsDepart, LocalDateTime tempsArrive) {
        this.code = code;
        this.tempsDepart = tempsDepart;
        this.tempsArrive = tempsArrive;

    }





}

