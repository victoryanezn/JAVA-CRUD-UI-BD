/*
SQLyog - Free MySQL GUI v5.11
Host - 5.5.5-10.4.28-MariaDB : Database - bd
*********************************************************************
Server version : 5.5.5-10.4.28-MariaDB
*/

SET NAMES utf8;

SET SQL_MODE='';

create database if not exists `bd`;

USE `bd`;

/*Table structure for table `juegos` */

DROP TABLE IF EXISTS `juegos`;

CREATE TABLE `juegos` (
  `id_juego` varchar(5) NOT NULL,
  `nombre_juego` varchar(30) NOT NULL,
  `precio_juego` decimal(10,0) NOT NULL,
  `descripcion` varchar(255) NOT NULL,
  `es_multijugador` tinyint(1) NOT NULL,
  `oferta` tinyint(1) NOT NULL,
  `tipoJuego` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id_juego`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

/*Data for the table `juegos` */
