package com.dynamicdatasource.mybatisConfig;
import com.Logger;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

import javax.sql.DataSource;

public class MyRoutingDataSource extends AbstractRoutingDataSource{
    private DataSource getDataSource(){
        MultiDataSourceManager manager = MultiDataSourceManager.getManager();
        return manager.peek();
    };
    @Override
    protected Object determineCurrentLookupKey() {
        //DataSource dataSource = getDataSource();
        //key = dataSource.name
        String dataSource = DynamicDataSourceContextHolder.getDataSource();
        Logger.info("返回数据："+dataSource);
        return dataSource;
    }
}
