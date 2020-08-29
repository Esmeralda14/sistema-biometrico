-- phpMyAdmin SQL Dump
-- version 4.9.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 17-12-2019 a las 09:37:00
-- Versión del servidor: 10.4.8-MariaDB
-- Versión de PHP: 7.3.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `biometrico`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tb_empleados`
--

CREATE TABLE `tb_empleados` (
  `id` int(11) NOT NULL,
  `nombres` varchar(30) NOT NULL,
  `apellidos` varchar(30) NOT NULL,
  `idPuesto` int(11) NOT NULL DEFAULT 1,
  `idGrupo` int(11) NOT NULL DEFAULT 1,
  `huella` blob NOT NULL,
  `foto` blob DEFAULT NULL,
  `horaEntrada` time DEFAULT NULL,
  `horaSalida` time DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tb_estatus`
--

CREATE TABLE `tb_estatus` (
  `id` int(11) NOT NULL,
  `status` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `tb_estatus`
--

INSERT INTO `tb_estatus` (`id`, `status`) VALUES
(1, 'Asistencia'),
(2, 'Retardo'),
(3, 'Falta'),
(4, 'Permiso'),
(5, 'Vacaciones'),
(6, 'Incapacidad'),
(7, 'Día de descanso');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tb_grupos`
--

CREATE TABLE `tb_grupos` (
  `id` int(11) NOT NULL,
  `grupo` varchar(60) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `tb_grupos`
--

INSERT INTO `tb_grupos` (`id`, `grupo`) VALUES
(11, 'CATASTRO'),
(5, 'COMERCIO'),
(4, 'EGRESOS'),
(1, 'INFORMÁTICA'),
(3, 'INGRESOS'),
(10, 'PATRIMONIO'),
(2, 'RECURSOS HUMANOS'),
(9, 'SECRETARIA'),
(7, 'SEDESOL'),
(8, 'TESORERIA');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tb_puestos`
--

CREATE TABLE `tb_puestos` (
  `id` int(11) NOT NULL,
  `puesto` varchar(60) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `tb_puestos`
--

INSERT INTO `tb_puestos` (`id`, `puesto`) VALUES
(3, 'AUXILIAR'),
(1, 'DIRECTOR'),
(2, 'SECRETARIO');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tb_registros`
--

CREATE TABLE `tb_registros` (
  `id` int(11) NOT NULL,
  `idEmpleado` int(11) NOT NULL,
  `fecha` date NOT NULL,
  `hora` time NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tb_reportes`
--

CREATE TABLE `tb_reportes` (
  `id` int(11) NOT NULL,
  `fecha` date NOT NULL,
  `idEmpleado` int(11) NOT NULL,
  `horaEntrada` time DEFAULT NULL,
  `horaSalida` time DEFAULT NULL,
  `idEstatus` int(11) NOT NULL DEFAULT 3
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tb_roles`
--

CREATE TABLE `tb_roles` (
  `id` int(11) NOT NULL,
  `rol` varchar(60) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `tb_roles`
--

INSERT INTO `tb_roles` (`id`, `rol`) VALUES
(1, 'Administrador'),
(2, 'Auxiliar');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tb_usuarios`
--

CREATE TABLE `tb_usuarios` (
  `id` int(11) NOT NULL,
  `usuario` varchar(60) NOT NULL,
  `password` varchar(60) NOT NULL,
  `idRol` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `tb_usuarios`
--

INSERT INTO `tb_usuarios` (`id`, `usuario`, `password`, `idRol`) VALUES
(1, 'admin', '123', 1),
(2, 'auxiliar', '123', 2);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `tb_empleados`
--
ALTER TABLE `tb_empleados`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `tb_estatus`
--
ALTER TABLE `tb_estatus`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `tb_grupos`
--
ALTER TABLE `tb_grupos`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `grupo` (`grupo`);

--
-- Indices de la tabla `tb_puestos`
--
ALTER TABLE `tb_puestos`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `puesto` (`puesto`);

--
-- Indices de la tabla `tb_registros`
--
ALTER TABLE `tb_registros`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `tb_reportes`
--
ALTER TABLE `tb_reportes`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `tb_roles`
--
ALTER TABLE `tb_roles`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `tb_usuarios`
--
ALTER TABLE `tb_usuarios`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `usuario` (`usuario`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `tb_empleados`
--
ALTER TABLE `tb_empleados`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `tb_estatus`
--
ALTER TABLE `tb_estatus`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=35;

--
-- AUTO_INCREMENT de la tabla `tb_grupos`
--
ALTER TABLE `tb_grupos`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT de la tabla `tb_puestos`
--
ALTER TABLE `tb_puestos`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `tb_registros`
--
ALTER TABLE `tb_registros`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `tb_reportes`
--
ALTER TABLE `tb_reportes`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `tb_roles`
--
ALTER TABLE `tb_roles`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `tb_usuarios`
--
ALTER TABLE `tb_usuarios`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
