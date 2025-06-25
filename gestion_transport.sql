-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Jun 25, 2025 at 10:44 AM
-- Server version: 8.3.0
-- PHP Version: 8.2.18

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `gestion_transport`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

DROP TABLE IF EXISTS `admin`;
CREATE TABLE IF NOT EXISTS `admin` (
  `id_admin` int NOT NULL AUTO_INCREMENT,
  `nom_admin` varchar(60) NOT NULL,
  `contact_admin` varchar(10) NOT NULL,
  `mdp_admin` varchar(32) NOT NULL,
  `id_cooper` int NOT NULL,
  PRIMARY KEY (`id_admin`),
  KEY `id_cooper` (`id_cooper`)
) ENGINE=MyISAM AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`id_admin`, `nom_admin`, `contact_admin`, `mdp_admin`, `id_cooper`) VALUES
(1, 'Vanilah', '0344646454', 'azerty1', 2),
(2, 'Geovanni', '0380000000', 'Geovanni', 3),
(3, 'Vanilah007', '0344646454', 'qwerty2124', 4);

-- --------------------------------------------------------

--
-- Table structure for table `cooperative`
--

DROP TABLE IF EXISTS `cooperative`;
CREATE TABLE IF NOT EXISTS `cooperative` (
  `id_cooper` int NOT NULL AUTO_INCREMENT,
  `nom_coo` varchar(32) NOT NULL,
  `contact_coo` varchar(10) NOT NULL,
  `logo_coo` varchar(255) NOT NULL,
  `num_porte` int NOT NULL,
  PRIMARY KEY (`id_cooper`)
) ENGINE=MyISAM AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `cooperative`
--

INSERT INTO `cooperative` (`id_cooper`, `nom_coo`, `contact_coo`, `logo_coo`, `num_porte`) VALUES
(2, 'Kofiam', '0342896421', 'KOFIAM', 5),
(3, 'Mamy', '0333333333', 'MAMY', 9),
(4, 'Balaine Bleu', '0341541545', 'Balaine Bleu', 5);

-- --------------------------------------------------------

--
-- Table structure for table `reservation`
--

DROP TABLE IF EXISTS `reservation`;
CREATE TABLE IF NOT EXISTS `reservation` (
  `id_reserv` int NOT NULL AUTO_INCREMENT,
  `nomcli` varchar(32) NOT NULL,
  `prenomcli` varchar(42) NOT NULL,
  `contact_cli` varchar(10) NOT NULL,
  `id_traj` int NOT NULL,
  `nb_billet` int NOT NULL,
  `statut_paiement` varchar(15) NOT NULL,
  `montant_paye` int NOT NULL,
  `transaction_id` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `date_reservation` date NOT NULL,
  PRIMARY KEY (`id_reserv`),
  KEY `id_traj` (`id_traj`)
) ENGINE=MyISAM AUTO_INCREMENT=24 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `reservation`
--

INSERT INTO `reservation` (`id_reserv`, `nomcli`, `prenomcli`, `contact_cli`, `id_traj`, `nb_billet`, `statut_paiement`, `montant_paye`, `transaction_id`, `date_reservation`) VALUES
(8, 'Nambinintsoa', 'Geovanni', '0385912827', 5, 1, 'payé', 40000, 'Paiment liquide', '2025-04-30'),
(7, 'Nambinintsoa', 'Geovanni', '0385912827', 5, 1, 'payé', 40000, 'Paiment liquide', '2025-04-30'),
(6, 'Nambinintsoa', 'Geovanni', '0385912827', 5, 1, 'payé', 40000, 'Paiment liquide', '2025-04-30'),
(9, 'Vanilah', 'Rovasoa', '0345600000', 5, 3, 'payé', 120000, 'Paiement liquide', '2025-04-22'),
(10, 'Francia', 'Andriambeloniaina', '0320000000', 5, 1, 'payé', 40000, 'Paiement liquide', '2025-04-26'),
(11, 'Nandrianina', 'Hery', '0331870022', 5, 1, 'payé', 40000, 'Paiement liquide', '2025-04-27'),
(12, 'Soa', 'Tiana', '0384525878', 5, 1, 'payé', 40000, 'Paiement liquide', '2025-04-27'),
(13, 'Franck', 'Louis', '0332125645', 5, 1, 'payé', 40000, 'Paiement liquide', '2025-04-28'),
(14, 'Nasolo', 'Fiderana', '0382345678', 5, 1, 'payé', 40000, 'Paiement liquide', '2025-04-30'),
(15, 'Rakoto', 'Mandimby', '0345722200', 1, 2, 'Paiment liquide', 70000, 'Paiement liquide', '2025-05-27'),
(16, 'Rasoa', 'Sarah', '0345687878', 1, 1, 'Payé', 35000, 'MV-cd90cb2d', '2025-05-27'),
(17, 'Nirina', 'Rak', '0344444444', 1, 1, 'Payé', 35000, 'MV-05342a57', '2025-05-27'),
(18, 'Namby', 'Tahiana', '0332222222', 1, 2, 'paye', 70000, 'Paiement liquide', '2024-04-30'),
(19, 'Ravao', 'Vao', '0382222222', 1, 1, 'paye', 35000, 'Paiement liquide', '2025-05-15'),
(20, 'Ralay', 'Narivo', '0325656565', 1, 1, 'Payé', 35000, 'MV-84337323', '2025-05-27'),
(21, 'Noro', 'Liana', '0320000000', 1, 1, 'paye', 35000, 'Paiement liquide', '2025-05-10'),
(22, 'Mahaliana', 'Avo', '0345647897', 1, 1, 'paye', 35000, 'Paiement liquide', '2025-05-10'),
(23, 'Vanilah', 'Rova', '0344444444', 1, 2, 'Payé', 70000, 'MV-f9b0150c', '2025-05-27');

