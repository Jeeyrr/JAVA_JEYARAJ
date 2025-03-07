-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le : ven. 07 mars 2025 à 13:36
-- Version du serveur : 8.2.0
-- Version de PHP : 8.2.13

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `easytrain`
--

-- --------------------------------------------------------

--
-- Structure de la table `utilisateur`
--

DROP TABLE IF EXISTS `utilisateur`;
CREATE TABLE IF NOT EXISTS `utilisateur` (
  `id` int NOT NULL AUTO_INCREMENT,
  `login` varchar(50) COLLATE utf8mb4_general_ci NOT NULL,
  `mdp` varchar(256) COLLATE utf8mb4_general_ci NOT NULL,
  `nom` varchar(50) COLLATE utf8mb4_general_ci NOT NULL,
  `prenom` varchar(50) COLLATE utf8mb4_general_ci NOT NULL,
  `dateEmbauche` date NOT NULL,
  `role` enum('ADMIN','EMPLOYE') COLLATE utf8mb4_general_ci NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `login` (`login`)
) ENGINE=InnoDB AUTO_INCREMENT=42 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Déchargement des données de la table `utilisateur`
--

INSERT INTO `utilisateur` (`id`, `login`, `mdp`, `nom`, `prenom`, `dateEmbauche`, `role`) VALUES
(1, 'admin', 'admin', 'jeyaraj', 'jeyron', '0200-09-02', 'ADMIN'),
(2, 'Tanjirore', 'mdpTanjirore', 'Aboudi', 'Reda', '2021-11-10', 'EMPLOYE'),
(3, 'Semeehh', 'mdpSemeehh', 'Cakici', 'Semih', '2021-11-01', 'EMPLOYE'),
(5, 'mopimeri', 'mdpmopimeri', 'OG', 'Dylan', '2021-11-11', 'EMPLOYE');

--
-- Déclencheurs `utilisateur`
--
DROP TRIGGER IF EXISTS `Trigger`;
DELIMITER $$
CREATE TRIGGER `Trigger` BEFORE INSERT ON `utilisateur` FOR EACH ROW IF LOWER(NEW.nom) IN ('test', 'tst', 'tést', 't3st') THEN -- Vérifie si le nom ajouté fait partie de cette liste de mots
        SIGNAL SQLSTATE '45000' -- génère une erreur SQL
        SET MESSAGE_TEXT = 'Le nom ne peut pas être "test" ou une variante.'; -- message d'erreur 
    END IF
$$
DELIMITER ;
DROP TRIGGER IF EXISTS `Trigger update`;
DELIMITER $$
CREATE TRIGGER `Trigger update` BEFORE UPDATE ON `utilisateur` FOR EACH ROW IF LOWER(NEW.nom) IN ('test', 'tst', 'TEST', 'tEst') THEN -- Vérifie si le nom ajouté fait partie de cette liste de mots
        SET NEW.nom = OLD.nom; -- laisser l'ancien nom
        SIGNAL SQLSTATE '45000' -- génère une erreur SQL
        SET MESSAGE_TEXT = 'Le nom ne peut pas être changé en "test" ou une variante. ancien nom est conservé.'; -- message d'erreur 
    END IF
$$
DELIMITER ;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
