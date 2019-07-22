package com.dynamicdatasource.mybatisConfig;




import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DatasourceConfig {
    static final  String PACKAGE = "com.dynamicdatasource.ssm1.mapper";
    static final String MAPPER_LOCATION="classpath:com/dynamicdatasource/ssm1/com.dynamicdatasource.ssm1.mapper/*Mapper1.xml";
    static Logger logger = LoggerFactory.getLogger(DatasourceConfig.class);
    @Bean(name = "dataSource1")
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource setDataSource1(){
        logger.info("开始加载数据源1");
      /*  DataSource dataSource = DataSourceBuilder.create().driverClassName("com.mysql.jdbc.Driver")
                .url("jdbc:mysql://localhost:3306/test?serverTimezone=UTC&useUnicode=true&characterEncoding=UTF-8")
                .username("root")
                .password("root")
                .build();
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        druidDataSource.setUrl("jdbc:mysql://localhost:3306/test?serverTimezone=UTC&useUnicode=true&characterEncoding=UTF-8");
        druidDataSource.setPassword("root");
        druidDataSource.setUsername("root");
        logger.info("创建数据源"+dataSource);
        logger.info("创建数据源"+druidDataSource);*/
        DataSource dataSource = DataSourceBuilder.create().build();
        logger.info("加载数据源1成功："+dataSource);
        return dataSource;
    }

    /**
     * 第二个数据源配置
     * @return
     */
    @Bean(name = "dataSource2")
    @ConfigurationProperties(prefix = "spring.datasource2")
    public DataSource setDataSource2(){
        logger.info("开始加载数据源2");
        /*DataSource dataSource = DataSourceBuilder.create().driverClassName("com.mysql.jdbc.Driver")
                .url("jdbc:mysql://localhost:3306/whh?serverTimezone=UTC&useUnicode=true&characterEncoding=UTF-8")
                .username("root")
                .password("root")
                .build();
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        druidDataSource.setUrl("jdbc:mysql://localhost:3306/whh?serverTimezone=UTC&useUnicode=true&characterEncoding=UTF-8");
        druidDataSource.setPassword("root");
        druidDataSource.setUsername("root");
        logger.info("创建数据源"+dataSource);
        logger.info("创建数据源"+druidDataSource);*/
        DataSource dataSource2 = DataSourceBuilder.create().build();
        logger.info("数据源2加载成功："+dataSource2);
        return dataSource2;
    }
}
