-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 22-03-2022 a las 21:51:53
-- Versión del servidor: 10.4.19-MariaDB
-- Versión de PHP: 8.0.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `tutoriasfei`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `problematica`
--

CREATE TABLE `problematica` (
  `idProblematica` int(11) NOT NULL,
  `idSesion` int(11) NOT NULL,
  `titulo` varchar(50) NOT NULL,
  `solucion` varchar(250) DEFAULT NULL,
  `descripcion` varchar(250) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `problematica`
--

INSERT INTO `problematica` (`idProblematica`, `idSesion`, `titulo`, `solucion`, `descripcion`) VALUES
(4, 1, 'ninguno', NULL, 'nada'),
(7, 1, 'Se enfermó', 'El estudiante va al doctor', 'El estudiante se enfermó');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `problematica`
--
ALTER TABLE `problematica`
  ADD PRIMARY KEY (`idProblematica`),
  ADD KEY `idSesion` (`idSesion`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `problematica`
--
ALTER TABLE `problematica`
  MODIFY `idProblematica` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `problematica`
--
ALTER TABLE `problematica`
  ADD CONSTRAINT `problematica_ibfk_1` FOREIGN KEY (`idSesion`) REFERENCES `sesiondetutoria` (`idSesion`) ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
