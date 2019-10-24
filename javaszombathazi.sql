-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Gép: 127.0.0.1
-- Létrehozás ideje: 2019. Okt 24. 08:15
-- Kiszolgáló verziója: 10.4.6-MariaDB
-- PHP verzió: 7.3.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Adatbázis: `javaszombathazi`
--

-- --------------------------------------------------------

--
-- Tábla szerkezet ehhez a táblához `cars`
--

CREATE TABLE `cars` (
  `id` int(250) NOT NULL,
  `brand` varchar(45) NOT NULL,
  `color` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- A tábla adatainak kiíratása `cars`
--

INSERT INTO `cars` (`id`, `brand`, `color`) VALUES
(3, 'Opel', 'piros'),
(5, 'Suzuki', 'zold'),
(6, 'Opel', 'kek'),
(26, 'asdad', 'asdad'),
(27, 'assaa', 'dasasd'),
(28, 'asdasd', 'asdasd'),
(29, 'sdad', 'adad'),
(31, 'sdfdsf', 'dsfdsf'),
(36, 'sdada', 'ada'),
(40, 'sdfdsf', 'sdf');

-- --------------------------------------------------------

--
-- Tábla szerkezet ehhez a táblához `users`
--

CREATE TABLE `users` (
  `id` int(255) NOT NULL,
  `username` varchar(45) CHARACTER SET utf8 COLLATE utf8_hungarian_ci NOT NULL,
  `password` varchar(45) CHARACTER SET utf8 COLLATE utf8_hungarian_ci NOT NULL,
  `user_security_level` int(1) NOT NULL DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- A tábla adatainak kiíratása `users`
--

INSERT INTO `users` (`id`, `username`, `password`, `user_security_level`) VALUES
(1, 'elek', 'secret', 0);

--
-- Indexek a kiírt táblákhoz
--

--
-- A tábla indexei `cars`
--
ALTER TABLE `cars`
  ADD PRIMARY KEY (`id`);

--
-- A tábla indexei `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`);

--
-- A kiírt táblák AUTO_INCREMENT értéke
--

--
-- AUTO_INCREMENT a táblához `cars`
--
ALTER TABLE `cars`
  MODIFY `id` int(250) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=60;

--
-- AUTO_INCREMENT a táblához `users`
--
ALTER TABLE `users`
  MODIFY `id` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
