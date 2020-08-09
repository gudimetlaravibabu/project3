-- MySQL dump 10.13  Distrib 8.0.17, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: be
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
-- Table structure for table `account_summary`
--

DROP TABLE IF EXISTS `account_summary`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `account_summary` (
  `pmbe` double DEFAULT NULL,
  `rtb` double DEFAULT NULL,
  `dhbe` double DEFAULT NULL,
  `DA` varchar(255) DEFAULT NULL,
  `remarks` varchar(255) DEFAULT NULL,
  `dm` varchar(255) DEFAULT NULL,
  `account_name` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `account_summary`
--

LOCK TABLES `account_summary` WRITE;
/*!40000 ALTER TABLE `account_summary` DISABLE KEYS */;
INSERT INTO `account_summary` VALUES (0,177.54802999999998,164.1243,NULL,NULL,'NP','NBNCOMST'),(0,0,0,NULL,NULL,'NP','NSWDEMST'),(0,23.47167,75.2535,NULL,NULL,'NP','OPTUS'),(0,46.65868999999999,44,NULL,NULL,'NP','ADBMST'),(0,156.67681,146.2068,NULL,NULL,'NP','AUCWW'),(0,649.3818200000001,397.7932,NULL,NULL,'NP','M1LTD'),(0,114.94606999999999,129.006,NULL,NULL,'NP','AUSGRID'),(253.12319999999997,1209.03528,1129.5192,NULL,NULL,'NP','TELSTMST'),(0,75.29709,80.0268,NULL,NULL,'NP','SDGOEMST'),(0,102.89600000000002,113.15,NULL,NULL,'NP','TOSHAPAC'),(0,310.14623,386.3013,NULL,NULL,'NP','WESTPAC'),(0,11.15716,0,NULL,NULL,'NP','PERMTMST'),(0,0,150.507,NULL,NULL,'NP','SRSTLMST'),(0,203.78168999999997,199.2426,NULL,NULL,'NP','AUSDHMST'),(0,-0.7795699999999998,0,NULL,NULL,'NP','SHBTCMST'),(0,58.481539999999995,77.4036,NULL,NULL,'NP','ANZBGL'),(0,111.90853,110.5132,NULL,NULL,'NP','MENESMST'),(0,41.975,55.9026,NULL,NULL,'NP','RACQMST'),(0,96.19866,91.7376,NULL,NULL,'NP','NAB'),(0,55.23781,58.0527,NULL,NULL,'NP','ICAREMST'),(0,136.68303,112,NULL,NULL,'NP','POLO'),(0,108.51548,103.7082,NULL,NULL,'NP','ENECOMST'),(0,22.761629999999997,60,NULL,NULL,'NP','COKE'),(0,143.47331000000003,148.3569,NULL,NULL,'NP','MECCAMST'),(0,738.43675,816.213476,NULL,NULL,'NP','TRADUMST'),(0,10.81,6.4503,NULL,NULL,'NP','CCAMTMST'),(0,19.58668,22.2177,NULL,NULL,'NP','PENTSOLU'),(0,115.14153999999999,102.3519,NULL,NULL,'NP','TMKHDMST'),(0,49.716680000000004,53.7525,NULL,NULL,'NP','HCFAUMST'),(0,5.67866,12.25557,NULL,NULL,'NP','AUDVMST'),(0,141.31552,137.6064,NULL,NULL,'NP','SINGTMST'),(0,17.919999999999998,17.88989482541018,NULL,NULL,'NP','TOMCOMST'),(0,248.69642999999996,272.346,NULL,NULL,'NP','AUTOLL');
/*!40000 ALTER TABLE `account_summary` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-08-09 20:59:27