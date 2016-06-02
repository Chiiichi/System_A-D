# 系统分析与设计 —— GuitarV2

System Analysis and Design practices.


## 描述： ##

- 采用OOD方法，主要业务逻辑由对象模型完成
- web界面实现用户查询和查询结果输出
- 可以只使用servlet或者其他框架
- 使用jdbc或者ORM工具将对象持久化到数据库
- 数据库请使用sqllite或者access等单机版数据库

## 实现 ##

### 1.Guitar属性数据表 ###

![Guitar数据](http://o7s15t2uh.bkt.clouddn.com/System_A-D-GuitarV2-001.png)

### 2.运行结果示例 ###

#### 按系列查询： ####

示例：查询9588系列

![Guitar数据](http://o7s15t2uh.bkt.clouddn.com/System_A-D-GuitarV2-002.png)

查询结果：

![](http://o7s15t2uh.bkt.clouddn.com/System_A-D-GuitarV2-003.png)

#### 按价格查询 ####

示例：查询价格为865

![](http://o7s15t2uh.bkt.clouddn.com/System_A-D-GuitarV2-004.png)

查询结果：

![](http://o7s15t2uh.bkt.clouddn.com/System_A-D-GuitarV2-005.png)

#### 按材质查询 ####

示例：查询背材为merbau木材

![](http://o7s15t2uh.bkt.clouddn.com/System_A-D-GuitarV2-006.png)

查询结果:

![](http://o7s15t2uh.bkt.clouddn.com/System_A-D-GuitarV2-007.png)

>其他查询方式省略