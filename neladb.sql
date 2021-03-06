-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               5.7.29-log - MySQL Community Server (GPL)
-- Server OS:                    Win32
-- HeidiSQL Version:             11.0.0.5919
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Dumping database structure for nela_db
DROP DATABASE IF EXISTS `nela_db`;
CREATE DATABASE IF NOT EXISTS `nela_db` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `nela_db`;

-- Dumping structure for table nela_db.coa
DROP TABLE IF EXISTS `coa`;
CREATE TABLE IF NOT EXISTS `coa` (
  `COAId` int(11) NOT NULL AUTO_INCREMENT,
  `AccountCode` varchar(50) DEFAULT NULL,
  `AccountTitle` varchar(300) DEFAULT NULL,
  PRIMARY KEY (`COAId`)
) ENGINE=InnoDB AUTO_INCREMENT=49 DEFAULT CHARSET=utf8;

-- Dumping data for table nela_db.coa: ~47 rows (approximately)
DELETE FROM `coa`;
/*!40000 ALTER TABLE `coa` DISABLE KEYS */;
INSERT INTO `coa` (`COAId`, `AccountCode`, `AccountTitle`) VALUES
	(1, 'A-001', 'CASH ON HAND'),
	(2, 'A-002', 'CASH IN BANK'),
	(4, 'A-003', 'ADVANCES TO OFFICERS AND EMPLOYEES'),
	(5, 'A-004', 'PREPAID EXPENSES'),
	(6, 'A-005', 'MULTIPURPOSE LOAN RECEIVABLES'),
	(7, 'C-001', 'ALLOWANCE FOR PROBABLE LOSSES ON LOANS'),
	(8, 'A-006', 'ACCOUNTS RECEIVABLES'),
	(9, 'A-007', 'UNUSED OFFICE SUPPLIES'),
	(10, 'A-008', 'INVESTMENTS'),
	(11, 'A-009', 'OFFICE AND FIELD EQUIPMENTS'),
	(12, 'C-002', 'ACCUMULATED DEPRECIATION-OFFICE & FIELD EQUIPMENTS'),
	(13, 'A-010', 'FURNITURE AND FIXTURES'),
	(14, 'C-003', 'ACCUMULATED DEPRECIATION-FURNITURE & FIXTURES'),
	(15, 'A-011', 'BUILDING & IMPROVEMENTS'),
	(16, 'C-004', 'ACCUMULATED DEPRECIATION - BUILDING & IMPROVEMENTS'),
	(17, 'A-012', 'COMPUTIRIZATION COSTS'),
	(18, 'L-001', 'RETIREMENT PAYABLE'),
	(19, 'L-002', 'INCOME TAX PAYABLE'),
	(20, 'L-003', 'LABOR PAYABLE'),
	(21, 'L-004', 'SALARIES AND WAGES PAYABLE'),
	(22, 'L-005', 'SSS/PAG-IBIG/PHIL. HEALTH PAYABLE'),
	(23, 'ME-001', 'GROUP INSURANCE FUND'),
	(24, 'ME-OO2', 'MUTUAL AID FUND'),
	(25, 'ME-003', 'PAID IN SHARES'),
	(26, 'ME-004', 'RETAINED EARNINGS'),
	(27, 'ME-005', 'OPTIONAL FUND'),
	(28, 'R-001', 'SERVICES INCOME'),
	(29, 'R-002', 'MISCELLANEOUS INCOME'),
	(30, 'R-003', 'OTHER INCOME-PHOTO COPIES'),
	(31, 'R-004', 'MEMBERSHIP FEES'),
	(32, 'R-005', 'ANNUAL DUES'),
	(33, 'R-006', 'BANK INTEREST INCOME'),
	(34, 'E-001', 'SALARIES & WAGES EXPENSES'),
	(35, 'E-002', 'PROFESSIONAL FEES'),
	(36, 'E-003', 'OFFICERS & EMPLOYEES BENEFITS'),
	(37, 'E-004', 'GENERAL ASSEMBLY EXPENSES'),
	(38, 'E-006', 'BUSINESS LICENSE AND TAXES'),
	(39, 'E-007', 'MISCELLANEOUS EXPENSES'),
	(40, 'E-008', 'TRANSPORTATION EXPENSES'),
	(41, 'E-009', 'STATIONERIES & OFFICE SUPPLIES EXPENSES'),
	(42, 'E-010', 'REPAIRS AND MAINTENANCE EXPENSES'),
	(43, 'E-011', 'LIGHT AND POWER EXPENSES'),
	(44, 'E-012', 'COMMUNICATION EXPENSES'),
	(45, 'E-013', 'DEPRECIATION EXPENSES'),
	(46, 'E-014', 'RETIREMENT EXPENSES'),
	(47, 'E-015', 'PROBABLE LOSSES ON LOANS EXPENSE'),
	(48, 'E-005', 'SSS/PAG-IBIG/PHIL. HEALTH SHARE CONTRIBUTION');
/*!40000 ALTER TABLE `coa` ENABLE KEYS */;

-- Dumping structure for table nela_db.electrician
DROP TABLE IF EXISTS `electrician`;
CREATE TABLE IF NOT EXISTS `electrician` (
  `ElectricianId` int(11) NOT NULL AUTO_INCREMENT,
  `FullName` varchar(100) NOT NULL DEFAULT '0',
  `Address` varchar(150) NOT NULL DEFAULT '0',
  `ContactNo` varchar(50) NOT NULL DEFAULT '0',
  PRIMARY KEY (`ElectricianId`),
  KEY `ElectricianId` (`ElectricianId`)
) ENGINE=InnoDB AUTO_INCREMENT=107 DEFAULT CHARSET=utf8;

