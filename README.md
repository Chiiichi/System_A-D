# 系统分析与设计 —— GuitarV3

System Analysis and Design practices.


## 描述： ##

- 采用OOD方法，主要业务逻辑由对象模型完成，有针对模型的测试程序。
- web界面实现用户查询，吉他添加和删除。
- 可以只使用servlet或者其他框架，要求servlet或action中依赖数据访问层的接口而非实现，使用工厂模式实现DAO层实例化。
- 使用jdbc或者ORM工具将对象持久化到数据库。
- 分别实现sqliteDAO和mysqlDAO。

## 结果示例 ##

### 添加吉他 ###

![添加吉他](http://o7s15t2uh.bkt.clouddn.com/System_A-D-GuitarV3-001.png)

添加结果：

![添加结果](http://o7s15t2uh.bkt.clouddn.com/System_A-D-GuitarV3-002.png)