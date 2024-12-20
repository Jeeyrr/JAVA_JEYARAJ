DROP DATABASE IF EXISTS EasyTrain;

CREATE DATABASE EasyTrain;

USE EasyTrain;

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";

CREATE TABLE `Arret` (
  `id` int(3) NOT NULL AUTO_INCREMENT,
  `nom` varchar(30) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

INSERT INTO `Arret` (`id`, `nom`) VALUES
(1, 'Paris Gare de Lyon'),
(2, 'Lyon Part Dieu'),
(3, 'Marseille Saint-Charles'),
(4, 'Nice Ville');

CREATE TABLE `Trajet` (
  `code` varchar(30) NOT NULL,
  `temps_depart` datetime NOT NULL,
  `temps_arrivee` datetime NOT NULL,
  `arret_depart_id` int(3) NOT NULL,
  `arret_arrivee_id` int(3) NOT NULL,
  PRIMARY KEY (`code`),
  KEY `arret_depart_id` (`arret_depart_id`),
  KEY `arret_arrivee_id` (`arret_arrivee_id`),
  CONSTRAINT `Trajet_fk_depart` FOREIGN KEY (`arret_depart_id`) REFERENCES `Arret` (`id`),
  CONSTRAINT `Trajet_fk_arrivee` FOREIGN KEY (`arret_arrivee_id`) REFERENCES `Arret` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

INSERT INTO `Trajet` (`code`, `temps_depart`, `temps_arrivee`, `arret_depart_id`, `arret_arrivee_id`) VALUES
('TRAJET001', '2021-11-30 10:20:00', '2021-12-03 16:00:00', 1, 2),
('TRAJET002', '2022-11-11 11:00:00', '2022-11-11 14:00:00', 3, 4);

CREATE TABLE `Utilisateur` (
  `id` int(3) NOT NULL AUTO_INCREMENT,
  `login` varchar(20) NOT NULL,
  `mdp` varchar(256) NOT NULL,
  `nom` varchar(30) NOT NULL,
  `prenom` varchar(30) NOT NULL,
  `date_embauche` datetime NOT NULL,
  `role` enum('ADMIN','EMPLOYE') NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `login` (`login`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

INSERT INTO `Utilisateur` (`id`, `login`, `mdp`, `nom`, `prenom`, `date_embauche`, `role`) VALUES
(1, 'reda', SHA2('mdpreda',256), 'Aboudi', 'Reda', '2021-11-01 00:00:00', 'EMPLOYE'),
(2, 'admin', SHA2('adminpass',256), 'Jeyaraj', 'Jeyron', '2000-09-02 00:00:00', 'ADMIN');

COMMIT;
