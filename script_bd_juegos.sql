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


INSERT INTO `juegos` (`id_juego`, `nombre_juego`, `precio_juego`, `descripcion`, `es_multijugador`, `oferta`, `tipoJuego`) VALUES
('1', 'The Witcher 3: Wild Hunt', 2999, 'Embark on a monster-hunting adventure in a vast open world.', 0, 1, 'RPG'),
('2', 'Counter-Strike: Global Offensive', 1499, 'Engage in intense tactical battles in this popular multiplayer FPS.', 1, 0, 'Shooter'),
('3', 'Grand Theft Auto V', 3999, 'Explore the fictional state of San Andreas in this action-packed open-world game.', 1, 1, 'Action'),
('4', 'Among Us', 499, 'Unmask the impostors in this multiplayer online party game of teamwork and betrayal.', 1, 0, 'Social Deduction'),
('5', 'Minecraft', 1999, 'Build and explore your own blocky world in this sandbox adventure.', 1, 0, 'Adventure');


/*Data for the table `juegos` */
