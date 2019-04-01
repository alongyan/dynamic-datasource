# dynamic-dataSource 
基于自定义注解的动态数据源配置以及使用
spring boot + mybatis-plus 动态数据源配置

## 原理
Spring内置了一个AbstractRoutingDataSource，它可以把多个数据源配置成一个Map，然后，根据不同的key返回不同的数据源。因为AbstractRoutingDataSource也是一个DataSource接口，因此，应用程序可以先设置好key， 访问数据库的代码就可以从AbstractRoutingDataSource拿到对应的一个真实的数据源，从而访问指定的数据库。  

利用自定义注解动态的设置数据源key，从而实现动态数据源切换。  

动态数据源在主从数据库有着广泛的运用。
## 参考文档
https://my.oschina.net/maojindaoGG/blog/1636147