-- Dumping data for table nela_db.electrician: ~104 rows (approximately)
DELETE FROM `electrician`;
/*!40000 ALTER TABLE `electrician` DISABLE KEYS */;
INSERT INTO `electrician` (`ElectricianId`, `FullName`, `Address`, `ContactNo`) VALUES
	(0, '', '', ''),
	(1, 'DAVAD, ANTHONY CADORNA', 'TIGUIB, AYUNGON NEGROS ORIENTAL', '09274948756'),
	(2, 'AMORIO, MARLON LIMBAGA', 'TINAOGAN, BINDOY NEGROS ORIENTAL', '09058319601'),
	(3, 'EROJO, NELSON ABANTO', 'TIGUIB, AYUNGON NEGROS ORIENTAL', '09165663326'),
	(4, 'SARABIA, LUCRITO GANTALAO', 'POBLACION, BINDOY NEGROS ORIENTAL', '09351538905'),
	(5, 'CADALSO, REYNALDO LARA', 'TANGCULOGAN, BAIS CITY NEGROS ORIENTAL', '09676939348'),
	(6, 'VAILOCES, MICHAEL BUMA-AT', 'DOMOLOG, BINDOY NEGROS ORIENTAL', '09652700593'),
	(7, 'ESTOCONING, JESSIEKEM PACUNLA', 'TAMPOCON 1, AYUNGON NEGROS ORIENTAL', '09973291817'),
	(8, 'PACION, ALBERTO ALBERIO', 'BULADO, GUIHULNGAN CITY NEGROS ORIENTAL', '09676622491'),
	(9, 'PACURIB, BARTHOLOME PLANIA', 'BAGO, TAYASAN NEGROS ORIENTAL', '09366116835'),
	(10, 'DAGLE, WILSON PERATER JR.', 'TAMBULAN, TAYASAN NEGROS ORIENTAL', '09359813431'),
	(11, 'HERRERA, ARNOLD SALVA', ' POBLACION, BINDOY NEGROS ORIENTAL', '09264051099'),
	(12, 'RUBLICO, REYMON REBANTE', 'NORTH POBLACION, LA LIBERTAD NEGROS ORIENTAL', '09056440972'),
	(13, 'CATACUTAN, ARCHON LIMBAGA', 'NALUNDAN, BINDOY NEGROS ORIENTAL', '09979529233'),
	(14, 'MONTENEGRO, EDMUND NILLES JR.', 'BASAK, GUIHULNGAN CITY NEGROS ORIENTAL', '09975171474'),
	(15, 'VILLAESTER, EDNAN YAP', 'T-BEACH, GUIHULNGAN CITY NEGROS ORIENTAL', '09059521141'),
	(16, 'VILLAESTER, EDLENE JOHN DOMOGHO', 'T-BEACH, GUIHULNGAN CITY NEGROS ORIENTAL', '09056462605'),
	(17, 'TABANAO, DANILO SABANAL', 'SOLONGGON, LA LIBERTAD NEGROS ORIENTAL', '09675742968'),
	(18, 'ALI??ABO, EMMANUEL PELIGRINO', 'BUTONG, MANJUYOD NEGROS ORIENTAL', '09265034095'),
	(19, 'DAGONTON, ERLINDO MONTEMAYOR', 'PALASLAN, TAYASAN NEGROS ORIENTAL', '09971667091'),
	(20, 'PANINGSORO, RAMONITO REGIDOR', 'HIMOCDUNGON MABINAY, NEGROS ORIENTAL', '09551820363'),
	(21, 'BOHOL, REMEGIO RODRIGUEZ', 'ABIS, MABINAY NEGROS ORIENTAL', '09358975799'),
	(22, 'PI??ERO, JERRY ODELENCIA', 'TADLONG, MABINAY NEGROS ORIENTAL', '09056114661'),
	(23, 'REBUSQUILLO, ANTHONY TABANAO', 'SOLONGGON, LA LIBERTAD NEGROS ORIENTAL', '09051178137'),
	(24, 'CASQUITE, ALFREDO CALAGO', 'BAGAWINES, VALLEHERMOSO NEGROS ORIENTAL', '09368455336'),
	(25, 'SECONG, WILFREDO LIMBAGA', 'MACAPSO, VALLEHERMOSO NEGROS ORIENTAL', '09069453007'),
	(26, 'LASPI??AS, GODFREY ATOY', 'CABULOTAN, TAYASAN NEGROS ORIENTAL', '09553907227'),
	(27, 'CABALLES, PERCIVAL SERION', 'POBLACION, VALLEHERMOSO NEGROS ORIENTAL', '09264856112'),
	(28, 'BALDOSANO, RODEL PAQUIRA', 'JUAN LUNA ST., BAIS CITY NEGROS ORIENTAL', '09551824032'),
	(30, 'BALBON, CLEINT JOHN BALDADO', 'CAMUDLAS, BINDOY NEGROS ORIENTAL', '09675204922'),
	(32, 'DELA TORRE, JUNAVEN TAMPIOC', 'CALAGCALAG, AYUNGON NEGROS ORIENTAL', '09056452805'),
	(33, 'SARABIA, RENGIE BALDOZA', 'DOMOLOG, BINDOY NEGROS ORIENTAL', '09068667311'),
	(34, 'CABUGNASON, ALEJANDRO ESTARIJA', 'BOLISONG, MANJUYOD NEGROS ORIENTAL', '09167562167'),
	(35, 'OBENITA, EDGAR RABOY', 'MAHANLOD, JIMALALUD NEGROS ORIENTAL', '09187018446'),
	(36, 'AMAMIO, JOSE VILLALON', 'PACUAN, LA LIBERTAD NEGROS ORIENTAL', '09430258296'),
	(37, 'DOMOGHO, REMEGIO GIMANG', 'T-BEACH, GUIHULNGAN CITY NEGROS ORIENTAL', '09759100398'),
	(38, 'SABEJON, RODOLFO MAYOLA JR.', 'POBLACION, GUIHULNGAN CITY NEGROS ORIENTAL', '09263867014'),
	(39, 'VISAGAS, ROMEO DORIA', 'POBLACION, GUIHULNGAN CITY NEGROS ORIENTAL', '09058318675'),
	(40, 'PAQUIRA, ROLANDO ALGA', 'POBLACION, GUIHULNGAN CITY NEGROS ORIENTAL', '09364453657'),
	(41, 'FLORENDIA, EDMUNDO MAGBANUA', 'CALAMBA, GUIHULNGAN CITY NEGROS ORIENTAL', '09569170432'),
	(42, 'BLANCO, MARCELO LAPUZ', 'POBLACION, GUIHULNGAN CITY NEGROS ORIENTAL', '09263149009'),
	(43, 'CARINAL, ALBIN LIBRADILLA', 'TAMPOCON II, AYUNGON NEGROS ORIENTAL', '09161441740'),
	(44, 'ESCUDERO, FREEDY REPUELA', 'TARA, MABINAY NEGROS ORIENTAL', '09261808157'),
	(45, 'OYANGORIN, EDMAR DELA COSTA', 'BINALBAGAN, CANLAON CITY NEGROS ORIENTAL', '09303607993'),
	(46, 'MAGOS, ROLANDO ESTOCONING', 'MAMBAID, JIMALALUD NEGROS ORIENTAL', '09756945501'),
	(47, 'CAYETANO, JUNRIL CAROLLO', 'PITOGO, LA LIBERTAD NEGROS ORIENTAL', '09304122963'),
	(48, 'MANABA, CRESENCIANO DIANA', 'CALAMBA, GUIHULNGAN CITY NEGROS ORIENTAL', '09066261745'),
	(49, 'DAGODOG, BEBOT AMOLO', 'BANBAN, AYUNGON NEGROS ORIENTAL', '09554818970'),
	(50, 'JOROLAN, APRODUCIO SAB-A', 'PULA, CANLAON CITY NEGROS ORIENTAL', '09168738464'),
	(51, 'CARREON, DANILO FLORES', 'MABIGO, CANLAON CITY NEGROS ORIENTAL', '09351796088'),
	(52, 'MARTINEZ, MATIAS CABANAG', 'BRGY. II, BAIS CITY NEGROS ORIENTAL', '09773620682'),
	(53, 'AMARO, FELIPE AMONDINA', 'POBLACION, BINDOY NEGROS ORIENTAL', '09367229300'),
	(54, 'ABILLA, JOSEPHRODSON RIVERA', 'POBLACION 2, BAIS CITY NEGROS ORIENTAL', '09556174748'),
	(55, 'AMARO, VINCENT DOLENDRES', 'POBLACION, BINDOY NEGROS ORIENTAL', '09263648332'),
	(56, 'AMARO, KAVIN DOLENDRES', 'POBLACION, BINDOY NEGROS ORIENTAL', '09051531115'),
	(57, 'BALASABAS, JULSAN ENMACINO', 'PINDAHAN, TAYASAN NEGROS ORIENTAL', '09264854507'),
	(58, 'LETIGIO, ENNAR ROMANO', 'NALUNDAN, BINDOY NEGROS ORIENTAL', '09363650825'),
	(59, 'EBAS, ELDE REDULA', 'TIGUIB, AYUNGON NEGROS ORIENTAL', '09058923924'),
	(60, 'MALINAS, ALVIN YU', 'POBLACION, GUIHULNGAN CITY NEGROS ORIENTAL', '09361877286'),
	(61, 'BAULITA, FELIMON ABSIN', 'PANGLAYAAN, JIMALALUD NEGROS ORIENTAL', '09974820476'),
	(62, 'VILLONES, LEOVIGILDO GAROL', 'POBLACION, TAYASAN NEGROS ORIENTAL', ''),
	(63, 'VALLEGA, REY BAHANDI', 'CALAGCALAG, AYUNGON NEGROS ORIENTAL', '09756117533'),
	(65, 'ALBERTO, ALCHE ESCOMO', 'ELECIA, LA LIBERTAD NEGROS ORIENTAL', '09307913550'),
	(66, 'PILAPIL, LORETO YBA??EZ JR.', 'MALUSAY, GUIHULNGAN CITY NEGROS ORIENTAL', '09351220457'),
	(67, 'LEDON, FEL GAUDAN', 'POLOPANTAO, JIMALALUD NEGROS ORIENTAL', '09663211453'),
	(68, 'DEPALAS, ROGER CATAYLO', 'LAMDAS, MABINAY NEGROS ORIENTAL', '09485858481'),
	(69, 'SONGGALIA, PEPITO SE??ERES', 'LAPAZ, BAIS CITY NEGROS ORIENTAL', '09978439592'),
	(70, 'ABRASALDO, HAROLD CABUGNASON', 'TUBOD, MANJUYOD NEGROS ORIENTAL', '09268740880'),
	(71, 'FLORES, REYNANTE CETALYO', 'MASULOG, CANLAON CITY NEGROS ORIENTAL', '09278358159'),
	(72, 'JAKUSALEM, CAMILO QUILANAN', 'MABIGO, CANLAON CITY NEGROS ORIENTAL', '09064221704'),
	(73, 'RODRIGUEZ, RICHARD LAPINOSO', 'POBLACION, MABINAY NEGROS ORIENTAL', '09358349036'),
	(74, 'SANTANDER, ALLAN MARQUEZ', 'PANUBIGAN, CANLAON CITY NEGROS ORIENTAL', ''),
	(75, 'SORE??O, NORMAN BALASABAS', 'TAMAO, TAYASAN NEGROS ORIENTAL', '09272890599'),
	(76, 'ENCARNACION, ELMER GUARIN', 'BUDLASAN, CANLAON CITY NEGROS ORIENTAL', '09461853413'),
	(77, 'CADUHADA, NOEL PEROMINGAN', 'LINOTHANGAN, CANLAON CITY NEGROS ORIENTAL', '09213764213'),
	(78, 'AMATO, PACO CAGUIHAYAN', 'LAMOGONG, MANJUYOD NEGROS ORIENTAL', '09974659862'),
	(79, 'ONLAGADA, JAYSON MANCAO', 'BAGTIC, MABINAY NEGROS ORIENTAL', '09759411105'),
	(80, 'CA??ETE, BHEBIE FRANZ ABSIN', 'MARTILO, LA LIBERTAD NEGROS ORIENTAL', '09368344789'),
	(81, 'SITONES, VERGELIO GUIA', 'MABIGO, CANLAON CITY NEGROS ORIENTAL', '09165439793'),
	(83, 'AMAMIO, JOSE VILLALON', 'PACUAN, LA LIBERTAD NEGROS ORIENTAL', '09430258296'),
	(84, 'PACION, FERNANDO ALBERIO JR.', 'BULADO, GUIHULNGAN CITY NEGROS ORIENTAL', '09066896084'),
	(85, 'GEPOLAN, VICENTE JACULBE', 'AQUINO, CANLAON CITY NEGROS ORIENTAL', '09450689189'),
	(86, 'PAQUIRA, ROLANDO ALGA', 'POBLACION, GUIHULNGAN CITY NEGROS ORIENTAL', '09364453657'),
	(87, 'DEGUIT, NELSON LAUDECINDO', 'AWA-AN AYUNGON NEGROS ORIENTAL', '09263233030'),
	(88, 'ACAB, VERGILIO AVENIDO', 'MANDALUPANG, MANJUYOD NEGROS ORIENTAL', '09354559490'),
	(89, 'ENCARNACION, ERLITO GUARIN', 'CANLAON CITY NEGROS ORIENTAL', '09197361733'),
	(90, 'TORRES, RONILO ESTOCONING', 'SOUTH POBLACION, JIMALALUD NEGROS ORIENTAL', '09269246157'),
	(91, 'WACAY, JOELIBER ABRASALDO', 'SAB-AHAN, BAIS CITY NEGROS ORIENTAL', '09264713076'),
	(92, 'GOLEZ, ROLDAN GAYTA', 'BAIS CITY NEGROS ORIENTAL', '09350793124'),
	(93, 'BARILLO, JOSELITO MARTINEZ', 'GUIHULNGAN CITY NEGROS ORIENTAL', '09239411213'),
	(94, 'EJERCITO, RICKY GANTE', 'LUMBANGAN, MABINAY NEGROS ORIENTAL', '09161408940'),
	(95, 'CABALLES, DANNI KEITH ACHARON', 'POBLACION, VALLEHERMOSO NEGROS ORIENTAL', ''),
	(96, 'CUEVAS, RUDY MATUS JR.', 'BAE, JIMALALUD NEGROS ORIENTAL', ''),
	(97, 'CALIDGUID, RENATO BANJAO', 'TINAOGAN, BINDOY NEGROS ORIENTAL', '09159521142'),
	(98, 'MATIAS, FRILAND ABRIL', 'POBLACION, MABINAY NEGROS ORIENTAL', '09360922309'),
	(99, 'DINAPO, RICHARD BARGAS', 'BAGTIC, MABINAY NEGROS ORIENTAL', '09675109901'),
	(100, 'DONASCO, RUPERTO SEVILLA JR.', 'NABHANG, AYUNGON NEGROS ORIENTAL', '09264900389'),
	(101, 'LENDIO, SOLITO ROMANO', 'CABUGAN, BINDOY NEGROS ORIENTAL', '09354609261'),
	(102, 'NOGA, NELSON ESTA??O', 'TAMPOCON II, AYUNGON NEGROS ORIENTAL', '09556998331'),
	(103, 'NOGA, NILO ESTA??O', 'TAMPOCON II, AYUNGON NEGROS ORIENTAL', ''),
	(104, 'CABANG, IRVIN FUNDADOR', 'NORTH POBLACION, LA LIBERTAD NEGROS ORIENTAL', '09261288028'),
	(105, 'FABILLAR, JUDE AMAAT', 'POBLACION, GUIHULNGAN CITY NEGROS ORIENTAL', '09753243502'),
	(106, 'CADIENTE, PEPITO', 'MANJUYOD NEGROS ORIENTAL', '');
