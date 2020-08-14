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
-- Table structure for table `accountbe`
--

DROP TABLE IF EXISTS `accountbe`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `accountbe` (
  `account_name` varchar(255) DEFAULT NULL,
  `account_track` varchar(255) DEFAULT NULL,
  `pm` varchar(255) DEFAULT NULL,
  `remarks` varchar(255) DEFAULT NULL,
  `rtb` double DEFAULT NULL,
  `summary` varchar(255) DEFAULT NULL,
  `dhbe` double DEFAULT NULL,
  `DA` varchar(255) DEFAULT NULL,
  `account_du` varchar(255) DEFAULT NULL,
  `dm` varchar(255) DEFAULT NULL,
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `show_summary` tinyint(1) DEFAULT '0',
  `show_textbox` tinyint(1) DEFAULT '0',
  `show_updatebutton` tinyint(1) DEFAULT '0',
  `m1bertbrremarks` varchar(255) DEFAULT NULL,
  `m2bertbrremarks` varchar(255) DEFAULT NULL,
  `m3bertbrremarks` varchar(255) DEFAULT NULL,
  `nativecurrency` varchar(255) DEFAULT NULL,
  `m1be` double DEFAULT '0',
  `m1native` double DEFAULT '0',
  `m1rtbr` double DEFAULT '0',
  `m1usdconversion` double DEFAULT '0',
  `m2be` double DEFAULT '0',
  `m2native` double DEFAULT '0',
  `m2rtbr` double DEFAULT '0',
  `m2usdconversion` double DEFAULT '0',
  `m3be` double DEFAULT '0',
  `m3native` double DEFAULT '0',
  `m3rtbr` double DEFAULT '0',
  `m3usdconversion` double DEFAULT '0',
  `nativediscount` double DEFAULT '0',
  `pmbe` double DEFAULT '0',
  `totalbe` double DEFAULT '0',
  `totalnative` double DEFAULT '0',
  `totalrtbr` double DEFAULT '0',
  `currmnthbe` double DEFAULT '0',
  `currmnthdhbe` double DEFAULT '0',
  `currmnthrtbr` double DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=748 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `accountbe`
--

LOCK TABLES `accountbe` WRITE;
/*!40000 ALTER TABLE `accountbe` DISABLE KEYS */;
INSERT INTO `accountbe` VALUES ('ADECCOGR','EAISAPI',NULL,'',288.69052999999997,NULL,279.0040116,NULL,'','Amit',545,0,0,0,NULL,NULL,NULL,NULL,0,0,99.14905999999998,0,0,0,95.88711,0,0,0,93.65436,0,0,0,0,0,0,0,0,0),('ALXPRMST','EAISAPI',NULL,'',46.79087,NULL,0,NULL,'','Amit',546,0,0,0,NULL,NULL,NULL,NULL,0,0,21.33712,0,0,0,25.021189999999997,0,0,0,0.43256,0,0,0,0,0,0,0,0,0),('AMDUSMST','EAISAPI',NULL,'',57.7483,NULL,64.5,NULL,'','Amit',547,0,0,0,NULL,NULL,NULL,NULL,0,0,21.21639,0,0,0,22.16861,0,0,0,14.363299999999999,0,0,0,0,0,0,0,0,0),('AMEREN','EAISAPI',NULL,'',460.4348,NULL,459.95000000000005,NULL,'','Amit',548,0,0,0,NULL,NULL,NULL,NULL,0,0,150.61473,0,0,0,154.91003999999998,0,0,0,154.91003,0,0,0,0,0,0,0,0,0),('APSMAST','EAISAPI',NULL,'',35.72269,NULL,37.11,NULL,'','Amit',549,0,0,0,NULL,NULL,NULL,NULL,0,0,3.02258,0,0,0,13.084700000000002,0,0,0,19.61541,0,0,0,0,0,0,0,0,0),('BAINCMST','EAISAPI',NULL,'',91.469,NULL,89.9,NULL,'','Amit',550,0,0,0,NULL,NULL,NULL,NULL,0,0,22.174,0,0,0,28.639,0,0,0,40.656,0,0,0,0,0,0,0,0,0),('BPMAST','EAISAPI',NULL,'',280.18265999999994,NULL,508.369683,NULL,'','Amit',551,0,0,0,NULL,NULL,NULL,NULL,0,0,85.95215999999999,0,0,0,98.31706999999999,0,0,0,95.91343,0,0,0,0,0,0,0,0,0),('BTMAST','EAISAPI',NULL,'',4.104010000000001,NULL,3.0220988,NULL,'','Amit',552,0,0,0,NULL,NULL,NULL,NULL,0,0,4.104010000000001,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0),('CAUASMST','EAISAPI',NULL,'',0,NULL,0,NULL,'','Amit',553,0,0,0,NULL,NULL,NULL,NULL,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0),('CHCMST','EAISAPI',NULL,'',137.56914,NULL,133,NULL,'','Amit',554,0,0,0,NULL,NULL,NULL,NULL,0,0,48.51638,0,0,0,43.44038,0,0,0,45.61238,0,0,0,0,0,0,0,0,0),('CISCOMST','EAISAPI',NULL,'',28.9327,NULL,49.94,NULL,'','Amit',555,0,0,0,NULL,NULL,NULL,NULL,0,0,28.9327,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0),('CONDTMST','EAISAPI',NULL,'',437.63293999999996,NULL,440.28,NULL,'','Amit',556,0,0,0,NULL,NULL,NULL,NULL,0,0,115.37066,0,0,0,152.79775,0,0,0,169.46453,0,0,0,0,0,0,0,0,0),('CONEDMST','EAISAPI',NULL,'',345.81763,NULL,230,NULL,'','Amit',557,0,0,0,NULL,NULL,NULL,NULL,0,0,136.93728,0,0,0,148.27390000000003,0,0,0,122.60645,0,0,0,0,0,0,0,0,0),('DISHPMST','EAISAPI',NULL,'',114.16,NULL,112.5,NULL,'','Amit',558,0,0,0,NULL,NULL,NULL,NULL,0,0,6.96,0,0,0,53.6,0,0,0,53.6,0,0,0,0,0,0,0,0,0),('ELPWAMST','EAISAPI',NULL,'',68.13509,NULL,35,NULL,'','Amit',559,0,0,0,NULL,NULL,NULL,NULL,0,0,0.6712100000000001,0,0,0,21.72381,0,0,0,45.74007,0,0,0,0,0,0,0,0,0),('EONMST','EAISAPI',NULL,'',60.54588,NULL,84.0025326,NULL,'','Amit',560,0,0,0,NULL,NULL,NULL,NULL,0,0,31.52694,0,0,0,25.688879999999997,0,0,0,3.33006,0,0,0,0,0,0,0,0,0),('EXXNMMST','EAISAPI',NULL,'',51.12001000000001,NULL,51,NULL,'','Amit',561,0,0,0,NULL,NULL,NULL,NULL,0,0,26.973740000000003,0,0,0,24.14627,0,0,0,0,0,0,0,0,0,0,0,0,0),('FPLMAST','EAISAPI',NULL,'',297.32205,NULL,440.1,NULL,'','Amit',562,0,0,0,NULL,NULL,NULL,NULL,0,0,114.99345,0,0,0,111.62200999999999,0,0,0,70.70658999999999,0,0,0,0,0,0,0,0,0),('HPQMST','EAISAPI',NULL,'',69.04180000000001,NULL,115.5,NULL,'','Amit',563,0,0,0,NULL,NULL,NULL,NULL,0,0,40.19276000000001,0,0,0,21.9863,0,0,0,6.86274,0,0,0,0,0,0,0,0,0),('INGRDMST','EAISAPI',NULL,'',127.16,NULL,126,NULL,'','Amit',564,0,0,0,NULL,NULL,NULL,NULL,0,0,44.352,0,0,0,40.304,0,0,0,42.504,0,0,0,0,0,0,0,0,0),('INMARMST','EAISAPI',NULL,'',19.26077,NULL,19.2,NULL,'','Amit',565,0,0,0,NULL,NULL,NULL,NULL,0,0,6.7119100000000005,0,0,0,6.23626,0,0,0,6.3126,0,0,0,0,0,0,0,0,0),('INOGYMST','EAISAPI',NULL,'',100.82919,NULL,87.6952224,NULL,'','Amit',566,0,0,0,NULL,NULL,NULL,NULL,0,0,33.60973,0,0,0,33.60973,0,0,0,33.60973,0,0,0,0,0,0,0,0,0),('INTELMST','EAISAPI',NULL,'',183.92113999999998,NULL,191,NULL,'','Amit',567,0,0,0,NULL,NULL,NULL,NULL,0,0,69.79513,0,0,0,57.214439999999996,0,0,0,56.91157000000001,0,0,0,0,0,0,0,0,0),('MarveMST','EAISAPI',NULL,'',11.6,NULL,24.5,NULL,'','Amit',568,0,0,0,NULL,NULL,NULL,NULL,0,0,0,0,0,0,11.6,0,0,0,0,0,0,0,0,0,0,0,0,0),('NALCHMST','EAISAPI',NULL,'',0,NULL,0,NULL,'','Amit',569,0,0,0,NULL,NULL,NULL,NULL,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0),('NOKINMST','EAISAPI',NULL,'',22.071089999999998,NULL,26.274772800000004,NULL,'','Amit',570,0,0,0,NULL,NULL,NULL,NULL,0,0,12.526879999999998,0,0,0,4.7968399999999995,0,0,0,4.74737,0,0,0,0,0,0,0,0,0),('PWC','EAISAPI',NULL,'',170.20585,NULL,161,NULL,'','Amit',571,0,0,0,NULL,NULL,NULL,NULL,0,0,59.79369,0,0,0,54.1308,0,0,0,56.28136,0,0,0,0,0,0,0,0,0),('SABRECO','EAISAPI',NULL,'',1227.7306800000001,NULL,1111,NULL,'','Amit',572,0,0,0,NULL,NULL,NULL,NULL,0,0,391.93989999999997,0,0,0,417.89539,0,0,0,417.89539,0,0,0,0,0,0,0,0,0),('SBCMST','EAISAPI',NULL,'',0,NULL,0,NULL,'','Amit',573,0,0,0,NULL,NULL,NULL,NULL,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0),('SFDCMSTT','EAISAPI',NULL,'',186.03305999999998,NULL,237,NULL,'','Amit',574,0,0,0,NULL,NULL,NULL,NULL,0,0,68.34944,0,0,0,63.04114,0,0,0,54.64247999999999,0,0,0,0,0,0,0,0,0),('SSEPLC','EAISAPI',NULL,'',107.09466999999998,NULL,96.9333666,NULL,'','Amit',575,0,0,0,NULL,NULL,NULL,NULL,0,0,60.67905,0,0,0,22.55041,0,0,0,23.865209999999998,0,0,0,0,0,0,0,0,0),('SSESLMST','EAISAPI',NULL,'',238.03646,NULL,224.39794519999995,NULL,'','Amit',576,0,0,0,NULL,NULL,NULL,NULL,0,0,63.15232,0,0,0,83.26719,0,0,0,91.61695,0,0,0,0,0,0,0,0,0),('TECLMST','EAISAPI',NULL,'',-10.14397,NULL,0,NULL,'','Amit',577,0,0,0,NULL,NULL,NULL,NULL,0,0,-11.03071,0,0,0,0.48456,0,0,0,0.40218,0,0,0,0,0,0,0,0,0),('TMBUSMST','EAISAPI',NULL,'',65.27443,NULL,64.7,NULL,'','Amit',578,0,0,0,NULL,NULL,NULL,NULL,0,0,18.63365,0,0,0,24.02304,0,0,0,22.617739999999998,0,0,0,0,0,0,0,0,0),('TRULPMST','EAISAPI',NULL,'',0,NULL,0,NULL,'','Amit',579,0,0,0,NULL,NULL,NULL,NULL,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0),('TTTELMST','EAISAPI',NULL,'',21.87481,NULL,21.5013816,NULL,'','Amit',580,0,0,0,NULL,NULL,NULL,NULL,0,0,8.57208,0,0,0,7.0292200000000005,0,0,0,6.27351,0,0,0,0,0,0,0,0,0),('UCASMST','EAISAPI',NULL,'',102.39567,NULL,63.005201799999995,NULL,'','Amit',581,0,0,0,NULL,NULL,NULL,NULL,0,0,15.84835,0,0,0,51.20792,0,0,0,35.3394,0,0,0,0,0,0,0,0,0),('UK-MOB-1','EAISAPI',NULL,'',639.9511,NULL,651.9997099999999,NULL,'','Amit',582,0,0,0,NULL,NULL,NULL,NULL,0,0,211.56345,0,0,0,222.98114999999999,0,0,0,205.4065,0,0,0,0,0,0,0,0,0),('UNPERGDE','EAISAPI',NULL,'',30.61594,NULL,31.3567682,NULL,'','Amit',583,0,0,0,NULL,NULL,NULL,NULL,0,0,14.383469999999999,0,0,0,10.738109999999999,0,0,0,5.4943599999999995,0,0,0,0,0,0,0,0,0),('UPCBBMST','EAISAPI',NULL,'',137.08154,NULL,115.00141380000001,NULL,'','Amit',584,0,0,0,NULL,NULL,NULL,NULL,0,0,47.9853,0,0,0,43.12231,0,0,0,45.97393,0,0,0,0,0,0,0,0,0),('VERIZMST','EAISAPI',NULL,'',1840.20516,NULL,2052,NULL,'','Amit',585,0,0,0,NULL,NULL,NULL,NULL,0,0,854.1522,0,0,0,491.00069,0,0,0,495.05227,0,0,0,0,0,0,0,0,0),('VFLNZMST','EAISAPI',NULL,'',30.65086,NULL,30.899131199999996,NULL,'','Amit',586,0,0,0,NULL,NULL,NULL,NULL,0,0,10.422360000000001,0,0,0,10.15123,0,0,0,10.07727,0,0,0,0,0,0,0,0,0),('WELSHMST','EAISAPI',NULL,'',239.84546999999998,NULL,234.968828,NULL,'','Amit',587,0,0,0,NULL,NULL,NULL,NULL,0,0,86.6932,0,0,0,77.37718000000001,0,0,0,75.77508999999999,0,0,0,0,0,0,0,0,0),('BASFITG','EAISAPI',NULL,'',0,NULL,0,NULL,'','Bindu',588,0,0,0,NULL,NULL,NULL,NULL,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0),('FEDMEMST','EAISAPI',NULL,'',13.961480000000002,NULL,15,NULL,'','Bindu',589,0,0,0,NULL,NULL,NULL,NULL,0,0,2.9533899999999997,0,0,0,5.63829,0,0,0,5.369800000000001,0,0,0,0,0,0,0,0,0),('INBEV','EAISAPI',NULL,'',0,NULL,0,NULL,'','Bindu',590,0,0,0,NULL,NULL,NULL,NULL,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0),('KONECORP','EAISAPI',NULL,'',0,NULL,0,NULL,'','Bindu',591,0,0,0,NULL,NULL,NULL,NULL,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0),('LOREFMST','EAISAPI',NULL,'',969.9171399999999,NULL,943.7082,NULL,'','Bindu',592,0,0,0,NULL,NULL,NULL,NULL,0,0,326.87212,0,0,0,312.89313999999996,0,0,0,330.15188,0,0,0,0,0,0,0,0,0),('MARS','EAISAPI',NULL,'',0,NULL,0,NULL,'','Bindu',593,0,0,0,NULL,NULL,NULL,NULL,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0),('RECUKMST','EAISAPI',NULL,'',2.90573,NULL,0,NULL,'','Bindu',594,0,0,0,NULL,NULL,NULL,NULL,0,0,0.74556,0,0,0,1.0666,0,0,0,1.09357,0,0,0,0,0,0,0,0,0),('SBD','EAISAPI',NULL,'',0,NULL,0,NULL,'','Bindu',595,0,0,0,NULL,NULL,NULL,NULL,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0),('SEGAMMST','EAISAPI',NULL,'',136.52296,NULL,0,NULL,'','Bindu',596,0,0,0,NULL,NULL,NULL,NULL,0,0,49.818259999999995,0,0,0,41.83865000000001,0,0,0,44.866049999999994,0,0,0,0,0,0,0,0,0),('SIEMST','EAISAPI',NULL,'',126.36232000000001,NULL,127.3139,NULL,'','Bindu',597,0,0,0,NULL,NULL,NULL,NULL,0,0,18.876829999999998,0,0,0,50.20852000000001,0,0,0,57.276970000000006,0,0,0,0,0,0,0,0,0),('TNTMST','EAISAPI',NULL,'',0,NULL,0,NULL,'','Bindu',598,0,0,0,NULL,NULL,NULL,NULL,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0),('10XFTMST','EAISAPI',NULL,'',20.33024,NULL,20.6816,NULL,'','Harish',599,0,0,0,NULL,NULL,NULL,NULL,0,0,5.813890000000001,0,0,0,7.25817,0,0,0,7.25818,0,0,0,0,0,0,0,0,0),('AETNA','EAISAPI',NULL,'',14.769199999999998,NULL,15,NULL,'','Harish',600,0,0,0,NULL,NULL,NULL,NULL,0,0,5.29766,0,0,0,5.368399999999999,0,0,0,4.103140000000001,0,0,0,0,0,0,0,0,0),('AMEXGMST','EAISAPI',NULL,'',0,NULL,0,NULL,'','Harish',601,0,0,0,NULL,NULL,NULL,NULL,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0),('AMEXMAST','EAISAPI',NULL,'',1111.7236300000002,NULL,1120,NULL,'','Harish',602,0,0,0,NULL,NULL,NULL,NULL,0,0,363.19412,0,0,0,371.5702100000001,0,0,0,376.95930000000004,0,0,0,0,0,0,0,0,0),('BOFAMAST','EAISAPI',NULL,'',652.55166,NULL,650,NULL,'','Harish',603,0,0,0,NULL,NULL,NULL,NULL,0,0,229.70152,0,0,0,204.53692,0,0,0,218.31322,0,0,0,0,0,0,0,0,0),('CAREFMST','EAISAPI',NULL,'',0,NULL,0,NULL,'','Harish',604,0,0,0,NULL,NULL,NULL,NULL,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0),('CAREMARK','EAISAPI',NULL,'',413.40418999999997,NULL,400,NULL,'','Harish',605,0,0,0,NULL,NULL,NULL,NULL,0,0,138.81699,0,0,0,134.42798,0,0,0,140.15922,0,0,0,0,0,0,0,0,0),('CITIMAST','EAISAPI',NULL,'',0,NULL,0,NULL,'','Harish',606,0,0,0,NULL,NULL,NULL,NULL,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0),('COMMEMST','EAISAPI',NULL,'',39.60516,NULL,31.6818,NULL,'','Harish',607,0,0,0,NULL,NULL,NULL,NULL,0,0,13.20172,0,0,0,13.20172,0,0,0,13.20172,0,0,0,0,0,0,0,0,0),('CSMGCMST','EAISAPI',NULL,'',27.24,NULL,50,NULL,'','Harish',608,0,0,0,NULL,NULL,NULL,NULL,0,0,27.24,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0),('CTZMAST','EAISAPI',NULL,'',0,NULL,0,NULL,'','Harish',609,0,0,0,NULL,NULL,NULL,NULL,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0),('DTCCMST','EAISAPI',NULL,'',-5.38666,NULL,0,NULL,'','Harish',610,0,0,0,NULL,NULL,NULL,NULL,0,0,-2.66319,0,0,0,-1.36173,0,0,0,-1.36174,0,0,0,0,0,0,0,0,0),('FIDMAST','EAISAPI',NULL,'',906.21665,NULL,900.9219070256626,NULL,'','Harish',611,0,0,0,NULL,NULL,NULL,NULL,0,0,307.8469,0,0,0,220.25912,0,0,0,378.11063,0,0,0,0,0,0,0,0,0),('GHSMST','EAISAPI',NULL,'',67,NULL,0,NULL,'','Harish',612,0,0,0,NULL,NULL,NULL,NULL,0,0,0,0,0,0,40.1529,0,0,0,26.847099999999998,0,0,0,0,0,0,0,0,0),('GOLDMAST','EAISAPI',NULL,'',33.80585000000001,NULL,30,NULL,'','Harish',613,0,0,0,NULL,NULL,NULL,NULL,0,0,11.637780000000001,0,0,0,11.0853,0,0,0,11.08277,0,0,0,0,0,0,0,0,0),('HCSCMST','EAISAPI',NULL,'',0,NULL,0,NULL,'','Harish',614,0,0,0,NULL,NULL,NULL,NULL,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0),('HSBC0MST','EAISAPI',NULL,'',1401.1750799999998,NULL,1425,NULL,'','Harish',615,0,0,0,NULL,NULL,NULL,NULL,0,0,533.5541599999999,0,0,0,513.7525399999998,0,0,0,438.86838,0,0,0,0,0,0,0,0,0),('INOLNMST','EAISAPI',NULL,'',318.41666000000004,NULL,250,NULL,'','Harish',616,0,0,0,NULL,NULL,NULL,NULL,0,0,121.52417000000001,0,0,0,93.97345000000001,0,0,0,102.91904000000001,0,0,0,0,0,0,0,0,0),('LSCOMST','EAISAPI',NULL,'',0,NULL,0,NULL,'','Harish',617,0,0,0,NULL,NULL,NULL,NULL,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0),('MDTRNMST','EAISAPI',NULL,'',15.36116,NULL,15,NULL,'','Harish',618,0,0,0,NULL,NULL,NULL,NULL,0,0,5.26177,0,0,0,10.09939,0,0,0,0,0,0,0,0,0,0,0,0,0),('MOLINA','EAISAPI',NULL,'',146.4612,NULL,120,NULL,'','Harish',619,0,0,0,NULL,NULL,NULL,NULL,0,0,25.02637,0,0,0,77.61053,0,0,0,43.824299999999994,0,0,0,0,0,0,0,0,0),('MOODYCOR','EAISAPI',NULL,'',9.399999999999999,NULL,9,NULL,'','Harish',620,0,0,0,NULL,NULL,NULL,NULL,0,0,1.05,0,0,0,3.75,0,0,0,4.6,0,0,0,0,0,0,0,0,0),('NYDMVMST','EAISAPI',NULL,'',6.69636,NULL,10,NULL,'','Harish',621,0,0,0,NULL,NULL,NULL,NULL,0,0,2.56713,0,0,0,3.28875,0,0,0,0.84048,0,0,0,0,0,0,0,0,0),('ONEMNMST','EAISAPI',NULL,'',281.49447000000004,NULL,260,NULL,'','Harish',622,0,0,0,NULL,NULL,NULL,NULL,0,0,108.26743000000002,0,0,0,86.61351,0,0,0,86.61353000000001,0,0,0,0,0,0,0,0,0),('ONMTMST','EAISAPI',NULL,'',88.81974,NULL,80.0895,NULL,'','Harish',623,0,0,0,NULL,NULL,NULL,NULL,0,0,26.37106,0,0,0,31.07048,0,0,0,31.3782,0,0,0,0,0,0,0,0,0),('PRMTHMST','EAISAPI',NULL,'',31.689,NULL,30,NULL,'','Harish',624,0,0,0,NULL,NULL,NULL,NULL,0,0,16.56,0,0,0,15.12,0,0,0,0.009,0,0,0,0,0,0,0,0,0),('PTTSBMST','EAISAPI',NULL,'',608.37856,NULL,591.3936,NULL,'','Harish',625,0,0,0,NULL,NULL,NULL,NULL,0,0,239.96268000000003,0,0,0,354.81342,0,0,0,13.602459999999999,0,0,0,0,0,0,0,0,0),('RABONMST','EAISAPI',NULL,'',8.04616,NULL,8.213799999999999,NULL,'','Harish',626,0,0,0,NULL,NULL,NULL,NULL,0,0,0.56136,0,0,0,3.7424,0,0,0,3.7424,0,0,0,0,0,0,0,0,0),('RBSMAST','EAISAPI',NULL,'',140.52109,NULL,125.3822,NULL,'','Harish',627,0,0,0,NULL,NULL,NULL,NULL,0,0,47.54985,0,0,0,45.39377999999999,0,0,0,47.577459999999995,0,0,0,0,0,0,0,0,0),('ROCH','EAISAPI',NULL,'',519.4770199999999,NULL,527.0013,NULL,'','Harish',628,0,0,0,NULL,NULL,NULL,NULL,0,0,196.87442,0,0,0,144.50253999999998,0,0,0,178.10006,0,0,0,0,0,0,0,0,0),('SCHW','EAISAPI',NULL,'',179.30693,NULL,165,NULL,'','Harish',629,0,0,0,NULL,NULL,NULL,NULL,0,0,67.42936999999999,0,0,0,57.091620000000006,0,0,0,54.785940000000004,0,0,0,0,0,0,0,0,0),('SUNTRUST','EAISAPI',NULL,'',0,NULL,30,NULL,'','Harish',630,0,0,0,NULL,NULL,NULL,NULL,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0),('SWISMAST','EAISAPI',NULL,'',25.86737,NULL,26.1864,NULL,'','Harish',631,0,0,0,NULL,NULL,NULL,NULL,0,0,9.32465,0,0,0,8.5859,0,0,0,7.9568200000000004,0,0,0,0,0,0,0,0,0),('TCGCMST','EAISAPI',NULL,'',10.21688,NULL,12,NULL,'','Harish',632,0,0,0,NULL,NULL,NULL,NULL,0,0,-0.9954700000000001,0,0,0,3.92348,0,0,0,7.28887,0,0,0,0,0,0,0,0,0),('TSBUK','EAISAPI',NULL,'',2.65387,NULL,15.511199999999999,NULL,'','Harish',633,0,0,0,NULL,NULL,NULL,NULL,0,0,0.77664,0,0,0,0.93445,0,0,0,0.94278,0,0,0,0,0,0,0,0,0),('UBSWMST','EAISAPI',NULL,'',659.9174,NULL,670,NULL,'','Harish',634,0,0,0,NULL,NULL,NULL,NULL,0,0,273.9429,0,0,0,260.21347000000003,0,0,0,125.76103,0,0,0,0,0,0,0,0,0),('VANGUMST','EAISAPI',NULL,'',0,NULL,0,NULL,'','Harish',635,0,0,0,NULL,NULL,NULL,NULL,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0),('WAMICMST','EAISAPI',NULL,'',0,NULL,0,NULL,'','Harish',636,0,0,0,NULL,NULL,NULL,NULL,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0),('WBGMST','EAISAPI',NULL,'',11.52,NULL,10,NULL,'','Harish',637,0,0,0,NULL,NULL,NULL,NULL,0,0,3.84,0,0,0,3.84,0,0,0,3.84,0,0,0,0,0,0,0,0,0),('WELPOINT','EAISAPI',NULL,'',45.599999999999994,NULL,45,NULL,'','Harish',638,0,0,0,NULL,NULL,NULL,NULL,0,0,15.2,0,0,0,15.2,0,0,0,15.2,0,0,0,0,0,0,0,0,0),('ABNMST','EAISAPI',NULL,'',367.58480000000003,NULL,381.355,NULL,'','Mukul',639,0,0,0,NULL,NULL,NULL,NULL,0,0,130.34296,0,0,0,98.57922,0,0,0,138.66262,0,0,0,0,0,0,0,0,0),('AUCWW','EAISAPI',NULL,'m1->testing1\n',156.67681,NULL,146.2068,'Prashant','','NP',640,0,0,1,'testing1',NULL,NULL,'AUD',0,0,60.492979999999996,0,0,0,50.212579999999996,0,0,0,45.97125,0,0,0,0,0,0,0,0,50.212579999999996),('AUTOLL','EAISAPI',NULL,'',248.69642999999996,NULL,272.346,'Prashant','','NP',641,0,0,1,NULL,NULL,NULL,'AUD',0,0,79.01236999999999,0,0,0,80.27027999999999,0,0,0,89.41378,0,0,0,0,0,0,0,0,0),('HCFAUMST','EAISAPI',NULL,'',49.716680000000004,NULL,53.7525,'Prashant','','NP',642,0,0,1,NULL,NULL,NULL,'AUD',0,0,16.57227,0,0,0,16.57221,0,0,0,16.572200000000002,0,0,0,0,0,0,0,0,0),('ICAREMST','EAISAPI',NULL,'',55.23781,NULL,58.0527,'Prashant','','NP',643,0,0,1,NULL,NULL,NULL,'AUD',0,0,18.61299,0,0,0,18.61261,0,0,0,18.01221,0,0,0,0,0,0,0,0,0),('MECCAMST','EAISAPI',NULL,'',143.47331000000003,NULL,148.3569,'Prashant','','NP',644,0,0,1,NULL,NULL,NULL,'AUD',0,0,51.350240000000014,0,0,0,49.60474,0,0,0,42.51833,0,0,0,0,0,0,0,0,0),('NBNCOMST','EAISAPI',NULL,'',177.54802999999998,NULL,164.1243,'Prashant','','NP',645,0,0,1,NULL,NULL,NULL,'AUD',0,0,68.87808999999999,0,0,0,59.453089999999996,0,0,0,49.216849999999994,0,0,0,0,0,0,0,0,0),('OPTUS','EAISAPI',NULL,'',23.47167,NULL,75.2535,'Prashant','','NP',646,0,0,1,NULL,NULL,NULL,'AUD',0,0,17.49689,0,0,0,2.7688,0,0,0,3.20598,0,0,0,0,0,0,0,0,0),('SINGTMST','EAISAPI',NULL,'',141.31552,NULL,137.6064,'Prashant','','NP',647,0,0,1,NULL,NULL,NULL,'AUD',0,0,51.91771,0,0,0,51.55561,0,0,0,37.8422,0,0,0,0,0,0,0,0,0),('SRSTLMST','EAISAPI',NULL,'',0,NULL,150.507,'Prashant','','NP',648,0,0,1,NULL,NULL,NULL,'AUD',0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0),('WESTPAC','EAISAPI',NULL,'',310.14623,NULL,386.3013,'Prashant','','NP',649,0,0,1,NULL,NULL,NULL,'AUD',0,0,179.06572000000003,0,0,0,104.30569999999999,0,0,0,26.77481,0,0,0,0,0,0,0,0,0),('ANZBGL','EAISAPI',NULL,'',58.481539999999995,NULL,58.0527,'Ravi','','NP',650,0,0,1,'Test1',NULL,NULL,'AUD',0,0,23.17193,0,0,0,23.17193,0,0,0,12.13768,0,0,0,0,0,0,0,0,23.17193),('AUSDHMST','EAISAPI',NULL,'m1->Test3\nm2->Test4\n',203.78168999999997,NULL,199.2426,'Ravi','','NP',651,0,0,1,'Test3','Test4',NULL,'AUD',0,0,118.08592999999999,0,0,0,85.69575999999999,0,0,0,0,0,0,0,0,0,0,0,0,85.69575999999999),('CCAMTMST','EAISAPI',NULL,'m3->Test6',10.81,NULL,6.4503,'Ravi','','NP',652,0,0,1,NULL,NULL,'Test6','AUD',0,0,10.81,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0),('COKE','EAISAPI',NULL,'',22.761629999999997,NULL,60,'Ravi','','NP',653,0,0,1,NULL,NULL,NULL,'USD',0,0,-11.70444,0,0,0,17.347369999999998,0,0,0,17.1187,0,0,0,0,0,0,0,0,0),('M1LTD','EAISAPI',NULL,'',649.3818200000001,NULL,397.7932,'Ravi','','NP',654,0,0,1,NULL,NULL,NULL,'SGD',0,0,194.25190000000003,0,0,0,223.34472,0,0,0,231.78519999999997,0,0,0,0,0,0,0,0,0),('NAB','EAISAPI',NULL,'',0.01839,NULL,0,'Ravi','','NP',655,0,0,1,NULL,NULL,NULL,'AUD',0,0,0.00613,0,0,0,0.00613,0,0,0,0.00613,0,0,0,0,0,0,0,0,0),('PERMTMST','EAISAPI',NULL,'',11.15716,NULL,0,'Ravi','','NP',656,0,0,1,NULL,NULL,NULL,'AUD',0,0,5.967779999999999,0,0,0,5.18938,0,0,0,0,0,0,0,0,0,0,0,0,0),('TELSTMST','EAISAPI',NULL,'',238.16048,NULL,196.3758,'Ravi','','NP',657,0,0,1,NULL,NULL,NULL,'AUD',0,0,81.79570000000001,0,0,0,79.41451,0,0,0,76.95026999999999,0,0,0,0,0,0,0,0,0),('ENECOMST','EAISAPI',NULL,'',108.51548,NULL,103.7082,'Sarada','','NP',658,0,0,1,NULL,NULL,NULL,'AED',0,0,39.51298,0,0,0,34.50125,0,0,0,34.50125,0,0,0,0,0,0,0,0,0),('SDGOEMST','EAISAPI',NULL,'',75.29709,NULL,80.0268,'Sarada','','NP',659,0,0,1,NULL,NULL,NULL,'AED',0,0,25.37209,0,0,0,25.37172,0,0,0,24.55328,0,0,0,0,0,0,0,0,0),('SHBTCMST','EAISAPI',NULL,'',-0.7795699999999998,NULL,0,'Sarada','','NP',660,0,0,1,NULL,NULL,NULL,'USD',0,0,-0.7795699999999998,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0),('TMKHDMST','EAISAPI',NULL,'',115.14153999999999,NULL,102.3519,'Sarada','','NP',661,0,0,1,NULL,NULL,NULL,'USD',0,0,34.015519999999995,0,0,0,47.14455,0,0,0,33.98147,0,0,0,0,0,0,0,0,0),('TRADUMST','EAISAPI',NULL,'',492.49966,NULL,572.1644,'Sarada','','NP',662,0,0,1,NULL,NULL,NULL,'AED',0,0,165.27469,0,0,0,165.2736,0,0,0,161.95137,0,0,0,0,0,0,0,0,0),('LIFULMST','EAISAPI',NULL,'',0,NULL,0,'Ravi','','(blank)',663,0,0,0,NULL,NULL,NULL,NULL,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0),('0_NewProspect','EAISAPI',NULL,'',0,NULL,108,NULL,'','Amit',664,0,0,0,NULL,NULL,NULL,NULL,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0),('AMDUSMST','EAISSOA',NULL,'',23.420859999999998,NULL,18.4,NULL,'','Amit',665,0,0,0,NULL,NULL,NULL,NULL,0,0,6.50601,0,0,0,6.50437,0,0,0,10.41048,0,0,0,0,0,0,0,0,0),('APSMAST','EAISSOA',NULL,'',92.77891,NULL,94.5,NULL,'','Amit',666,0,0,0,NULL,NULL,NULL,NULL,0,0,46.70918,0,0,0,26.94587,0,0,0,19.12386,0,0,0,0,0,0,0,0,0),('AVNETMST','EAISSOA',NULL,'',184.66993,NULL,198,NULL,'','Amit',667,0,0,0,NULL,NULL,NULL,NULL,0,0,58.575889999999994,0,0,0,56.1605,0,0,0,69.93354,0,0,0,0,0,0,0,0,0),('BH1','EAISSOA',NULL,'',0,NULL,0,NULL,'','Amit',668,0,0,0,NULL,NULL,NULL,NULL,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0),('BHPBNMST','EAISSOA',NULL,'',84.87,NULL,87,NULL,'','Amit',669,0,0,0,NULL,NULL,NULL,NULL,0,0,46.4025,0,0,0,21.0105,0,0,0,17.457,0,0,0,0,0,0,0,0,0),('BPMAST','EAISSOA',NULL,'',737.95693,NULL,800,NULL,'','Amit',670,0,0,0,NULL,NULL,NULL,NULL,0,0,253.62747000000002,0,0,0,265.64478,0,0,0,218.68468000000001,0,0,0,0,0,0,0,0,0),('CONDTMST','EAISSOA',NULL,'',61.3275,NULL,60,NULL,'','Amit',671,0,0,0,NULL,NULL,NULL,NULL,0,0,20.4425,0,0,0,20.4425,0,0,0,20.4425,0,0,0,0,0,0,0,0,0),('COPARMST','EAISSOA',NULL,'',165.69669,NULL,179.5,NULL,'','Amit',672,0,0,0,NULL,NULL,NULL,NULL,0,0,55.30589,0,0,0,55.30569,0,0,0,55.08511,0,0,0,0,0,0,0,0,0),('CYPREMST','EAISSOA',NULL,'',65.64231,NULL,75,NULL,'','Amit',673,0,0,0,NULL,NULL,NULL,NULL,0,0,20.66104,0,0,0,22.53096,0,0,0,22.450309999999998,0,0,0,0,0,0,0,0,0),('EXELOMST','EAISSOA',NULL,'',68.84955,NULL,68,NULL,'','Amit',674,0,0,0,NULL,NULL,NULL,NULL,0,0,22.10889,0,0,0,22.59977,0,0,0,24.14089,0,0,0,0,0,0,0,0,0),('INOGYMST','EAISSOA',NULL,'',723.5494100000001,NULL,669.993799,NULL,'','Amit',675,0,0,0,NULL,NULL,NULL,NULL,0,0,258.07564,0,0,0,263.39391,0,0,0,202.07986,0,0,0,0,0,0,0,0,0),('NALCHMST','EAISSOA',NULL,'',0,NULL,0,NULL,'','Amit',676,0,0,0,NULL,NULL,NULL,NULL,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0),('NUOOOOO1','EAISSOA',NULL,'',413.24451999999997,NULL,394,NULL,'','Amit',677,0,0,0,NULL,NULL,NULL,NULL,0,0,151.62989,0,0,0,153.99147,0,0,0,107.62316,0,0,0,0,0,0,0,0,0),('PWC','EAISSOA',NULL,'',353.0781,NULL,334,NULL,'','Amit',678,0,0,0,NULL,NULL,NULL,NULL,0,0,126.54681,0,0,0,110.97632,0,0,0,115.55497000000001,0,0,0,0,0,0,0,0,0),('SSEPLC','EAISSOA',NULL,'',15.26295,NULL,14.6167208,NULL,'','Amit',679,0,0,0,NULL,NULL,NULL,NULL,0,0,5.57219,0,0,0,4.60311,0,0,0,5.08765,0,0,0,0,0,0,0,0,0),('SSESLMST','EAISSOA',NULL,'',127.01154000000001,NULL,113.92717880000001,NULL,'','Amit',680,0,0,0,NULL,NULL,NULL,NULL,0,0,43.17884000000001,0,0,0,43.19865,0,0,0,40.63405,0,0,0,0,0,0,0,0,0),('TMBUSMST','EAISSOA',NULL,'',0,NULL,0,NULL,'','Amit',681,0,0,0,NULL,NULL,NULL,NULL,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0),('UK-MOB-1','EAISSOA',NULL,'',178.25516,NULL,132.0075,NULL,'','Amit',682,0,0,0,NULL,NULL,NULL,NULL,0,0,45.09528,0,0,0,54.74198,0,0,0,78.41789999999999,0,0,0,0,0,0,0,0,0),('VFLNZMST','EAISSOA',NULL,'',13.63025,NULL,12.601700999999998,NULL,'','Amit',683,0,0,0,NULL,NULL,NULL,NULL,0,0,5.04309,0,0,0,4.36637,0,0,0,4.22079,0,0,0,0,0,0,0,0,0),('ADIDMAST','EAISSOA',NULL,'',736.5520200000001,NULL,674.705,NULL,'','Bindu',684,0,0,0,NULL,NULL,NULL,NULL,0,0,285.72865,0,0,0,248.53835,0,0,0,202.28502000000003,0,0,0,0,0,0,0,0,0),('APPLE','EAISSOA',NULL,'',32.136,NULL,30,NULL,'','Bindu',685,0,0,0,NULL,NULL,NULL,NULL,0,0,11.96,0,0,0,9.88,0,0,0,10.296,0,0,0,0,0,0,0,0,0),('AVON','EAISSOA',NULL,'',206.99303,NULL,120,NULL,'','Bindu',686,0,0,0,NULL,NULL,NULL,NULL,0,0,59.110409999999995,0,0,0,74.29217,0,0,0,73.59045,0,0,0,0,0,0,0,0,0),('BNSF','EAISSOA',NULL,'',0,NULL,0,NULL,'','Bindu',687,0,0,0,NULL,NULL,NULL,NULL,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0),('bpostMST','EAISSOA',NULL,'',93.37221,NULL,77.4444,NULL,'','Bindu',688,0,0,0,NULL,NULL,NULL,NULL,0,0,31.35725,0,0,0,30.86513,0,0,0,31.14983,0,0,0,0,0,0,0,0,0),('CAMPBMST','EAISSOA',NULL,'',192.38072,NULL,181,NULL,'','Bindu',689,0,0,0,NULL,NULL,NULL,NULL,0,0,85.51947,0,0,0,62.93158999999999,0,0,0,43.929660000000005,0,0,0,0,0,0,0,0,0),('DHLMST','EAISSOA',NULL,'',170.12000999999998,NULL,194.7844,NULL,'','Bindu',690,0,0,0,NULL,NULL,NULL,NULL,0,0,56.59967,0,0,0,56.599979999999995,0,0,0,56.92036,0,0,0,0,0,0,0,0,0),('DTCHLMST','EAISSOA',NULL,'',0,NULL,0,NULL,'','Bindu',691,0,0,0,NULL,NULL,NULL,NULL,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0),('EDGEMST','EAISSOA',NULL,'',6.63432,NULL,9,NULL,'','Bindu',692,0,0,0,NULL,NULL,NULL,NULL,0,0,1.882,0,0,0,2.34767,0,0,0,2.40465,0,0,0,0,0,0,0,0,0),('ENERMST','EAISSOA',NULL,'',16.23688,NULL,15,NULL,'','Bindu',693,0,0,0,NULL,NULL,NULL,NULL,0,0,5.84715,0,0,0,5.27413,0,0,0,5.115600000000001,0,0,0,0,0,0,0,0,0),('HYUNDAI','EAISSOA',NULL,'',0,NULL,0,NULL,'','Bindu',694,0,0,0,NULL,NULL,NULL,NULL,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0),('ICABMST','EAISSOA',NULL,'',15.34345,NULL,34.6256,NULL,'','Bindu',695,0,0,0,NULL,NULL,NULL,NULL,0,0,12.517040000000001,0,0,0,2.8264099999999996,0,0,0,0,0,0,0,0,0,0,0,0,0),('INBEV','EAISSOA',NULL,'',46.90313,NULL,63,NULL,'','Bindu',696,0,0,0,NULL,NULL,NULL,NULL,0,0,42.81932,0,0,0,2.0757,0,0,0,2.00811,0,0,0,0,0,0,0,0,0),('JCMASTER','EAISSOA',NULL,'',29.30751,NULL,30,NULL,'','Bindu',697,0,0,0,NULL,NULL,NULL,NULL,0,0,9.76998,0,0,0,9.76998,0,0,0,9.76755,0,0,0,0,0,0,0,0,0),('JPGMST','EAISSOA',NULL,'',0,NULL,0,NULL,'','Bindu',698,0,0,0,NULL,NULL,NULL,NULL,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0),('LOREFMST','EAISSOA',NULL,'',12.409859999999998,NULL,0,NULL,'','Bindu',699,0,0,0,NULL,NULL,NULL,NULL,0,0,4.13662,0,0,0,4.13662,0,0,0,4.13662,0,0,0,0,0,0,0,0,0),('MACYSMST','EAISSOA',NULL,'',317.96124,NULL,342,NULL,'','Bindu',700,0,0,0,NULL,NULL,NULL,NULL,0,0,105.04845,0,0,0,108.20013999999999,0,0,0,104.71265000000001,0,0,0,0,0,0,0,0,0),('NORSCMST','EAISSOA',NULL,'',16.32716,NULL,21,NULL,'','Bindu',701,0,0,0,NULL,NULL,NULL,NULL,0,0,11.56467,0,0,0,2.42028,0,0,0,2.3422099999999997,0,0,0,0,0,0,0,0,0),('NSTROM','EAISSOA',NULL,'',23.681099999999997,NULL,24,NULL,'','Bindu',702,0,0,0,NULL,NULL,NULL,NULL,0,0,7.893599999999999,0,0,0,10.524799999999999,0,0,0,5.2627,0,0,0,0,0,0,0,0,0),('PACLIMST','EAISSOA',NULL,'',69.52000000000001,NULL,0,NULL,'','Bindu',703,0,0,0,NULL,NULL,NULL,NULL,0,0,18.96,0,0,0,25.28,0,0,0,25.28,0,0,0,0,0,0,0,0,0),('PEPSIMST','EAISSOA',NULL,'',407.42413,NULL,465,NULL,'','Bindu',704,0,0,0,NULL,NULL,NULL,NULL,0,0,110.99705,0,0,0,153.96875,0,0,0,142.45833,0,0,0,0,0,0,0,0,0),('PGMSTRCT','EAISSOA',NULL,'',16.22544,NULL,15,NULL,'','Bindu',705,0,0,0,NULL,NULL,NULL,NULL,0,0,5.40848,0,0,0,5.40848,0,0,0,5.40848,0,0,0,0,0,0,0,0,0),('REXELFR','EAISSOA',NULL,'',56.7875,NULL,45,NULL,'','Bindu',706,0,0,0,NULL,NULL,NULL,NULL,0,0,19.78958,0,0,0,18.06875,0,0,0,18.92917,0,0,0,0,0,0,0,0,0),('SMTFINAL','EAISSOA',NULL,'',0,NULL,0,NULL,'','Bindu',707,0,0,0,NULL,NULL,NULL,NULL,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0),('TNTMST','EAISSOA',NULL,'',0,NULL,0,NULL,'','Bindu',708,0,0,0,NULL,NULL,NULL,NULL,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0),('TOYOTMST','EAISSOA',NULL,'',53.760000000000005,NULL,50.400000000000006,NULL,'','Bindu',709,0,0,0,NULL,NULL,NULL,NULL,0,0,18.48,0,0,0,17.64,0,0,0,17.64,0,0,0,0,0,0,0,0,0),('TSCOMST','EAISSOA',NULL,'',149.83386,NULL,268,NULL,'','Bindu',710,0,0,0,NULL,NULL,NULL,NULL,0,0,50.235519999999994,0,0,0,50.17117,0,0,0,49.427170000000004,0,0,0,0,0,0,0,0,0),('ULTAMST','EAISSOA',NULL,'',103.74609999999998,NULL,101.6,NULL,'','Bindu',711,0,0,0,NULL,NULL,NULL,NULL,0,0,26.18658,0,0,0,38.11632,0,0,0,39.4432,0,0,0,0,0,0,0,0,0),('UT','EAISSOA',NULL,'',29.988899999999997,NULL,31,NULL,'','Bindu',712,0,0,0,NULL,NULL,NULL,NULL,0,0,7.1777,0,0,0,11.590379999999998,0,0,0,11.22082,0,0,0,0,0,0,0,0,0),('WS','EAISSOA',NULL,'',0,NULL,10,NULL,'','Bindu',713,0,0,0,NULL,NULL,NULL,NULL,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0),('ALCONMST','EAISSOA',NULL,'',0,NULL,0,NULL,'','Harish',714,0,0,0,NULL,NULL,NULL,NULL,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0),('ALSTMST','EAISSOA',NULL,'',154.51691,NULL,120,NULL,'','Harish',715,0,0,0,NULL,NULL,NULL,NULL,0,0,57.616119999999995,0,0,0,48.877430000000004,0,0,0,48.02336,0,0,0,0,0,0,0,0,0),('AMEXMAST','EAISSOA',NULL,'',516.97383,NULL,490,NULL,'','Harish',716,0,0,0,NULL,NULL,NULL,NULL,0,0,199.37084,0,0,0,158.71363,0,0,0,158.88936,0,0,0,0,0,0,0,0,0),('BOFAMAST','EAISSOA',NULL,'',53.40181,NULL,50,NULL,'','Harish',717,0,0,0,NULL,NULL,NULL,NULL,0,0,17.38057,0,0,0,17.074029999999997,0,0,0,18.947210000000002,0,0,0,0,0,0,0,0,0),('CAREFMST','EAISSOA',NULL,'',423.92265999999995,NULL,405,NULL,'','Harish',718,0,0,0,NULL,NULL,NULL,NULL,0,0,212.65238999999997,0,0,0,211.27026999999998,0,0,0,0,0,0,0,0,0,0,0,0,0),('CITIMAST','EAISSOA',NULL,'',115.58803,NULL,60,NULL,'','Harish',719,0,0,0,NULL,NULL,NULL,NULL,0,0,37.98485,0,0,0,39.4866,0,0,0,38.11658,0,0,0,0,0,0,0,0,0),('CSMGCMST','EAISSOA',NULL,'',94.07265999999998,NULL,95,NULL,'','Harish',720,0,0,0,NULL,NULL,NULL,NULL,0,0,50.373129999999996,0,0,0,43.699529999999996,0,0,0,0,0,0,0,0,0,0,0,0,0),('DEUTMST','EAISSOA',NULL,'',27.95172,NULL,28.1616,NULL,'','Harish',721,0,0,0,NULL,NULL,NULL,NULL,0,0,9.656049999999999,0,0,0,8.63962,0,0,0,9.656049999999999,0,0,0,0,0,0,0,0,0),('INGIHL','EAISSOA',NULL,'',0.94116,NULL,0,NULL,'','Harish',722,0,0,0,NULL,NULL,NULL,NULL,0,0,0.94116,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0),('INTESMST','EAISSOA',NULL,'',132.18153,NULL,102.1154,NULL,'','Harish',723,0,0,0,NULL,NULL,NULL,NULL,0,0,41.54851,0,0,0,44.21123,0,0,0,46.42179,0,0,0,0,0,0,0,0,0),('MOLINA','EAISSOA',NULL,'',52.293620000000004,NULL,45,NULL,'','Harish',724,0,0,0,NULL,NULL,NULL,NULL,0,0,28.09748,0,0,0,12.06107,0,0,0,12.135069999999999,0,0,0,0,0,0,0,0,0),('NNGRPMST','EAISSOA',NULL,'',44.80205,NULL,37.5488,NULL,'','Harish',725,0,0,0,NULL,NULL,NULL,NULL,0,0,13.51173,0,0,0,15.64516,0,0,0,15.64516,0,0,0,0,0,0,0,0,0),('NOVARMST','EAISSOA',NULL,'',0,NULL,0,NULL,'','Harish',726,0,0,0,NULL,NULL,NULL,NULL,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0),('PFE','EAISSOA',NULL,'',22.86752,NULL,15,NULL,'','Harish',727,0,0,0,NULL,NULL,NULL,NULL,0,0,5.400829999999999,0,0,0,9.66945,0,0,0,7.79724,0,0,0,0,0,0,0,0,0),('RBSMAST','EAISSOA',NULL,'',164.47775000000001,NULL,151.2342,NULL,'','Harish',728,0,0,0,NULL,NULL,NULL,NULL,0,0,54.57894,0,0,0,54.86507,0,0,0,55.033739999999995,0,0,0,0,0,0,0,0,0),('SANOFMST','EAISSOA',NULL,'',30.568670000000004,NULL,21.1212,NULL,'','Harish',729,0,0,0,NULL,NULL,NULL,NULL,0,0,1.8166099999999998,0,0,0,16.27362,0,0,0,12.47844,0,0,0,0,0,0,0,0,0),('TSBUK','EAISSOA',NULL,'',19.03614,NULL,15.511199999999999,NULL,'','Harish',730,0,0,0,NULL,NULL,NULL,NULL,0,0,8.66071,0,0,0,7.91418,0,0,0,2.4612499999999997,0,0,0,0,0,0,0,0,0),('ABNMST','EAISSOA',NULL,'',2454.0242,NULL,2493.0449,NULL,NULL,'Mukul',731,0,0,0,NULL,NULL,NULL,NULL,0,0,939.2201499999999,0,0,0,774.2072800000001,0,0,0,808.5967699999999,0,0,0,0,0,0,0,0,0),('AUTOLL','EAISSOA',NULL,'',0,NULL,0,'Prashant',NULL,'NP',732,0,0,1,NULL,NULL,NULL,'AUD',0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0),('PENTSOLU','EAISSOA',NULL,'',19.58668,NULL,22.2177,'Prashant',NULL,'NP',733,0,0,1,NULL,NULL,NULL,'AUD',0,0,6.25457,0,0,0,6.58376,0,0,0,6.74835,0,0,0,0,0,0,0,0,0),('POLO','EAISSOA',NULL,'',136.68303,NULL,112,'Prashant',NULL,'NP',734,0,0,1,NULL,NULL,NULL,'USD',0,0,42.66393,0,0,0,53.34632,0,0,0,40.672779999999996,0,0,0,0,0,0,0,0,0),('RACQMST','EAISSOA',NULL,'',41.975,NULL,55.9026,'Prashant',NULL,'NP',735,0,0,1,NULL,NULL,NULL,'AUD',0,0,20.355,0,0,0,16.56,0,0,0,5.06,0,0,0,0,0,0,0,0,0),('WESTPAC','EAISSOA',NULL,'',0,NULL,0,'Prashant',NULL,'NP',736,0,0,1,NULL,NULL,NULL,'AUD',0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0),('ANZBGL','EAISSOA',NULL,'',0,NULL,19.3509,'Ravi',NULL,'NP',737,0,0,1,NULL,NULL,NULL,'AUD',0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0),('AUDVMST','EAISSOA',NULL,'',5.67866,NULL,12.25557,'Ravi',NULL,'NP',738,0,0,1,NULL,NULL,NULL,'AUD',0,0,0,0,0,0,5.67866,0,0,0,0,0,0,0,0,0,0,0,0,0),('AUSGRID','EAISSOA',NULL,'',114.94606999999999,NULL,129.006,'Ravi',NULL,'NP',739,0,0,1,NULL,NULL,NULL,'AUD',0,0,61.047000000000004,0,0,0,31.598709999999997,0,0,0,22.300359999999998,0,0,0,0,0,0,0,0,0),('NAB','EAISSOA',NULL,'',96.18027000000001,NULL,91.7376,'Ravi',NULL,'NP',740,0,0,1,NULL,NULL,NULL,'AUD',0,0,28.24401,0,0,0,33.96813,0,0,0,33.96813,0,0,0,0,0,0,0,0,0),('NSWDEMST','EAISSOA',NULL,'',0,NULL,0,'Ravi',NULL,'NP',741,0,0,1,NULL,NULL,NULL,'AUD',0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0),('TELSTMST','EAISSOA',NULL,'',970.8748,NULL,933.1434,'Ravi',NULL,'NP',742,0,0,1,NULL,NULL,NULL,'AUD',0,0,335.90296000000006,0,0,0,326.50131000000005,0,0,0,308.47053,0,0,0,0,0,0,0,0,0),('ADBMST','EAISSOA',NULL,'m1->test1\nm2->\nm3->',46.65868999999999,NULL,44,'Sarada',NULL,'NP',743,0,0,1,'test1','','','USD',0,0,16.04816,0,0,0,16.754019999999997,0,0,0,13.856509999999998,0,0,0,0,0,0,0,0,16.754019999999997),('MENESMST','EAISSOA',NULL,'',111.90853,NULL,110.5132,'Sarada',NULL,'NP',744,0,0,1,NULL,NULL,NULL,'AED',0,0,24.809630000000002,0,0,0,63.08791000000001,0,0,0,24.010989999999996,0,0,0,0,0,0,0,0,0),('TOMCOMST','EAISSOA',NULL,'',17.919999999999998,NULL,17.88989482541018,'Sarada',NULL,'NP',745,0,0,1,NULL,NULL,NULL,'USD',0,0,6.44,0,0,0,5.6,0,0,0,5.88,0,0,0,0,0,0,0,0,0),('TOSHAPAC','EAISSOA',NULL,'',102.89600000000002,NULL,113.15,'Sarada',NULL,'NP',746,0,0,1,NULL,NULL,NULL,'USD',0,0,32.76,0,0,0,34.176,0,0,0,35.96,0,0,0,0,0,0,0,0,0),('TRADUMST','EAISSOA',NULL,'',245.93708999999996,NULL,244.04907599999999,'Sarada',NULL,'NP',747,0,0,1,NULL,NULL,NULL,'AED',0,0,82.30443,0,0,0,82.30393999999998,0,0,0,81.32871999999999,0,0,0,0,0,0,0,0,0);
/*!40000 ALTER TABLE `accountbe` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-08-14 12:35:23
