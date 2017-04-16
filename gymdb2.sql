/*
SQLyog Enterprise - MySQL GUI v6.0
Host - 5.6.17 : Database - gymdb
*********************************************************************
Server version : 5.6.17
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

/*Table structure for table `customer` */

DROP TABLE IF EXISTS `customer`;

CREATE TABLE `customer` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `firstname` varchar(40) DEFAULT NULL,
  `lastname` varchar(40) DEFAULT NULL,
  `fee` int(30) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

/*Data for the table `customer` */

insert  into `customer`(`id`,`firstname`,`lastname`,`fee`) values (3,'dsfd','sdfds',5000);
insert  into `customer`(`id`,`firstname`,`lastname`,`fee`) values (4,'fdg','fgf',121);

/*Table structure for table `customer_supplements` */

DROP TABLE IF EXISTS `customer_supplements`;

CREATE TABLE `customer_supplements` (
  `customerid` int(20) NOT NULL,
  `supplementid` int(20) NOT NULL,
  `purchased` int(20) DEFAULT NULL,
  `cost` int(40) DEFAULT NULL,
  `date_purchase` date DEFAULT NULL,
  `purchased_from` int(30) DEFAULT NULL,
  PRIMARY KEY (`customerid`,`supplementid`),
  KEY `supplementid` (`supplementid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `customer_supplements` */

/*Table structure for table `employee` */

DROP TABLE IF EXISTS `employee`;

CREATE TABLE `employee` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `firstname` varchar(40) DEFAULT NULL,
  `lastname` varchar(40) DEFAULT NULL,
  `designation` varchar(255) DEFAULT NULL,
  `contact` varchar(13) DEFAULT NULL,
  `salary` int(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

/*Data for the table `employee` */

insert  into `employee`(`id`,`firstname`,`lastname`,`designation`,`contact`,`salary`) values (2,'sdsd','trtrt','yuyuy','kikik',15165);

/*Table structure for table `equipment` */

DROP TABLE IF EXISTS `equipment`;

CREATE TABLE `equipment` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `item_name` varchar(255) DEFAULT NULL,
  `manufacturer_name` varchar(255) DEFAULT NULL,
  `supplier_name` varchar(255) DEFAULT NULL,
  `cost` int(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

/*Data for the table `equipment` */

insert  into `equipment`(`id`,`item_name`,`manufacturer_name`,`supplier_name`,`cost`) values (1,'avhs','bsdb','skjbdj',1000);
insert  into `equipment`(`id`,`item_name`,`manufacturer_name`,`supplier_name`,`cost`) values (2,'papu','bahi','sdfs',2112);

/*Table structure for table `supplements` */

DROP TABLE IF EXISTS `supplements`;

CREATE TABLE `supplements` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `item_name` varchar(255) DEFAULT NULL,
  `manufacturer_name` varchar(255) DEFAULT NULL,
  `supplier_name` varchar(255) DEFAULT NULL,
  `cost` int(20) DEFAULT NULL,
  `stock` int(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

/*Data for the table `supplements` */

insert  into `supplements`(`id`,`item_name`,`manufacturer_name`,`supplier_name`,`cost`,`stock`) values (1,'dopo','xaxx','max',35,5);

/*Table structure for table `trainer` */

DROP TABLE IF EXISTS `trainer`;

CREATE TABLE `trainer` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `trainer_style` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=latin1;

/*Data for the table `trainer` */

insert  into `trainer`(`id`,`trainer_style`) values (5,'c');
insert  into `trainer`(`id`,`trainer_style`) values (6,'khkjhk');
insert  into `trainer`(`id`,`trainer_style`) values (7,'sda');
insert  into `trainer`(`id`,`trainer_style`) values (8,'abc');
insert  into `trainer`(`id`,`trainer_style`) values (9,'asd');
insert  into `trainer`(`id`,`trainer_style`) values (10,'asd');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;