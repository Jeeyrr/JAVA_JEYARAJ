# Mission EasyTrain
Jeyron JEYARAJ, 04/10/2024

Mise à jour le 18/10/2024

## Modèle relationnel

### Utilisateur:
- utilisateur(id: int(3), login: varchar(20), mdp: varchar(256), nom: varchar(30), prenom: varchar(30), date_embauche: datetime, role: enum('ADMIN', 'EMPLOYE'))
- clé primaire: id
- clé étrangère: __
- champs unique:

### Trajet
- trajet(code: varchar(30), temps_depart: datetime, temps_arrivee: datetime, arret_depart_id: int(3), arret_arrivee_id: int(30))
- clé primaire: code
- clé étrangère: - arret_depart_id référence à Arret (id)
                 - arret_arrivee_id référence à Arret (id)
- champs unique:

### Arret
- arret(id: int(3), nom: varchar(30))
- clé primaire : id
- clé étrangère __

## 1. Récupérer l'utilisateur qui à login = ...
`SELECT id,login,mdp,nom,prenom,role,date_embauche`

`FROM utilisateur`

`WHERE login='unloginparticulier';`

`AND mdp = SHA2('lemdpsaisie',256);`

## 2. Lister les utilisateurs qui sont admin
`SELECT id,login,mdp,nom,prenom,role,date_embauche`

`FROM utilisateur`

`WHERE role='ADMIN';`

## 3. Récupérer les trajets sur une période donnée
`SELECT code,temps_depart,temps_arrivee,arret_depart_id,arret_arrivee_id`

`FROM Trajet`

`WHERE temps_depart BETWEEN '<date1>' AND '<date2>'`

`AND temps_arrivee BETWEEN '<date1>' AND <date2>'`
## 3. BIS : Lister tout les trajets
`SELECT code,tempsDepart,tempsArrivee,id_arretDepart,id_arretArrivee,ad.nom as nomAD,ad.id as idAD,aa.nom as nomAA,aa.id as idAA`

`FROM trajet t,arret ad,arret aa`

`WHERE ad.id=id_arretDrrivee`

`AND aa.id=id_arretArrivee`

`AND temps_depart BETWEEN '<date1>' AND '<date2>'`

`AND temps_arrivee BETWEEN '<date1>' AND '<date2>'`
## 4. 
   ### a. Ajouter un employé avec toutes les infos
`INSERT INTO utilisateur  (id,login,mdp,nom,prenom,role,date_embauche)`

`VALUES('leLogin',SHA2('lemdp',256),'leNom','leprenom','EMPLOYE','<date>')`

`DELETE FROM utilisateur WHERE id=3`


   ### b. Supprimer un employé avec un id ou login    
`UPDATE trajet SET tempsArrivee='<nouvelledate>', tempsDepart='<nouvelledate>'`

`WHERE code='LeCode';`