-- phpMyAdmin SQL Dump
-- version 2.10.3
-- http://www.phpmyadmin.net
-- 
-- Host: localhost
-- Generation Time: Sep 02, 2013 at 02:39 AM
-- Server version: 5.0.51
-- PHP Version: 5.2.6

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";

-- 
-- Database: `pasantia`
-- 

-- --------------------------------------------------------

-- 
-- Table structure for table `tblbarrio`
-- 

CREATE TABLE `tblbarrio` (
  `SECBARRIO` int(11) NOT NULL auto_increment,
  `NOMBRE` varchar(45) NOT NULL,
  `SECMUNICIPIO` int(11) NOT NULL,
  PRIMARY KEY  (`SECBARRIO`),
  KEY `FK_MUNICIPIO_idx` (`SECMUNICIPIO`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- 
-- Dumping data for table `tblbarrio`
-- 


-- --------------------------------------------------------

-- 
-- Table structure for table `tblcaja`
-- 

CREATE TABLE `tblcaja` (
  `SECCAJA` int(11) NOT NULL auto_increment,
  `SECEGRESO` int(11) NOT NULL,
  `SECINGRESO` int(11) NOT NULL,
  `TOTAL` varchar(45) NOT NULL,
  PRIMARY KEY  (`SECCAJA`),
  KEY `FK_EGRESO_idx` (`SECEGRESO`),
  KEY `FK_INGRESO_idx` (`SECINGRESO`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- 
-- Dumping data for table `tblcaja`
-- 


-- --------------------------------------------------------

-- 
-- Table structure for table `tblcategoria`
-- 

CREATE TABLE `tblcategoria` (
  `SECCATEGORIA` int(11) NOT NULL auto_increment,
  `NOMBRE_CATEGORIA` varchar(45) NOT NULL,
  PRIMARY KEY  (`SECCATEGORIA`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- 
-- Dumping data for table `tblcategoria`
-- 


-- --------------------------------------------------------

-- 
-- Table structure for table `tblcliente`
-- 

CREATE TABLE `tblcliente` (
  `SECCLIENTE` int(11) NOT NULL auto_increment,
  `NOMBRES` varchar(45) NOT NULL,
  `APELLIDOS` varchar(45) NOT NULL,
  `CEDULA` varchar(45) NOT NULL,
  `DIRECCION` varchar(45) NOT NULL,
  `TELEFONO` varchar(45) NOT NULL,
  `EMAIL` varchar(45) NOT NULL,
  PRIMARY KEY  (`SECCLIENTE`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- 
-- Dumping data for table `tblcliente`
-- 


-- --------------------------------------------------------

-- 
-- Table structure for table `tblcompra`
-- 

CREATE TABLE `tblcompra` (
  `SECCOMPRA` int(11) NOT NULL,
  `SECPUNTODEVENTA` int(11) NOT NULL,
  `SECPROVEEDOR` int(11) NOT NULL,
  `TOTAL` varchar(45) NOT NULL,
  `TOTAL_CANTIDAD` varchar(45) NOT NULL,
  `DESCRIPCION` varchar(45) NOT NULL,
  `FECHA` date NOT NULL,
  `SECFORMAPAGO` int(11) NOT NULL,
  PRIMARY KEY  (`SECCOMPRA`),
  KEY `FK_PUNTODEVENTA_idx` (`SECPUNTODEVENTA`),
  KEY `FK_PROVEEDOR_idx` (`SECPROVEEDOR`),
  KEY `FK_FORMAPAGO_idx` (`SECFORMAPAGO`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- 
-- Dumping data for table `tblcompra`
-- 


-- --------------------------------------------------------

-- 
-- Table structure for table `tblcompracredito`
-- 

CREATE TABLE `tblcompracredito` (
  `SECOMPRACREDITO` int(11) NOT NULL auto_increment,
  `FECHA_PAGO` date NOT NULL,
  `PAGADO` int(11) NOT NULL,
  PRIMARY KEY  (`SECOMPRACREDITO`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- 
-- Dumping data for table `tblcompracredito`
-- 


-- --------------------------------------------------------

-- 
-- Table structure for table `tblcompraefectivo`
-- 

CREATE TABLE `tblcompraefectivo` (
  `SECCOMPRAEFECTIVO` int(11) NOT NULL auto_increment,
  `SECCOMPRA` int(11) NOT NULL,
  `FECHA_PAGO` date NOT NULL,
  `PAGADO` int(11) NOT NULL,
  PRIMARY KEY  (`SECCOMPRAEFECTIVO`),
  KEY `FK_COMPRA_idx` (`SECCOMPRA`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- 
-- Dumping data for table `tblcompraefectivo`
-- 


-- --------------------------------------------------------

-- 
-- Table structure for table `tbldepartamento`
-- 

CREATE TABLE `tbldepartamento` (
  `SECDEPARTAMENTO` int(11) NOT NULL auto_increment,
  `NOMBRE` varchar(45) NOT NULL,
  `SECPAIS` int(11) NOT NULL,
  PRIMARY KEY  (`SECDEPARTAMENTO`),
  KEY `FK_PAIS_idx` (`SECPAIS`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- 
-- Dumping data for table `tbldepartamento`
-- 


-- --------------------------------------------------------

-- 
-- Table structure for table `tbldetallecompra`
-- 

CREATE TABLE `tbldetallecompra` (
  `SECDETALLECOMPRA` int(11) NOT NULL auto_increment,
  `SECPRODUCTO` int(11) NOT NULL,
  `SECCOMPRA` int(11) NOT NULL,
  `CANTIDAD` varchar(45) NOT NULL,
  `SUBTOTAL` varchar(45) NOT NULL,
  PRIMARY KEY  (`SECDETALLECOMPRA`),
  KEY `KF_PRODUCTO_idx` (`SECPRODUCTO`),
  KEY `FK_COMPRA_idx` (`SECCOMPRA`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- 
-- Dumping data for table `tbldetallecompra`
-- 


-- --------------------------------------------------------

-- 
-- Table structure for table `tbldetalleventa`
-- 

CREATE TABLE `tbldetalleventa` (
  `SECDETALLEVENTA` int(11) NOT NULL auto_increment,
  `SECPRODUCTO` int(11) NOT NULL,
  `SECVENTA` int(11) NOT NULL,
  `SUBTOTAL` varchar(45) NOT NULL,
  `CANTIDAD` varchar(45) NOT NULL,
  PRIMARY KEY  (`SECDETALLEVENTA`),
  KEY `FK_VENTA_idx` (`SECVENTA`),
  KEY `FK_PRODUCTO_idx` (`SECPRODUCTO`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- 
-- Dumping data for table `tbldetalleventa`
-- 


-- --------------------------------------------------------

-- 
-- Table structure for table `tbldocumento`
-- 

CREATE TABLE `tbldocumento` (
  `SECDOCUMENTO` int(11) NOT NULL auto_increment,
  `NUMERO` varchar(45) NOT NULL,
  `SECTIPODOCUMENTO` int(11) NOT NULL,
  PRIMARY KEY  (`SECDOCUMENTO`),
  KEY `FK_TIPODOCUMENTO_idx` (`SECTIPODOCUMENTO`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- 
-- Dumping data for table `tbldocumento`
-- 


-- --------------------------------------------------------

-- 
-- Table structure for table `tblegreso`
-- 

CREATE TABLE `tblegreso` (
  `SECEGRESO` int(11) NOT NULL auto_increment,
  `SECCOMPRA` int(11) NOT NULL,
  `SECTIPOEGRESO` int(11) NOT NULL,
  `FECHA` date NOT NULL,
  PRIMARY KEY  (`SECEGRESO`),
  KEY `FK_COMPRA_idx` (`SECCOMPRA`),
  KEY `FK_TIPOEGRESO_idx` (`SECTIPOEGRESO`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- 
-- Dumping data for table `tblegreso`
-- 


-- --------------------------------------------------------

-- 
-- Table structure for table `tblentregapedido`
-- 

CREATE TABLE `tblentregapedido` (
  `SECENTREGAPEDIDO` int(11) NOT NULL auto_increment,
  `LUNES` int(11) NOT NULL,
  `MARTES` int(11) NOT NULL,
  `MIERCOLES` int(11) NOT NULL,
  `JUEVES` int(11) NOT NULL,
  `VIERNES` int(11) NOT NULL,
  `SABADO` int(11) NOT NULL,
  `DOMINGO` int(11) NOT NULL,
  `SECPEDIDO` int(11) NOT NULL,
  PRIMARY KEY  (`SECENTREGAPEDIDO`),
  KEY `FK_PEDIDO_idx` (`SECPEDIDO`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- 
-- Dumping data for table `tblentregapedido`
-- 


-- --------------------------------------------------------

-- 
-- Table structure for table `tblformapago`
-- 

CREATE TABLE `tblformapago` (
  `SECFORMAPAGO` int(11) NOT NULL auto_increment,
  `DESCRIPCION` varchar(45) NOT NULL,
  PRIMARY KEY  (`SECFORMAPAGO`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- 
-- Dumping data for table `tblformapago`
-- 


-- --------------------------------------------------------

-- 
-- Table structure for table `tblingreso`
-- 

CREATE TABLE `tblingreso` (
  `SECINGRESO` int(11) NOT NULL auto_increment,
  `SECVENTA` int(11) NOT NULL,
  `SECTIPOINGRESO` int(11) NOT NULL,
  `FECHA` date NOT NULL,
  PRIMARY KEY  (`SECINGRESO`),
  KEY `FK_VENTA_idx` (`SECVENTA`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- 
-- Dumping data for table `tblingreso`
-- 


-- --------------------------------------------------------

-- 
-- Table structure for table `tblinventario`
-- 

CREATE TABLE `tblinventario` (
  `SECINVENTARIO` int(11) NOT NULL auto_increment,
  `SECDETALLEVENTA` int(11) NOT NULL,
  `SECDETALLECOMPRA` int(11) NOT NULL,
  `TOTAL_CANTIDAD` varchar(45) NOT NULL,
  `TOTAL_COMPRA` varchar(45) NOT NULL,
  `TOTAL_COMPRAS` varchar(45) NOT NULL,
  PRIMARY KEY  (`SECINVENTARIO`),
  KEY `FK_DETALLEVENTA_idx` (`SECDETALLEVENTA`),
  KEY `FK_DETALLECOMPRA_idx` (`SECDETALLECOMPRA`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- 
-- Dumping data for table `tblinventario`
-- 


-- --------------------------------------------------------

-- 
-- Table structure for table `tblmarca`
-- 

CREATE TABLE `tblmarca` (
  `SECMARCA` int(11) NOT NULL auto_increment,
  `NOMBRE_MARCA` varchar(45) NOT NULL,
  PRIMARY KEY  (`SECMARCA`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- 
-- Dumping data for table `tblmarca`
-- 


-- --------------------------------------------------------

-- 
-- Table structure for table `tblmunicipio`
-- 

CREATE TABLE `tblmunicipio` (
  `SECMUNICIPIO` int(11) NOT NULL auto_increment,
  `NOMBRE` varchar(45) NOT NULL,
  `SECDEPARTAMENTO` int(11) NOT NULL,
  PRIMARY KEY  (`SECMUNICIPIO`),
  KEY `FK_DEPARTAMENTO_idx` (`SECDEPARTAMENTO`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- 
-- Dumping data for table `tblmunicipio`
-- 


-- --------------------------------------------------------

-- 
-- Table structure for table `tblpais`
-- 

CREATE TABLE `tblpais` (
  `SECPAIS` int(11) NOT NULL auto_increment,
  `NOMBRE` varchar(45) NOT NULL,
  PRIMARY KEY  (`SECPAIS`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- 
-- Dumping data for table `tblpais`
-- 


-- --------------------------------------------------------

-- 
-- Table structure for table `tblpedido`
-- 

CREATE TABLE `tblpedido` (
  `SECPEDIDO` int(11) NOT NULL auto_increment,
  `SECPRODUCTO` int(11) NOT NULL,
  `SECPROVEEDOR` int(11) NOT NULL,
  `TOTALPEDIDO` varchar(45) NOT NULL,
  PRIMARY KEY  (`SECPEDIDO`),
  KEY `FK_PRODUCTO_idx` (`SECPRODUCTO`),
  KEY `FK_PROVEEDOR_idx` (`SECPROVEEDOR`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- 
-- Dumping data for table `tblpedido`
-- 


-- --------------------------------------------------------

-- 
-- Table structure for table `tblpersona`
-- 

CREATE TABLE `tblpersona` (
  `SECPERSONA` int(11) NOT NULL auto_increment,
  `PRIMER_NOMBRE` varchar(45) NOT NULL,
  `SEGUNDO_NOMBRE` varchar(45) NOT NULL,
  `PRIMER_APELLIDO` varchar(45) NOT NULL,
  `SEGUNDO_APELLIDO` varchar(45) NOT NULL,
  `TELEFONO` varchar(45) NOT NULL,
  `DIRECCION` varchar(45) NOT NULL,
  `EMAIL` varchar(45) NOT NULL,
  `SECSEXO` int(11) NOT NULL,
  `SECTIPOPERSONA` int(11) NOT NULL,
  `SECMUNICIPIO` int(11) NOT NULL,
  `SECDOCUMENTO` int(11) NOT NULL,
  PRIMARY KEY  (`SECPERSONA`),
  KEY `FK_SEXO_idx` (`SECSEXO`),
  KEY `FK_TIPOPERSONA_idx` (`SECTIPOPERSONA`),
  KEY `FK_MUNICIPIO_idx` (`SECMUNICIPIO`),
  KEY `FK_DOCUMENTO_idx` (`SECDOCUMENTO`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- 
-- Dumping data for table `tblpersona`
-- 


-- --------------------------------------------------------

-- 
-- Table structure for table `tblpreciocompra`
-- 

CREATE TABLE `tblpreciocompra` (
  `SECPRECIOCOMPRA` int(11) NOT NULL auto_increment,
  `FECHA` date NOT NULL,
  `PRECIO` varchar(45) NOT NULL,
  `ACTIVO` varchar(45) NOT NULL,
  PRIMARY KEY  (`SECPRECIOCOMPRA`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- 
-- Dumping data for table `tblpreciocompra`
-- 


-- --------------------------------------------------------

-- 
-- Table structure for table `tblproducto`
-- 

CREATE TABLE `tblproducto` (
  `SECPRODUCTO` int(11) NOT NULL auto_increment,
  `NOMBRE_PRODUCTO` varchar(45) NOT NULL,
  `SECPROVEEDOR` int(11) NOT NULL,
  `SECCATEGORIA` int(11) NOT NULL,
  `SECMARCA` int(11) NOT NULL,
  `SECPRECIOCOMPRA` int(11) NOT NULL,
  `SECUNIDAD` int(11) NOT NULL,
  `CODIGO` int(11) NOT NULL,
  `CANTIDAD` int(11) NOT NULL,
  `PRECIO_COMPRA` varchar(45) NOT NULL,
  PRIMARY KEY  (`SECPRODUCTO`),
  KEY `FK_PROVEEDOR_idx` (`SECPROVEEDOR`),
  KEY `FK_CATEGORIA_idx` (`SECCATEGORIA`),
  KEY `FK_MARRCA_idx` (`SECMARCA`),
  KEY `FK_UNIDAD_idx` (`SECUNIDAD`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- 
-- Dumping data for table `tblproducto`
-- 


-- --------------------------------------------------------

-- 
-- Table structure for table `tblproveedor`
-- 

CREATE TABLE `tblproveedor` (
  `SECPREVEEDOR` int(11) NOT NULL auto_increment,
  `NOMBRE` varchar(45) NOT NULL,
  `TELEFONO` varchar(45) NOT NULL,
  `DIRECCION` varchar(45) NOT NULL,
  `EMAIL` varchar(45) NOT NULL,
  `SECMUNICIPIO` int(11) NOT NULL,
  `NIT` varchar(45) NOT NULL,
  `SECENTREGAPEDIDO` int(11) NOT NULL,
  PRIMARY KEY  (`SECPREVEEDOR`),
  KEY `FK_MUNICIPIO_idx` (`SECMUNICIPIO`),
  KEY `FK_ENTREGAPEDIDO_idx` (`SECENTREGAPEDIDO`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- 
-- Dumping data for table `tblproveedor`
-- 


-- --------------------------------------------------------

-- 
-- Table structure for table `tblpuntodeventa`
-- 

CREATE TABLE `tblpuntodeventa` (
  `SECTIPODEVENTA` int(11) NOT NULL auto_increment,
  `SECPERSONA` int(11) NOT NULL,
  `SECSUCURSAL` int(11) NOT NULL,
  PRIMARY KEY  (`SECTIPODEVENTA`),
  KEY `FK_SUCURSAL_idx` (`SECSUCURSAL`),
  KEY `FK_PERSONA_idx` (`SECPERSONA`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- 
-- Dumping data for table `tblpuntodeventa`
-- 


-- --------------------------------------------------------

-- 
-- Table structure for table `tblrol`
-- 

CREATE TABLE `tblrol` (
  `SECROL` int(11) NOT NULL auto_increment,
  `DESCRIPCION` varchar(45) NOT NULL,
  PRIMARY KEY  (`SECROL`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- 
-- Dumping data for table `tblrol`
-- 


-- --------------------------------------------------------

-- 
-- Table structure for table `tblsexo`
-- 

CREATE TABLE `tblsexo` (
  `SECSEXO` int(11) NOT NULL auto_increment,
  `DESCRIPCION` varchar(45) NOT NULL,
  PRIMARY KEY  (`SECSEXO`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- 
-- Dumping data for table `tblsexo`
-- 


-- --------------------------------------------------------

-- 
-- Table structure for table `tblsucursal`
-- 

CREATE TABLE `tblsucursal` (
  `SECSUCURSAL` int(11) NOT NULL auto_increment,
  `NOMBRE` varchar(45) NOT NULL,
  `DIRECCION` varchar(45) NOT NULL,
  `TELEFONO` varchar(45) NOT NULL,
  `EMAIL` varchar(45) NOT NULL,
  `NIT` varchar(45) NOT NULL,
  PRIMARY KEY  (`SECSUCURSAL`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- 
-- Dumping data for table `tblsucursal`
-- 


-- --------------------------------------------------------

-- 
-- Table structure for table `tbltipodocumento`
-- 

CREATE TABLE `tbltipodocumento` (
  `SECTIPODOCUMENTO` int(11) NOT NULL auto_increment,
  `DESCRIPCION` varchar(45) NOT NULL,
  PRIMARY KEY  (`SECTIPODOCUMENTO`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- 
-- Dumping data for table `tbltipodocumento`
-- 


-- --------------------------------------------------------

-- 
-- Table structure for table `tbltipoegreso`
-- 

CREATE TABLE `tbltipoegreso` (
  `SECTIPOINGRESO` int(11) NOT NULL auto_increment,
  `CONCEPTO_EGRESO` varchar(200) NOT NULL,
  PRIMARY KEY  (`SECTIPOINGRESO`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- 
-- Dumping data for table `tbltipoegreso`
-- 


-- --------------------------------------------------------

-- 
-- Table structure for table `tbltipoingreso`
-- 

CREATE TABLE `tbltipoingreso` (
  `SECTIPOINGRESO` int(11) NOT NULL auto_increment,
  `CONCEPTO_INGRESO` varchar(200) NOT NULL,
  PRIMARY KEY  (`SECTIPOINGRESO`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- 
-- Dumping data for table `tbltipoingreso`
-- 


-- --------------------------------------------------------

-- 
-- Table structure for table `tbltipopersona`
-- 

CREATE TABLE `tbltipopersona` (
  `SECTIPOPERSONA` int(11) NOT NULL auto_increment,
  `DESCRIPCION` varchar(45) NOT NULL,
  PRIMARY KEY  (`SECTIPOPERSONA`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- 
-- Dumping data for table `tbltipopersona`
-- 


-- --------------------------------------------------------

-- 
-- Table structure for table `tblunidad`
-- 

CREATE TABLE `tblunidad` (
  `SECUNIDAD` int(11) NOT NULL auto_increment,
  `UNIDADES` varchar(45) NOT NULL,
  PRIMARY KEY  (`SECUNIDAD`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- 
-- Dumping data for table `tblunidad`
-- 


-- --------------------------------------------------------

-- 
-- Table structure for table `tblusuario`
-- 

CREATE TABLE `tblusuario` (
  `SECUSUARIO` int(11) NOT NULL auto_increment,
  `LOGIN` varchar(45) NOT NULL,
  `PASSWORD` varchar(45) NOT NULL,
  `SECROL` int(11) NOT NULL,
  `SESION` varchar(45) NOT NULL,
  `SECPERSONA` int(11) NOT NULL,
  PRIMARY KEY  (`SECUSUARIO`),
  KEY `FK_ROL_idx` (`SECROL`),
  KEY `FK_PERSONA_idx` (`SECPERSONA`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- 
-- Dumping data for table `tblusuario`
-- 


-- --------------------------------------------------------

-- 
-- Table structure for table `tblventa`
-- 

CREATE TABLE `tblventa` (
  `SECVENTA` int(11) NOT NULL auto_increment,
  `FECHA` date NOT NULL,
  `SECPUNTODEVENTA` int(11) NOT NULL,
  `SECCLIENTE` int(11) NOT NULL,
  `OBSERVACION` varchar(200) NOT NULL,
  `SECVENDEDOR` int(11) NOT NULL,
  `TOTAL` decimal(50,0) NOT NULL,
  `TOTALCANTIDAD` int(11) NOT NULL,
  `SECFORMAPAGO` int(11) NOT NULL,
  PRIMARY KEY  (`SECVENTA`),
  KEY `FK_PUNTODEVENTA_idx` (`SECPUNTODEVENTA`),
  KEY `FK_CLIENTE_idx` (`SECCLIENTE`),
  KEY `FK_FORMADEPAGO_idx` (`SECFORMAPAGO`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- 
-- Dumping data for table `tblventa`
-- 


-- --------------------------------------------------------

-- 
-- Table structure for table `tblvisitapedidos`
-- 

CREATE TABLE `tblvisitapedidos` (
  `SECVISITAPEDIDOS` int(11) NOT NULL auto_increment,
  `LUNES` int(11) NOT NULL,
  `MARTES` int(11) NOT NULL,
  `MIERCOLES` int(11) NOT NULL,
  `JUEVES` int(11) NOT NULL,
  `VIERNES` int(11) NOT NULL,
  `SABADO` int(11) NOT NULL,
  `DOMINGO` int(11) NOT NULL,
  `SECPROVEEDOR` int(11) NOT NULL,
  PRIMARY KEY  (`SECVISITAPEDIDOS`),
  KEY `FK_PROVEEDOR_idx` (`SECPROVEEDOR`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- 
-- Dumping data for table `tblvisitapedidos`
-- 