/*!40000 ALTER TABLE `electrician` ENABLE KEYS */;

-- Dumping structure for table nela_db.gui_menu
DROP TABLE IF EXISTS `gui_menu`;
CREATE TABLE IF NOT EXISTS `gui_menu` (
  `menu_id` tinyint(4) NOT NULL AUTO_INCREMENT,
  `menu_caption` varchar(50) DEFAULT NULL,
  `mnemonic` varchar(5) NOT NULL,
  `icon_path` varchar(100) NOT NULL,
  `seq` tinyint(4) NOT NULL DEFAULT '0',
  PRIMARY KEY (`menu_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- Dumping data for table nela_db.gui_menu: ~4 rows (approximately)
DELETE FROM `gui_menu`;
/*!40000 ALTER TABLE `gui_menu` DISABLE KEYS */;
INSERT INTO `gui_menu` (`menu_id`, `menu_caption`, `mnemonic`, `icon_path`, `seq`) VALUES
	(1, 'NELA', 'L', '/img/build.png', 1),
	(2, 'SETTINGS', 'A', '/img/ua.png', 9),
	(3, 'TRANSACTIONS', 'B', '/img/ledger4.png', 3),
	(4, 'REPORTS', 'U', '/img/set.png', 4);
/*!40000 ALTER TABLE `gui_menu` ENABLE KEYS */;

-- Dumping structure for table nela_db.gui_menu_item
DROP TABLE IF EXISTS `gui_menu_item`;
CREATE TABLE IF NOT EXISTS `gui_menu_item` (
  `menu_item_id` tinyint(4) NOT NULL AUTO_INCREMENT,
  `mini_icon_path` varchar(100) NOT NULL DEFAULT '0',
  `menu_item_caption` varchar(100) NOT NULL,
  `mnemonic` varchar(10) NOT NULL,
  `icon_path` varchar(100) NOT NULL,
  `menu_id` tinyint(4) DEFAULT NULL,
  `seq` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`menu_item_id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- Dumping data for table nela_db.gui_menu_item: ~7 rows (approximately)
DELETE FROM `gui_menu_item`;
/*!40000 ALTER TABLE `gui_menu_item` DISABLE KEYS */;
INSERT INTO `gui_menu_item` (`menu_item_id`, `mini_icon_path`, `menu_item_caption`, `mnemonic`, `icon_path`, `menu_id`, `seq`) VALUES
	(1, '/img/myinquiry.png', 'User Account', 't', '/img/ua.png', 2, 1),
	(2, '/img/myinquiry.png', 'User Group Privilege', 'g', '/img/manageemp.png', 2, 2),
	(3, '/img/myinquiry.png', 'Chart of Accounts', 'c', '/img/book1.png', 1, 1),
	(4, '/img/myinquiry.png', 'Electricians', 'a', '/img/hh.png', 1, 2),
	(5, '/img/myinquiry.png', 'Transaction Setup', 'p', '/img/services.png', 1, 3),
	(6, '/img/myinquiry.png', 'New Transaction', 'a', '/img/approved1.png', 3, 1),
	(7, '/img/myinquiry.png', 'Transaction Management', 'n', '/img/pexag.png', 3, 2);
/*!40000 ALTER TABLE `gui_menu_item` ENABLE KEYS */;

-- Dumping structure for table nela_db.share_holder
DROP TABLE IF EXISTS `share_holder`;
CREATE TABLE IF NOT EXISTS `share_holder` (
  `ShareHolderId` tinyint(4) NOT NULL AUTO_INCREMENT,
  `Description` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`ShareHolderId`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- Dumping data for table nela_db.share_holder: ~2 rows (approximately)
DELETE FROM `share_holder`;
/*!40000 ALTER TABLE `share_holder` DISABLE KEYS */;
INSERT INTO `share_holder` (`ShareHolderId`, `Description`) VALUES
	(1, 'NELA Cooperative'),
	(2, 'NELA Electrician');
/*!40000 ALTER TABLE `share_holder` ENABLE KEYS */;

-- Dumping structure for table nela_db.transaction
DROP TABLE IF EXISTS `transaction`;
CREATE TABLE IF NOT EXISTS `transaction` (
  `TransId` int(11) NOT NULL AUTO_INCREMENT,
  `ElectricianId` int(11) DEFAULT '0',
  `TransTypeId` tinyint(4) NOT NULL DEFAULT '0',
  `TotalAmount` decimal(18,2) DEFAULT NULL,
  `TransStatus` tinyint(4) DEFAULT '1',
  `TransDate` datetime DEFAULT CURRENT_TIMESTAMP,
  `UserId` int(11) DEFAULT NULL,
  `Consumer` varchar(80) DEFAULT NULL,
  `ORNo` varchar(25) DEFAULT NULL,
  `ORDate` date DEFAULT NULL,
  PRIMARY KEY (`TransId`)
) ENGINE=InnoDB AUTO_INCREMENT=84 DEFAULT CHARSET=utf8;

-- Dumping data for table nela_db.transaction: ~83 rows (approximately)
DELETE FROM `transaction`;
/*!40000 ALTER TABLE `transaction` DISABLE KEYS */;
INSERT INTO `transaction` (`TransId`, `ElectricianId`, `TransTypeId`, `TotalAmount`, `TransStatus`, `TransDate`, `UserId`, `Consumer`, `ORNo`, `ORDate`) VALUES
	(1, 22, 2, 1367.00, 1, '2019-05-23 09:11:04', 2, 'CECELIA OGATIS', '29892', '2019-05-14'),
	(2, 98, 2, 2157.00, 1, '2019-05-23 09:12:23', 2, 'GEMMA CALLAO "B"', '29893', '2019-05-14'),
	(3, 90, 2, 1435.00, 1, '2019-05-23 09:13:31', 2, 'DANJICK DAGAT', '29894', '2019-05-14'),
	(4, 25, 2, 1855.00, 1, '2019-05-23 09:14:31', 2, 'CORAZON OWACAN', '29895', '2019-05-14'),
	(5, 33, 2, 949.00, 1, '2019-05-23 09:17:04', 2, 'CONCHITA PALUMAR', '29896', '2019-05-14'),
	(6, 84, 2, 4430.00, 1, '2019-05-23 09:17:56', 2, 'JOLIMIE CALUNSAG', '29897', '2019-05-14'),
	(7, 8, 2, 1815.00, 1, '2019-05-23 09:19:03', 2, 'EMILY BELOTENDOS', '29898', '2019-05-14'),
	(8, 11, 5, 495.00, 1, '2019-05-23 09:20:58', 2, 'ARNOLD HERRERA', '29905', '2019-05-14'),
	(9, 73, 2, 1345.00, 1, '2019-05-23 09:33:14', 2, 'LUCIA DINGLASA', '29899', '2019-05-14'),
	(10, 95, 2, 1049.00, 1, '2019-05-23 09:35:13', 2, 'RICHARD TELERON', '29900', '2019-05-14'),
	(11, 22, 2, 1235.00, 1, '2019-05-23 09:36:20', 2, 'AIDA MASCARDO "B"', '29901', '2019-05-14'),
	(12, 12, 2, 1855.00, 1, '2019-05-23 09:37:24', 2, 'ALLEN TULISANA', '29902', '2019-05-14'),
	(13, 12, 2, 1635.00, 1, '2019-05-23 09:38:28', 2, 'HARLEN BILLONES', '29903', '2019-05-14'),
	(14, 90, 2, 2130.00, 1, '2019-05-23 09:39:40', 2, 'CESAR GRANADA JR.', '29904', '2019-05-14'),
	(15, 68, 7, 340.00, 1, '2019-05-23 09:49:42', 2, 'ROGER DEPALAS', '29907', '2019-05-15'),
	(16, 104, 2, 2000.00, 1, '2019-05-23 09:51:38', 2, 'IRVIN CABANG', '29909', '2019-05-15'),
	(17, 104, 7, 340.00, 1, '2019-05-23 09:53:12', 2, 'IRVIN CABANG', '29910', '2019-05-15'),
	(18, 38, 2, 132.00, 1, '2019-05-23 09:56:28', 2, 'BENJAMIN PITULAN', '29912', '2019-05-15'),
	(19, 38, 2, 90.00, 1, '2019-05-23 09:57:56', 2, 'ANASTACIA PITULAN', '29913', '2019-05-15'),
	(20, 38, 2, 90.00, 1, '2019-05-23 09:59:04', 2, 'MARILYN OPSIMAR', '29914', '2019-05-15'),
	(21, 38, 2, 90.00, 1, '2019-05-23 10:00:18', 2, 'ELIZA CALAGO', '29915', '2019-05-15'),
	(22, 38, 2, 231.00, 1, '2019-05-23 10:01:45', 2, 'MARILOU OPSIMAR', '29916', '2019-05-15'),
	(23, 38, 2, 90.00, 1, '2019-05-23 10:02:50', 2, 'EDITHA ELUM', '29917', '2019-05-15'),
	(24, 38, 2, 165.00, 1, '2019-05-23 10:04:26', 2, 'EUSTAQUIO GIMARANGAN', '29918', '2019-05-15'),
	(25, 38, 2, 660.00, 1, '2019-05-23 10:05:44', 2, 'ROBERTO ACOSTA', '29919', '2019-05-15'),
	(26, 38, 2, 561.00, 1, '2019-05-23 10:07:10', 2, 'MARITES DELA TORRE', '29920', '2019-05-15'),
	(27, 22, 2, 899.00, 1, '2019-05-23 10:08:24', 2, 'JENY LATURNAS', '29921', '2019-05-15'),
	(28, 98, 2, 932.00, 1, '2019-05-23 10:09:49', 2, 'MELANIE SAYLANON', '29922', '2019-05-15'),
	(29, 72, 2, 1180.00, 1, '2019-05-23 10:11:04', 2, 'REBECCA GARLET', '29923', '2019-05-15'),
	(30, 73, 2, 1180.00, 1, '2019-05-23 10:12:19', 2, 'EXCYL ALBERASTINE', '29924', '2019-05-15'),
	(31, 11, 2, 2580.00, 1, '2019-05-23 10:15:05', 2, 'LETECIA TULBO', '29925', '2019-05-15'),
	(32, 72, 2, 2730.00, 1, '2019-05-23 10:16:18', 2, 'TRIXIE SILABAY', '29926', '2019-05-15'),
	(33, 85, 2, 1097.00, 1, '2019-05-23 10:18:50', 2, 'EMELIO DAMASOLE', '29927', '2019-05-15'),
	(34, 22, 2, 1125.00, 1, '2019-05-23 10:20:13', 2, 'JOHN IAN JAMITO', '29928', '2019-05-15'),
	(35, 50, 2, 2347.00, 1, '2019-05-23 10:22:21', 2, 'HELEN GRACE MACATUAL', '29929', '2019-05-16'),
	(36, 50, 2, 1125.00, 1, '2019-05-23 10:23:31', 2, 'FELICIANA SAMEON', '29930', '2019-05-16'),
	(37, 50, 2, 1125.00, 1, '2019-05-23 10:26:19', 2, 'SUSAN ESTOQUE', '29931', '2019-05-16'),
	(38, 99, 2, 1290.00, 1, '2019-05-23 10:27:35', 2, 'MARY ANN MAHILUM', '29932', '2019-05-16'),
	(39, 10, 2, 1302.00, 1, '2019-05-23 10:29:08', 2, 'MYRNA CABANAG "B"', '29933', '2019-05-16'),
	(40, 40, 2, 6335.00, 1, '2019-05-23 10:30:44', 2, 'BHOBER EROJO', '29934', '2019-05-16'),
	(41, 65, 7, 340.00, 1, '2019-05-23 10:31:59', 2, 'ALCHE ALBERTO', '29935', '2019-05-16'),
	(42, 21, 2, 1152.00, 1, '2019-05-23 10:33:20', 2, 'JOLLY BOY DE JESUS', '29936', '2019-05-16'),
	(43, 61, 2, 952.00, 1, '2019-05-23 10:34:35', 2, 'MARILYN REDOBLE "B"', '29937', '2019-05-16'),
	(44, 85, 7, 340.00, 1, '2019-05-23 10:35:46', 2, 'VICENTE GEPOLAN', '29938', '2019-05-16'),
	(45, 35, 7, 340.00, 1, '2019-05-23 10:36:46', 2, 'EDGAR OBENITA', '29939', '2019-05-16'),
	(46, 105, 2, 6065.00, 1, '2019-05-23 10:41:59', 2, 'GENEVIEVE BRETT', '29940', '2019-05-16'),
	(47, 36, 2, 1412.00, 1, '2019-05-23 10:50:19', 2, 'JULIBETH KIKOY', '29941', '2019-05-16'),
	(48, 15, 2, 949.00, 1, '2019-05-23 10:51:56', 2, 'DANNY ESTREBELLO', '29942', '2019-05-16'),
	(49, 15, 2, 1382.00, 1, '2019-05-23 10:52:54', 2, 'WENDELL YAP "C"', '', '2019-05-16'),
	(50, 22, 2, 1800.00, 1, '2019-05-23 11:05:28', 2, 'GERLYN ALANGILAN', '29944', '2019-05-16'),
	(51, 35, 2, 1099.00, 1, '2019-05-23 11:06:41', 2, 'INIE GAROL', '29945', '2019-05-16'),
	(52, 5, 2, 222.00, 1, '2019-05-23 11:07:44', 2, 'JUVELYN SANCHEZ', '29946', '2019-05-16'),
	(53, 15, 2, 90.00, 1, '2019-05-23 11:08:52', 2, 'SAMUEL CASTILLO', '29947', '2019-05-16'),
	(54, 15, 2, 90.00, 1, '2019-05-23 11:10:22', 2, 'ZYA MARIE BANDIC', '29948', '2019-05-16'),
	(55, 15, 2, 192.00, 1, '2019-05-23 11:11:36', 2, 'ADELEN TORRES "B"', '29949', '2019-05-16'),
	(56, 15, 2, 207.00, 1, '2019-05-23 11:17:56', 2, 'RONEL HIJARA "B"', '29950', '2019-05-16'),
	(57, 53, 2, 1247.00, 1, '2019-05-23 11:28:08', 2, 'JAYLIN BALDADO "B"', '29951', '2019-05-16'),
	(58, 28, 2, 1189.00, 1, '2019-05-23 11:30:33', 2, 'JESOSA BATIANCILA', '29952', '2019-05-16'),
	(59, 40, 7, 340.00, 1, '2019-05-23 11:31:25', 2, 'ROLANDO PAQUIRA', '29953', '2019-05-16'),
	(60, 97, 2, 6722.00, 1, '2019-05-23 11:32:33', 2, 'JEORGE HINAYON', '29954', '2019-05-16'),
	(61, 7, 2, 693.00, 1, '2019-05-23 11:35:11', 2, 'LUCITO PACULANANG', '29955', '2019-05-17'),
	(62, 7, 2, 693.00, 1, '2019-05-23 11:36:29', 2, 'ASUNCIO EDIZA', '29956', '2019-05-17'),
	(63, 7, 2, 957.00, 1, '2019-05-23 11:37:39', 2, 'WELME DELA LE??A', '29957', '2019-05-17'),
	(64, 22, 2, 975.00, 1, '2019-05-23 11:38:51', 2, 'MARICAR CADILIG', '29958', '2019-05-17'),
	(65, 104, 2, 7515.00, 1, '2019-05-23 11:40:03', 2, 'RENANTE ESTORCO "B"', '29959', '2019-05-17'),
	(66, 22, 2, 1125.00, 1, '2019-05-23 11:41:08', 2, 'GLENNIS BABOR', '29960', '2019-05-17'),
	(67, 3, 2, 1249.00, 1, '2019-05-23 11:42:13', 2, 'RYAN DELAS VERLAS', '29961', '2019-05-17'),
	(68, 106, 2, 1345.00, 1, '2019-05-23 11:45:54', 2, 'LERY PALUMAR', '29962', '2019-05-17'),
	(69, 8, 2, 899.00, 1, '2019-05-23 11:46:57', 2, 'JASMIN PONTEROS', '29963', '2019-05-17'),
	(70, 40, 2, 1180.00, 1, '2019-05-23 11:48:12', 2, 'MA. AGNES CARBONA', '29964', '2019-05-17'),
	(71, 21, 2, 1400.00, 1, '2019-05-23 11:50:06', 2, 'MARITA BINARAO', '29965', '2019-05-17'),
	(72, 21, 2, 1180.00, 1, '2019-05-23 13:00:54', 2, 'ANTIRA MAHIPOS', '29966', '2019-05-17'),
	(73, 15, 2, 4405.00, 1, '2019-05-23 13:02:33', 2, 'ESTRELLITA SIA "B"', '29967', '2019-05-17'),
	(74, 15, 2, 396.00, 1, '2019-05-23 13:03:38', 2, 'ALICIA INDINO', '29968', '2019-05-17'),
	(75, 46, 2, 1152.00, 1, '2019-05-23 13:04:50', 2, 'RAD PANDAC', '29969', '2019-05-17'),
	(76, 8, 2, 2240.00, 1, '2019-05-23 13:06:15', 2, 'EMILY MAHINAY', '29970', '2019-05-17'),
	(77, 64, 7, 340.00, 1, '2019-05-23 13:07:25', 2, 'BONIFACIO ABUSO', '29971', '2019-05-17'),
	(78, 13, 7, 340.00, 1, '2019-05-23 13:08:33', 2, 'ARCHON CATACUTAN', '29972', '2019-05-17'),
	(79, 11, 2, 1152.00, 1, '2019-05-23 13:09:39', 2, 'LITECIA CHAVEZ "B"', '29973', '2019-05-17'),
	(80, 10, 2, 1306.00, 1, '2019-05-23 13:11:13', 2, 'GERLY SABANAL', '29974', '2019-05-17'),
	(81, 11, 2, 1522.00, 1, '2019-05-23 13:13:24', 2, 'RICE MILL c/o MARGIE CALUMBA', '29975', '2019-05-17'),
	(82, 70, 2, 899.00, 1, '2019-05-23 13:14:48', 2, 'JOAN TUBIAS', '29976', '2019-05-17'),
	(83, 70, 5, 532.00, 1, '2019-05-23 13:25:34', 2, 'Cash', '29977', '2019-05-17');
/*!40000 ALTER TABLE `transaction` ENABLE KEYS */;

-- Dumping structure for table nela_db.transaction_charges
DROP TABLE IF EXISTS `transaction_charges`;
CREATE TABLE IF NOT EXISTS `transaction_charges` (
  `ChargeId` int(11) NOT NULL AUTO_INCREMENT,
  `Amount` decimal(18,2) NOT NULL DEFAULT '0.00',
  `ShareHolderId` tinyint(4) NOT NULL DEFAULT '0',
  `TransTypeId` tinyint(4) NOT NULL DEFAULT '0',
  `COAId` smallint(6) DEFAULT NULL,
  PRIMARY KEY (`ChargeId`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- Dumping data for table nela_db.transaction_charges: ~8 rows (approximately)
DELETE FROM `transaction_charges`;
/*!40000 ALTER TABLE `transaction_charges` DISABLE KEYS */;
INSERT INTO `transaction_charges` (`ChargeId`, `Amount`, `ShareHolderId`, `TransTypeId`, `COAId`) VALUES
	(1, 0.00, 2, 2, 20),
	(3, 0.00, 1, 2, 28),
	(4, 1.00, 2, 4, 20),
	(5, 1.00, 1, 5, 29),
	(7, 1.00, 1, 6, 27),
	(8, 1.00, 1, 7, 24),
	(9, 1.00, 1, 7, 32),
	(10, 5000.00, 1, 7, 2);
/*!40000 ALTER TABLE `transaction_charges` ENABLE KEYS */;

-- Dumping structure for table nela_db.transaction_details
DROP TABLE IF EXISTS `transaction_details`;
CREATE TABLE IF NOT EXISTS `transaction_details` (
  `TransDetailId` int(11) NOT NULL AUTO_INCREMENT,
  `TransId` int(11) NOT NULL DEFAULT '0',
  `COAId` int(11) NOT NULL DEFAULT '0',
  `ShareHolderId` int(11) NOT NULL,
  `Amount` decimal(18,2) DEFAULT NULL,
  PRIMARY KEY (`TransDetailId`)
) ENGINE=InnoDB AUTO_INCREMENT=211 DEFAULT CHARSET=utf8;

-- Dumping data for table nela_db.transaction_details: ~210 rows (approximately)
DELETE FROM `transaction_details`;
/*!40000 ALTER TABLE `transaction_details` DISABLE KEYS */;
INSERT INTO `transaction_details` (`TransDetailId`, `TransId`, `COAId`, `ShareHolderId`, `Amount`) VALUES
	(1, 1, 20, 2, 1130.30),
	(2, 1, 25, 2, 100.00),
	(3, 1, 28, 1, 136.70),
	(4, 2, 20, 2, 1841.30),
	(5, 2, 25, 2, 100.00),
	(6, 2, 28, 1, 215.70),
	(7, 3, 20, 2, 1345.00),
	(8, 3, 28, 1, 90.00),
	(9, 4, 20, 2, 1569.50),
	(10, 4, 25, 2, 100.00),
	(11, 4, 28, 1, 185.50),
	(12, 5, 20, 2, 754.10),
	(13, 5, 25, 2, 100.00),
	(14, 5, 28, 1, 94.90),
	(15, 6, 20, 2, 3887.00),
	(16, 6, 25, 2, 100.00),
	(17, 6, 28, 1, 443.00),
	(18, 7, 20, 2, 1533.50),
	(19, 7, 25, 2, 100.00),
	(20, 7, 28, 1, 181.50),
	(21, 8, 29, 1, 495.00),
	(22, 9, 20, 2, 1110.50),
	(23, 9, 25, 2, 100.00),
	(24, 9, 28, 1, 134.50),
	(25, 10, 20, 2, 844.10),
	(26, 10, 25, 2, 100.00),
	(27, 10, 28, 1, 104.90),
	(28, 11, 20, 2, 1011.50),
	(29, 11, 25, 2, 100.00),
	(30, 11, 28, 1, 123.50),
	(31, 12, 20, 2, 1569.50),
	(32, 12, 25, 2, 100.00),
	(33, 12, 28, 1, 185.50),
	(34, 13, 20, 2, 1371.50),
	(35, 13, 25, 2, 100.00),
	(36, 13, 28, 1, 163.50),
	(37, 14, 20, 2, 1817.00),
	(38, 14, 25, 2, 100.00),
	(39, 14, 28, 1, 213.00),
	(40, 15, 24, 1, 100.00),
	(41, 15, 32, 1, 240.00),
	(42, 16, 25, 2, 2000.00),
	(43, 17, 24, 1, 100.00),
	(44, 17, 32, 1, 240.00),
	(45, 18, 20, 2, 42.00),
	(46, 18, 28, 1, 90.00),
	(47, 19, 28, 1, 90.00),
	(48, 20, 28, 1, 90.00),
	(49, 21, 28, 1, 90.00),
	(50, 22, 20, 2, 141.00),
	(51, 22, 28, 1, 90.00),
	(52, 23, 28, 1, 90.00),
	(53, 24, 20, 2, 75.00),
	(54, 24, 28, 1, 90.00),
	(55, 25, 20, 2, 570.00),
	(56, 25, 28, 1, 90.00),
	(57, 26, 20, 2, 471.00),
	(58, 26, 28, 1, 90.00),
	(59, 27, 20, 2, 709.10),
	(60, 27, 25, 2, 100.00),
	(61, 27, 28, 1, 89.90),
	(62, 28, 20, 2, 738.80),
	(63, 28, 25, 2, 100.00),
	(64, 28, 28, 1, 93.20),
	(65, 29, 20, 2, 962.00),
	(66, 29, 25, 2, 100.00),
	(67, 29, 28, 1, 118.00),
	(68, 30, 20, 2, 962.00),
	(69, 30, 25, 2, 100.00),
	(70, 30, 28, 1, 118.00),
	(71, 31, 20, 2, 2222.00),
	(72, 31, 25, 2, 100.00),
	(73, 31, 28, 1, 258.00),
	(74, 32, 20, 2, 2357.00),
	(75, 32, 25, 2, 100.00),
	(76, 32, 28, 1, 273.00),
	(77, 33, 20, 2, 887.30),
	(78, 33, 25, 2, 100.00),
	(79, 33, 28, 1, 109.70),
	(80, 34, 20, 2, 912.50),
	(81, 34, 25, 2, 100.00),
	(82, 34, 28, 1, 112.50),
	(83, 35, 20, 2, 2012.30),
	(84, 35, 25, 2, 100.00),
	(85, 35, 28, 1, 234.70),
	(86, 36, 20, 2, 912.50),
	(87, 36, 25, 2, 100.00),
	(88, 36, 28, 1, 112.50),
	(89, 37, 20, 2, 912.50),
	(90, 37, 25, 2, 100.00),
	(91, 37, 28, 1, 112.50),
	(92, 38, 20, 2, 1061.00),
	(93, 38, 25, 2, 100.00),
	(94, 38, 28, 1, 129.00),
	(95, 39, 20, 2, 1071.80),
	(96, 39, 25, 2, 100.00),
	(97, 39, 28, 1, 130.20),
	(98, 40, 20, 2, 5601.50),
	(99, 40, 25, 2, 100.00),
	(100, 40, 28, 1, 633.50),
	(101, 41, 24, 1, 100.00),
	(102, 41, 32, 1, 240.00),
	(103, 42, 20, 2, 936.80),
	(104, 42, 25, 2, 100.00),
	(105, 42, 28, 1, 115.20),
	(106, 43, 20, 2, 756.80),
	(107, 43, 25, 2, 100.00),
	(108, 43, 28, 1, 95.20),
	(109, 44, 24, 1, 100.00),
	(110, 44, 32, 1, 240.00),
	(111, 45, 24, 1, 100.00),
	(112, 45, 32, 1, 240.00),
	(113, 46, 20, 2, 5358.50),
	(114, 46, 25, 2, 100.00),
	(115, 46, 28, 1, 606.50),
	(116, 47, 20, 2, 1170.80),
	(117, 47, 25, 2, 100.00),
	(118, 47, 28, 1, 141.20),
	(119, 48, 20, 2, 754.10),
	(120, 48, 25, 2, 100.00),
	(121, 48, 28, 1, 94.90),
	(122, 49, 20, 2, 1143.80),
	(123, 49, 25, 2, 100.00),
	(124, 49, 28, 1, 138.20),
	(125, 50, 20, 2, 1520.00),
	(126, 50, 25, 2, 100.00),
	(127, 50, 28, 1, 180.00),
	(128, 51, 20, 2, 889.10),
	(129, 51, 25, 2, 100.00),
	(130, 51, 28, 1, 109.90),
	(131, 52, 25, 2, 100.00),
	(132, 52, 28, 1, 122.00),
	(133, 53, 28, 1, 90.00),
	(134, 54, 28, 1, 90.00),
	(135, 55, 25, 2, 100.00),
	(136, 55, 28, 1, 92.00),
	(137, 56, 25, 2, 100.00),
	(138, 56, 28, 1, 107.00),
	(139, 57, 20, 2, 1022.30),
	(140, 57, 25, 2, 100.00),
	(141, 57, 28, 1, 124.70),
	(142, 58, 20, 2, 970.10),
	(143, 58, 25, 2, 100.00),
	(144, 58, 28, 1, 118.90),
	(145, 59, 24, 1, 100.00),
	(146, 59, 32, 1, 240.00),
	(147, 60, 20, 2, 5949.80),
	(148, 60, 25, 2, 100.00),
	(149, 60, 28, 1, 672.20),
	(150, 61, 20, 2, 603.00),
	(151, 61, 28, 1, 90.00),
	(152, 62, 20, 2, 603.00),
	(153, 62, 28, 1, 90.00),
	(154, 63, 20, 2, 867.00),
	(155, 63, 28, 1, 90.00),
	(156, 64, 20, 2, 777.50),
	(157, 64, 25, 2, 100.00),
	(158, 64, 28, 1, 97.50),
	(159, 65, 20, 2, 6663.50),
	(160, 65, 25, 2, 100.00),
	(161, 65, 28, 1, 751.50),
	(162, 66, 20, 2, 912.50),
	(163, 66, 25, 2, 100.00),
	(164, 66, 28, 1, 112.50),
	(165, 67, 20, 2, 1024.10),
	(166, 67, 25, 2, 100.00),
	(167, 67, 28, 1, 124.90),
	(168, 68, 20, 2, 1110.50),
	(169, 68, 25, 2, 100.00),
	(170, 68, 28, 1, 134.50),
	(171, 69, 20, 2, 709.10),
	(172, 69, 25, 2, 100.00),
	(173, 69, 28, 1, 89.90),
	(174, 70, 20, 2, 962.00),
	(175, 70, 25, 2, 100.00),
	(176, 70, 28, 1, 118.00),
	(177, 71, 20, 2, 1160.00),
	(178, 71, 25, 2, 100.00),
	(179, 71, 28, 1, 140.00),
	(180, 72, 20, 2, 962.00),
	(181, 72, 25, 2, 100.00),
	(182, 72, 28, 1, 118.00),
	(183, 73, 20, 2, 3864.50),
	(184, 73, 25, 2, 100.00),
	(185, 73, 28, 1, 440.50),
	(186, 74, 25, 2, 100.00),
	(187, 74, 28, 1, 296.00),
	(188, 75, 20, 2, 936.80),
	(189, 75, 25, 2, 100.00),
	(190, 75, 28, 1, 115.20),
	(191, 76, 20, 2, 1916.00),
	(192, 76, 25, 2, 100.00),
	(193, 76, 28, 1, 224.00),
	(194, 77, 24, 1, 100.00),
	(195, 77, 32, 1, 240.00),
	(196, 78, 24, 1, 100.00),
	(197, 78, 32, 1, 240.00),
	(198, 79, 20, 2, 936.80),
	(199, 79, 25, 2, 100.00),
	(200, 79, 28, 1, 115.20),
	(201, 80, 20, 2, 1075.40),
	(202, 80, 25, 2, 100.00),
	(203, 80, 28, 1, 130.60),
	(204, 81, 20, 2, 1269.80),
	(205, 81, 25, 2, 100.00),
	(206, 81, 28, 1, 152.20),
	(207, 82, 20, 2, 709.10),
	(208, 82, 25, 2, 100.00),
	(209, 82, 28, 1, 89.90),
	(210, 83, 29, 1, 532.00);
/*!40000 ALTER TABLE `transaction_details` ENABLE KEYS */;

-- Dumping structure for table nela_db.transaction_log
DROP TABLE IF EXISTS `transaction_log`;
CREATE TABLE IF NOT EXISTS `transaction_log` (
  `TransLogID` int(11) NOT NULL AUTO_INCREMENT,
  `Details` varchar(200) NOT NULL DEFAULT '0',
  `TransDate` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `UserId` int(11) NOT NULL,
  PRIMARY KEY (`TransLogID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table nela_db.transaction_log: ~0 rows (approximately)
DELETE FROM `transaction_log`;
/*!40000 ALTER TABLE `transaction_log` DISABLE KEYS */;
/*!40000 ALTER TABLE `transaction_log` ENABLE KEYS */;

-- Dumping structure for table nela_db.transaction_status
DROP TABLE IF EXISTS `transaction_status`;
CREATE TABLE IF NOT EXISTS `transaction_status` (
  `TransStatId` tinyint(4) NOT NULL AUTO_INCREMENT,
  `Description` varchar(50) NOT NULL,
  PRIMARY KEY (`TransStatId`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- Dumping data for table nela_db.transaction_status: ~4 rows (approximately)
DELETE FROM `transaction_status`;
/*!40000 ALTER TABLE `transaction_status` DISABLE KEYS */;
INSERT INTO `transaction_status` (`TransStatId`, `Description`) VALUES
	(1, 'Posted'),
	(2, 'Closed'),
	(3, 'Cancelled'),
	(4, 'Adjusted');
/*!40000 ALTER TABLE `transaction_status` ENABLE KEYS */;

-- Dumping structure for table nela_db.transaction_type
DROP TABLE IF EXISTS `transaction_type`;
CREATE TABLE IF NOT EXISTS `transaction_type` (
  `TransTypeId` tinyint(4) NOT NULL AUTO_INCREMENT,
  `Description` varchar(50) NOT NULL,
  PRIMARY KEY (`TransTypeId`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- Dumping data for table nela_db.transaction_type: ~6 rows (approximately)
DELETE FROM `transaction_type`;
/*!40000 ALTER TABLE `transaction_type` DISABLE KEYS */;
INSERT INTO `transaction_type` (`TransTypeId`, `Description`) VALUES
	(2, 'LABOR'),
	(3, 'LOAN PAYMENT'),
	(4, 'VOUCHER FOR ELECTRICIAN'),
	(5, 'MISCELLANEOUS INCOME'),
	(6, 'OPTIONAL FUND'),
	(7, 'RENEWAL');
/*!40000 ALTER TABLE `transaction_type` ENABLE KEYS */;

-- Dumping structure for table nela_db.user
DROP TABLE IF EXISTS `user`;
CREATE TABLE IF NOT EXISTS `user` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `full_name` varchar(100) DEFAULT NULL,
  `user_name` varchar(25) DEFAULT NULL,
  `password` varchar(500) DEFAULT NULL,
  `gender` int(11) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- Dumping data for table nela_db.user: ~2 rows (approximately)
DELETE FROM `user`;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` (`user_id`, `full_name`, `user_name`, `password`, `gender`) VALUES
	(1, 'ADMINISTRATOR', 'w', 'f1290186a5d0b1ceab27f4e77c0c5d68', 1),
	(2, 'CLINTON VAILOCES', 'clinton', '14b13c8dfec3420156262ecea203332b', 1);
/*!40000 ALTER TABLE `user` ENABLE KEYS */;

-- Dumping structure for table nela_db.user_group
DROP TABLE IF EXISTS `user_group`;
CREATE TABLE IF NOT EXISTS `user_group` (
  `grp_id` int(11) NOT NULL AUTO_INCREMENT,
  `grp_desc` varchar(50) NOT NULL DEFAULT '0',
  PRIMARY KEY (`grp_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- Dumping data for table nela_db.user_group: ~0 rows (approximately)
DELETE FROM `user_group`;
/*!40000 ALTER TABLE `user_group` DISABLE KEYS */;
INSERT INTO `user_group` (`grp_id`, `grp_desc`) VALUES
	(1, 'ADMINISTRATOR');
/*!40000 ALTER TABLE `user_group` ENABLE KEYS */;

-- Dumping structure for table nela_db.user_group_assigned
DROP TABLE IF EXISTS `user_group_assigned`;
CREATE TABLE IF NOT EXISTS `user_group_assigned` (
  `user_grp_assigned_id` tinyint(4) NOT NULL AUTO_INCREMENT,
  `grp_id` tinyint(4) NOT NULL DEFAULT '0',
  `user_id` tinyint(4) NOT NULL DEFAULT '0',
  PRIMARY KEY (`user_grp_assigned_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- Dumping data for table nela_db.user_group_assigned: ~2 rows (approximately)
DELETE FROM `user_group_assigned`;
/*!40000 ALTER TABLE `user_group_assigned` DISABLE KEYS */;
INSERT INTO `user_group_assigned` (`user_grp_assigned_id`, `grp_id`, `user_id`) VALUES
	(1, 1, 1),
	(2, 1, 2);
/*!40000 ALTER TABLE `user_group_assigned` ENABLE KEYS */;

-- Dumping structure for table nela_db.user_group_privilege
DROP TABLE IF EXISTS `user_group_privilege`;
CREATE TABLE IF NOT EXISTS `user_group_privilege` (
  `grp_privilege_id` tinyint(4) NOT NULL AUTO_INCREMENT,
  `grp_id` tinyint(4) NOT NULL DEFAULT '0',
  `privilege_id` tinyint(4) NOT NULL DEFAULT '0',
  PRIMARY KEY (`grp_privilege_id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- Dumping data for table nela_db.user_group_privilege: ~7 rows (approximately)
DELETE FROM `user_group_privilege`;
/*!40000 ALTER TABLE `user_group_privilege` DISABLE KEYS */;
INSERT INTO `user_group_privilege` (`grp_privilege_id`, `grp_id`, `privilege_id`) VALUES
	(1, 1, 1),
	(2, 1, 2),
	(3, 1, 3),
	(4, 1, 4),
	(5, 1, 5),
	(6, 1, 6),
	(7, 1, 7);
/*!40000 ALTER TABLE `user_group_privilege` ENABLE KEYS */;

-- Dumping structure for table nela_db.user_privilege
DROP TABLE IF EXISTS `user_privilege`;
CREATE TABLE IF NOT EXISTS `user_privilege` (
  `privilege_id` tinyint(4) NOT NULL AUTO_INCREMENT,
  `privilege_desc` varchar(100) DEFAULT NULL,
  `class_path` varchar(100) DEFAULT NULL,
  `type` tinyint(4) DEFAULT NULL,
  `menu_item_id` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`privilege_id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- Dumping data for table nela_db.user_privilege: ~7 rows (approximately)
DELETE FROM `user_privilege`;
/*!40000 ALTER TABLE `user_privilege` DISABLE KEYS */;
INSERT INTO `user_privilege` (`privilege_id`, `privilege_desc`, `class_path`, `type`, `menu_item_id`) VALUES
	(1, 'Allow to Manage Accounts', 'app.view.user.UserAccountManage', 2, 1),
	(2, 'Allow to Manage User Group Privileges', 'app.view.user.GroupPrivileges', 1, 2),
	(3, 'Allow to Manage Chart of Accounts', 'app.view.coa.MainFrameCoa', 1, 3),
	(4, 'Allow to Manage Electrician Records', 'app.view.electrician.MainFrameElectrician', 1, 4),
	(5, 'Allow to Manage Charges/Services Setup', 'app.view.cssetup.transtype.MainFrameCSSetup', 1, 5),
	(6, 'Allow to Create New Transaction', 'app.view.transaction.CreateTrans', 1, 6),
	(7, 'Allow to Manage Transactions', 'app.view.transaction.manage.ManageTrans', 1, 7);
/*!40000 ALTER TABLE `user_privilege` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
