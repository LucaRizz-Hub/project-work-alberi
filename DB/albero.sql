-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Creato il: Ott 25, 2024 alle 09:57
-- Versione del server: 10.4.28-MariaDB
-- Versione PHP: 8.0.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `alberibelli`
--

-- --------------------------------------------------------

--
-- Struttura della tabella `albero`
--

CREATE TABLE `albero` (
  `id` int(11) NOT NULL,
  `nome_albero` varchar(100) NOT NULL,
  `specie` varchar(100) NOT NULL,
  `descrizione` text DEFAULT NULL,
  `continente` varchar(50) DEFAULT NULL,
  `paese` varchar(50) DEFAULT NULL,
  `prezzo` decimal(10,2) DEFAULT NULL,
  `foto` varchar(255) DEFAULT NULL,
  `co2` decimal(10,2) DEFAULT NULL,
  `significato` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dump dei dati per la tabella `albero`
--

INSERT INTO `albero` (`id`, `nome_albero`, `specie`, `descrizione`, `continente`, `paese`, `prezzo`, `foto`, `co2`, `significato`) VALUES
(1, 'Baobab', 'Adansonia digitata', 'Albero iconico per il tronco largo e la forma unica, vive per migliaia di anni e immagazzina acqua.', 'Africa', 'Madagascar', 25.00, 'albero_1.jpg', 50.00, 'Longevità e saggezza.'),
(2, 'Acacia', 'Acacia tortilis', 'Tipico della savana africana, ha una chioma ad ombrello e fornisce nutrimento per molte specie animali.', 'Africa', 'Sud Africa', 20.00, 'albero_2.jpg', 25.00, 'Protezione e resistenza.'),
(3, 'Mopane', 'Colophospermum mopane', 'Resistente alle condizioni aride, le sue foglie a forma di farfalla sono distintive.', 'Africa', 'Zimbabwe', 30.00, 'albero_3.jpg', 40.00, 'Adattabilità e persistenza.'),
(4, 'Ebano Africano', 'Diospyros mespiliformis', 'Albero dal legno nero e denso, apprezzato per la lavorazione del legno e strumenti musicali.', 'Africa', 'Camerun', 45.00, 'albero_4.jpg', 50.00, 'Eleganza e mistero.'),
(5, 'Fico del Capo', 'Ficus capensis', 'Produce frutti che sono una fonte di cibo per molti animali selvatici.', 'Africa', 'Sud Africa', 35.00, 'albero_5.jpg', 60.00, 'Fertilità e abbondanza.'),
(6, 'Teak', 'Tectona grandis', 'Albero dal legno pregiato, resistente all\'acqua e agli insetti, usato per mobili e navi.', 'Asia', 'India', 40.00, 'albero_6.jpg', 55.00, 'Resistenza e nobiltà.'),
(7, 'Bambù gigante', 'Dendrocalamus giganteus', 'Il più grande dei bambù, cresce rapidamente e viene usato per edilizia e artigianato.', 'Asia', 'Cina', 15.00, 'albero_7.jpg', 100.00, 'Crescita rapida e versatilità.'),
(8, 'Albero di Sandalo', 'Santalum album', 'Albero aromatico, usato per incensi e oli essenziali.', 'Asia', 'India', 60.00, 'albero_8.jpg', 40.00, 'Spiritualità e pace.'),
(9, 'Ginkgo biloba', 'Ginkgo biloba', 'Considerato un fossile vivente, noto per le foglie a ventaglio.', 'Asia', 'Cina', 30.00, 'albero_9.jpg', 45.00, 'Immortalità e rinascita.'),
(10, 'Cedro del Libano', 'Cedrus libani', 'Albero maestoso e longevo, simbolo del Libano.', 'Asia', 'Libano', 50.00, 'albero_10.jpg', 60.00, 'Forza e maestosità.'),
(11, 'Quercia', 'Quercus robur', 'Albero longevo e simbolo di forza, utilizzato per mobili e barrique.', 'Europa', 'Spagna', 55.00, 'albero_11.jpg', 100.00, 'Forza e stabilità.'),
(12, 'Faggio', 'Fagus sylvatica', 'Diffuso nelle foreste temperate, noto per la chioma densa e il legno versatile.', 'Europa', 'Germania', 45.00, 'albero_12.jpg', 90.00, 'Resilienza e protezione.'),
(13, 'Pino silvestre', 'Pinus sylvestris', 'Albero delle regioni fredde, con aghi lunghi e corteccia arancione.', 'Europa', 'Finlandia', 40.00, 'albero_13.jpg', 50.00, 'Resistenza e purezza.'),
(14, 'Ulivo', 'Olea europaea', 'Simbolo del Mediterraneo, apprezzato per i suoi frutti e l’olio.', 'Europa', 'Italia', 50.00, 'albero_14.jpg', 50.00, 'Pace e prosperità.'),
(15, 'Castagno europeo', 'Castanea sativa', 'Produttore di castagne, diffuso nelle regioni collinari.', 'Europa', 'Italia', 50.00, 'albero_15.jpg', 60.00, 'Generosità e abbondanza.'),
(16, 'Sequoia gigante', 'Sequoiadendron giganteum', 'Albero tra i più alti e longevi del mondo, può superare i 90 metri.', 'America', 'USA', 150.00, 'albero_16.jpg', 250.00, 'Eternità e grandezza.'),
(17, 'Pino ponderosa', 'Pinus ponderosa', 'Riconoscibile dalla corteccia squamosa giallastra, cresce in aree montuose.', 'America', 'USA', 45.00, 'albero_17.jpg', 60.00, 'Sopravvivenza e adattamento.'),
(18, 'Cipresso calvo', 'Taxodium distichum', 'Albero che cresce in zone umide con radici aeree che emergono dal suolo.', ' America', 'USA', 35.00, 'albero_18.jpg', 55.00, 'Rigenerazione e resilienza.'),
(19, 'Jacaranda', 'Jacaranda mimosifolia', 'Apprezzato per i suoi fiori viola che ricoprono l\'albero in primavera.', ' America', 'Argentina', 30.00, 'albero_19.jpg', 50.00, 'Creatività e bellezza.'),
(20, 'Palo santo', 'Bursera graveolens', 'Albero noto per il suo legno aromatico, spesso utilizzato in rituali spirituali.', ' America', 'Ecuador', 30.00, 'albero_20.jpg', 35.00, 'Purificazione e guarigione.'),
(21, 'Eucalipto', 'Eucalyptus globulus', 'Albero dominante in Australia, noto per l\'olio essenziale e il nutrimento per i koala.', 'Oceania', 'Australia', 25.00, 'albero_21.jpg', 50.00, 'Guarigione e protezione.'),
(22, 'Pohutukawa', 'Metrosideros excelsa', 'Albero simbolo del Natale in Nuova Zelanda, noto per i fiori rossi vibranti.', 'Oceania', 'Nuova Zelanda', 40.00, 'albero_22.jpg', 60.00, 'Festa e vitalità.'),
(23, 'Kauri', 'Agathis australis', 'Albero massiccio e longevo, noto per il legno di qualità superiore.', 'Oceania', 'Nuova Zelanda', 60.00, 'albero_23.jpg', 80.00, 'Stabilità e antichità.'),
(24, 'Acacia dorata', 'Acacia pycnantha', 'Albero nazionale dell\'Australia, noto per i fiori gialli brillanti.', 'Oceania', 'Australia', 20.00, 'albero_24.jpg', 35.00, 'Ottimismo e prosperità.'),
(25, 'Casuarina', 'Casuarina equisetifolia', 'Albero resistente al vento e all\'erosione costiera, dalle foglie aghiformi.', 'Oceania', 'Australia', 30.00, 'albero_25.jpg', 40.00, 'Protezione e resilienza.');

--
-- Indici per le tabelle scaricate
--

--
-- Indici per le tabelle `albero`
--
ALTER TABLE `albero`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT per le tabelle scaricate
--

--
-- AUTO_INCREMENT per la tabella `albero`
--
ALTER TABLE `albero`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=26;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
