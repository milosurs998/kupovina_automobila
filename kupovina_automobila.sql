-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 04, 2019 at 11:47 AM
-- Server version: 10.3.15-MariaDB
-- PHP Version: 7.1.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `kupovina_automobila`
--

-- --------------------------------------------------------

--
-- Table structure for table `auto`
--

CREATE TABLE `auto` (
  `auto_id` int(10) UNSIGNED NOT NULL,
  `marka` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `model` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `godiste` varchar(4) COLLATE utf8_unicode_ci NOT NULL,
  `boja` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `konjska_snaga` double UNSIGNED NOT NULL,
  `kupac_id` int(10) UNSIGNED NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `auto`
--

INSERT INTO `auto` (`auto_id`, `marka`, `model`, `godiste`, `boja`, `konjska_snaga`, `kupac_id`) VALUES
(1, 'audi', 'A6Sedan', '2019', 'crna', 248, 1),
(2, 'audi', 'Q7', '2018', 'siva', 333, 1),
(3, 'mercedes-amg', 'C43Sedan', '2019', 'crna', 390, 2),
(4, 'mercedes-amg', 'A35', '2019', 'bela', 306, 3),
(5, 'mercedes-amg', 'CLA35', '2019', 'bela', 306, 4),
(6, 'audi', 'TT', '2017', 'crna', 292, 5);

-- --------------------------------------------------------

--
-- Table structure for table `kupac`
--

CREATE TABLE `kupac` (
  `kupac_id` int(10) UNSIGNED NOT NULL,
  `ime` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `prezime` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `br_tel` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `adresa` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `godiste` varchar(4) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `kupac`
--

INSERT INTO `kupac` (`kupac_id`, `ime`, `prezime`, `br_tel`, `adresa`, `godiste`) VALUES
(1, 'Milos', 'Urs', '0645553334', 'Diznijeva32', '1999'),
(2, 'Nikola', 'Mikic', '0633334444', 'Kolarska11', '1998'),
(3, 'Ana', 'Vranic', '0655554445', 'Dositejeva3', '1991'),
(4, 'Stefan', 'Stankelic', '0622225556', 'Cegarska33', '1992'),
(5, 'Jovana', 'Jovanovic', '0644322345', 'Nemanjina12', '2000');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `auto`
--
ALTER TABLE `auto`
  ADD PRIMARY KEY (`auto_id`),
  ADD KEY `kupac_id` (`kupac_id`);

--
-- Indexes for table `kupac`
--
ALTER TABLE `kupac`
  ADD PRIMARY KEY (`kupac_id`),
  ADD UNIQUE KEY `br_tel` (`br_tel`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `auto`
--
ALTER TABLE `auto`
  MODIFY `auto_id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `kupac`
--
ALTER TABLE `kupac`
  MODIFY `kupac_id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `auto`
--
ALTER TABLE `auto`
  ADD CONSTRAINT `auto_ibfk_1` FOREIGN KEY (`kupac_id`) REFERENCES `kupac` (`kupac_id`) ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
