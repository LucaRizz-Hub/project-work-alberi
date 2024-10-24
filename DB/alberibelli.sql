-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Creato il: Ott 24, 2024 alle 16:31
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
-- Struttura della tabella `adozione`
--

CREATE TABLE `adozione` (
  `id` int(11) NOT NULL,
  `id_albero` int(11) DEFAULT NULL,
  `id_utente` int(11) DEFAULT NULL,
  `data_adozione` date NOT NULL DEFAULT current_timestamp(),
  `quantità` int(11) DEFAULT NULL,
  `costo_totale` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

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
(1, 'albero del mango', 'mangifera indica', 'albero di prova bellissimo', 'america', 'haiti', 50.00, 'mango.jpeg', -700.00, 'prosperità'),
(3, 'Baobab', 'Adansonia digitata', 'Albero iconico per il tronco largo e la forma unica, vive per migliaia di anni e immagazzina acqua.', 'Africa', 'Madagascar', 25.00, 'baobab.jpg', 50.00, 'Longevità e saggezza.'),
(4, 'Acacia', 'Acacia tortilis', 'Tipico della savana africana, ha una chioma ad ombrello e fornisce nutrimento per molte specie animali.', 'Africa', 'Sud Africa', 20.00, 'Acacia.jpg', 25.00, 'Protezione e resistenza.'),
(5, 'Mopane', 'Colophospermum mopane', 'Resistente alle condizioni aride, le sue foglie a forma di farfalla sono distintive.', 'Africa', 'Zimbabwe', 30.00, 'Mopane.jpg', 40.00, 'Adattabilità e persistenza.'),
(6, 'Ebano Africano', 'Diospyros mespiliformis', 'Albero dal legno nero e denso, apprezzato per la lavorazione del legno e strumenti musicali.', 'Africa', 'Camerun', 45.00, 'Ebano.jpg', 50.00, 'Eleganza e mistero.'),
(7, 'Fico del Capo', 'Ficus capensis', 'Produce frutti che sono una fonte di cibo per molti animali selvatici.', 'Africa', 'Sud Africa', 35.00, 'fico.jpg', 60.00, 'Fertilità e abbondanza.'),
(8, 'Palma da dattero', 'Phoenix dactylifera', 'Albero che produce i datteri, coltivato da millenni nelle oasi desertiche.', 'Africa', 'Egitto', 35.00, 'dattero.jpg', 55.00, 'Fertilità ed erotismo.'),
(9, 'Ceiba', 'Ceiba pentandra', 'Albero tropicale massiccio, noto per il suo tronco enorme e spinoso, venerato in diverse culture.', 'Sud America', 'Brasile', 50.00, 'ceiba.jpg', 70.00, 'Virilità e grandezza.'),
(10, 'Teak', 'Tectona grandis', 'Albero dal legno pregiato, resistente all\'acqua e agli insetti, usato per mobili e navi.', 'Asia', 'India', 40.00, 'teak.jpg', 55.00, 'Resistenza e nobiltà.'),
(11, 'Bambù gigante', 'Dendrocalamus giganteus', 'Il più grande dei bambù, cresce rapidamente e viene usato per edilizia e artigianato.', 'Asia', 'Cina', 15.00, 'bambu.jpg', 100.00, 'Crescita rapida e versatilità.'),
(12, 'Albero di Sandalo', 'Santalum album', 'Albero aromatico, usato per incensi e oli essenziali.', 'Asia', 'India', 60.00, 'sandalo.jpg', 40.00, 'Spiritualità e pace.'),
(13, 'Ginkgo biloba', 'Ginkgo biloba', 'Considerato un fossile vivente, noto per le foglie a ventaglio.', 'Asia', 'Cina', 30.00, 'ginkgo.jpg', 45.00, 'Immortalità e rinascita.'),
(14, 'Cedro del Libano', 'Cedrus libani', 'Albero maestoso e longevo, simbolo del Libano.', 'Asia', 'Libano', 50.00, 'link_foto_cedro_libano', 60.00, 'Forza e maestosità.'),
(15, 'Quercia', 'Quercus robur', 'Albero longevo e simbolo di forza, utilizzato per mobili e barrique.', 'Europa', 'Spagna', 55.00, 'quercia.jpg', 100.00, 'Forza e stabilità.'),
(16, 'Faggio', 'Fagus sylvatica', 'Diffuso nelle foreste temperate, noto per la chioma densa e il legno versatile.', 'Europa', 'Germania', 45.00, 'faggio.jpg', 90.00, 'Resilienza e protezione.'),
(17, 'Pino silvestre', 'Pinus sylvestris', 'Albero delle regioni fredde, con aghi lunghi e corteccia arancione.', 'Europa', 'Finlandia', 40.00, 'pino.jpg', 50.00, 'Resistenza e purezza.'),
(18, 'Ulivo', 'Olea europaea', 'Simbolo del Mediterraneo, apprezzato per i suoi frutti e l’olio.', 'Europa', 'Italia', 50.00, 'ulivo.jpg', 50.00, 'Pace e prosperità.'),
(19, 'Castagno europeo', 'Castanea sativa', 'Produttore di castagne, diffuso nelle regioni collinari.', 'Europa', 'Italia', 50.00, 'castagno.jpg', 60.00, 'Generosità e abbondanza.'),
(20, 'Leccio', 'Quercus ilex', 'Albero sempreverde della macchia mediterranea, con foglie coriacee e resistente alla siccità.', 'Europa', 'Italia', 45.00, 'leccio.jpg', 65.00, 'Stabilità e forza.'),
(21, 'Sequoia gigante', 'Sequoiadendron giganteum', 'Albero tra i più alti e longevi del mondo, può superare i 90 metri.', 'Nord America', 'USA', 150.00, 'sequoia.jpg', 250.00, 'Eternità e grandezza.'),
(22, 'Acero zuccherino', 'Acer saccharum', 'Famoso per lo sciroppo d\'acero, le sue foglie assumono colori spettacolari in autunno.', 'Nord America', 'Canada', 40.00, 'acero.jpg', 55.00, 'Dolcezza e rinnovamento.'),
(23, 'Quercia rossa', 'Quercus rubra', 'Quercia iconica delle foreste nordamericane, con foglie rosse in autunno.', 'Nord America', 'USA', 50.00, 'querciaRossa.jpg', 70.00, 'Cambiamento e forza.'),
(24, 'Pino ponderosa', 'Pinus ponderosa', 'Riconoscibile dalla corteccia squamosa giallastra, cresce in aree montuose.', 'Nord America', 'USA', 45.00, 'pinoponderosa.jpg', 60.00, 'Sopravvivenza e adattamento.'),
(25, 'Cipresso calvo', 'Taxodium distichum', 'Albero che cresce in zone umide con radici aeree che emergono dal suolo.', 'Nord America', 'USA', 35.00, 'cipressocalvo.jpg', 55.00, 'Rigenerazione e resilienza.'),
(26, 'Caucciù', 'Hevea brasiliensis', 'Albero che produce il lattice per la gomma naturale.', 'Sud America', 'Brasile', 20.00, 'caucciù.jpg', 45.00, 'Flessibilità e innovazione.'),
(27, 'Palo santo', 'Bursera graveolens', 'Albero noto per il suo legno aromatico, spesso utilizzato in rituali spirituali.', 'Sud America', 'Ecuador', 30.00, 'palosanto.jpg', 35.00, 'Purificazione e guarigione.'),
(28, 'Cecropia', 'Cecropia peltata', 'Albero pioniere delle foreste pluviali, ha foglie grandi e lobate.', 'Sud America', 'Colombia', 20.00, 'cecropia.jpg', 30.00, 'Innovazione e rigenerazione.'),
(29, 'Albero del cacao', 'Theobroma cacao', 'Produce i semi dai quali si ricava il cioccolato.', 'Sud America', 'Perù', 25.00, 'cacao.jpg', 40.00, 'Piacere e abbondanza.'),
(30, 'Jacaranda', 'Jacaranda mimosifolia', 'Apprezzato per i suoi fiori viola che ricoprono l\'albero in primavera.', 'Sud America', 'Argentina', 30.00, 'jacaranda.jpg', 50.00, 'Creatività e bellezza.'),
(31, 'Eucalipto', 'Eucalyptus globulus', 'Albero dominante in Australia, noto per l\'olio essenziale e il nutrimento per i koala.', 'Oceania', 'Australia', 25.00, 'eucalipto.jpg', 50.00, 'Guarigione e protezione.'),
(32, 'Pohutukawa', 'Metrosideros excelsa', 'Albero simbolo del Natale in Nuova Zelanda, noto per i fiori rossi vibranti.', 'Oceania', 'Nuova Zelanda', 40.00, 'pohutukawa.jpg', 60.00, 'Festa e vitalità.'),
(33, 'Kauri', 'Agathis australis', 'Albero massiccio e longevo, noto per il legno di qualità superiore.', 'Oceania', 'Nuova Zelanda', 60.00, 'kauri.jpg', 80.00, 'Stabilità e antichità.'),
(34, 'Acacia dorata', 'Acacia pycnantha', 'Albero nazionale dell\'Australia, noto per i fiori gialli brillanti.', 'Oceania', 'Australia', 20.00, 'acaciadorata.jpg', 35.00, 'Ottimismo e prosperità.'),
(35, 'Acacia', 'Acacia tortilis', 'Tipico della savana africana, ha una chioma ad ombrello e fornisce nutrimento per molte specie animali.', 'Africa', 'Sud Africa', 20.00, 'Acacia.jpg', 25.00, 'Protezione e resistenza.'),
(36, 'Mopane', 'Colophospermum mopane', 'Resistente alle condizioni aride, le sue foglie a forma di farfalla sono distintive.', 'Africa', 'Zimbabwe', 30.00, 'Mopane.jpg', 40.00, 'Adattabilità e persistenza.'),
(37, 'Ebano Africano', 'Diospyros mespiliformis', 'Albero dal legno nero e denso, apprezzato per la lavorazione del legno e strumenti musicali.', 'Africa', 'Camerun', 45.00, 'Ebano.jpg', 50.00, 'Eleganza e mistero.'),
(38, 'Fico del Capo', 'Ficus capensis', 'Produce frutti che sono una fonte di cibo per molti animali selvatici.', 'Africa', 'Sud Africa', 35.00, 'fico.jpg', 60.00, 'Fertilità e abbondanza.'),
(39, 'Palma da dattero', 'Phoenix dactylifera', 'Albero che produce i datteri, coltivato da millenni nelle oasi desertiche.', 'Africa', 'Egitto', 35.00, 'dattero.jpg', 55.00, 'Fertilità ed erotismo.'),
(40, 'Ceiba', 'Ceiba pentandra', 'Albero tropicale massiccio, noto per il suo tronco enorme e spinoso, venerato in diverse culture.', 'Sud America', 'Brasile', 50.00, 'ceiba.jpg', 70.00, 'Virilità e grandezza.'),
(41, 'Teak', 'Tectona grandis', 'Albero dal legno pregiato, resistente all\'acqua e agli insetti, usato per mobili e navi.', 'Asia', 'India', 40.00, 'teak.jpg', 55.00, 'Resistenza e nobiltà.'),
(42, 'Bambù gigante', 'Dendrocalamus giganteus', 'Il più grande dei bambù, cresce rapidamente e viene usato per edilizia e artigianato.', 'Asia', 'Cina', 15.00, 'bambu.jpg', 100.00, 'Crescita rapida e versatilità.'),
(43, 'Albero di Sandalo', 'Santalum album', 'Albero aromatico, usato per incensi e oli essenziali.', 'Asia', 'India', 60.00, 'sandalo.jpg', 40.00, 'Spiritualità e pace.'),
(44, 'Ginkgo biloba', 'Ginkgo biloba', 'Considerato un fossile vivente, noto per le foglie a ventaglio.', 'Asia', 'Cina', 30.00, 'ginkgo.jpg', 45.00, 'Immortalità e rinascita.'),
(45, 'Cedro del Libano', 'Cedrus libani', 'Albero maestoso e longevo, simbolo del Libano.', 'Asia', 'Libano', 50.00, 'link_foto_cedro_libano', 60.00, 'Forza e maestosità.'),
(46, 'Quercia', 'Quercus robur', 'Albero longevo e simbolo di forza, utilizzato per mobili e barrique.', 'Europa', 'Spagna', 55.00, 'quercia.jpg', 100.00, 'Forza e stabilità.'),
(47, 'Faggio', 'Fagus sylvatica', 'Diffuso nelle foreste temperate, noto per la chioma densa e il legno versatile.', 'Europa', 'Germania', 45.00, 'faggio.jpg', 90.00, 'Resilienza e protezione.'),
(48, 'Pino silvestre', 'Pinus sylvestris', 'Albero delle regioni fredde, con aghi lunghi e corteccia arancione.', 'Europa', 'Finlandia', 40.00, 'pino.jpg', 50.00, 'Resistenza e purezza.'),
(49, 'Ulivo', 'Olea europaea', 'Simbolo del Mediterraneo, apprezzato per i suoi frutti e l’olio.', 'Europa', 'Italia', 50.00, 'ulivo.jpg', 50.00, 'Pace e prosperità.'),
(50, 'Castagno europeo', 'Castanea sativa', 'Produttore di castagne, diffuso nelle regioni collinari.', 'Europa', 'Italia', 50.00, 'castagno.jpg', 60.00, 'Generosità e abbondanza.'),
(51, 'Leccio', 'Quercus ilex', 'Albero sempreverde della macchia mediterranea, con foglie coriacee e resistente alla siccità.', 'Europa', 'Italia', 45.00, 'leccio.jpg', 65.00, 'Stabilità e forza.'),
(52, 'Sequoia gigante', 'Sequoiadendron giganteum', 'Albero tra i più alti e longevi del mondo, può superare i 90 metri.', 'Nord America', 'USA', 150.00, 'sequoia.jpg', 250.00, 'Eternità e grandezza.'),
(53, 'Acero zuccherino', 'Acer saccharum', 'Famoso per lo sciroppo d\'acero, le sue foglie assumono colori spettacolari in autunno.', 'Nord America', 'Canada', 40.00, 'acero.jpg', 55.00, 'Dolcezza e rinnovamento.'),
(54, 'Quercia rossa', 'Quercus rubra', 'Quercia iconica delle foreste nordamericane, con foglie rosse in autunno.', 'Nord America', 'USA', 50.00, 'querciaRossa.jpg', 70.00, 'Cambiamento e forza.'),
(55, 'Pino ponderosa', 'Pinus ponderosa', 'Riconoscibile dalla corteccia squamosa giallastra, cresce in aree montuose.', 'Nord America', 'USA', 45.00, 'pinoponderosa.jpg', 60.00, 'Sopravvivenza e adattamento.'),
(56, 'Cipresso calvo', 'Taxodium distichum', 'Albero che cresce in zone umide con radici aeree che emergono dal suolo.', 'Nord America', 'USA', 35.00, 'cipressocalvo.jpg', 55.00, 'Rigenerazione e resilienza.'),
(57, 'Caucciù', 'Hevea brasiliensis', 'Albero che produce il lattice per la gomma naturale.', 'Sud America', 'Brasile', 20.00, 'caucciù.jpg', 45.00, 'Flessibilità e innovazione.'),
(58, 'Palo santo', 'Bursera graveolens', 'Albero noto per il suo legno aromatico, spesso utilizzato in rituali spirituali.', 'Sud America', 'Ecuador', 30.00, 'palosanto.jpg', 35.00, 'Purificazione e guarigione.'),
(59, 'Cecropia', 'Cecropia peltata', 'Albero pioniere delle foreste pluviali, ha foglie grandi e lobate.', 'Sud America', 'Colombia', 20.00, 'cecropia.jpg', 30.00, 'Innovazione e rigenerazione.'),
(60, 'Albero del cacao', 'Theobroma cacao', 'Produce i semi dai quali si ricava il cioccolato.', 'Sud America', 'Perù', 25.00, 'cacao.jpg', 40.00, 'Piacere e abbondanza.'),
(61, 'Jacaranda', 'Jacaranda mimosifolia', 'Apprezzato per i suoi fiori viola che ricoprono l\'albero in primavera.', 'Sud America', 'Argentina', 30.00, 'jacaranda.jpg', 50.00, 'Creatività e bellezza.'),
(62, 'Eucalipto', 'Eucalyptus globulus', 'Albero dominante in Australia, noto per l\'olio essenziale e il nutrimento per i koala.', 'Oceania', 'Australia', 25.00, 'eucalipto.jpg', 50.00, 'Guarigione e protezione.'),
(63, 'Pohutukawa', 'Metrosideros excelsa', 'Albero simbolo del Natale in Nuova Zelanda, noto per i fiori rossi vibranti.', 'Oceania', 'Nuova Zelanda', 40.00, 'pohutukawa.jpg', 60.00, 'Festa e vitalità.'),
(64, 'Kauri', 'Agathis australis', 'Albero massiccio e longevo, noto per il legno di qualità superiore.', 'Oceania', 'Nuova Zelanda', 60.00, 'kauri.jpg', 80.00, 'Stabilità e antichità.'),
(65, 'Acacia dorata', 'Acacia pycnantha', 'Albero nazionale dell\'Australia, noto per i fiori gialli brillanti.', 'Oceania', 'Australia', 20.00, 'acaciadorata.jpg', 35.00, 'Ottimismo e prosperità.'),
(66, 'Casuarina', 'Casuarina equisetifolia', 'Albero resistente al vento e all\'erosione costiera, dalle foglie aghiformi.', 'Oceania', 'Australia', 30.00, 'casuarina.jpg', 40.00, 'Protezione e resilienza.');

-- --------------------------------------------------------

--
-- Struttura della tabella `recensione`
--

CREATE TABLE `recensione` (
  `id` int(11) NOT NULL,
  `id_adozione` int(11) DEFAULT NULL,
  `valutazione` int(11) DEFAULT NULL CHECK (`valutazione` between 1 and 5),
  `commento` text DEFAULT NULL,
  `data_recensione` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Struttura della tabella `utente`
--

CREATE TABLE `utente` (
  `id` int(11) NOT NULL,
  `nome` varchar(50) NOT NULL,
  `cognome` varchar(50) NOT NULL,
  `email` varchar(100) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(255) NOT NULL,
  `metodo_pagamento` varchar(50) DEFAULT NULL,
  `foto` varchar(255) DEFAULT NULL,
  `data_di_nascita` date DEFAULT NULL,
  `data_iscrizione` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dump dei dati per la tabella `utente`
--

INSERT INTO `utente` (`id`, `nome`, `cognome`, `email`, `username`, `password`, `metodo_pagamento`, `foto`, `data_di_nascita`, `data_iscrizione`) VALUES
(1, 'carolina', 'zero', 'zerocarolina@gmail.com', 'bububu', 'Bello1!', NULL, '', NULL, '2024-10-24 13:47:21');

--
-- Indici per le tabelle scaricate
--

--
-- Indici per le tabelle `adozione`
--
ALTER TABLE `adozione`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_albero` (`id_albero`),
  ADD KEY `id_utente` (`id_utente`);

--
-- Indici per le tabelle `albero`
--
ALTER TABLE `albero`
  ADD PRIMARY KEY (`id`);

--
-- Indici per le tabelle `recensione`
--
ALTER TABLE `recensione`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_adozione` (`id_adozione`);

--
-- Indici per le tabelle `utente`
--
ALTER TABLE `utente`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `email` (`email`),
  ADD UNIQUE KEY `username` (`username`);

--
-- AUTO_INCREMENT per le tabelle scaricate
--

--
-- AUTO_INCREMENT per la tabella `adozione`
--
ALTER TABLE `adozione`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT per la tabella `albero`
--
ALTER TABLE `albero`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=67;

--
-- AUTO_INCREMENT per la tabella `recensione`
--
ALTER TABLE `recensione`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT per la tabella `utente`
--
ALTER TABLE `utente`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Limiti per le tabelle scaricate
--

--
-- Limiti per la tabella `adozione`
--
ALTER TABLE `adozione`
  ADD CONSTRAINT `adozione_ibfk_1` FOREIGN KEY (`id_albero`) REFERENCES `albero` (`id`) ON DELETE CASCADE,
  ADD CONSTRAINT `adozione_ibfk_2` FOREIGN KEY (`id_utente`) REFERENCES `utente` (`id`) ON DELETE CASCADE;

--
-- Limiti per la tabella `recensione`
--
ALTER TABLE `recensione`
  ADD CONSTRAINT `recensione_ibfk_1` FOREIGN KEY (`id_adozione`) REFERENCES `adozione` (`id`) ON DELETE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