-- --------------------------------------------------------

--
-- Table structure for table `siege`
--

DROP TABLE IF EXISTS `siege`;
CREATE TABLE IF NOT EXISTS `siege` (
  `id_siege` int NOT NULL AUTO_INCREMENT,
  `id_veh` int NOT NULL,
  `num_siege` varchar(5) NOT NULL,
  `etat_siege` varchar(10) NOT NULL,
  PRIMARY KEY (`id_siege`),
  KEY `id_veh` (`id_veh`)
) ENGINE=MyISAM AUTO_INCREMENT=40 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `siege`
--

INSERT INTO `siege` (`id_siege`, `id_veh`, `num_siege`, `etat_siege`) VALUES
(1, 1, '1', 'réservé'),
(2, 2, '1', 'réservé'),
(3, 1, '2', 'réservé'),
(4, 1, '3', 'réservé'),
(5, 1, '4', 'réservé'),
(6, 1, '5', 'réservé'),
(30, 1, '9', 'réservé'),
(7, 2, '2', 'disponible'),
(8, 2, '3', 'disponible'),
(9, 3, '1', 'réservé'),
(10, 3, '2', 'réservé'),
(11, 3, '3', 'réservé'),
(12, 3, '4', 'réservé'),
(13, 3, '5', 'réservé'),
(14, 3, '6', 'réservé'),
(15, 3, '7', 'réservé'),
(16, 3, '8', 'disponible'),
(17, 3, '9', 'disponible'),
(18, 3, '10', 'disponible'),
(19, 3, '11', 'disponible'),
(20, 3, '12', 'disponible'),
(21, 3, '13', 'disponible'),
(22, 4, '1', 'disponible'),
(23, 4, '2', 'réservé'),
(24, 4, '3', 'réservé'),
(25, 4, '4', 'réservé'),
(26, 4, '5', 'réservé'),
(27, 1, '6', 'réservé'),
(28, 1, '7', 'réservé'),
(29, 1, '8', 'disponible'),
(31, 1, '9', 'disponible'),
(32, 1, '10', 'disponible'),
(33, 1, '11', 'réservé'),
(34, 1, '12', 'disponible'),
(35, 1, '13', 'disponible'),
(36, 1, '14', 'disponible'),
(37, 1, '15', 'disponible'),
(38, 1, '16', 'réservé'),
(39, 1, '17', 'réservé');

-- --------------------------------------------------------

--
-- Table structure for table `trajet`
--

DROP TABLE IF EXISTS `trajet`;
CREATE TABLE IF NOT EXISTS `trajet` (
  `id_traj` int NOT NULL AUTO_INCREMENT,
  `id_cooper` int NOT NULL,
  `ville_dep` varchar(40) NOT NULL,
  `ville_arr` varchar(40) NOT NULL,
  `heure_dep` time NOT NULL,
  `heure_arr` time NOT NULL,
  `date_dep` date NOT NULL,
  `prix_billet` int NOT NULL,
  PRIMARY KEY (`id_traj`),
  KEY `id_cooper` (`id_cooper`)
) ENGINE=MyISAM AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `trajet`
--

INSERT INTO `trajet` (`id_traj`, `id_cooper`, `ville_dep`, `ville_arr`, `heure_dep`, `heure_arr`, `date_dep`, `prix_billet`) VALUES
(1, 2, 'Fianarantsoa', 'Antananarivo', '16:30:00', '06:00:00', '2025-05-30', 35000),
(2, 2, 'Fianarantsoa', 'Toliara', '06:10:00', '19:30:00', '2025-04-25', 40000),
(3, 3, 'Fianarantsoa', 'Antananarivo', '17:00:00', '07:00:00', '2025-04-24', 37000),
(4, 3, 'Fianarantsoa', 'Ambositra', '17:00:00', '21:00:00', '2025-04-22', 25000),
(5, 2, 'Fianarantsoa', 'Antananarivo', '16:00:00', '07:00:00', '2025-05-01', 40000),
(6, 3, 'Fianarantsoa', 'Antananarivo', '17:00:00', '07:00:00', '2025-05-30', 37000);

-- --------------------------------------------------------

--
-- Table structure for table `vehicule`
--

DROP TABLE IF EXISTS `vehicule`;
CREATE TABLE IF NOT EXISTS `vehicule` (
  `id_veh` int NOT NULL AUTO_INCREMENT,
  `id_cooper` int NOT NULL,
  `id_traj` int NOT NULL,
  `immatriculation` varchar(7) NOT NULL,
  `capacite` int NOT NULL,
  PRIMARY KEY (`id_veh`),
  KEY `id_cooper` (`id_cooper`),
  KEY `id_traj` (`id_traj`)
) ENGINE=MyISAM AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `vehicule`
--

INSERT INTO `vehicule` (`id_veh`, `id_cooper`, `id_traj`, `immatriculation`, `capacite`) VALUES
(1, 2, 1, '4556TBD', 22),
(2, 2, 2, '5598TBE', 16),
(3, 2, 5, '2298HRT', 13),
(4, 2, 5, '4456TAL', 5),
(5, 3, 6, '2345THB', 6);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
