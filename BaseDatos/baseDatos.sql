-- MySQL dump 10.13  Distrib 8.0.23, for Win64 (x86_64)
--
-- Host: localhost    Database: ejercicio
-- ------------------------------------------------------
-- Server version	8.0.23

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `inventario`
--
DROP schema IF EXISTS `ejercicio`;
CREATE SCHEMA `ejercicio` ;
USE `ejercicio` ;


DROP TABLE IF EXISTS `inventario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `inventario` (
  `idinventario` int NOT NULL AUTO_INCREMENT,
  `cod_producto` varchar(45) NOT NULL,
  `can_producto` int NOT NULL,
  `descripcion` varchar(245) NOT NULL,
  `precio_compra_sin_iva` double NOT NULL,
  `precio_compra_con_iva` double NOT NULL,
  `precio_mayorista` double NOT NULL,
  `precio_cliente_fijo` double NOT NULL,
  `precio_cliente_normal` double NOT NULL,
  `fecha_caducidad` date DEFAULT NULL,
  `fecha_registro` date NOT NULL,
  `fecha_actualizacion` date NOT NULL,
  PRIMARY KEY (`idinventario`),
  UNIQUE KEY `cod_producto_UNIQUE` (`cod_producto`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `inventario`
--

LOCK TABLES `inventario` WRITE;
/*!40000 ALTER TABLE `inventario` DISABLE KEYS */;
/*!40000 ALTER TABLE `inventario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `persona`
--

DROP TABLE IF EXISTS `persona`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `persona` (
  `idpersona` int NOT NULL AUTO_INCREMENT,
  `cedula` varchar(20) NOT NULL,
  `nombres` varchar(45) NOT NULL,
  `apellidos` varchar(45) NOT NULL,
  `direccion` varchar(145) NOT NULL,
  `correo` varchar(45) NOT NULL,
  `telefono` varchar(10) NOT NULL,
  `fecha_registro` date NOT NULL,
  `genero` int DEFAULT NULL,
  `fecha_actualizacion` date DEFAULT NULL,
  `fecha_nacimiento` date DEFAULT NULL,
  PRIMARY KEY (`idpersona`),
  UNIQUE KEY `cedula_UNIQUE` (`cedula`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `persona`
--

LOCK TABLES `persona` WRITE;
/*!40000 ALTER TABLE `persona` DISABLE KEYS */;
INSERT INTO `persona` VALUES (17,'1106049925','PABLO','ABRIGO','LOJA','pabrigo@gmail.com','0979256123','2021-12-01',NULL,NULL,NULL),(18,'1105138166','KEVIN','MORA','LA ARGELIA','kmora@gmail.com','0995736565','2021-12-01',NULL,NULL,NULL),(20,'1104268899','JOHN','SOLANO','DANIEL ALVAREZ','jpsolanoc@gmail.com','0979256768','2021-03-19',1,NULL,'1987-12-22');
/*!40000 ALTER TABLE `persona` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `proveedores`
--

DROP TABLE IF EXISTS `proveedores`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `proveedores` (
  `id_proveedores` int NOT NULL AUTO_INCREMENT,
  `ruc` varchar(13) NOT NULL,
  `razon_social` varchar(100) NOT NULL,
  `tipo_actividad` varchar(250) NOT NULL,
  `nombre_representante_legal` varchar(50) NOT NULL,
  `apellido_representante_legal` varchar(50) NOT NULL,
  `telefono` varchar(10) NOT NULL,
  `correo` varchar(45) NOT NULL,
  `direccion` varchar(45) NOT NULL,
  `fecha_registro` date NOT NULL,
  `fecha_vencimiento_deuda` date DEFAULT NULL,
  PRIMARY KEY (`id_proveedores`),
  UNIQUE KEY `ruc_UNIQUE` (`ruc`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `proveedores`
--

LOCK TABLES `proveedores` WRITE;
/*!40000 ALTER TABLE `proveedores` DISABLE KEYS */;
INSERT INTO `proveedores` VALUES (6,'1104268899001','DEVCUSTOMSOFTWARE','DESARROLLO DE SOFTWARE','JOHN','SOLANO','0979256768','jpsolanoc@gmail.com','null','2021-03-18',NULL);
/*!40000 ALTER TABLE `proveedores` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tipo_usuario`
--

DROP TABLE IF EXISTS `tipo_usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tipo_usuario` (
  `idtipo_usuario` int NOT NULL AUTO_INCREMENT,
  `tipo_usuario_sistema` int NOT NULL DEFAULT '0' COMMENT '0:Administrador\n1: Cliente\n2: Empleado\n3: Gerente\n4: Gerente General',
  `id_persona_sistema` int NOT NULL,
  `contrasenia` varchar(45) NOT NULL,
  PRIMARY KEY (`idtipo_usuario`),
  KEY `fk_persona_usuario_sistema_idx` (`id_persona_sistema`),
  CONSTRAINT `fk_persona_usuario_sistema` FOREIGN KEY (`id_persona_sistema`) REFERENCES `persona` (`idpersona`) ON DELETE RESTRICT ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tipo_usuario`
--

LOCK TABLES `tipo_usuario` WRITE;
/*!40000 ALTER TABLE `tipo_usuario` DISABLE KEYS */;
/*!40000 ALTER TABLE `tipo_usuario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'ejercicio'
--

--
-- Dumping routines for database 'ejercicio'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-03-23 11:59:30
