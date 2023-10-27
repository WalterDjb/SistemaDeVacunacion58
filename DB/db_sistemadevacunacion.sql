-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 27-10-2023 a las 23:13:44
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
(3, 'Centro 36', '-', '36-Goya', '36-Goya', 'A'),
(3, 'Centro 37', '-', '37-Capital', '37-Capital', 'A'),
(3, 'Centro 38', '-', '38-Lavalle', '38-Lavalle', 'A'),
(3, 'Centro 39', '-', '39-Curuzu Cuatia', '39-Curuzu Cuatia', 'A'),
(3, 'Centro 40', '-', '40-Ituzaingo', '40-Ituzaingo', 'A'),
(3, 'Centro 41', '-', '41-La Cruz', '41-La Cruz', 'A'),
(3, 'Centro 42', '-', '42-Capital2', '42-Capital2', 'A'),
(3, 'Centro 43', '-', '43-Mercedes', '43-Mercedes', 'A'),
(3, 'Centro 44', '-', '44-Saladas', '44-Saladas', 'A'),
(3, 'Centro 45', '-', '45-La Plata', '45-La Plata', 'A'),
(3, 'Centro 46', '-', '46-Las Lomitas', '46-Las Lomitas', 'A'),
(3, 'Centro 47', '-', '47-San Telmo', '47-San Telmo', 'A'),
(3, 'Centro 48', '-', '48-Barracas', '48-Barracas', 'A'),
(2, 'Guille', 'guilleglp@gmail.com', 'Buenos Aires', 'BuenosAires', 'A'),
(2, '-', '-', 'CABA', 'CABA', 'A'),
(2, '-', '-', 'Catamarca', 'Catamarca', 'A'),
(2, '-', '-', 'Chaco', 'Chaco', 'A'),
(2, '-', '-', 'Chubut', 'Chubut', 'A'),
(2, '-', '-', 'Cordoba', 'Cordoba', 'A'),
(2, 'Gas', 'fernandeztomadin1985@gmail.com', 'Corrientes', 'Corrientes', 'A'),
(2, '-', '-', 'Entre Rios', 'EntreRios', 'A'),
(2, 'Walt', 'walterdjb@gmail.com', 'Formosa', 'Formosa', 'A'),
(2, '-', '-', 'Jujuy', 'Jujuy', 'A'),
(2, '-', '-', 'La Pampa', 'LaPampa', 'A'),
(2, '-', '-', 'La Rioja', 'LaRioja', 'A'),
(2, '-', '-', 'Mendoza', 'Mendoza', 'A'),
(2, '-', '-', 'Misiones', 'Misiones', 'A'),
(1, 'Ro', '', 'Nacion', 'Nacion', 'A'),
(2, '-', '-', 'Neuquen', 'Neuquen', 'A'),
(2, '-', '-', 'Rio Negro', 'RioNegro', 'A'),
(2, '-', '-', 'Salta', 'Salta', 'A'),
(2, '-', '-', 'San Juan', 'SanJuan', 'A'),
(2, '-', '-', 'San Luis', 'SanLuis', 'A'),
(2, '-', '-', 'Santa Cruz', 'SantaCruz', 'A'),
(2, '-', '-', 'Santa Fe', 'SantaFe', 'A'),
(2, '-', '-', 'Santiago del Estero', 'SantiagoDelEstero', 'A'),
(2, '-', '-', 'Tierra del Fuego', 'TierraDelFuego', 'A'),
(2, '-', '-', 'Tucuman', 'Tucuman', 'A');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `centro`
--

