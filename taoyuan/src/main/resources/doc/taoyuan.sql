/*
SQLyog 企业版 - MySQL GUI v8.14 
MySQL - 5.5.40 : Database - taoyuan
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`taoyuan` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_bin */;

USE `taoyuan`;

/*Table structure for table `college` */

DROP TABLE IF EXISTS `college`;

CREATE TABLE `college` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `collegeName` varchar(40) COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `college` */

/*Table structure for table `grade` */

DROP TABLE IF EXISTS `grade`;

CREATE TABLE `grade` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `gradeName` varchar(20) COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `grade` */

/*Table structure for table `image` */

DROP TABLE IF EXISTS `image`;

CREATE TABLE `image` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `imageAdress` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `image` */

/*Table structure for table `info` */

DROP TABLE IF EXISTS `info`;

CREATE TABLE `info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `categoryId` int(11) DEFAULT NULL,
  `imageUrl` varchar(50) COLLATE utf8_bin DEFAULT NULL,
  `content` varchar(1000) COLLATE utf8_bin DEFAULT NULL,
  `lookedCount` int(11) DEFAULT NULL,
  `add_Time` datetime NOT NULL,
  `title` varchar(50) COLLATE utf8_bin NOT NULL,
  `isHot` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_info_category` (`categoryId`),
  CONSTRAINT `fk_info_category` FOREIGN KEY (`categoryId`) REFERENCES `infocategory` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `info` */

insert  into `info`(`id`,`categoryId`,`imageUrl`,`content`,`lookedCount`,`add_Time`,`title`,`isHot`) values (1,2,'','最好的九成新的台灯',0,'2016-05-04 20:40:38','九成新的台灯',1);

/*Table structure for table `infocategory` */

DROP TABLE IF EXISTS `infocategory`;

CREATE TABLE `infocategory` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `categoryName` varchar(30) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `infocategory` */

insert  into `infocategory`(`id`,`categoryName`) values (1,'学习用品');
insert  into `infocategory`(`id`,`categoryName`) values (2,'生活用品');
insert  into `infocategory`(`id`,`categoryName`) values (3,'电子数码');
insert  into `infocategory`(`id`,`categoryName`) values (4,'虚拟交易');
insert  into `infocategory`(`id`,`categoryName`) values (5,'兼职信息');
insert  into `infocategory`(`id`,`categoryName`) values (6,'其他二手');

/*Table structure for table `profession` */

DROP TABLE IF EXISTS `profession`;

CREATE TABLE `profession` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `professionName` varchar(40) COLLATE utf8_bin NOT NULL,
  `collegeId` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_profession_collegeid_college_id` (`collegeId`),
  CONSTRAINT `fk_profession_collegeid_college_id` FOREIGN KEY (`collegeId`) REFERENCES `college` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `profession` */

/*Table structure for table `roomarea` */

DROP TABLE IF EXISTS `roomarea`;

CREATE TABLE `roomarea` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `roomAreaName` varchar(20) COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `roomarea` */

/*Table structure for table `roomfloor` */

DROP TABLE IF EXISTS `roomfloor`;

CREATE TABLE `roomfloor` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `roomAreaId` int(11) NOT NULL,
  `roomFloorName` varchar(20) COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_roomFloor_roomAreaId_roomArea_id` (`roomAreaId`),
  CONSTRAINT `fk_roomFloor_roomAreaId_roomArea_id` FOREIGN KEY (`roomAreaId`) REFERENCES `roomarea` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `roomfloor` */

/*Table structure for table `usercomfirmcode` */

DROP TABLE IF EXISTS `usercomfirmcode`;

