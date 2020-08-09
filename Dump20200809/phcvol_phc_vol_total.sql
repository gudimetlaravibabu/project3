-- MySQL dump 10.13  Distrib 8.0.17, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: phcvol
-- ------------------------------------------------------
-- Server version	8.0.13

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
-- Table structure for table `phc_vol_total`
--

DROP TABLE IF EXISTS `phc_vol_total`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `phc_vol_total` (
  `dm` varchar(255) NOT NULL,
  `phcaod` double NOT NULL,
  `phcaol` double NOT NULL,
  `phc_gap` double NOT NULL,
  `phc_target` double NOT NULL,
  `remarks` varchar(255) DEFAULT NULL,
  `volaod` double NOT NULL,
  `vol_gap` double NOT NULL,
  `vol_target` double NOT NULL,
  PRIMARY KEY (`dm`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `phc_vol_total`
--

LOCK TABLES `phc_vol_total` WRITE;
/*!40000 ALTER TABLE `phc_vol_total` DISABLE KEYS */;
INSERT INTO `phc_vol_total` VALUES ('Amit',615,613,26,639,'NA',629.22,23.609999999999992,652.83),('Bindu',480,480,-4,476,'NA',497.35999999999996,-2.009999999999996,495.35),('Harish',532,534,8,542,'NA',533.79,5.91,539.7),('Mukul',127,127,9,136,'NA',130.58,1.4199999999999995,132),('NP',247,242,7,249,'NA',261.07,8.379999999999997,269.31);
/*!40000 ALTER TABLE `phc_vol_total` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-08-09 20:59:34
