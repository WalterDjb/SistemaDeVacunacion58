-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 13-10-2023 a las 23:29:03
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `db_sistemadevacunacion`
--
CREATE DATABASE IF NOT EXISTS `db_sistemadevacunacion` DEFAULT CHARACTER SET utf8 COLLATE utf8_unicode_ci;
USE `db_sistemadevacunacion`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `acceso`
--

CREATE TABLE `acceso` (
  `nivel` int(2) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `email` varchar(40) NOT NULL,
  `usuario` varchar(20) NOT NULL,
  `contra` varchar(20) NOT NULL,
  `tipoContra` varchar(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Volcado de datos para la tabla `acceso`
--

INSERT INTO `acceso` (`nivel`, `nombre`, `email`, `usuario`, `contra`, `tipoContra`) VALUES
(3, '', '', 'centro', 'centro', 'A'),
(1, '', '', 'nacion', 'nacion', 'A'),
(2, '', 'walterdjb@gmail.com', 'provincia', 'perromalo', 'A');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `centro`
--

CREATE TABLE `centro` (
  `id` int(3) NOT NULL,
  `direccion` varchar(50) NOT NULL,
  `stock` int(5) NOT NULL,
  `provincia` varchar(20) NOT NULL,
  `localidad` varchar(20) NOT NULL,
  `capacidad` int(4) NOT NULL,
  `registrados` int(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cita`
--

CREATE TABLE `cita` (
  `id` int(8) NOT NULL,
  `dni` int(8) NOT NULL,
  `fHCita` datetime NOT NULL,
  `codRefuerzo` int(15) NOT NULL,
  `fHAplicacion` datetime NOT NULL,
  `centro` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ciudadano`
--

CREATE TABLE `ciudadano` (
  `dni` int(8) NOT NULL,
  `nombre` varchar(20) NOT NULL,
  `apellido` varchar(20) NOT NULL,
  `provincia` varchar(20) NOT NULL,
  `localidad` varchar(20) NOT NULL,
  `email` varchar(40) NOT NULL,
  `celular` int(10) NOT NULL,
  `patologia` varchar(50) NOT NULL,
  `ambitoTrabajo` varchar(20) NOT NULL,
  `aplicaciones` int(2) NOT NULL,
  `domicilio` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `laboratorio`
--

CREATE TABLE `laboratorio` (
  `cuit` bigint(11) NOT NULL,
  `nombre` varchar(20) NOT NULL,
  `pais` varchar(20) NOT NULL,
  `direccion` varchar(50) NOT NULL,
  `stock` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `vacuna`
--

CREATE TABLE `vacuna` (
  `cuitLaboratorio` bigint(11) NOT NULL,
  `serie` int(15) NOT NULL,
  `capacidadDosis` double NOT NULL,
  `marca` varchar(20) NOT NULL,
  `antigeno` varchar(15) NOT NULL,
  `caducidad` date NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `acceso`
--
ALTER TABLE `acceso`
  ADD PRIMARY KEY (`usuario`),
  ADD UNIQUE KEY `usuario` (`usuario`);

--
-- Indices de la tabla `centro`
--
ALTER TABLE `centro`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `id` (`id`);

--
-- Indices de la tabla `cita`
--
ALTER TABLE `cita`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `id` (`id`),
  ADD UNIQUE KEY `dni` (`dni`),
  ADD UNIQUE KEY `centro` (`centro`),
  ADD UNIQUE KEY `codRefuerzo` (`codRefuerzo`),
  ADD KEY `dni_2` (`dni`),
  ADD KEY `dni_3` (`dni`);

--
-- Indices de la tabla `ciudadano`
--
ALTER TABLE `ciudadano`
  ADD PRIMARY KEY (`dni`),
  ADD UNIQUE KEY `dni` (`dni`);

--
-- Indices de la tabla `laboratorio`
--
ALTER TABLE `laboratorio`
  ADD PRIMARY KEY (`cuit`),
  ADD UNIQUE KEY `cuit` (`cuit`);

--
-- Indices de la tabla `vacuna`
--
ALTER TABLE `vacuna`
  ADD PRIMARY KEY (`serie`),
  ADD UNIQUE KEY `serie` (`serie`),
  ADD UNIQUE KEY `cuitLaboratorio` (`cuitLaboratorio`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `centro`
--
ALTER TABLE `centro`
  MODIFY `id` int(3) NOT NULL AUTO_INCREMENT;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `cita`
--
ALTER TABLE `cita`
  ADD CONSTRAINT `cita_ibfk_1` FOREIGN KEY (`dni`) REFERENCES `ciudadano` (`dni`),
  ADD CONSTRAINT `cita_ibfk_2` FOREIGN KEY (`centro`) REFERENCES `centro` (`id`);

--
-- Filtros para la tabla `vacuna`
--
ALTER TABLE `vacuna`
  ADD CONSTRAINT `vacuna_ibfk_1` FOREIGN KEY (`cuitLaboratorio`) REFERENCES `laboratorio` (`cuit`),
  ADD CONSTRAINT `vacuna_ibfk_2` FOREIGN KEY (`serie`) REFERENCES `cita` (`codRefuerzo`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