CREATE TABLE `usercomfirmcode` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `userId` int(11) DEFAULT NULL,
  `vcode` varchar(50) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_comfirecode_user` (`userId`),
  CONSTRAINT `fk_comfirecode_user` FOREIGN KEY (`userId`) REFERENCES `userlogin` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `usercomfirmcode` */

insert  into `usercomfirmcode`(`id`,`userId`,`vcode`) values (12,59,'184608674405861534518974572648611032378');
insert  into `usercomfirmcode`(`id`,`userId`,`vcode`) values (13,60,'217618359071472558252745408999432768443');

/*Table structure for table `userinfo` */

DROP TABLE IF EXISTS `userinfo`;

CREATE TABLE `userinfo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `headImage` varchar(40) COLLATE utf8_bin DEFAULT NULL,
  `gender` varchar(10) COLLATE utf8_bin DEFAULT NULL,
  `realName` varchar(20) COLLATE utf8_bin DEFAULT NULL,
  `telePhone` varchar(20) COLLATE utf8_bin NOT NULL,
  `gradeId` int(11) NOT NULL,
  `userId` int(11) NOT NULL,
  `professionId` int(11) NOT NULL,
  `roomFloorId` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_userInfo_userId_userLogin_id` (`userId`),
  KEY `fk_userInfo_professionId_profession_id` (`professionId`),
  KEY `fk_userInfo_gradeId_grade_id` (`gradeId`),
  KEY `fk_userInfo_roomFloorId_roomFloor_id` (`roomFloorId`),
  CONSTRAINT `fk_userInfo_gradeId_grade_id` FOREIGN KEY (`gradeId`) REFERENCES `grade` (`id`),
  CONSTRAINT `fk_userInfo_professionId_profession_id` FOREIGN KEY (`professionId`) REFERENCES `profession` (`id`),
  CONSTRAINT `fk_userInfo_roomFloorId_roomFloor_id` FOREIGN KEY (`roomFloorId`) REFERENCES `roomfloor` (`id`),
  CONSTRAINT `fk_userInfo_userId_userLogin_id` FOREIGN KEY (`userId`) REFERENCES `userlogin` (`id`),
  CONSTRAINT `fk_users_id_userLogin_id` FOREIGN KEY (`id`) REFERENCES `userlogin` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `userinfo` */

/*Table structure for table `userlogin` */

DROP TABLE IF EXISTS `userlogin`;

CREATE TABLE `userlogin` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `userName` varchar(50) COLLATE utf8_bin NOT NULL,
  `pwd` varchar(50) COLLATE utf8_bin NOT NULL,
  `userStatusId` int(11) NOT NULL,
  `email` varchar(50) COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_userLogin_statusId_userStatus_id` (`userStatusId`),
  CONSTRAINT `fk_userLogin_statusId_userStatus_id` FOREIGN KEY (`userStatusId`) REFERENCES `userstatus` (`id`),
  CONSTRAINT `fk_userlogin_userStatusId_userStatus_id` FOREIGN KEY (`userStatusId`) REFERENCES `userstatus` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=61 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `userlogin` */

insert  into `userlogin`(`id`,`userName`,`pwd`,`userStatusId`,`email`) values (24,'18482195202','123',1,'');
insert  into `userlogin`(`id`,`userName`,`pwd`,`userStatusId`,`email`) values (25,'ghy','ghy',1,'');
insert  into `userlogin`(`id`,`userName`,`pwd`,`userStatusId`,`email`) values (26,'zxm','zxm',1,'');
insert  into `userlogin`(`id`,`userName`,`pwd`,`userStatusId`,`email`) values (27,'18349341449','123',1,'');
insert  into `userlogin`(`id`,`userName`,`pwd`,`userStatusId`,`email`) values (28,'ggg','ggg',1,'');
insert  into `userlogin`(`id`,`userName`,`pwd`,`userStatusId`,`email`) values (29,'188','123',1,'');
insert  into `userlogin`(`id`,`userName`,`pwd`,`userStatusId`,`email`) values (30,'123','123',1,'');
insert  into `userlogin`(`id`,`userName`,`pwd`,`userStatusId`,`email`) values (31,'110','110',1,'');
insert  into `userlogin`(`id`,`userName`,`pwd`,`userStatusId`,`email`) values (32,'admin','admin',2,'');
insert  into `userlogin`(`id`,`userName`,`pwd`,`userStatusId`,`email`) values (33,'18180447065','123456',1,'');
insert  into `userlogin`(`id`,`userName`,`pwd`,`userStatusId`,`email`) values (34,'1234','123',1,'');
insert  into `userlogin`(`id`,`userName`,`pwd`,`userStatusId`,`email`) values (35,'123345','234',1,'');
insert  into `userlogin`(`id`,`userName`,`pwd`,`userStatusId`,`email`) values (59,'hansiming','299132688689127175738334524183350839358',1,'294098789@qq.com');
insert  into `userlogin`(`id`,`userName`,`pwd`,`userStatusId`,`email`) values (60,'Tiffany','85077773243997394023655415708321571964',1,'976156821@qq.com');

/*Table structure for table `userstatus` */

DROP TABLE IF EXISTS `userstatus`;

CREATE TABLE `userstatus` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `userStatusName` varchar(20) COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `userstatus` */

insert  into `userstatus`(`id`,`userStatusName`) values (1,'普通用户');
insert  into `userstatus`(`id`,`userStatusName`) values (2,'管理员');
insert  into `userstatus`(`id`,`userStatusName`) values (3,'未验证用户');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
