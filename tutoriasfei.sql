-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 23-03-2022 a las 01:18:27
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
-- Estructura de tabla para la tabla `academico`
--

CREATE TABLE `academico` (
  `numeroDePersonal` int(11) NOT NULL,
  `Nombre` varchar(100) NOT NULL,
  `apellidoPaterno` varchar(50) NOT NULL,
  `apellidoMaterno` varchar(50) NOT NULL,
  `correoPersonal` varchar(50) NOT NULL,
  `correoInstitucional` varchar(50) NOT NULL,
  `nrc` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `estudiante`
--

CREATE TABLE `estudiante` (
  `matricula` varchar(10) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `apellidoPaterno` varchar(50) NOT NULL,
  `apellidoMaterno` varchar(50) NOT NULL,
  `correoPersonal` varchar(50) NOT NULL,
  `correoInstitucional` varchar(50) NOT NULL,
  `claveDeCarrera` varchar(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `experienciaeducativa`
--

CREATE TABLE `experienciaeducativa` (
  `nrc` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `claveCarrera` varchar(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `experienciaeducativa`
--

INSERT INTO `experienciaeducativa` (`nrc`, `nombre`, `claveCarrera`) VALUES
(6987, 'Lectura y Redaccion', 'TECO'),
(6987, 'Lectura y Redaccion', 'TECO');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `imparte`
--

CREATE TABLE `imparte` (
  `numeroDePersonal` int(11) NOT NULL,
  `idSesion` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `presenta`
--

CREATE TABLE `presenta` (
  `idProblematica` int(11) NOT NULL,
  `nrc` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

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
(4, 1, 'ninguno', NULL, 'nada');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `programaeducativo`
--

CREATE TABLE `programaeducativo` (
  `claveDeCarrera` varchar(4) NOT NULL,
  `nombre` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `programaeducativo`
--

INSERT INTO `programaeducativo` (`claveDeCarrera`, `nombre`) VALUES
('TECO', 'Tecnologías Computacionales'),
('TECO', 'Tecnologías Computacionales');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `recibe`
--

CREATE TABLE `recibe` (
  `idSesion` int(11) NOT NULL,
  `matricula` varchar(10) NOT NULL,
  `horario` time NOT NULL,
  `enRiesgo` tinyint(1) NOT NULL,
  `asiste` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `reporta`
--

CREATE TABLE `reporta` (
  `idProblematica` int(11) NOT NULL,
  `matricula` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `rol`
--

CREATE TABLE `rol` (
  `idRol` int(11) NOT NULL,
  `nombreRol` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `rolusuario`
--

CREATE TABLE `rolusuario` (
  `idUsuario` int(11) NOT NULL,
  `idRol` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `sesiondetutoria`
--

CREATE TABLE `sesiondetutoria` (
  `idSesion` int(11) NOT NULL,
  `numeroDeSesion` int(11) NOT NULL,
  `periodo` varchar(50) NOT NULL,
  `comentarios` varchar(250) NOT NULL,
  `fechaSesion` date NOT NULL,
  `fechacierre` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `sesiondetutoria`
--

INSERT INTO `sesiondetutoria` (`idSesion`, `numeroDeSesion`, `periodo`, `comentarios`, `fechaSesion`, `fechacierre`) VALUES
(1, 1, '2022-2024', 'registro de prueba', '2022-03-22', '2022-03-25'),
(3, 2, '2022-2024', 'esta es otra prueba', '2022-03-21', '2022-03-24');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tablaprueba`
--

CREATE TABLE `tablaprueba` (
  `idTabla` varchar(4) NOT NULL,
  `nombre` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `tablaprueba`
--

INSERT INTO `tablaprueba` (`idTabla`, `nombre`) VALUES
('hola', 'registro de prueba'),
('hola', 'registro de prueba');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `trabaja`
--

CREATE TABLE `trabaja` (
  `claveDeCarrera` varchar(4) NOT NULL,
  `numeroDePersonal` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tutoracademico`
--

CREATE TABLE `tutoracademico` (
  `numeroDePersonal` int(11) NOT NULL,
  `tipoDeDocente` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `idUsuario` int(11) NOT NULL,
  `contraseña` varchar(100) NOT NULL,
  `nombreDeUsuario` varchar(50) NOT NULL,
  `numeroDePersonal` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `academico`
--
ALTER TABLE `academico`
  ADD PRIMARY KEY (`numeroDePersonal`),
  ADD KEY `nrc` (`nrc`);

--
-- Indices de la tabla `estudiante`
--
ALTER TABLE `estudiante`
  ADD PRIMARY KEY (`matricula`),
  ADD KEY `claveDeCarrera` (`claveDeCarrera`);

--
-- Indices de la tabla `experienciaeducativa`
--
ALTER TABLE `experienciaeducativa`
  ADD KEY `claveCarrera` (`claveCarrera`),
  ADD KEY `nrc` (`nrc`) USING BTREE;

--
-- Indices de la tabla `imparte`
--
ALTER TABLE `imparte`
  ADD KEY `numeroDePersonal` (`numeroDePersonal`),
  ADD KEY `idSesion` (`idSesion`);

--
-- Indices de la tabla `presenta`
--
ALTER TABLE `presenta`
  ADD KEY `idProblematica` (`idProblematica`),
  ADD KEY `nrc` (`nrc`);

--
-- Indices de la tabla `problematica`
--
ALTER TABLE `problematica`
  ADD PRIMARY KEY (`idProblematica`),
  ADD KEY `idSesion` (`idSesion`);

--
-- Indices de la tabla `programaeducativo`
--
ALTER TABLE `programaeducativo`
  ADD KEY `claveDeCarrera` (`claveDeCarrera`) USING BTREE;

--
-- Indices de la tabla `recibe`
--
ALTER TABLE `recibe`
  ADD KEY `matricula` (`matricula`),
  ADD KEY `idSesion` (`idSesion`);

--
-- Indices de la tabla `reporta`
--
ALTER TABLE `reporta`
  ADD KEY `idProblematica` (`idProblematica`),
  ADD KEY `matricula` (`matricula`);

--
-- Indices de la tabla `rol`
--
ALTER TABLE `rol`
  ADD PRIMARY KEY (`idRol`);

--
-- Indices de la tabla `rolusuario`
--
ALTER TABLE `rolusuario`
  ADD KEY `idUsuario` (`idUsuario`),
  ADD KEY `idRol` (`idRol`);

--
-- Indices de la tabla `sesiondetutoria`
--
ALTER TABLE `sesiondetutoria`
  ADD PRIMARY KEY (`idSesion`);

--
-- Indices de la tabla `trabaja`
--
ALTER TABLE `trabaja`
  ADD KEY `claveDeCarrera` (`claveDeCarrera`),
  ADD KEY `numeroDePersonal` (`numeroDePersonal`);

--
-- Indices de la tabla `tutoracademico`
--
ALTER TABLE `tutoracademico`
  ADD KEY `numeroDePersonal` (`numeroDePersonal`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`idUsuario`),
  ADD KEY `numeroDePersonal` (`numeroDePersonal`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `academico`
--
ALTER TABLE `academico`
  MODIFY `numeroDePersonal` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=78945;

--
-- AUTO_INCREMENT de la tabla `problematica`
--
ALTER TABLE `problematica`
  MODIFY `idProblematica` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT de la tabla `rol`
--
ALTER TABLE `rol`
  MODIFY `idRol` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `sesiondetutoria`
--
ALTER TABLE `sesiondetutoria`
  MODIFY `idSesion` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `usuario`
--
ALTER TABLE `usuario`
  MODIFY `idUsuario` int(11) NOT NULL AUTO_INCREMENT;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `academico`
--
ALTER TABLE `academico`
  ADD CONSTRAINT `academico_ibfk_1` FOREIGN KEY (`nrc`) REFERENCES `experienciaeducativa` (`nrc`) ON UPDATE CASCADE;

--
-- Filtros para la tabla `experienciaeducativa`
--
ALTER TABLE `experienciaeducativa`
  ADD CONSTRAINT `experienciaeducativa_ibfk_1` FOREIGN KEY (`claveCarrera`) REFERENCES `programaeducativo` (`claveDeCarrera`) ON UPDATE CASCADE;

--
-- Filtros para la tabla `imparte`
--
ALTER TABLE `imparte`
  ADD CONSTRAINT `imparte_ibfk_1` FOREIGN KEY (`numeroDePersonal`) REFERENCES `tutoracademico` (`numeroDePersonal`) ON UPDATE CASCADE,
  ADD CONSTRAINT `imparte_ibfk_2` FOREIGN KEY (`idSesion`) REFERENCES `sesiondetutoria` (`idSesion`) ON UPDATE CASCADE;

--
-- Filtros para la tabla `presenta`
--
ALTER TABLE `presenta`
  ADD CONSTRAINT `presenta_ibfk_1` FOREIGN KEY (`idProblematica`) REFERENCES `problematica` (`idProblematica`) ON UPDATE CASCADE,
  ADD CONSTRAINT `presenta_ibfk_2` FOREIGN KEY (`nrc`) REFERENCES `experienciaeducativa` (`nrc`) ON UPDATE CASCADE;

--
-- Filtros para la tabla `problematica`
--
ALTER TABLE `problematica`
  ADD CONSTRAINT `problematica_ibfk_1` FOREIGN KEY (`idSesion`) REFERENCES `sesiondetutoria` (`idSesion`) ON UPDATE CASCADE;

--
-- Filtros para la tabla `recibe`
--
ALTER TABLE `recibe`
  ADD CONSTRAINT `recibe_ibfk_2` FOREIGN KEY (`matricula`) REFERENCES `estudiante` (`matricula`) ON UPDATE CASCADE,
  ADD CONSTRAINT `recibe_ibfk_3` FOREIGN KEY (`idSesion`) REFERENCES `sesiondetutoria` (`idSesion`) ON UPDATE CASCADE;

--
-- Filtros para la tabla `reporta`
--
ALTER TABLE `reporta`
  ADD CONSTRAINT `reporta_ibfk_1` FOREIGN KEY (`matricula`) REFERENCES `estudiante` (`matricula`) ON UPDATE CASCADE,
  ADD CONSTRAINT `reporta_ibfk_2` FOREIGN KEY (`idProblematica`) REFERENCES `problematica` (`idProblematica`) ON UPDATE CASCADE;

--
-- Filtros para la tabla `rolusuario`
--
ALTER TABLE `rolusuario`
  ADD CONSTRAINT `rolusuario_ibfk_1` FOREIGN KEY (`idRol`) REFERENCES `rol` (`idRol`) ON UPDATE CASCADE,
  ADD CONSTRAINT `rolusuario_ibfk_2` FOREIGN KEY (`idUsuario`) REFERENCES `usuario` (`idUsuario`) ON UPDATE CASCADE;

--
-- Filtros para la tabla `trabaja`
--
ALTER TABLE `trabaja`
  ADD CONSTRAINT `trabaja_ibfk_1` FOREIGN KEY (`claveDeCarrera`) REFERENCES `programaeducativo` (`claveDeCarrera`) ON UPDATE CASCADE,
  ADD CONSTRAINT `trabaja_ibfk_2` FOREIGN KEY (`numeroDePersonal`) REFERENCES `academico` (`numeroDePersonal`) ON UPDATE CASCADE;

--
-- Filtros para la tabla `tutoracademico`
--
ALTER TABLE `tutoracademico`
  ADD CONSTRAINT `tutoracademico_ibfk_1` FOREIGN KEY (`numeroDePersonal`) REFERENCES `academico` (`numeroDePersonal`) ON UPDATE CASCADE;

--
-- Filtros para la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD CONSTRAINT `usuario_ibfk_1` FOREIGN KEY (`numeroDePersonal`) REFERENCES `academico` (`numeroDePersonal`) ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
