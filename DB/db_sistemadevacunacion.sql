-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 31-10-2023 a las 21:45:17
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
(3, 'Centro 49', '-', '49-Santa Lucía', '49-Santa Lucía', 'A'),
(3, 'Centro 50', '-', '50-Santo Tomé', '50-Santo Tomé', 'A'),
(3, 'Centro 51', '-', '51-Capital', '51-Capital', 'A'),
(3, 'Centro 52', '-', '52-Chilecito', '52-Chilecito', 'A'),
(3, 'Centro 53', '-', '53-Capital', '53-Capital', 'A'),
(3, 'Centro 54', '-', '54-CataNoMarca', '54-CataNoMarca', 'A'),
(3, 'Centro 55', '-', '55-Capital', '55-Capital', 'A'),
(3, 'Centro 56', '-', '56-Saenz Peña', '56-Saenz Peña', 'A'),
(3, 'Centro 57', '-', '57-Capital', '57-Capital', 'A'),
(3, 'Centro 58', '-', '58-Pueblito', '58-Pueblito', 'A'),
(3, 'Centro 59', '-', '59-Capital', '59-Capital', 'A'),
(3, 'Centro 60', '-', '60-VillaCarlosPaz', '60-VillaCarlosPaz', 'A'),
(3, 'Centro 61', '-', '61-Capital', '61-Capital', 'A'),
(3, 'Centro 62', '-', '62-La Paz', '62-La Paz', 'A'),
(3, 'Centro 63', '-', '63-Capital', '63-Capital', 'A'),
(3, 'Centro 64', '-', '64-La Primavera', '64-La Primavera', 'A'),
(3, 'Centro 65', '-', '65-Capital', '65-Capital', 'A'),
(3, 'Centro 66', '-', '66-Tunuyan', '66-Tunuyan', 'A'),
(3, 'Centro 67', '-', '67-Capital', '67-Capital', 'A'),
(3, 'Centro 68', '-', '68-Nowhere', '68-Nowhere', 'A'),
(3, 'Centro 69', '-', '69-Capital', '69-Capital', 'A'),
(3, 'Centro 70', '-', '70-La Punta', '70-La Punta', 'A'),
(3, 'Centro 71', '-', '71-Capital', '71-Capital', 'A'),
(3, 'Centro 72', '-', '72-Puerto Olvidado', '72-Puerto Olvidado', 'A'),
(3, 'Centro 73', '-', '73-Capital', '73-Capital', 'A'),
(3, 'Centro 74', '-', '74-PuebloSolYTierra', '74-PuebloSolYTierra', 'A'),
(3, 'Centro 75', '-', '75-Capital', '75-Capital', 'A'),
(3, 'Centro 76', '-', '76-Rosario', '76-Rosario', 'A'),
(3, 'Centro 77', '-', '77-Capital', '77-Capital', 'A'),
(3, 'Centro 78', '-', '78-PueblitoInospito', '78-PueblitoInospito', 'A'),
(3, 'Centro 79', '-', '79-Capital', '79-Capital', 'A'),
(3, 'Centro 80', '-', '80-Rio Blanco', '80-Rio Blanco', 'A'),
(3, 'Centro 81', '-', '81-Capital', '81-Capital', 'A'),
(3, 'Centro 82', '-', '82-Piedritas', '82-Piedritas', 'A'),
(3, 'Centro 83', '-', '83-Capital', '83-Capital', 'A'),
(3, 'Centro 84', '-', '84-SeSienta', '84-SeSienta', 'A'),
(3, 'Centro 85', '-', '85-Capital', '85-Capital', 'A'),
(3, 'Centro 86', '-', '86-Tolhuin', '86-Tolhuin', 'A'),
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
  `direccion` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `stock` int(5) DEFAULT NULL,
  `provincia` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `localidad` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
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
(42, '3 de abril 1968', NULL, 'Corrientes', 'Capital', 150, 0),
(43, 'Caa Guazu 1800', NULL, 'Corrientes', 'Mercedes', 75, 0),
(44, 'Independencia 660', NULL, 'Corrientes', 'Saladas', 30, 0),
(45, 'San Martin 5960', NULL, 'Buenos Aires', 'La Plata', 250, 0),
(46, 'Peron 1280', NULL, 'Buenos Aires', 'Las Lomitas', 100, 0),
(47, 'San Juan 1490', NULL, 'Ciudad Autónoma de Buenos Aires', 'San Telmo', 250, 0),
(48, 'Defensa 2550', NULL, 'Ciudad Autónoma de Buenos Aires', 'Barracas', 200, 0),
(49, 'Belgrano 1280', NULL, 'Corrientes', 'Santa Lucía', 50, 0),
(50, 'vaca marron 111', NULL, 'Corrientes', 'Santo Tomé', 10, 0),
(51, 'Carlos Saul 333', NULL, 'La Rioja', 'Capital', 100, 0),
(52, 'España 959', NULL, 'La Rioja', 'Chilecito', 50, 0),
(53, 'Mitre 653', NULL, 'Catamarca', 'Capital', 150, 0),
(54, 'DireccionDeMentira 33', NULL, 'Catamarca', 'CataNoMarca', 80, 0),
(55, 'Barrio Toba C55', NULL, 'Chaco', 'Capital', 10, 0),
(56, 'José Hernandez 564', NULL, 'Chaco', 'Saenz Peña', 200, 0),
(57, 'Lucas Matthysse 1', NULL, 'Chubut', 'Capital', 250, 0),
(58, 'Direccion 666', NULL, 'Chubut', 'Pueblito', 75, 0),
(59, 'Fernet Branca 369', NULL, 'Cordoba', 'Capital', 200, 0),
(60, 'Vittone 147', NULL, 'Cordoba', 'VillaCarlosPaz', 10, 0),
(61, 'Coso 987', NULL, 'Entre Rios', 'Capital', 200, 0),
(62, 'Estem 520', NULL, 'Entre Rios', 'La Paz', 100, 0),
(63, 'Tio Gildo 666', NULL, 'Formosa', 'Capital', 300, 0),
(64, 'Tio Gildo 333', NULL, 'Formosa', 'La Primavera', 100, 0),
(65, 'Malvec 123', NULL, 'Mendoza', 'Capital', 250, 0),
(66, 'Sidra 555', NULL, 'Mendoza', 'Tunuyan', 100, 0),
(67, 'TierraYPiedras 456', NULL, 'Neuquen', 'Capital', 250, 0),
(68, '159', NULL, 'Neuquen', 'Nowhere', 50, 0),
(69, 'Homero Tomadin 1', NULL, 'San Luis', 'Capital', 250, 0),
(70, 'Carlos Pallotti 001', NULL, 'San Luis', 'La Punta', 300, 0),
(71, 'Tio Nestor 666', NULL, 'Santa Cruz', 'Capital', 10, 0),
(72, 'Tio Nestor 666', NULL, 'Santa Cruz', 'Puerto Olvidado', 10, 0),
(73, 'David Moya 333', NULL, 'Tucuman', 'Capital', 250, 0),
(74, 'Juana Zurduy 123', NULL, 'Tucuman', 'PuebloSolYTierra', 100, 0),
(75, 'Tio Binner 666', NULL, 'Santa Fe', 'Capital', 250, 0),
(76, 'Trinchera15 666', NULL, 'Santa Fe', 'Rosario', 150, 0),
(77, 'Ventolera 753', NULL, 'San Juan', 'Capital', 200, 0),
(78, 'Calle Unica 951', NULL, 'San Juan', 'PueblitoInospito', 50, 0),
(79, 'NoSeMeOcurre 654', NULL, 'Rio Negro', 'Capital', 175, 0),
(80, 'Inventado 885', NULL, 'Rio Negro', 'Rio Blanco', 75, 0),
(81, 'Llama 25', NULL, 'Jujuy', 'Capital', 300, 0),
(82, 'Tio Gerardo 666', NULL, 'Jujuy', 'Piedritas', 80, 0),
(83, 'Una Pata 879', NULL, 'Salta', 'Capital', 350, 0),
(84, 'Callecita8 552 ', NULL, 'Salta', 'SeSienta', 90, 0),
(85, 'Onas 553', NULL, 'Tierra del Fuego', 'Capital', 300, 0),
(86, 'PiedrasYFrio 654', NULL, 'Tierra del Fuego', 'Tolhuin', 80, 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cita`
--

CREATE TABLE `cita` (
  `id` int(8) NOT NULL,
  `dni` int(8) NOT NULL,
  `fHCita` datetime DEFAULT NULL,
  `Vacuna` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `fHAplicacion` datetime DEFAULT NULL,
  `centro` int(3) NOT NULL,
  `estadoCita` varchar(10) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT 'VEN(cida)CUM(plida) ó CAN(celada)',
  `numeroSerie` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT 'Numero de serie de la vacuna(pide el tp) fecha de aplicacion+dni+ndosis',
  `Dosis` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Volcado de datos para la tabla `cita`
--

INSERT INTO `cita` (`id`, `dni`, `fHCita`, `Vacuna`, `fHAplicacion`, `centro`, `estadoCita`, `numeroSerie`, `Dosis`) VALUES
(2, 31863250, '2023-11-01 00:00:00', 'vaxina', '2023-10-31 09:15:41', 39, 'CUM', '00010', 10),
(3, 31863250, '2023-11-01 00:00:00', 'vaxina', '2023-10-31 09:17:09', 39, 'CUM', '1321', 2),
(4, 32999440, '2023-11-01 00:00:00', 'vaxina', '2023-10-31 09:17:29', 39, 'CUM', '00011', 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ciudadano`
--

CREATE TABLE `ciudadano` (
  `dni` int(8) NOT NULL,
  `tramite` varchar(11) COLLATE utf8_unicode_ci NOT NULL,
  `nombre` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `apellido` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `provincia` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `localidad` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `email` varchar(40) COLLATE utf8_unicode_ci NOT NULL,
  `celular` bigint(10) NOT NULL,
  `patologia` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `ambitoTrabajo` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `aplicaciones` int(2) NOT NULL DEFAULT 0,
  `ultimaDosis` datetime DEFAULT NULL,
  `domicilio` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Volcado de datos para la tabla `ciudadano`
--

INSERT INTO `ciudadano` (`dni`, `tramite`, `nombre`, `apellido`, `provincia`, `localidad`, `email`, `celular`, `patologia`, `ambitoTrabajo`, `aplicaciones`, `ultimaDosis`, `domicilio`) VALUES
(11111111, '22222222222', 'Tiburcio', 'Trafalgar', 'Buenos Aires', 'Tortuguitas', 'tubur@example.com', 321321321321, 'Enf. autoinmunitarias.', 'Educacion', 0, NULL, 'La Casita 123'),
(11112222, '89012345671', 'Elena', 'García', 'Corrientes', 'Ciudad R', 'elena@example.com', 1818181818, 'Diabetes', 'Educación', 0, NULL, 'Avenida 151, No. 161'),
(12345649, '12345671890', 'Juan', 'Pérez', 'Buenos Aires', 'Ciudad A', 'juan@example.com', 1111111111, 'Ninguna', 'Oficina', 0, NULL, 'Calle 123, No. 456'),
(12345678, '12345678910', 'Josecito', 'Lopez', 'Corrientes', 'Goya', 'sdfadsfasdfads@cacamail.com', 999999999999, 'Cáncer.', 'Justicia', 0, NULL, 'Estado 0001'),
(20200202, '01123456789', 'Mariana', 'Díaz', 'Santiago del Estero', 'Ciudad T', 'mariana@example.com', 2020202020, 'Alergia', 'Oficina', 0, NULL, 'Avenida 171, No. 181'),
(22221110, '78901123456', 'Diego', 'Torres', 'Jujuy', 'Ciudad G', 'diego@example.com', 2147483647, 'Ninguna', 'Salud', 0, NULL, 'Calle 444, No. 555'),
(23456789, '67891012345', 'María', 'Martínez', 'Tierra del Fuego', 'Ciudad P', 'maria@example.com', 1616161616, 'Ninguna', 'Salud', 0, NULL, 'Avenida 131, No. 141'),
(27211110, '23456012345', 'Lorena', 'Gutiérrez', 'Catamarca', 'Ciudad L', 'lorena@example.com', 1212121212, 'Hipertensión', 'Salud', 0, NULL, 'Avenida 999, No. 101'),
(31863250, '12345678910', 'Gaston', 'Fernandez', 'Corrientes', 'Santa Lucía', 'fernandeztomadin1985@gmail.com', 3777622457, 'Ninguna', 'Otros', 0, NULL, 'Barrio35V-C15'),
(32999440, '12345678901', 'Guillermo', 'Dawson', 'La Plata', 'La Plata', 'a@mail.com', 2215680908, 'Ninguna', 'Salud', 0, NULL, 'Lasasa 2121'),
(35681886, '00395514326', 'Walter Eduardo', 'Benitez', 'Formosa', 'La Primavera', 'walterdjb@gmail.com', 2147483647, 'Obesidad', 'Educación', 2, '2023-10-10 00:00:00', 'Ruta Número 2 km 130'),
(44443320, '56789012344', 'Pedro', 'Sánchez', 'Tucumán', 'Ciudad E', 'pedro@example.com', 2147483647, 'Ninguna', 'Restaurante', 0, NULL, 'Calle 222, No. 333'),
(44443332, '12345098760', 'Carlos', 'Gómez', 'Chaco', 'Ciudad K', 'carlos@example.com', 1111111112, 'Diabetes', 'Oficina', 0, NULL, 'Calle 888, No. 999'),
(55511122, '56789001239', 'Fernando', 'Fernández', 'Neuquén', 'Ciudad O', 'fernando@example.com', 1515151515, 'Artritis', 'Oficina', 0, NULL, 'Calle 121, No. 131'),
(55555555, '34567890124', 'Carlos', 'Rodríguez', 'Mendoza', 'Ciudad C', 'carlos@example.com', 2147483647, 'Diabetes', 'Educación', 0, NULL, 'Calle 789, No. 123'),
(55558112, '01234567895', 'Valentina', 'Santos', 'San Luis', 'Ciudad J', 'valentina@example.com', 1010101010, 'Asma', 'Educación', 0, NULL, 'Avenida 777, No. 888'),
(60669998, '90123456787', 'Luis', 'Gómez', 'Formosa', 'Ciudad S', 'luis@example.com', 1919191919, 'Ninguna', 'Restaurante', 0, NULL, 'Calle 161, No. 171'),
(66669998, '89012345678', 'Sofía', 'Martínez', 'San Juan', 'Ciudad H', 'sofia@example.com', 2147483647, 'Artritis', 'Tienda', 0, NULL, 'Avenida 555, No. 666'),
(77770001, '45678912305', 'Laura', 'Rojas', 'Río Negro', 'Ciudad N', 'laura@example.com', 1414141414, 'Ninguna', 'Restaurante', 0, NULL, 'Avenida 111, No. 121'),
(77780001, '19012345678', 'Roberto', 'López', 'La Pampa', 'Ciudad I', 'roberto@example.com', 2147483647, 'Ninguna', 'Restaurante', 0, NULL, 'Calle 666, No. 777'),
(88787766, '34567814513', 'Lucas', 'Hernández', 'Santa Cruz', 'Ciudad M', 'lucas@example.com', 1313131313, 'Alergia', 'Tienda', 0, NULL, 'Calle 101, No. 111'),
(88887776, '67890125551', 'Ana', 'López', 'Santa Fe', 'Ciudad F', 'ana@example.com', 2147483647, 'Alergia', 'Oficina', 0, NULL, 'Avenida 333, No. 444'),
(91112222, '41535678901', 'Laura', 'Fernández', 'Salta', 'Ciudad D', 'laura@example.com', 2147483647, 'Hipertensión', 'Tienda', 0, NULL, 'Avenida 111, No. 222'),
(96885624, '45212588556', 'Rafael', 'Vilca', 'Corrientes', 'Capital', 'Rafael@example.com', 3794334455, 'Enf.s hepáticas.', 'Otros', 0, NULL, 'Maruchita5000'),
(98761432, '23565947890', 'María', 'González', 'Córdoba', 'Ciudad B', 'maria@example.com', 2147483647, 'Asma', 'Salud', 0, NULL, 'Avenida 456, No. 789'),
(98765321, '89012345563', 'Juan', 'Sánchez', 'Entre Ríos', 'Ciudad Q', 'juan@example.com', 1717171717, 'Asma', 'Tienda', 0, NULL, 'Calle 141, No. 151');

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
(30987654321, 'Peña & Peña Co.', 'Venezuela', 'Dr Fernandez', 5000);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `stock`
--

CREATE TABLE `stock` (
  `idCentro` int(11) NOT NULL,
  `marca` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `stock` double NOT NULL DEFAULT 0,
  `indice` int(50) NOT NULL COMMENT 'Identificador necesario para el servidor, no le den bola'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Volcado de datos para la tabla `stock`
--

INSERT INTO `stock` (`idCentro`, `marca`, `stock`, `indice`) VALUES
(36, 'vaxina', 0, 1),
(37, 'vaxina', 0, 2),
(38, 'vaxina', 0, 3),
(39, 'vaxina', 42, 4),
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
  `marca` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `antigeno` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `caducidad` date NOT NULL,
  `stock` int(5) NOT NULL COMMENT 'stock de vacunas en nacion'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Volcado de datos para la tabla `vacuna`
--

INSERT INTO `vacuna` (`cuitLaboratorio`, `capacidadDosis`, `marca`, `antigeno`, `caducidad`, `stock`) VALUES
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
  ADD KEY `cita_ibfk_1` (`dni`),
  ADD KEY `cita_ibfk_2` (`centro`),
  ADD KEY `cita_ibfk_3` (`Vacuna`);

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
  MODIFY `id` int(3) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=87;

--
-- AUTO_INCREMENT de la tabla `cita`
--
ALTER TABLE `cita`
  MODIFY `id` int(8) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

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
