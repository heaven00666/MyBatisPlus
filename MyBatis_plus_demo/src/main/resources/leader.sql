/*
 Navicat Premium Data Transfer

 Source Server         : Mysql
 Source Server Type    : MySQL
 Source Server Version : 80028
 Source Host           : localhost:3306
 Source Schema         : mysql

 Target Server Type    : MySQL
 Target Server Version : 80028
 File Encoding         : 65001

 Date: 14/10/2022 14:38:25
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for leader
-- ----------------------------
DROP TABLE IF EXISTS `leader`;
CREATE TABLE `leader`  (
  `id` int(0) NOT NULL,
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `score` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `time` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of leader
-- ----------------------------
INSERT INTO `leader` VALUES (1, 'tom', '66', '2022-10-05 13:37:45');
INSERT INTO `leader` VALUES (2, 'ti', '68', '2022-10-05 13:37:48');
INSERT INTO `leader` VALUES (3, 'fa', '99', '2022-10-06 13:37:45');
INSERT INTO `leader` VALUES (10, 'jack10', '98', '2022-10-20 00:00:00');
INSERT INTO `leader` VALUES (11, 'jack11', '100', '2022-10-08 00:00:00');
INSERT INTO `leader` VALUES (12, 'jack12', '93', '2022-10-14 05:00:00');
INSERT INTO `leader` VALUES (13, 'jack13', '44', '2022-10-29 00:00:00');
INSERT INTO `leader` VALUES (14, 'jack14', '66', '2022-10-14 03:00:00');
INSERT INTO `leader` VALUES (15, 'jack15', '33', '2022-10-02 00:00:00');
INSERT INTO `leader` VALUES (26, 'jack26', '96', '2022-10-14 00:00:00');
INSERT INTO `leader` VALUES (103, 'jack103', '98', '2022-10-03 06:00:00');
INSERT INTO `leader` VALUES (104, 'jack104', '80', '2022-10-14 00:00:00');
INSERT INTO `leader` VALUES (105, 'jack105', '88', '2022-10-21 04:00:00');

SET FOREIGN_KEY_CHECKS = 1;
