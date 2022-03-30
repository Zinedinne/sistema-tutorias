-- MariaDB dump 10.19  Distrib 10.4.24-MariaDB, for Win64 (AMD64)
--
-- Host: localhost    Database: tutoriasfei
-- ------------------------------------------------------
-- Server version	10.4.24-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `academico`
--

DROP TABLE IF EXISTS `academico`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `academico` (
  `numeroDePersonal` int(11) NOT NULL AUTO_INCREMENT,
  `Nombre` varchar(100) NOT NULL,
  `apellidoPaterno` varchar(50) NOT NULL,
  `apellidoMaterno` varchar(50) NOT NULL,
  `correoPersonal` varchar(50) NOT NULL,
  `correoInstitucional` varchar(50) NOT NULL,
  `nrc` int(11) DEFAULT NULL,
  PRIMARY KEY (`numeroDePersonal`),
  KEY `nrc` (`nrc`),
  CONSTRAINT `academico_ibfk_1` FOREIGN KEY (`nrc`) REFERENCES `experienciaeducativa` (`nrc`) ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=78945 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `academico`
--

LOCK TABLES `academico` WRITE;
/*!40000 ALTER TABLE `academico` DISABLE KEYS */;
/*!40000 ALTER TABLE `academico` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `estudiante`
--

DROP TABLE IF EXISTS `estudiante`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `estudiante` (
  `matricula` varchar(10) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `apellidoPaterno` varchar(50) NOT NULL,
  `apellidoMaterno` varchar(50) NOT NULL,
  `correoPersonal` varchar(50) NOT NULL,
  `correoInstitucional` varchar(50) NOT NULL,
  `claveDeCarrera` varchar(4) NOT NULL,
  PRIMARY KEY (`matricula`),
  KEY `claveDeCarrera` (`claveDeCarrera`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `estudiante`
--

LOCK TABLES `estudiante` WRITE;
/*!40000 ALTER TABLE `estudiante` DISABLE KEYS */;
/*!40000 ALTER TABLE `estudiante` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `experienciaeducativa`
--

DROP TABLE IF EXISTS `experienciaeducativa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `experienciaeducativa` (
  `nrc` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `claveCarrera` varchar(4) NOT NULL,
  KEY `claveCarrera` (`claveCarrera`),
  KEY `nrc` (`nrc`) USING BTREE,
  CONSTRAINT `experienciaeducativa_ibfk_1` FOREIGN KEY (`claveCarrera`) REFERENCES `programaeducativo` (`claveDeCarrera`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `experienciaeducativa`
--

LOCK TABLES `experienciaeducativa` WRITE;
/*!40000 ALTER TABLE `experienciaeducativa` DISABLE KEYS */;
INSERT INTO `experienciaeducativa` VALUES (6987,'Lectura y Redaccion','TECO'),(6987,'Lectura y Redaccion','TECO'),(6987,'Lectura y Redaccion','TECO'),(6987,'Lectura y Redaccion','TECO'),(6987,'Lectura y Redaccion','TECO'),(6987,'Lectura y Redaccion','TECO'),(6987,'Lectura y Redaccion','TECO'),(6987,'Lectura y Redaccion','TECO'),(6987,'Lectura y Redaccion','TECO'),(6987,'Lectura y Redaccion','TECO');
/*!40000 ALTER TABLE `experienciaeducativa` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `imparte`
--

DROP TABLE IF EXISTS `imparte`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `imparte` (
  `numeroDePersonal` int(11) NOT NULL,
  `idSesion` int(11) NOT NULL,
  KEY `numeroDePersonal` (`numeroDePersonal`),
  KEY `idSesion` (`idSesion`),
  CONSTRAINT `imparte_ibfk_1` FOREIGN KEY (`numeroDePersonal`) REFERENCES `tutoracademico` (`numeroDePersonal`) ON UPDATE CASCADE,
  CONSTRAINT `imparte_ibfk_2` FOREIGN KEY (`idSesion`) REFERENCES `sesiondetutoria` (`idSesion`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `imparte`
--

LOCK TABLES `imparte` WRITE;
/*!40000 ALTER TABLE `imparte` DISABLE KEYS */;
/*!40000 ALTER TABLE `imparte` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `presenta`
--

DROP TABLE IF EXISTS `presenta`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `presenta` (
  `idProblematica` int(11) NOT NULL,
  `nrc` int(11) NOT NULL,
  KEY `idProblematica` (`idProblematica`),
  KEY `nrc` (`nrc`),
  CONSTRAINT `presenta_ibfk_1` FOREIGN KEY (`idProblematica`) REFERENCES `problematica` (`idProblematica`) ON UPDATE CASCADE,
  CONSTRAINT `presenta_ibfk_2` FOREIGN KEY (`nrc`) REFERENCES `experienciaeducativa` (`nrc`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `presenta`
--

LOCK TABLES `presenta` WRITE;
/*!40000 ALTER TABLE `presenta` DISABLE KEYS */;
/*!40000 ALTER TABLE `presenta` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `problematica`
--

DROP TABLE IF EXISTS `problematica`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `problematica` (
  `idProblematica` int(11) NOT NULL AUTO_INCREMENT,
  `idSesion` int(11) NOT NULL,
  `titulo` varchar(50) NOT NULL,
  `solucion` varchar(250) DEFAULT NULL,
  `descripcion` varchar(250) NOT NULL,
  PRIMARY KEY (`idProblematica`),
  KEY `idSesion` (`idSesion`),
  CONSTRAINT `problematica_ibfk_1` FOREIGN KEY (`idSesion`) REFERENCES `sesiondetutoria` (`idSesion`) ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `problematica`
--

LOCK TABLES `problematica` WRITE;
/*!40000 ALTER TABLE `problematica` DISABLE KEYS */;
INSERT INTO `problematica` VALUES (4,1,'ninguno',NULL,'nada');
/*!40000 ALTER TABLE `problematica` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `programaeducativo`
--

DROP TABLE IF EXISTS `programaeducativo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `programaeducativo` (
  `claveDeCarrera` varchar(4) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  KEY `claveDeCarrera` (`claveDeCarrera`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `programaeducativo`
--

LOCK TABLES `programaeducativo` WRITE;
/*!40000 ALTER TABLE `programaeducativo` DISABLE KEYS */;
INSERT INTO `programaeducativo` VALUES ('TECO','Tecnologías Computacionales'),('TECO','Tecnologías Computacionales'),('TECO','Tecnologías Computacionales'),('TECO','Tecnologías Computacionales'),('TECO','Tecnologías Computacionales'),('TECO','Tecnologías Computacionales'),('TECO','Tecnologías Computacionales'),('TECO','Tecnologías Computacionales'),('TECO','Tecnologías Computacionales'),('TECO','Tecnologías Computacionales');
/*!40000 ALTER TABLE `programaeducativo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `recibe`
--

DROP TABLE IF EXISTS `recibe`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `recibe` (
  `idSesion` int(11) NOT NULL,
  `matricula` varchar(10) NOT NULL,
  `horario` time NOT NULL,
  `enRiesgo` tinyint(1) NOT NULL,
  `asiste` tinyint(1) NOT NULL,
  KEY `matricula` (`matricula`),
  KEY `idSesion` (`idSesion`),
  CONSTRAINT `recibe_ibfk_2` FOREIGN KEY (`matricula`) REFERENCES `estudiante` (`matricula`) ON UPDATE CASCADE,
  CONSTRAINT `recibe_ibfk_3` FOREIGN KEY (`idSesion`) REFERENCES `sesiondetutoria` (`idSesion`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `recibe`
--

LOCK TABLES `recibe` WRITE;
/*!40000 ALTER TABLE `recibe` DISABLE KEYS */;
/*!40000 ALTER TABLE `recibe` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `reporta`
--

DROP TABLE IF EXISTS `reporta`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `reporta` (
  `idProblematica` int(11) NOT NULL,
  `matricula` varchar(10) NOT NULL,
  KEY `idProblematica` (`idProblematica`),
  KEY `matricula` (`matricula`),
  CONSTRAINT `reporta_ibfk_1` FOREIGN KEY (`matricula`) REFERENCES `estudiante` (`matricula`) ON UPDATE CASCADE,
  CONSTRAINT `reporta_ibfk_2` FOREIGN KEY (`idProblematica`) REFERENCES `problematica` (`idProblematica`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `reporta`
--

LOCK TABLES `reporta` WRITE;
/*!40000 ALTER TABLE `reporta` DISABLE KEYS */;
/*!40000 ALTER TABLE `reporta` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `rol`
--

DROP TABLE IF EXISTS `rol`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `rol` (
  `idRol` int(11) NOT NULL AUTO_INCREMENT,
  `nombreRol` varchar(50) NOT NULL,
  PRIMARY KEY (`idRol`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `rol`
--

LOCK TABLES `rol` WRITE;
/*!40000 ALTER TABLE `rol` DISABLE KEYS */;
/*!40000 ALTER TABLE `rol` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `rolusuario`
--

DROP TABLE IF EXISTS `rolusuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `rolusuario` (
  `idUsuario` int(11) NOT NULL,
  `idRol` int(11) NOT NULL,
  KEY `idUsuario` (`idUsuario`),
  KEY `idRol` (`idRol`),
  CONSTRAINT `rolusuario_ibfk_1` FOREIGN KEY (`idRol`) REFERENCES `rol` (`idRol`) ON UPDATE CASCADE,
  CONSTRAINT `rolusuario_ibfk_2` FOREIGN KEY (`idUsuario`) REFERENCES `usuario` (`idUsuario`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `rolusuario`
--

LOCK TABLES `rolusuario` WRITE;
/*!40000 ALTER TABLE `rolusuario` DISABLE KEYS */;
/*!40000 ALTER TABLE `rolusuario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sesiondetutoria`
--

DROP TABLE IF EXISTS `sesiondetutoria`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sesiondetutoria` (
  `idSesion` int(11) NOT NULL AUTO_INCREMENT,
  `numeroDeSesion` int(11) NOT NULL,
  `periodo` varchar(50) NOT NULL,
  `comentarios` varchar(250) NOT NULL,
  `fechaSesion` date NOT NULL,
  `fechacierre` date NOT NULL,
  PRIMARY KEY (`idSesion`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sesiondetutoria`
--

LOCK TABLES `sesiondetutoria` WRITE;
/*!40000 ALTER TABLE `sesiondetutoria` DISABLE KEYS */;
INSERT INTO `sesiondetutoria` VALUES (1,1,'2022-2024','registro de prueba','2022-03-22','2022-03-25'),(3,2,'2022-2024','esta es otra prueba','2022-03-21','2022-03-24');
/*!40000 ALTER TABLE `sesiondetutoria` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `solucionproblematica`
--

DROP TABLE IF EXISTS `solucionproblematica`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `solucionproblematica` (
  `idSolucionProblematica` int(11) NOT NULL AUTO_INCREMENT,
  `idProblematica` int(11) NOT NULL,
  `descripcionSolucion` varchar(250) NOT NULL,
  PRIMARY KEY (`idSolucionProblematica`),
  KEY `idProblematica` (`idProblematica`),
  CONSTRAINT `solucionproblematica_ibfk_1` FOREIGN KEY (`idProblematica`) REFERENCES `problematica` (`idProblematica`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `solucionproblematica`
--

LOCK TABLES `solucionproblematica` WRITE;
/*!40000 ALTER TABLE `solucionproblematica` DISABLE KEYS */;
/*!40000 ALTER TABLE `solucionproblematica` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `trabaja`
--

DROP TABLE IF EXISTS `trabaja`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `trabaja` (
  `claveDeCarrera` varchar(4) NOT NULL,
  `numeroDePersonal` int(11) NOT NULL,
  KEY `claveDeCarrera` (`claveDeCarrera`),
  KEY `numeroDePersonal` (`numeroDePersonal`),
  CONSTRAINT `trabaja_ibfk_1` FOREIGN KEY (`claveDeCarrera`) REFERENCES `programaeducativo` (`claveDeCarrera`) ON UPDATE CASCADE,
  CONSTRAINT `trabaja_ibfk_2` FOREIGN KEY (`numeroDePersonal`) REFERENCES `academico` (`numeroDePersonal`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `trabaja`
--

LOCK TABLES `trabaja` WRITE;
/*!40000 ALTER TABLE `trabaja` DISABLE KEYS */;
/*!40000 ALTER TABLE `trabaja` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tutoracademico`
--

DROP TABLE IF EXISTS `tutoracademico`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tutoracademico` (
  `numeroDePersonal` int(11) NOT NULL,
  `tipoDeDocente` varchar(50) NOT NULL,
  KEY `numeroDePersonal` (`numeroDePersonal`),
  CONSTRAINT `tutoracademico_ibfk_1` FOREIGN KEY (`numeroDePersonal`) REFERENCES `academico` (`numeroDePersonal`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tutoracademico`
--

LOCK TABLES `tutoracademico` WRITE;
/*!40000 ALTER TABLE `tutoracademico` DISABLE KEYS */;
/*!40000 ALTER TABLE `tutoracademico` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `usuario` (
  `idUsuario` int(11) NOT NULL AUTO_INCREMENT,
  `contraseña` varchar(100) NOT NULL,
  `nombreDeUsuario` varchar(50) NOT NULL,
  `numeroDePersonal` int(11) NOT NULL,
  PRIMARY KEY (`idUsuario`),
  KEY `numeroDePersonal` (`numeroDePersonal`),
  CONSTRAINT `usuario_ibfk_1` FOREIGN KEY (`numeroDePersonal`) REFERENCES `academico` (`numeroDePersonal`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-03-29 18:30:38
