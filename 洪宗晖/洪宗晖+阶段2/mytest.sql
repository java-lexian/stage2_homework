
/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

CREATE DATABASE IF NOT EXISTS  `movie` ;

USE `movie`;

DROP TABLE IF EXISTS `tbl_user`;

CREATE TABLE `tbl_user` (
  `id` int(11) PRIMARY KEY  AUTO_INCREMENT,
  `name` varchar(80) ,
  `uptime` date NOT NULL,
  `company` varchar(64),
  `director` varchar(80) ,
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

/*Data for the table `tbl_user` */

INSERT INTO `tbl_user values (1,'钢铁侠',2008-4-30','漫威','乔恩·费儒 '),(2,'疯狂的石头','2006-06-30','中影华纳横店影视 ','宁浩'),(3,'让子弹飞','2010-12-16',' 峨眉电影集团','姜文');
SELECT * FROM `movie` where id=3;
