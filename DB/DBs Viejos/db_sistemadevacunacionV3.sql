-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 24-10-2023 a las 05:18:43
-- Versión del servidor: 10.4.22-MariaDB
-- Versión de PHP: 8.1.1

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
  `nombre` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `email` varchar(40) COLLATE utf8_unicode_ci NOT NULL,
  `usuario` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `contra` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `tipoContra` varchar(1) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Volcado de datos para la tabla `acceso`
--

INSERT INTO `acceso` (`nivel`, `nombre`, `email`, `usuario`, `contra`, `tipoContra`) VALUES
(3, '', '', 'centro', 'centro', 'A'),
(3, 'Gas', 'fernandeztomadin1985@gmail.com', 'ggg', '12345678', 'A'),
(1, '', '', 'nacion', 'nacion', 'A'),
(2, '', 'walterdjb@gmail.com', 'provincia', 'perromalo', 'A');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `centro`
--

CREATE TABLE `centro` (
  `id` int(3) NOT NULL,
  `direccion` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `stock` int(5) NOT NULL,
  `provincia` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `localidad` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
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
  `Vacuna` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `fHAplicacion` datetime NOT NULL,
  `centro` int(3) NOT NULL,
  `estadoCita` varchar(3) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT 'VEN(cida)CUM(plida) ó CAN(celada)',
  `numeroSerie` bigint(20) DEFAULT NULL COMMENT 'Numero de serie de la vacuna(pide el tp) fecha de aplicacion+dni+ndosis'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ciudadano`
--

CREATE TABLE `ciudadano` (
  `dni` int(8) NOT NULL,
  `nombre` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `apellido` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `provincia` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `localidad` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `email` varchar(40) COLLATE utf8_unicode_ci NOT NULL,
  `celular` int(10) NOT NULL,
  `patologia` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `ambitoTrabajo` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `aplicaciones` int(2) NOT NULL,
  `domicilio` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `laboratorio`
--

CREATE TABLE `laboratorio` (
  `cuit` bigint(11) NOT NULL,
  `nombre` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `pais` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `direccion` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `stock` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Volcado de datos para la tabla `laboratorio`
--

INSERT INTO `laboratorio` (`cuit`, `nombre`, `pais`, `direccion`, `stock`) VALUES
(233243242, 'papaluza', 'Boke', 'allaleestanponiendo22', 500),
(30123456789, 'DawsonLab', 'Peronia', 'IngenieroBenitez666', 2),
(30987654321, 'Peña & Peña Co.', 'Venezuela', 'Dr Fernandez', 5000),
(33111444779, 'Benitax', 'Guyana', 'Calle perro', 50);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `stock`
--

CREATE TABLE `stock` (
  `idCentro` int(11) NOT NULL,
  `marca` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `stock` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `vacuna`
--

CREATE TABLE `vacuna` (
  `cuitLaboratorio` bigint(11) NOT NULL,
  `capacidadDosis` double NOT NULL,
  `marca` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `antigeno` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `caducidad` date NOT NULL,
  `stock` int(5) NOT NULL COMMENT 'stock de vacunas en nacion'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Volcado de datos para la tabla `vacuna`
--

INSERT INTO `vacuna` (`cuitLaboratorio`, `capacidadDosis`, `marca`, `antigeno`, `caducidad`, `stock`) VALUES
(30123456789, 2.5, 'vacunitah', 'falopa', '2030-05-25', 1),
(30123456789, 2, 'vacunola lince', 'caca de perro m', '2023-11-01', 1),
(30987654321, 2, 'vaxina', 'basura', '2028-09-10', 5000);

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
  ADD UNIQUE KEY `codRefuerzo` (`Vacuna`),
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
-- Indices de la tabla `stock`
--
ALTER TABLE `stock`
  ADD UNIQUE KEY `idCentro` (`idCentro`),
  ADD UNIQUE KEY `marca` (`marca`);

--
-- Indices de la tabla `vacuna`
--
ALTER TABLE `vacuna`
  ADD UNIQUE KEY `marca` (`marca`);

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
-- Filtros para la tabla `centro`
--
ALTER TABLE `centro`
  ADD CONSTRAINT `centro_ibfk_1` FOREIGN KEY (`id`) REFERENCES `stock` (`idCentro`);

--
-- Filtros para la tabla `cita`
--
ALTER TABLE `cita`
  ADD CONSTRAINT `cita_ibfk_1` FOREIGN KEY (`dni`) REFERENCES `ciudadano` (`dni`),
  ADD CONSTRAINT `cita_ibfk_2` FOREIGN KEY (`centro`) REFERENCES `centro` (`id`),
  ADD CONSTRAINT `cita_ibfk_3` FOREIGN KEY (`Vacuna`) REFERENCES `vacuna` (`marca`);

--
-- Filtros para la tabla `stock`
--
ALTER TABLE `stock`
  ADD CONSTRAINT `stock_ibfk_1` FOREIGN KEY (`marca`) REFERENCES `vacuna` (`marca`);

--
-- Filtros para la tabla `vacuna`
--
ALTER TABLE `vacuna`
  ADD CONSTRAINT `vacuna_ibfk_1` FOREIGN KEY (`cuitLaboratorio`) REFERENCES `laboratorio` (`cuit`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
