-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Creato il: Ott 23, 2024 alle 17:24
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
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT per la tabella `recensione`
--
ALTER TABLE `recensione`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT per la tabella `utente`
--
ALTER TABLE `utente`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

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
