/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 80011
Source Host           : localhost:3306
Source Database       : springboot

Target Server Type    : MYSQL
Target Server Version : 80011
File Encoding         : 65001

Date: 2019-01-22 11:06:38
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for girl
-- ----------------------------
DROP TABLE IF EXISTS `girl`;
CREATE TABLE `girl` (
  `id` int(11) NOT NULL,
  `age` int(11) DEFAULT NULL,
  `name` varchar(32) DEFAULT NULL,
  `height` double(32,0) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of girl
-- ----------------------------
INSERT INTO `girl` VALUES ('1', '23', 'te', '124');
INSERT INTO `girl` VALUES ('2', '53', 'hb', '43');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(32) DEFAULT NULL,
  `password` varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('2', 'admin', '$2a$10$2iBMsPjyXLJtoMu9.EnsrOmHzBCJz.TaZyoMaXQK3Yl/ovvSS/VzK');
