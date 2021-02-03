/*
SQLyog Community Edition- MySQL GUI v8.15 Beta1
MySQL - 5.0.37-community-nt : Database - login
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`login` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `login`;

/*Table structure for table `user_pass` */

DROP TABLE IF EXISTS `user_pass`;

CREATE TABLE `user_pass` (
  `USUARIO` char(10) NOT NULL,
  `PASS` char(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `user_pass` */

insert  into `user_pass`(`USUARIO`,`PASS`) values ('ALICIA','12345'),('NOLAN','12ABC'),('BATMAN','12345'),('ROBIN','34CBA');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