CREATE TABLE `centro` (
  `id` int(3) NOT NULL,
  `direccion` varchar(50) NOT NULL,
  `stock` int(5) DEFAULT NULL,
  `provincia` varchar(50) NOT NULL,
  `localidad` varchar(20) NOT NULL,
  `capacidad` int(4) NOT NULL,
  `registrados` int(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Volcado de datos para la tabla `centro`
--

INSERT INTO `centro` (`id`, `direccion`, `stock`, `provincia`, `localidad`, `capacidad`, `registrados`) VALUES
(36, 'mazzanti 344', NULL, 'Corrientes', 'Goya', 100, 0),
(37, 'CostaneraNorte30', NULL, 'Corrientes', 'Capital', 100, 0),
(38, 'San Martin 1680', NULL, 'Corrientes', 'Lavalle', 20, 0),
(39, 'Beron de Astrada 20', NULL, 'Corrientes', 'Curuzu Cuatia', 50, 0),
(40, 'Paraguay 1653', NULL, 'Corrientes', 'Ituzaingo', 100, 0),
(41, 'Menem1989', NULL, 'Corrientes', 'La Cruz', 60, 0),
(42, '3 de abril 1968', NULL, 'Corrientes', 'Capital2', 150, 0),
(43, 'Caa Guazu 1800', NULL, 'Corrientes', 'Mercedes', 75, 0),
(44, 'Independencia 660', NULL, 'Corrientes', 'Saladas', 30, 0),
(45, 'San Martin 5960', NULL, 'Buenos Aires', 'La Plata', 250, 0),
(46, 'Peron 1280', NULL, 'Buenos Aires', 'Las Lomitas', 100, 0),
(47, 'San Juan 1490', NULL, 'Ciudad Autónoma de Buenos Aires', 'San Telmo', 250, 0),
(48, 'Defensa 2550', NULL, 'Ciudad Autónoma de Buenos Aires', 'Barracas', 200, 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cita`
--

CREATE TABLE `cita` (
  `id` int(8) NOT NULL,
  `dni` int(8) NOT NULL,
  `fHCita` datetime NOT NULL,
  `Vacuna` varchar(20) NOT NULL,
  `fHAplicacion` datetime NOT NULL,
  `centro` int(3) NOT NULL,
  `estadoCita` varchar(10) DEFAULT NULL COMMENT 'VEN(cida)CUM(plida) ó CAN(celada)',
  `numeroSerie` varchar(20) DEFAULT NULL COMMENT 'Numero de serie de la vacuna(pide el tp) fecha de aplicacion+dni+ndosis'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Volcado de datos para la tabla `cita`
--

INSERT INTO `cita` (`id`, `dni`, `fHCita`, `Vacuna`, `fHAplicacion`, `centro`, `estadoCita`, `numeroSerie`) VALUES
(1, 35681886, '2023-10-27 00:00:00', 'vaxina', '2023-10-10 00:00:00', 39, 'CUM', '712304713');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ciudadano`
--

CREATE TABLE `ciudadano` (
  `dni` int(8) NOT NULL,
  `tramite` varchar(11) NOT NULL,
  `nombre` varchar(20) NOT NULL,
  `apellido` varchar(20) NOT NULL,
  `provincia` varchar(20) NOT NULL,
  `localidad` varchar(20) NOT NULL,
  `email` varchar(40) NOT NULL,
  `celular` bigint(10) NOT NULL,
  `patologia` varchar(50) NOT NULL,
  `ambitoTrabajo` varchar(20) NOT NULL,
  `aplicaciones` int(2) NOT NULL,
  `ultimaDosis` datetime NOT NULL,
  `domicilio` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Volcado de datos para la tabla `ciudadano`
--

INSERT INTO `ciudadano` (`dni`, `tramite`, `nombre`, `apellido`, `provincia`, `localidad`, `email`, `celular`, `patologia`, `ambitoTrabajo`, `aplicaciones`, `ultimaDosis`, `domicilio`) VALUES
(35681886, '00395514326', 'Walter Eduardo', 'Benitez', 'Formosa', 'La Primavera', 'walterdjb@gmail.com', 3794856308, 'Obesidad', 'Educación', 2, '2023-10-10 00:00:00', 'Ruta Número 2 km 130');

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
  `marca` varchar(20) NOT NULL,
  `stock` int(11) NOT NULL DEFAULT 0,
  `indice` int(50) NOT NULL COMMENT 'Identificador necesario para el servidor, no le den bola'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Volcado de datos para la tabla `stock`
--

INSERT INTO `stock` (`idCentro`, `marca`, `stock`, `indice`) VALUES
(36, 'vaxina', 0, 1),
(37, 'vaxina', 0, 2),
(38, 'vaxina', 0, 3),
(39, 'vaxina', 0, 4),
(40, 'vaxina', 0, 5),
(41, 'vaxina', 0, 6),
(42, 'vaxina', 0, 7),
(43, 'vaxina', 0, 8),
(44, 'vaxina', 0, 9),
(45, 'vaxina', 0, 10),
(46, 'vaxina', 0, 11),
(47, 'vaxina', 0, 12),
(48, 'vaxina', 0, 13);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `vacuna`
--

CREATE TABLE `vacuna` (
  `cuitLaboratorio` bigint(11) NOT NULL,
  `capacidadDosis` double NOT NULL,
  `marca` varchar(20) NOT NULL,
  `antigeno` varchar(20) NOT NULL,
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
  ADD PRIMARY KEY (`indice`),
  ADD KEY `idCentro` (`idCentro`),
  ADD KEY `marca` (`marca`);

--
-- Indices de la tabla `vacuna`
--
ALTER TABLE `vacuna`
  ADD PRIMARY KEY (`marca`),
  ADD KEY `marca` (`marca`),
  ADD KEY `cuitLaboratorio` (`cuitLaboratorio`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `centro`
--
ALTER TABLE `centro`
  MODIFY `id` int(3) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=49;

--
-- AUTO_INCREMENT de la tabla `cita`
--
ALTER TABLE `cita`
  MODIFY `id` int(8) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `stock`
--
ALTER TABLE `stock`
  MODIFY `indice` int(50) NOT NULL AUTO_INCREMENT COMMENT 'Identificador necesario para el servidor, no le den bola', AUTO_INCREMENT=14;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `cita`
--
ALTER TABLE `cita`
  ADD CONSTRAINT `cita_ibfk_1` FOREIGN KEY (`dni`) REFERENCES `ciudadano` (`dni`),
  ADD CONSTRAINT `cita_ibfk_2` FOREIGN KEY (`centro`) REFERENCES `centro` (`id`),
  ADD CONSTRAINT `cita_ibfk_3` FOREIGN KEY (`Vacuna`) REFERENCES `stock` (`marca`);

--
-- Filtros para la tabla `stock`
--
ALTER TABLE `stock`
  ADD CONSTRAINT `stock_ibfk_2` FOREIGN KEY (`idCentro`) REFERENCES `centro` (`id`),
  ADD CONSTRAINT `stock_ibfk_3` FOREIGN KEY (`marca`) REFERENCES `vacuna` (`marca`);

--
-- Filtros para la tabla `vacuna`
--
ALTER TABLE `vacuna`
  ADD CONSTRAINT `vacuna_ibfk_1` FOREIGN KEY (`cuitLaboratorio`) REFERENCES `laboratorio` (`cuit`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
