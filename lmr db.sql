/*
SQLyog Community v13.3.0 (64 bit)
MySQL - 10.4.32-MariaDB : Database - lmrtherapycenter
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`lmrtherapycenter` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci */;

USE `lmrtherapycenter`;

/*Table structure for table `admin` */

DROP TABLE IF EXISTS `admin`;

CREATE TABLE `admin` (
  `id` int(255) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) DEFAULT NULL,
  `fullname` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

/*Data for the table `admin` */

insert  into `admin`(`id`,`username`,`fullname`,`password`) values 
(23,'itss gello','Angelo M. Candelaria','123567890'),
(24,'Annie','Annie Kasale','123'),
(25,'Angelo','Angelo M. Candelaria','123'),
(26,'Rey','Rey Verano','123');

/*Table structure for table `aintakeskillassessmentchecklist` */

DROP TABLE IF EXISTS `aintakeskillassessmentchecklist`;

CREATE TABLE `aintakeskillassessmentchecklist` (
  `askill_id` int(11) NOT NULL AUTO_INCREMENT,
  `client_id` int(11) NOT NULL,
  `therapy_id` int(11) NOT NULL,
  `education_id` int(11) NOT NULL,
  `r1` varchar(255) DEFAULT NULL,
  `r2` varchar(255) DEFAULT NULL,
  `r3` varchar(255) DEFAULT NULL,
  `r4` varchar(255) DEFAULT NULL,
  `r5` varchar(255) DEFAULT NULL,
  `r6` varchar(255) DEFAULT NULL,
  `r7` varchar(255) DEFAULT NULL,
  `m1` varchar(255) DEFAULT NULL,
  `m2` varchar(255) DEFAULT NULL,
  `m3` varchar(255) DEFAULT NULL,
  `m4` varchar(255) DEFAULT NULL,
  `m5` varchar(255) DEFAULT NULL,
  `m6` varchar(255) DEFAULT NULL,
  `m7` varchar(255) DEFAULT NULL,
  `r8` varchar(255) DEFAULT NULL,
  `r9` varchar(255) DEFAULT NULL,
  `r10` varchar(255) DEFAULT NULL,
  `r11` varchar(255) DEFAULT NULL,
  `r12` varchar(255) DEFAULT NULL,
  `r13` varchar(255) DEFAULT NULL,
  `r14` varchar(255) DEFAULT NULL,
  `m8` varchar(255) DEFAULT NULL,
  `m9` varchar(255) DEFAULT NULL,
  `m10` varchar(255) DEFAULT NULL,
  `m11` varchar(255) DEFAULT NULL,
  `m12` varchar(255) DEFAULT NULL,
  `m13` varchar(255) DEFAULT NULL,
  `m14` varchar(255) DEFAULT NULL,
  `r15` varchar(255) DEFAULT NULL,
  `r16` varchar(255) DEFAULT NULL,
  `r17` varchar(255) DEFAULT NULL,
  `r18` varchar(255) DEFAULT NULL,
  `r19` varchar(255) DEFAULT NULL,
  `r20` varchar(255) DEFAULT NULL,
  `r21` varchar(255) DEFAULT NULL,
  `r22` varchar(255) DEFAULT NULL,
  `r23` varchar(255) DEFAULT NULL,
  `r24` varchar(255) DEFAULT NULL,
  `r25` varchar(255) DEFAULT NULL,
  `r26` varchar(255) DEFAULT NULL,
  `r27` varchar(255) DEFAULT NULL,
  `r28` varchar(255) DEFAULT NULL,
  `m15` varchar(255) DEFAULT NULL,
  `m16` varchar(255) DEFAULT NULL,
  `m17` varchar(255) DEFAULT NULL,
  `m18` varchar(255) DEFAULT NULL,
  `m19` varchar(255) DEFAULT NULL,
  `m20` varchar(255) DEFAULT NULL,
  `m21` varchar(255) DEFAULT NULL,
  `m22` varchar(255) DEFAULT NULL,
  `m23` varchar(255) DEFAULT NULL,
  `m24` varchar(255) DEFAULT NULL,
  `m25` varchar(255) DEFAULT NULL,
  `m26` varchar(255) DEFAULT NULL,
  `m27` varchar(255) DEFAULT NULL,
  `m28` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`askill_id`),
  KEY `client_id` (`client_id`),
  KEY `therapy_id` (`therapy_id`),
  KEY `education_id` (`education_id`),
  CONSTRAINT `aintakeskillassessmentchecklist_ibfk_1` FOREIGN KEY (`client_id`) REFERENCES `clientinformation` (`client_id`) ON DELETE CASCADE,
  CONSTRAINT `aintakeskillassessmentchecklist_ibfk_2` FOREIGN KEY (`therapy_id`) REFERENCES `othertherapyprovider` (`therapy_id`) ON DELETE CASCADE,
  CONSTRAINT `aintakeskillassessmentchecklist_ibfk_3` FOREIGN KEY (`education_id`) REFERENCES `educationhistory` (`education_id`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=132 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

/*Data for the table `aintakeskillassessmentchecklist` */

insert  into `aintakeskillassessmentchecklist`(`askill_id`,`client_id`,`therapy_id`,`education_id`,`r1`,`r2`,`r3`,`r4`,`r5`,`r6`,`r7`,`m1`,`m2`,`m3`,`m4`,`m5`,`m6`,`m7`,`r8`,`r9`,`r10`,`r11`,`r12`,`r13`,`r14`,`m8`,`m9`,`m10`,`m11`,`m12`,`m13`,`m14`,`r15`,`r16`,`r17`,`r18`,`r19`,`r20`,`r21`,`r22`,`r23`,`r24`,`r25`,`r26`,`r27`,`r28`,`m15`,`m16`,`m17`,`m18`,`m19`,`m20`,`m21`,`m22`,`m23`,`m24`,`m25`,`m26`,`m27`,`m28`) values 
(118,167,171,151,'Yes','Sometimes','Yes','Yes','No','Sometimes','Yes','','','','','','','','Sometimes','Sometimes','Yes','No','No','Sometimes','Yes','','','','','','','','Sometimes','Yes','Yes','Yes','Sometimes','Yes','Yes','Yes','Yes','Yes','Sometimes','Yes','Sometimes','Yes','','','','','','','','','','','','','',''),
(120,169,173,153,'Choose','Choose','Choose','Choose','Choose','Choose','Choose','','','','','','','','Choose','Choose','Choose','Choose','Choose','Choose','Choose','','','','','','','','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','','','','','','','','','','','','','',''),
(121,170,174,154,'Choose','Choose','Choose','Choose','Choose','Choose','Choose','','','','','','','','Choose','Choose','Choose','Choose','Choose','Choose','Choose','','','','','','','','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','','','','','','','','','','','','','',''),
(122,171,175,155,'Choose','Choose','Choose','Choose','Choose','Choose','Choose','','','','','','','','Choose','Choose','Choose','Choose','Choose','Choose','Choose','','','','','','','','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','','','','','','','','','','','','','',''),
(123,172,176,156,'Choose','Choose','Choose','Choose','Choose','Choose','Choose','','','','','','','','Choose','Choose','Choose','Choose','Choose','Choose','Choose','','','','','','','','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','','','','','','','','','','','','','',''),
(124,173,177,157,'Choose','Choose','Choose','Choose','Choose','Choose','Choose','','','','','','','','Choose','Choose','Choose','Choose','Choose','Choose','Choose','','','','','','','','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','','','','','','','','','','','','','',''),
(125,174,178,158,'Choose','Choose','Choose','Choose','Choose','Choose','Choose','','','','','','','','Choose','Choose','Choose','Choose','Choose','Choose','Choose','','','','','','','','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','','','','','','','','','','','','','',''),
(126,175,179,159,'Choose','Choose','Choose','Choose','Choose','Choose','Choose','','','','','','','','Choose','Choose','Choose','Choose','Choose','Choose','Choose','','','','','','','','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','','','','','','','','','','','','','',''),
(127,176,180,160,'Choose','Choose','Choose','Choose','Choose','Choose','Choose','','','','','','','','Choose','Choose','Choose','Choose','Choose','Choose','Choose','','','','','','','','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','','','','','','','','','','','','','',''),
(128,177,181,161,'Choose','Choose','Choose','Choose','Choose','Choose','Choose','','','','','','','','Choose','Choose','Choose','Choose','Choose','Choose','Choose','','','','','','','','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','','','','','','','','','','','','','',''),
(129,178,182,162,'Choose','Choose','Choose','Choose','Choose','Choose','Choose','','','','','','','','Choose','Choose','Choose','Choose','Choose','Choose','Choose','','','','','','','','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','','','','','','','','','','','','','',''),
(130,179,183,163,'Choose','Choose','Choose','Choose','Choose','Choose','Choose','','','','','','','','Choose','Choose','Choose','Choose','Choose','Choose','Choose','','','','','','','','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','','','','','','','','','','','','','',''),
(131,180,184,164,'Choose','Choose','Choose','Choose','Choose','Choose','Choose','','','','','','','','Choose','Choose','Choose','Choose','Choose','Choose','Choose','','','','','','','','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','','','','','','','','','','','','','','');

/*Table structure for table `appointment` */

DROP TABLE IF EXISTS `appointment`;

CREATE TABLE `appointment` (
  `appointment_id` int(11) NOT NULL AUTO_INCREMENT,
  `guardianname` varchar(100) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `contact` varchar(15) DEFAULT NULL,
  `gmail` varchar(100) DEFAULT NULL,
  `appointment_date` date DEFAULT NULL,
  `appointment_time` time DEFAULT NULL,
  `submitdate` date DEFAULT NULL,
  PRIMARY KEY (`appointment_id`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

/*Data for the table `appointment` */

insert  into `appointment`(`appointment_id`,`guardianname`,`address`,`contact`,`gmail`,`appointment_date`,`appointment_time`,`submitdate`) values 
(10,'asd','asdas','0','asdasd','2025-04-18','10:00:00','2025-04-25'),
(11,'as','asdasd','193954','as','2025-04-03','09:30:00','2025-04-26'),
(12,'asasddd','asddasd','9135112','asdas','2025-04-05','10:00:00','2025-04-24'),
(13,'Angeloooo','32 Sanpedro','1947175','asasd','2025-04-30','11:00:00','2025-04-26'),
(14,'Rey','asdasd','192786412','adasda','2025-04-11','09:30:00','2025-04-26'),
(15,'asdasd','asdasd','3112324','sadasd','2025-04-03','10:00:00','2025-04-26'),
(16,'Ken','asdasda','2352353','asdasdasd','2025-04-29','10:00:00','2025-04-26'),
(17,'Sam','asdasd','16523765','asdas','2025-04-10','09:30:00','2025-04-26'),
(18,'dasdasda','sdasdasd','635172291','dasdas','2025-04-30','09:30:00','2025-04-26'),
(19,'asdasdas','asdasd','63123213','dasdasd','2025-04-29','11:00:00','2025-04-26'),
(20,'Ange','29 Sanglaan','63','asdasd','2025-04-28','10:00:00','2025-04-26'),
(21,'asdas','dasdasd','76533352','dasdas','2025-04-27','10:00:00','2025-04-26'),
(22,'Angelo','09 Building 3','951778','angelo@gmail.com','2025-04-28','11:30:00','2025-04-26'),
(23,'Angelo','09 Building 3','+639517229178','angelo@gmail.com','2025-04-29','11:30:00','2025-04-26'),
(24,'Angelo','32 San Pedro','+6309517229178','Angelo@gmail.com','2025-04-30','09:00:00','2025-04-28'),
(25,'Angelo ','32 San Pedro','+639517229178','angelo@gmail.com','2025-04-30','09:30:00','2025-04-28');

/*Table structure for table `bintakeskillassessmentchecklist` */

DROP TABLE IF EXISTS `bintakeskillassessmentchecklist`;

CREATE TABLE `bintakeskillassessmentchecklist` (
  `bskill_id` int(11) NOT NULL AUTO_INCREMENT,
  `client_id` int(11) NOT NULL,
  `therapy_id` int(11) NOT NULL,
  `education_id` int(11) NOT NULL,
  `askill_id` int(11) NOT NULL,
  `r29` varchar(255) DEFAULT NULL,
  `r30` varchar(255) DEFAULT NULL,
  `r31` varchar(255) DEFAULT NULL,
  `r32` varchar(255) DEFAULT NULL,
  `r33` varchar(255) DEFAULT NULL,
  `r34` varchar(255) DEFAULT NULL,
  `r35` varchar(255) DEFAULT NULL,
  `m29` varchar(255) DEFAULT NULL,
  `m30` varchar(255) DEFAULT NULL,
  `m31` varchar(255) DEFAULT NULL,
  `m32` varchar(255) DEFAULT NULL,
  `m33` varchar(255) DEFAULT NULL,
  `m34` varchar(255) DEFAULT NULL,
  `m35` varchar(255) DEFAULT NULL,
  `r36` varchar(255) DEFAULT NULL,
  `r37` varchar(255) DEFAULT NULL,
  `r38` varchar(255) DEFAULT NULL,
  `r39` varchar(255) DEFAULT NULL,
  `r40` varchar(255) DEFAULT NULL,
  `r41` varchar(255) DEFAULT NULL,
  `r42` varchar(255) DEFAULT NULL,
  `m36` varchar(255) DEFAULT NULL,
  `m37` varchar(255) DEFAULT NULL,
  `m38` varchar(255) DEFAULT NULL,
  `m39` varchar(255) DEFAULT NULL,
  `m40` varchar(255) DEFAULT NULL,
  `m41` varchar(255) DEFAULT NULL,
  `m42` varchar(255) DEFAULT NULL,
  `r43` varchar(255) DEFAULT NULL,
  `r44` varchar(255) DEFAULT NULL,
  `m44` varchar(255) DEFAULT NULL,
  `m43` varchar(255) DEFAULT NULL,
  `rthrow` varchar(255) DEFAULT NULL,
  `rkick` varchar(255) DEFAULT NULL,
  `mthrow` varchar(255) DEFAULT NULL,
  `mkick` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`bskill_id`),
  KEY `client_id` (`client_id`),
  KEY `therapy_id` (`therapy_id`),
  KEY `education_id` (`education_id`),
  KEY `askill_id` (`askill_id`),
  CONSTRAINT `bintakeskillassessmentchecklist_ibfk_1` FOREIGN KEY (`client_id`) REFERENCES `clientinformation` (`client_id`) ON DELETE CASCADE,
  CONSTRAINT `bintakeskillassessmentchecklist_ibfk_2` FOREIGN KEY (`therapy_id`) REFERENCES `othertherapyprovider` (`therapy_id`) ON DELETE CASCADE,
  CONSTRAINT `bintakeskillassessmentchecklist_ibfk_3` FOREIGN KEY (`education_id`) REFERENCES `educationhistory` (`education_id`) ON DELETE CASCADE,
  CONSTRAINT `bintakeskillassessmentchecklist_ibfk_4` FOREIGN KEY (`askill_id`) REFERENCES `aintakeskillassessmentchecklist` (`askill_id`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=119 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

/*Data for the table `bintakeskillassessmentchecklist` */

insert  into `bintakeskillassessmentchecklist`(`bskill_id`,`client_id`,`therapy_id`,`education_id`,`askill_id`,`r29`,`r30`,`r31`,`r32`,`r33`,`r34`,`r35`,`m29`,`m30`,`m31`,`m32`,`m33`,`m34`,`m35`,`r36`,`r37`,`r38`,`r39`,`r40`,`r41`,`r42`,`m36`,`m37`,`m38`,`m39`,`m40`,`m41`,`m42`,`r43`,`r44`,`m44`,`m43`,`rthrow`,`rkick`,`mthrow`,`mkick`) values 
(105,167,171,151,118,'Sometimes','Yes','Yes','Yes','Yes','Sometimes','Yes','','','','','','','','Sometimes','Yes','Yes','Yes','Yes','No','Yes','','','','','','','','No','No','','','Yes','Yes','',''),
(107,169,173,153,120,'Choose','Choose','Choose','Choose','Choose','Choose','Choose','','','','','','','','Choose','Choose','Choose','Choose','Choose','Choose','Choose','','','','','','','','Choose','Choose','','','Choose','Choose','',''),
(108,170,174,154,121,'Choose','Choose','Choose','Choose','Choose','Choose','Choose','','','','','','','','Choose','Choose','Choose','Choose','Choose','Choose','Choose','','','','','','','','Choose','Choose','','','Choose','Choose','',''),
(109,171,175,155,122,'Choose','Choose','Choose','Choose','Choose','Choose','Choose','','','','','','','','Choose','Choose','Choose','Choose','Choose','Choose','Choose','','','','','','','','Choose','Choose','','','Choose','Choose','',''),
(110,172,176,156,123,'Choose','Choose','Choose','Choose','Choose','Choose','Choose','','','','','','','','Choose','Choose','Choose','Choose','Choose','Choose','Choose','','','','','','','','Choose','Choose','','','Choose','Choose','',''),
(111,173,177,157,124,'Choose','Choose','Choose','Choose','Choose','Choose','Choose','','','','','','','','Choose','Choose','Choose','Choose','Choose','Choose','Choose','','','','','','','','Choose','Choose','','','Choose','Choose','',''),
(112,174,178,158,125,'Choose','Choose','Choose','Choose','Choose','Choose','Choose','','','','','','','','Choose','Choose','Choose','Choose','Choose','Choose','Choose','','','','','','','','Choose','Choose','','','Choose','Choose','',''),
(113,175,179,159,126,'Choose','Choose','Choose','Choose','Choose','Choose','Choose','','','','','','','','Choose','Choose','Choose','Choose','Choose','Choose','Choose','','','','','','','','Choose','Choose','','','Choose','Choose','',''),
(114,176,180,160,127,'Choose','Choose','Choose','Choose','Choose','Choose','Choose','','','','','','','','Choose','Choose','Choose','Choose','Choose','Choose','Choose','','','','','','','','Choose','Choose','','','Choose','Choose','',''),
(115,177,181,161,128,'Choose','Choose','Choose','Choose','Choose','Choose','Choose','','','','','','','','Choose','Choose','Choose','Choose','Choose','Choose','Choose','','','','','','','','Choose','Choose','','','Choose','Choose','',''),
(116,178,182,162,129,'Choose','Choose','Choose','Choose','Choose','Choose','Choose','','','','','','','','Choose','Choose','Choose','Choose','Choose','Choose','Choose','','','','','','','','Choose','Choose','','','Choose','Choose','',''),
(117,179,183,163,130,'Choose','Choose','Choose','Choose','Choose','Choose','Choose','','','','','','','','Choose','Choose','Choose','Choose','Choose','Choose','Choose','','','','','','','','Choose','Choose','','','Choose','Choose','',''),
(118,180,184,164,131,'Choose','Choose','Choose','Choose','Choose','Choose','Choose','','','','','','','','Choose','Choose','Choose','Choose','Choose','Choose','Choose','','','','','','','','Choose','Choose','','','Choose','Choose','','');

/*Table structure for table `clientinformation` */

DROP TABLE IF EXISTS `clientinformation`;

CREATE TABLE `clientinformation` (
  `client_id` int(11) NOT NULL AUTO_INCREMENT,
  `clientname` varchar(255) NOT NULL,
  `nickname` varchar(255) DEFAULT NULL,
  `dateofbirth` varchar(20) DEFAULT NULL,
  `gender` varchar(50) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `diagnosis` varchar(255) DEFAULT NULL,
  `ifasdlevel` varchar(50) DEFAULT NULL,
  `physician` varchar(255) DEFAULT NULL,
  `clinicname` varchar(255) DEFAULT NULL,
  `submit` varchar(20) NOT NULL,
  `enrolled` varchar(10) DEFAULT 'No',
  PRIMARY KEY (`client_id`)
) ENGINE=InnoDB AUTO_INCREMENT=181 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

/*Data for the table `clientinformation` */

insert  into `clientinformation`(`client_id`,`clientname`,`nickname`,`dateofbirth`,`gender`,`address`,`diagnosis`,`ifasdlevel`,`physician`,`clinicname`,`submit`,`enrolled`) values 
(167,'Samuel Pisico','Sam','2010-07-01','Male','11 San Pedro Street, Payatas A, Quezon City','ADHD','Level 1','Joyce Makula','Kalinga Hospital','','Yes'),
(169,'Rey','rii','2015-04-18','Male','32 Banaba Street, Payatas D, Cavite','ADHD','Level 4','Ken Sean Basanes','Clinical Kulang','','No'),
(170,'asdad','asdasd','2025-04-05','Male','asd','asdas','Level 1','dasdas','dasdas','','No'),
(171,'AAA','asdasdas','2025-04-05','Male','asda','asdas','Level 3','asdasd','asdasda','','Yes'),
(172,'BBB','asdas','2025-04-03','Choose','','','Choose','','','','No'),
(173,'Gorge Dimagiba','Geor','2011-04-09','Male','99 Alanganin sa Banging Street, Dayuhin ng bagyo','Nauntog kaya nabaliw','Level 2','Dr. Habulin ng Baliw','Sugoran ng baliw','','No'),
(174,'Kin','asdad','2022-04-09','Male','dasd','asdas','Level 2','dasdasd','asdas','','Yes'),
(175,'Oia','asdasdasd','2021-04-10','Male','asdas','dasd','Level 5','asdasd','asdasds','','Yes'),
(176,'Kon','asdasd','2020-04-09','Female','asdasd','asd','Level 3','asdasd','A','2025-04-11','No'),
(177,'asdasda','asdasda','2025-04-12','Female','asdasdas','dasdasd','Level 2','asdasda','asdasdasd','2025-04-28','No'),
(178,'a','asdas','2025-04-12','Female','asdasd','asd','Level 2','asdasd','asdas','2025-04-28','Yes'),
(179,'Aaaa','aa','2025-04-03','Male','dasd','dasasdas','Level 2','asdasdasdas','dasd','2025-04-16','Yes'),
(180,'Rey','N/A','2025-04-05','Male','32 Block 3','ADHD','NA','Ken Sean Basanes','Sanbol Clinic','2025-04-28','No');

/*Table structure for table `dintakeskillassessmentchecklist` */

DROP TABLE IF EXISTS `dintakeskillassessmentchecklist`;

CREATE TABLE `dintakeskillassessmentchecklist` (
  `client_id` int(11) NOT NULL,
  `therapy_id` int(11) NOT NULL,
  `education_id` int(11) NOT NULL,
  `askill_id` int(11) NOT NULL,
  `bskill_id` int(11) NOT NULL,
  `r45` varchar(255) DEFAULT NULL,
  `r46` varchar(255) DEFAULT NULL,
  `r47` varchar(255) DEFAULT NULL,
  `r48` varchar(255) DEFAULT NULL,
  `r49` varchar(255) DEFAULT NULL,
  `r50` varchar(255) DEFAULT NULL,
  `r51` varchar(255) DEFAULT NULL,
  `r52` varchar(255) DEFAULT NULL,
  `r53` varchar(255) DEFAULT NULL,
  `r54` varchar(255) DEFAULT NULL,
  `r55` varchar(255) DEFAULT NULL,
  `r56` varchar(255) DEFAULT NULL,
  `r57` varchar(255) DEFAULT NULL,
  `r58` varchar(255) DEFAULT NULL,
  `m45` varchar(255) DEFAULT NULL,
  `m46` varchar(255) DEFAULT NULL,
  `m47` varchar(255) DEFAULT NULL,
  `m48` varchar(255) DEFAULT NULL,
  `m49` varchar(255) DEFAULT NULL,
  `m50` varchar(255) DEFAULT NULL,
  `m51` varchar(255) DEFAULT NULL,
  `m52` varchar(255) DEFAULT NULL,
  `m53` varchar(255) DEFAULT NULL,
  `m54` varchar(255) DEFAULT NULL,
  `m55` varchar(255) DEFAULT NULL,
  `m56` varchar(255) DEFAULT NULL,
  `m57` varchar(255) DEFAULT NULL,
  `m58` varchar(255) DEFAULT NULL,
  KEY `client_id` (`client_id`),
  KEY `therapy_id` (`therapy_id`),
  KEY `education_id` (`education_id`),
  KEY `askill_id` (`askill_id`),
  KEY `bskill_id` (`bskill_id`),
  CONSTRAINT `dintakeskillassessmentchecklist_ibfk_1` FOREIGN KEY (`client_id`) REFERENCES `clientinformation` (`client_id`) ON DELETE CASCADE,
  CONSTRAINT `dintakeskillassessmentchecklist_ibfk_2` FOREIGN KEY (`therapy_id`) REFERENCES `othertherapyprovider` (`therapy_id`) ON DELETE CASCADE,
  CONSTRAINT `dintakeskillassessmentchecklist_ibfk_3` FOREIGN KEY (`education_id`) REFERENCES `educationhistory` (`education_id`) ON DELETE CASCADE,
  CONSTRAINT `dintakeskillassessmentchecklist_ibfk_4` FOREIGN KEY (`askill_id`) REFERENCES `aintakeskillassessmentchecklist` (`askill_id`) ON DELETE CASCADE,
  CONSTRAINT `dintakeskillassessmentchecklist_ibfk_5` FOREIGN KEY (`bskill_id`) REFERENCES `bintakeskillassessmentchecklist` (`bskill_id`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

/*Data for the table `dintakeskillassessmentchecklist` */

insert  into `dintakeskillassessmentchecklist`(`client_id`,`therapy_id`,`education_id`,`askill_id`,`bskill_id`,`r45`,`r46`,`r47`,`r48`,`r49`,`r50`,`r51`,`r52`,`r53`,`r54`,`r55`,`r56`,`r57`,`r58`,`m45`,`m46`,`m47`,`m48`,`m49`,`m50`,`m51`,`m52`,`m53`,`m54`,`m55`,`m56`,`m57`,`m58`) values 
(167,171,151,118,105,'Yes','Yes','Sometimes','No','Yes','Yes','Yes','Yes','Yes','Yes','Sometimes','Yes','Sometimes','Yes','','','','','','','','','','','','','',''),
(169,173,153,120,107,'Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','','','','','','','','','','','','','',''),
(170,174,154,121,108,'Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','','','','','','','','','','','','','',''),
(171,175,155,122,109,'Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','','','','','','','','','','','','','',''),
(172,176,156,123,110,'Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','','','','','','','','','','','','','',''),
(173,177,157,124,111,'Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','','','','','','','','','','','','','',''),
(174,178,158,125,112,'Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','','','','','','','','','','','','','',''),
(175,179,159,126,113,'Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','','','','','','','','','','','','','',''),
(176,180,160,127,114,'Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','','','','','','','','','','','','','',''),
(177,181,161,128,115,'Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','','','','','','','','','','','','','',''),
(178,182,162,129,116,'Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','','','','','','','','','','','','','',''),
(179,183,163,130,117,'Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','','','','','','','','','','','','','',''),
(180,184,164,131,118,'Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose','','','','','','','','','','','','','','');

/*Table structure for table `educationhistory` */

DROP TABLE IF EXISTS `educationhistory`;

CREATE TABLE `educationhistory` (
  `education_id` int(11) NOT NULL AUTO_INCREMENT,
  `client_id` int(11) NOT NULL,
  `therapy_id` int(11) NOT NULL,
  `sa` varchar(255) DEFAULT NULL,
  `sn` varchar(255) DEFAULT NULL,
  `ly` varchar(50) DEFAULT NULL,
  `sh` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`education_id`),
  KEY `client_id` (`client_id`),
  KEY `therapy_id` (`therapy_id`),
  CONSTRAINT `educationhistory_ibfk_1` FOREIGN KEY (`client_id`) REFERENCES `clientinformation` (`client_id`) ON DELETE CASCADE,
  CONSTRAINT `educationhistory_ibfk_2` FOREIGN KEY (`therapy_id`) REFERENCES `othertherapyprovider` (`therapy_id`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=165 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

/*Data for the table `educationhistory` */

insert  into `educationhistory`(`education_id`,`client_id`,`therapy_id`,`sa`,`sn`,`ly`,`sh`) values 
(151,167,171,'Yes','Pinagpala Elementary School','4','5'),
(153,169,173,'Choose','','',''),
(154,170,174,'Choose','','',''),
(155,171,175,'Choose','','',''),
(156,172,176,'Choose','','',''),
(157,173,177,'Choose','','',''),
(158,174,178,'Choose','','',''),
(159,175,179,'Choose','','',''),
(160,176,180,'Choose','','',''),
(161,177,181,'Choose','','',''),
(162,178,182,'Choose','','',''),
(163,179,183,'Choose','','',''),
(164,180,184,'Choose','','','');

/*Table structure for table `othertherapyprovider` */

DROP TABLE IF EXISTS `othertherapyprovider`;

CREATE TABLE `othertherapyprovider` (
  `therapy_id` int(11) NOT NULL AUTO_INCREMENT,
  `client_id` int(11) NOT NULL,
  `d1` varchar(255) DEFAULT NULL,
  `d2` varchar(255) DEFAULT NULL,
  `d3` varchar(255) DEFAULT NULL,
  `d4` varchar(255) DEFAULT NULL,
  `y1` varchar(255) DEFAULT NULL,
  `y2` varchar(255) DEFAULT NULL,
  `y3` varchar(255) DEFAULT NULL,
  `y4` varchar(255) DEFAULT NULL,
  `l1` varchar(255) DEFAULT NULL,
  `l2` varchar(255) DEFAULT NULL,
  `l3` varchar(255) DEFAULT NULL,
  `l4` varchar(255) DEFAULT NULL,
  `c1` varchar(255) DEFAULT NULL,
  `c2` varchar(255) DEFAULT NULL,
  `c3` varchar(255) DEFAULT NULL,
  `c4` varchar(255) DEFAULT NULL,
  `therapyname` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`therapy_id`),
  KEY `client_id` (`client_id`),
  CONSTRAINT `othertherapyprovider_ibfk_1` FOREIGN KEY (`client_id`) REFERENCES `clientinformation` (`client_id`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=185 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

/*Data for the table `othertherapyprovider` */

insert  into `othertherapyprovider`(`therapy_id`,`client_id`,`d1`,`d2`,`d3`,`d4`,`y1`,`y2`,`y3`,`y4`,`l1`,`l2`,`l3`,`l4`,`c1`,`c2`,`c3`,`c4`,`therapyname`) values 
(171,167,'Tuesday','Thursday','Monday','Friday','10 Years','1 Year','6 Months','3 Years','Homebased','Centerbased','Centerbased','Homebased','Yes','No','No','Yes','Special Learning'),
(173,169,'Choose','Choose','Choose','Choose','','','','','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose',''),
(174,170,'Choose','Choose','Choose','Choose','','','','','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose',''),
(175,171,'Choose','Choose','Choose','Choose','','','','','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose',''),
(176,172,'Choose','Choose','Choose','Choose','','','','','Choose','Choose','Choose','Choose','','','','',''),
(177,173,'Choose','Choose','Choose','Choose','','','','','Choose','Choose','Choose','Choose','Choose','Choose','Choose','Choose',''),
(178,174,'Choose','Choose','Choose','Choose','','','','','Choose','Choose','Choose','Choose','','','','',''),
(179,175,'Choose','Choose','Choose','Choose','','','','','Choose','Choose','Choose','Choose','','','','',''),
(180,176,'Choose','Choose','Choose','Choose','','','','','Choose','Choose','Choose','Choose','','','','',''),
(181,177,'Choose','Choose','Choose','Choose','','','','','Choose','Choose','Choose','Choose','','','','',''),
(182,178,'Choose','Choose','Choose','Choose','','','','','Choose','Choose','Choose','Choose','','','','',''),
(183,179,'Choose','Choose','Choose','Choose','','','','','Choose','Choose','Choose','Choose','','','','',''),
(184,180,'Choose','Choose','Choose','Choose','','','','','Choose','Choose','Choose','Choose','','','','','');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
