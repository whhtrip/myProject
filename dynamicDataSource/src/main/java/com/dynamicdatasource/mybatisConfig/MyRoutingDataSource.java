package com.dynamicdatasource.mybatisConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

import javax.sql.DataSource;

public class MyRoutingDataSource extends AbstractRoutingDataSource{
    Logger logger = LoggerFactory.getLogger(MyRoutingDataSource.class);
    private DataSource getDataSource(){
        MultiDataSourceManager manager = MultiDataSourceManager.getManager();
        return manager.peek();
    };
    @Override
    protected Object determineCurrentLookupKey() {
        //DataSource dataSource = getDataSource();
        //key = dataSource.name
        //String dataSource = DynamicDataSourceContextHolder.getDataSource();
       //logger.info("获取的数据源是："+dataSource);
        return "dataSource1";
    }
}
