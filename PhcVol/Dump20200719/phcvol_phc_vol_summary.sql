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
-- Table structure for table `phc_vol_summary`
--

DROP TABLE IF EXISTS `phc_vol_summary`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `phc_vol_summary` (
  `account_name` varchar(255) NOT NULL,
  `da` varchar(255) DEFAULT NULL,
  `phcaod` double NOT NULL,
  `phcaol` double NOT NULL,
  `phc_target` double NOT NULL,
  `remarks` varchar(255) DEFAULT NULL,
  `volaod` double NOT NULL,
  `volaol` double NOT NULL,
  `vol_target` double NOT NULL,
  `dm` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `phc_vol_summary`
--

LOCK TABLES `phc_vol_summary` WRITE;
/*!40000 ALTER TABLE `phc_vol_summary` DISABLE KEYS */;
INSERT INTO `phc_vol_summary` VALUES ('ABNMST',NULL,126,127,136,NULL,130.54,0,132,'Mukul'),('NBNCOMST',NULL,8,8,9,NULL,8.17,0,9,'NP'),('NSWDEMST',NULL,0,0,0,NULL,0,0,0,'NP'),('ALGYRMST',NULL,0,0,0,NULL,0,0,0,'NP'),('OPTUS',NULL,6,6,7,NULL,7,0,6.7,'NP'),('ADBMST',NULL,10,10,11,NULL,10.32,0,11,'NP'),('AUCWW',NULL,3,0,0,NULL,5.9,0,5,'NP'),('M1LTD',NULL,32,36,34,NULL,31.55,0,31.5,'NP'),('AUSGRID',NULL,9,8,7,NULL,8.120000000000001,0,8.1,'NP'),('TELSTMST',NULL,55,55,59,NULL,61.629999999999995,0,63.5,'NP'),('SDGOEMST',NULL,4,4,3,NULL,4,0,4,'NP'),('TOSHAPAC',NULL,3,3,3,NULL,3,0,3,'NP'),('WESTPAC',NULL,14,14,17,NULL,17.830000000000002,0,19.33,'NP'),('PERMTMST',NULL,1,1,0,NULL,0,0,0,'NP'),('SRSTLMST',NULL,3,3,3,NULL,5,0,5,'NP'),('AUSDHMST',NULL,3,3,1,NULL,6.55,0,6.5,'NP'),('SHBTCMST',NULL,0,0,0,NULL,0.13,0,3.2,'NP'),('ANZBGL',NULL,2,2,2,NULL,3,0,2,'NP'),('MENESMST',NULL,11,11,11,NULL,11.5,0,12,'NP'),('RACQMST',NULL,2,2,2,NULL,2,0,1.5,'NP'),('NAB',NULL,2,2,3,NULL,2,0,3,'NP'),('ICAREMST',NULL,3,3,3,NULL,3,0,3,'NP'),('POLO',NULL,11,12,10,NULL,10.54,0,10,'NP'),('ENECOMST',NULL,3,3,3,NULL,3,0,3,'NP'),('MECCAMST',NULL,5,5,6,NULL,8,0,8,'NP'),('COKE',NULL,6,6,7,NULL,4,0,4.5,'NP'),('TRADUMST',NULL,18,18,19,NULL,17.5,0,17.5,'NP'),('CCAMTMST',NULL,2,0,2,NULL,1.88,0,1.82,'NP'),('PENTSOLU',NULL,0,0,2,NULL,0,0,1.5,'NP'),('SGHSLMST',NULL,0,0,0,NULL,0,0,0,'NP'),('TMKHDMST',NULL,4,4,4,NULL,4,0,4,'NP'),('POLHKMST',NULL,0,0,0,NULL,0,0,0,'NP'),('LIFULMST',NULL,0,0,0,NULL,0,0,0,'NP'),('HCFAUMST',NULL,1,1,1,NULL,2,0,2,'NP'),('AUDVMST',NULL,1,1,1,NULL,1,0,1,'NP'),('ABNMST',NULL,0,0,0,NULL,0,0,0.3,'NP'),('SINGTMST',NULL,5,5,6,NULL,5.08,0,6,'NP'),('TOMCOMST',NULL,1,1,1,NULL,1,0,1,'NP'),('AUTOLL',NULL,12,12,12,NULL,11.5,0,11.5,'NP'),('UK-MOB-1',NULL,38,38,41,NULL,38.480000000000004,0,41.4,'Amit'),('CHCMST',NULL,6,6,6,NULL,6,0,6,'Amit'),('UK-MOB-2',NULL,0,0,0,NULL,0,0,0,'Amit'),('AMDUSMST',NULL,5,5,4,NULL,4.55,0,4,'Amit'),('SBCMST',NULL,0,0,0,NULL,0,0,0,'Amit'),('TMBUSMST',NULL,3,3,3,NULL,3,0,3,'Amit'),('SSESLMST',NULL,12,12,12,NULL,10.74,0,9.5,'Amit'),('MarveMST',NULL,0,0,1,NULL,0.48,0,1,'Amit'),('AVNETMST',NULL,9,9,10,NULL,9.16,0,10,'Amit'),('VERIZMST',NULL,82,81,100,NULL,82.22,0,98,'Amit'),('BTMAST',NULL,0,0,0,NULL,0,0,0,'Amit'),('CONDTMST',NULL,20,20,19,NULL,19.810000000000002,0,21,'Amit'),('VFLNZMST',NULL,3,3,3,NULL,3.2199999999999998,0,3,'Amit'),('UCASMST',NULL,5,5,5,NULL,5,0,5,'Amit'),('BH1',NULL,0,0,0,NULL,0,0,0,'Amit'),('NALCHMST',NULL,0,0,0,NULL,0,0,0,'Amit'),('ADECCOGR',NULL,19,19,19,NULL,18.32,0,18.3,'Amit'),('SSEPLC',NULL,4,4,3,NULL,6.26,0,6.5,'Amit'),('TECLMST',NULL,0,0,0,NULL,0,0,0,'Amit'),('TRULPMST',NULL,0,0,0,NULL,0,0,0,'Amit'),('INGRDMST',NULL,6,6,6,NULL,6,0,6,'Amit'),('PWC',NULL,29,29,29,NULL,29.16,0,29,'Amit'),('BHPBNMST',NULL,5,4,4,NULL,4.97,0,4,'Amit'),('APSMAST',NULL,5,5,5,NULL,5.64,0,5.8,'Amit'),('CISCOMST',NULL,3,0,3,NULL,2.42,0,3,'Amit'),('CYPREMST',NULL,7,7,7,NULL,7,0,7,'Amit'),('AMEREN',NULL,21,21,21,NULL,21,0,21,'Amit'),('UNPERGDE',NULL,3,3,3,NULL,2.5,0,2.5,'Amit'),('INTELMST',NULL,15,15,10,NULL,14.16,0,10,'Amit'),('INMARMST',NULL,3,3,3,NULL,3,0,3,'Amit'),('EXELOMST',NULL,2,2,2,NULL,2,0,2,'Amit'),('BPMAST',NULL,95,95,98,NULL,96,0,98,'Amit'),('TTTELMST',NULL,1,1,1,NULL,1,0,1,'Amit'),('CONEDMST',NULL,22,22,22,NULL,22.97,0,22.84,'Amit'),('FPLMAST',NULL,21,21,24,NULL,21,0,24,'Amit'),('CAUASMST',NULL,0,0,0,NULL,0,0,0,'Amit'),('HPQMST',NULL,10,10,11,NULL,10.65,0,11.65,'Amit'),('NOKINMST',NULL,3,3,3,NULL,3,0,3,'Amit'),('SFDCMSTT',NULL,15,15,21,NULL,15,0,21,'Amit'),('ELPWAMST',NULL,0,0,1,NULL,0,0,0.84,'Amit'),('COPARMST',NULL,2,2,2,NULL,11,0,11,'Amit'),('WELSHMST',NULL,13,13,12,NULL,13,0,12,'Amit'),('EXXNMMST',NULL,1,2,1,NULL,1,0,1,'Amit'),('INOGYMST',NULL,38,38,37,NULL,39,0,38,'Amit'),('EONMST',NULL,4,4,5,NULL,3.42,0,5,'Amit'),('UPCBBMST',NULL,10,10,11,NULL,10,0,11,'Amit'),('SABRECO',NULL,23,23,44,NULL,26.97,0,48,'Amit'),('VANGUMST',NULL,0,0,0,NULL,0,0,0,'Amit'),('NUOOOOO2',NULL,0,0,0,NULL,0,0,0,'Amit'),('NUOOOOO1',NULL,21,21,20,NULL,20.55,0,20,'Amit'),('BAINCMST',NULL,3,3,3,NULL,3.11,0,1.5,'Amit'),('DISHPMST',NULL,0,0,4,NULL,0,0,3,'Amit'),('ADIDMAST',NULL,41,41,43,NULL,45.55,0,48,'Bindu'),('ENERMST',NULL,1,1,1,NULL,1,0,1,'Bindu'),('CAMPBMST',NULL,14,14,14,NULL,13.51,0,13.5,'Bindu'),('TOYOTMST',NULL,2,2,2,NULL,2,0,2,'Bindu'),('MACYSMST',NULL,22,22,22,NULL,22.5,0,23,'Bindu'),('DHLMST',NULL,16,15,15,NULL,15.8,0,15.65,'Bindu'),('UT',NULL,2,2,2,NULL,2.0300000000000002,0,2,'Bindu'),('APPLE',NULL,2,2,2,NULL,2,0,2,'Bindu'),('TMHEMST',NULL,1,1,1,NULL,1,0,1,'Bindu'),('CAT',NULL,0,0,0,NULL,0,0,0,'Bindu'),('KONECORP',NULL,31,31,30,NULL,31.740000000000002,0,31,'Bindu'),('MSCOKMST',NULL,10,10,12,NULL,7.33,0,10,'Bindu'),('ABBMST',NULL,0,0,1,NULL,0.48,0,1,'Bindu'),('bpostMST',NULL,4,4,4,NULL,4,0,4,'Bindu'),('NSTROM',NULL,2,2,2,NULL,1.58,0,1.55,'Bindu'),('MSCCAMST',NULL,0,0,0,NULL,0,0,0,'Bindu'),('WALMART',NULL,12,12,12,NULL,11.92,0,12.5,'Bindu'),('SEGAMMST',NULL,2,2,3,NULL,3.34,0,3.35,'Bindu'),('MARS',NULL,12,17,12,NULL,14,0,12,'Bindu'),('BSHTGMST',NULL,11,11,11,NULL,12,0,12,'Bindu'),('AVON',NULL,11,11,11,NULL,12,0,11,'Bindu'),('FEDMEMST',NULL,0,0,1,NULL,0,0,1,'Bindu'),('PGMSTRCT',NULL,1,1,1,NULL,1,0,1,'Bindu'),('EDGEMST',NULL,1,1,1,NULL,1,0,1,'Bindu'),('HYUNDAI',NULL,0,0,0,NULL,0,0,0,'Bindu'),('LOREFMST',NULL,47,47,53,NULL,53.19,0,59,'Bindu'),('GEFCOMST',NULL,0,0,0,NULL,0,0,0,'Bindu'),('TNTMST',NULL,1,1,1,NULL,1,0,1,'Bindu'),('JPGMST',NULL,0,0,0,NULL,0,0,0,'Bindu'),('HERSHMST',NULL,0,0,0,NULL,0,0,0,'Bindu'),('UNILVMST',NULL,6,6,6,NULL,6,0,6,'Bindu'),('ROCKWELL',NULL,4,4,4,NULL,4,0,4,'Bindu'),('REXELFR',NULL,1,1,1,NULL,1,0,1,'Bindu'),('JCMASTER',NULL,52,55,54,NULL,54.93,0,54,'Bindu'),('KCCESMST',NULL,3,3,4,NULL,3,0,4,'Bindu'),('WS',NULL,1,1,1,NULL,1,0,1,'Bindu'),('XPOLOGIS',NULL,1,1,1,NULL,1,0,1,'Bindu'),('RECUKMST',NULL,12,12,12,NULL,12,0,12,'Bindu'),('PMITNE',NULL,1,1,1,NULL,1,0,1,'Bindu'),('COKE',NULL,0,0,0,NULL,0,0,0,'Bindu'),('KMSACMST',NULL,5,5,4,NULL,4.840000000000001,0,4.3,'Bindu'),('SYNGMAST',NULL,1,1,1,NULL,0,0,0.5,'Bindu'),('ULTAMST',NULL,7,8,7,NULL,7.390000000000001,0,7,'Bindu'),('SMTFINAL',NULL,0,0,0,NULL,0,0,0,'Bindu'),('EMRSMAST',NULL,18,18,18,NULL,19,0,17.5,'Bindu'),('NORSCMST',NULL,2,2,2,NULL,2,0,2,'Bindu'),('SIEMST',NULL,8,8,8,NULL,8.25,0,8,'Bindu'),('DTCHLMST',NULL,0,0,0,NULL,0,0,0,'Bindu'),('ICABMST',NULL,1,1,1,NULL,1,0,1,'Bindu'),('FPLMAST',NULL,0,0,0,NULL,0,0,0,'Bindu'),('BASFITG',NULL,1,1,1,NULL,1,0,1,'Bindu'),('SBD',NULL,3,1,1,NULL,2.48,0,2.5,'Bindu'),('BNSF',NULL,6,6,6,NULL,5.51,0,5.5,'Bindu'),('PEPSIMST',NULL,41,41,40,NULL,48.01,0,47,'Bindu'),('INBEV',NULL,23,24,24,NULL,23.48,0,23.5,'Bindu'),('NRPCMST',NULL,0,0,0,NULL,0,0,0,'Bindu'),('TSCOMST',NULL,15,15,15,NULL,15.040000000000001,0,15,'Bindu'),('AGCINTMA',NULL,7,7,7,NULL,7,0,7,'Bindu'),('ONMTMST',NULL,6,6,6,NULL,5.51,0,5.5,'Harish'),('MDTRNMST',NULL,3,3,3,NULL,3,0,3,'Harish'),('CSMGCMST',NULL,8,8,6,NULL,8.1,0,6,'Harish'),('AETNA',NULL,1,1,1,NULL,1,0,1,'Harish'),('COMMEMST',NULL,1,1,0,NULL,0.93,0,0.5,'Harish'),('ALCONMST',NULL,0,0,0,NULL,0,0,0,'Harish'),('FIDMAST',NULL,26,27,27,NULL,26.54,0,26.5,'Harish'),('TSBUK',NULL,4,4,4,NULL,4,0,4,'Harish'),('INTESMST',NULL,4,4,4,NULL,4,0,4,'Harish'),('SANOFMST',NULL,2,2,2,NULL,2,0,2,'Harish'),('DEUTMST',NULL,2,2,2,NULL,2,0,2,'Harish'),('NYDMVMST',NULL,10,10,10,NULL,10.24,0,10,'Harish'),('ROCH',NULL,18,18,27,NULL,20.650000000000002,0,26.5,'Harish'),('INGIHL',NULL,0,0,0,NULL,0.1,0,0,'Harish'),('SCHW',NULL,9,9,9,NULL,9.65,0,9.5,'Harish'),('MARKEMST',NULL,0,0,0,NULL,0,0,0,'Harish'),('CAREFMST',NULL,20,20,19,NULL,19.810000000000002,0,19,'Harish'),('WAMICMST',NULL,0,0,0,NULL,0,0,0,'Harish'),('SWISMAST',NULL,2,2,2,NULL,2,0,2,'Harish'),('ALSTMST',NULL,6,6,6,NULL,6.4,0,6.4,'Harish'),('NOVARMST',NULL,0,0,0,NULL,0,0,0,'Harish'),('HSBC0MST',NULL,105,105,107,NULL,109.40999999999998,0,106.5,'Harish'),('BNYOERFP',NULL,1,1,0,NULL,0,0,0,'Harish'),('CAREMARK',NULL,20,20,20,NULL,20,0,20,'Harish'),('UBSWMST',NULL,29,28,30,NULL,27.97,0,30,'Harish'),('TCGCMST',NULL,1,1,1,NULL,1,0,1,'Harish'),('INOLNMST',NULL,8,8,8,NULL,7.61,0,7.3,'Harish'),('MOLINA',NULL,13,13,13,NULL,13,0,13,'Harish'),('PFE',NULL,3,3,3,NULL,3,0,3,'Harish'),('PRMTHMST',NULL,1,1,1,NULL,1,0,1,'Harish'),('AMEXGMST',NULL,0,0,0,NULL,0,0,0,'Harish'),('AMEXMAST',NULL,76,79,78,NULL,77.91,0,78,'Harish'),('WELPOINT',NULL,1,1,1,NULL,1,0,1,'Harish'),('BOFAMAST',NULL,51,52,54,NULL,49.47,0,53.5,'Harish'),('DTCCMST',NULL,0,0,0,NULL,0,0,0,'Harish'),('HCSCMST',NULL,0,0,0,NULL,0,0,0,'Harish'),('NNGRPMST',NULL,1,1,1,NULL,1,0,1,'Harish'),('INFYMC',NULL,0,0,0,NULL,0,0,0,'Harish'),('10XFTMST',NULL,3,3,3,NULL,3,0,3,'Harish'),('RABONMST',NULL,0,0,0,NULL,0,0,0,'Harish'),('CTZMAST',NULL,0,0,0,NULL,0,0,0,'Harish'),('ONEMNMST',NULL,15,15,15,NULL,15,0,15,'Harish'),('GOLDMAST',NULL,1,1,1,NULL,1,0,1,'Harish'),('CITIMAST',NULL,10,10,10,NULL,9.51,0,9.5,'Harish'),('WBGMST',NULL,1,1,0,NULL,1,0,0,'Harish'),('SUNTRUST',NULL,0,0,6,NULL,0.09,0,5,'Harish'),('VANGUMST',NULL,0,0,0,NULL,0,0,0,'Harish'),('RBSMAST',NULL,24,24,24,NULL,24,0,24,'Harish'),('MOODYCOR',NULL,1,1,0,NULL,0.84,0,0,'Harish'),('LSCOMST',NULL,18,18,19,NULL,18.51,0,19,'Harish'),('PTTSBMST',NULL,20,20,19,NULL,20.61,0,20,'Harish');
/*!40000 ALTER TABLE `phc_vol_summary` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-07-19 17:20:28
