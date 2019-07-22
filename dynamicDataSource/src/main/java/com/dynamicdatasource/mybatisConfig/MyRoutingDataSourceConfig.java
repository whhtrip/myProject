package com.dynamicdatasource.mybatisConfig;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;
@Configuration
public class MyRoutingDataSourceConfig {
    private static Logger logger  = LoggerFactory.getLogger(MyRoutingDataSourceConfig.class);
static{
    logger.info("开始创建多数据源工厂");
}
    @Resource(name = "dataSource1")
    DataSource dataSource1;
    @Resource(name = "dataSource2")
    DataSource dataSource2;

    @Bean(name = "routingDataSource")
    public MyRoutingDataSource setRoutDataSource(){
        logger.info("开始创建RoutDataSource");
        MyRoutingDataSource myRoutingDataSource = new MyRoutingDataSource();
        Map<Object,Object> datasourceMap = new HashMap<>();
        datasourceMap.put("dataSource1",dataSource1);
        datasourceMap.put("dataSource2",dataSource2);
        myRoutingDataSource.setTargetDataSources(datasourceMap);
        myRoutingDataSource.setDefaultTargetDataSource(dataSource1);
        logger.info("数据源注入到动态数据源中："+myRoutingDataSource);
        logger.info("默认使用的数据源是："+dataSource1);
        return myRoutingDataSource;
    }
}
