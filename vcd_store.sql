/*
 Navicat Premium Data Transfer

 Source Server         : 服务器
 Source Server Type    : MySQL
 Source Server Version : 50741
 Source Host           : 49.235.84.94:3307
 Source Schema         : vcd_store

 Target Server Type    : MySQL
 Target Server Version : 50741
 File Encoding         : 65001

 Date: 25/06/2023 18:22:50
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for Client
-- ----------------------------
DROP TABLE IF EXISTS `Client`;
CREATE TABLE `Client`  (
  `Cno` int(10) NOT NULL AUTO_INCREMENT COMMENT '客户编号',
  `Cnum` char(11) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL COMMENT '联系电话',
  `Cpwd` char(11) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL COMMENT '客户密码',
  `Cname` char(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '客户姓名',
  `root` int(1) NOT NULL COMMENT '是否是管理员,1代表是',
  PRIMARY KEY (`Cno`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 29 CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of Client
-- ----------------------------
INSERT INTO `Client` VALUES (1, '123456', '123456', 'root', 1);
INSERT INTO `Client` VALUES (13, '17584962578', 'sha157465', 'linjie', 0);
INSERT INTO `Client` VALUES (14, '18569752147', 'asdjkq456', 'alsi', 0);
INSERT INTO `Client` VALUES (15, '17268492574', 'sl789q', '阿萨德', 0);
INSERT INTO `Client` VALUES (16, '18579234581', 'asd2131872', 'kaer', 0);
INSERT INTO `Client` VALUES (17, '13478521965', 'oi131456', '凯恩', 0);
INSERT INTO `Client` VALUES (18, '14987526348', 'as12316545', 'messi', 0);
INSERT INTO `Client` VALUES (19, '13875426985', '5826asd', 'c罗', 0);
INSERT INTO `Client` VALUES (20, '17798524631', 'sp87592', '哈兰德', 0);
INSERT INTO `Client` VALUES (21, '17956842358', '123qwer', 'kate', 0);
INSERT INTO `Client` VALUES (22, '16387263784', 'nudsld', '善逸', 0);
INSERT INTO `Client` VALUES (23, '13856987425', 'apo54826', 'lite', 0);
INSERT INTO `Client` VALUES (24, '19324764590', 'poiuqwer', '蝴蝶忍', 0);
INSERT INTO `Client` VALUES (25, '15823964857', 'mack123', 'mack', 0);
INSERT INTO `Client` VALUES (26, '18334034785', 'jack123', 'jack', 0);
INSERT INTO `Client` VALUES (27, '123', '123', '123', 0);

-- ----------------------------
-- Table structure for Hire
-- ----------------------------
DROP TABLE IF EXISTS `Hire`;
CREATE TABLE `Hire`  (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `Vno` char(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT 'VCD编号',
  `Cno` char(10) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL COMMENT '客户编号',
  `Hprice` decimal(10, 2) NULL DEFAULT NULL COMMENT '押金',
  `Hamount` int(11) NOT NULL COMMENT '借出数量',
  `Htime` datetime(0) NOT NULL COMMENT '借出时间',
  `Rdate` date NOT NULL COMMENT '归还日期',
  `Vstate` char(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '状态',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 46 CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of Hire
-- ----------------------------
INSERT INTO `Hire` VALUES (40, '119283', '123', 240.00, 12, '2023-03-02 00:00:00', '2023-03-02', '已归还');
INSERT INTO `Hire` VALUES (41, '119283', 'error', 2000.00, 100, '2023-06-25 00:00:00', '2023-06-25', '已归还');
INSERT INTO `Hire` VALUES (42, '123432', '123', 2000.00, 100, '2023-06-25 00:00:00', '2023-06-25', '已归还');
INSERT INTO `Hire` VALUES (43, '238467', '123', 6000.00, 300, '2023-03-02 00:00:00', '2023-03-02', '借出');
INSERT INTO `Hire` VALUES (45, '428390', 'jack', 400.00, 20, '2023-06-25 00:00:00', '2023-06-25', '借出');

-- ----------------------------
-- Table structure for Sell
-- ----------------------------
DROP TABLE IF EXISTS `Sell`;
CREATE TABLE `Sell`  (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `Vno` char(10) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL COMMENT 'VCD编号',
  `Cno` char(10) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL COMMENT '客户编号',
  `Samount` int(11) NOT NULL COMMENT '销售数量',
  `Stime` datetime(0) NOT NULL COMMENT '销售时间',
  `Sprice` decimal(10, 2) NOT NULL COMMENT '价格',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 23 CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of Sell
-- ----------------------------
INSERT INTO `Sell` VALUES (19, '119283', '123', 100, '2023-06-25 00:00:00', 2220.00);
INSERT INTO `Sell` VALUES (20, '198273', '123', 100, '2023-06-25 00:00:00', 1520.00);
INSERT INTO `Sell` VALUES (22, '483716', 'jack', 120, '2023-06-25 00:00:00', 2328.00);

-- ----------------------------
-- Table structure for Stock
-- ----------------------------
DROP TABLE IF EXISTS `Stock`;
CREATE TABLE `Stock`  (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `Vno` char(10) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL COMMENT 'VCD编号',
  `InTime` datetime(0) NOT NULL COMMENT '入库时间',
  `InAmount` int(11) NOT NULL COMMENT '入库数量',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 8 CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of Stock
-- ----------------------------
INSERT INTO `Stock` VALUES (1, '123', '2012-02-03 00:00:00', 50);
INSERT INTO `Stock` VALUES (2, '119283', '2023-06-24 00:00:00', 30);
INSERT INTO `Stock` VALUES (3, '119283', '2023-06-24 00:00:00', 30);
INSERT INTO `Stock` VALUES (4, '119283', '2023-06-24 00:00:00', 30);
INSERT INTO `Stock` VALUES (5, '119283', '2023-06-24 00:00:00', 20);
INSERT INTO `Stock` VALUES (6, '119283', '2023-06-24 00:00:00', 54);
INSERT INTO `Stock` VALUES (7, '119283', '2023-06-24 00:00:00', 1);

-- ----------------------------
-- Table structure for VCD
-- ----------------------------
DROP TABLE IF EXISTS `VCD`;
CREATE TABLE `VCD`  (
  `Vno` int(10) NOT NULL COMMENT 'VCD编号',
  `Vname` char(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT 'VCD名称',
  `Actor` char(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '主演',
  `Price` decimal(10, 2) NOT NULL COMMENT '价格',
  `Vtype` char(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '类型',
  `Amount` int(11) NOT NULL COMMENT '库存数量',
  PRIMARY KEY (`Vno`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of VCD
-- ----------------------------
INSERT INTO `VCD` VALUES (119283, '后天', '达尼斯', 22.20, '剧情', 6350);
INSERT INTO `VCD` VALUES (123432, '绿皮书', '维果', 12.20, '喜剧', 21462);
INSERT INTO `VCD` VALUES (123452, '怦然心动', '卡罗尔', 27.32, '剧情', 35409);
INSERT INTO `VCD` VALUES (192832, '遗愿清单', '西恩海耶斯', 15.80, '剧情', 79077);
INSERT INTO `VCD` VALUES (198273, '海上钢琴师', '阿喀尔', 15.20, '爱情', 1334);
INSERT INTO `VCD` VALUES (213864, '鬼灭之刃', '嘴平伊之助', 18.90, '喜剧', 265);
INSERT INTO `VCD` VALUES (238463, '龙猫', '日高法子', 17.54, '喜剧', 10164);
INSERT INTO `VCD` VALUES (238467, '教父', '马龙白兰度', 23.98, '犯罪', 30467);
INSERT INTO `VCD` VALUES (292872, '这么多年', '孙千', 15.10, '爱情', 355);
INSERT INTO `VCD` VALUES (324233, '霸王别姬', '张国荣', 20.90, '剧情', 2252);
INSERT INTO `VCD` VALUES (328463, '无间道', '梁朝伟', 23.09, '剧情', 10264);
INSERT INTO `VCD` VALUES (384682, '楚门的世界', '金凯瑞', 23.87, '剧情', 21787);
INSERT INTO `VCD` VALUES (392817, '红海行动', '张译', 15.60, '犯罪', 464);
INSERT INTO `VCD` VALUES (394856, '触不可及', '奥玛赛', 13.60, '喜剧', 35689);
INSERT INTO `VCD` VALUES (398372, '白日梦想家', '本斯蒂勒', 19.90, '剧情', 21463);
INSERT INTO `VCD` VALUES (428390, '盗梦空间', '莱昂纳多', 17.92, '悬疑', 19244);
INSERT INTO `VCD` VALUES (452738, '心灵捕手', '马特达蒙', 29.70, '剧情', 465);
INSERT INTO `VCD` VALUES (473628, '肖申克的救赎', '蒂姆罗宾斯', 22.30, '犯罪', 355);
INSERT INTO `VCD` VALUES (482391, '失控玩家', '瑞安雷诺兹', 18.80, '犯罪', 355);
INSERT INTO `VCD` VALUES (483716, '无名', '梁朝伟', 19.40, '悬疑', 32255);
INSERT INTO `VCD` VALUES (698372, '金刚川', '吴京', 22.90, '剧情', 43666);
INSERT INTO `VCD` VALUES (761823, '生化危机', '米拉', 17.70, '悬疑', 355);
INSERT INTO `VCD` VALUES (823632, '千与千寻', '入野自由', 18.39, '喜剧', 54);
INSERT INTO `VCD` VALUES (873954, '泰坦尼克号', '莱昂纳多', 23.09, '爱情', 264);
INSERT INTO `VCD` VALUES (937282, '疯狂动物成', '金妮弗', 16.22, '喜剧', 602);
INSERT INTO `VCD` VALUES (982763, '死寂', '迈克尔曼', 19.20, '悬疑', 21904);

-- ----------------------------
-- View structure for v_Hire_Sell
-- ----------------------------
DROP VIEW IF EXISTS `v_Hire_Sell`;
CREATE ALGORITHM = UNDEFINED SQL SECURITY DEFINER VIEW `v_Hire_Sell` AS select `VCD`.`Vtype` AS `Vtype`,sum(`Hire`.`Hamount`) AS `Hire_count`,sum(`Sell`.`Samount`) AS `Sell_count`,sum((case when (`Hire`.`Vstate` = '已归还') then `Hire`.`Hamount` else 0 end)) AS `return_count` from ((`VCD` left join `Hire` on((`VCD`.`Vno` = `Hire`.`Vno`))) left join `Sell` on((`VCD`.`Vno` = `Sell`.`Vno`))) group by `VCD`.`Vtype`;

-- ----------------------------
-- Records of VCD
-- ----------------------------
INSERT INTO `VCD` VALUES ('剧情', 112, 200, 112);
INSERT INTO `VCD` VALUES ('喜剧', 100, NULL, 100);
INSERT INTO `VCD` VALUES ('悬疑', 20, 120, 0);
INSERT INTO `VCD` VALUES ('爱情', NULL, 100, 0);
INSERT INTO `VCD` VALUES ('犯罪', 300, NULL, 0);

-- ----------------------------
-- Procedure structure for sales_rental_returns
-- ----------------------------
DROP PROCEDURE IF EXISTS `sales_rental_returns`;
delimiter ;;
CREATE PROCEDURE `sales_rental_returns`(IN month_year VARCHAR(10))
BEGIN
    SELECT 
        SUM(CASE WHEN MONTH(Htime) = MONTH(month_year) THEN Hamount ELSE 0 END) AS rental_amount,
        SUM(CASE WHEN MONTH(Stime) = MONTH(month_year) THEN Samount ELSE 0 END) AS sales_amount,
        SUM(CASE WHEN MONTH(Rdate) = MONTH(month_year) THEN Hamount ELSE 0 END) AS return_amount
    FROM Hire
    LEFT JOIN Sell ON Hire.Cno = Sell.Cno AND Hire.Vno = Sell.Vno
    WHERE (MONTH(Htime) = MONTH(month_year) OR MONTH(Stime) = MONTH(month_year) OR MONTH(Rdate) = MONTH(month_year))
    AND (Hstate = '借出' OR Vstate = '已售');
END
;;
delimiter ;

-- ----------------------------
-- Triggers structure for table Hire
-- ----------------------------
DROP TRIGGER IF EXISTS `trg_Hire_Out`;
delimiter ;;
CREATE TRIGGER `trg_Hire_Out` AFTER INSERT ON `Hire` FOR EACH ROW BEGIN
		UPDATE VCD 
		SET Amount = Amount - NEW.Hamount 
	WHERE
	Vno = NEW.Vno;
END
;;
delimiter ;

-- ----------------------------
-- Triggers structure for table Hire
-- ----------------------------
DROP TRIGGER IF EXISTS `trg_Hire_In`;
delimiter ;;
CREATE TRIGGER `trg_Hire_In` AFTER UPDATE ON `Hire` FOR EACH ROW BEGIN
		UPDATE VCD 
		SET Amount = Amount + NEW.Hamount 
	WHERE
	Vno = NEW.Vno;
END
;;
delimiter ;

-- ----------------------------
-- Triggers structure for table Sell
-- ----------------------------
DROP TRIGGER IF EXISTS `trg_Sell_Out`;
delimiter ;;
CREATE TRIGGER `trg_Sell_Out` AFTER INSERT ON `Sell` FOR EACH ROW BEGIN
		UPDATE VCD 
		SET Amount = Amount - NEW.Samount 
	WHERE
	Vno = NEW.Vno;
END
;;
delimiter ;

SET FOREIGN_KEY_CHECKS = 1;
