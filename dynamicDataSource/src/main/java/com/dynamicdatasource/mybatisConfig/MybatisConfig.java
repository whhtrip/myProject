package com.dynamicdatasource.mybatisConfig;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@Configuration
//@ComponentScan
@MapperScan(value = "com.dynamicdatasource.ssm1.mapper", sqlSessionFactoryRef = "sqlSessionFactory")
public class MybatisConfig {
    static Logger logger = LoggerFactory.getLogger(MybatisConfig.class);
    //@Resource(name ="dataSource1")
    @Resource(name="dataSource1")
    DataSource dataSource1;
    @Resource(name="dataSource2")
    DataSource dataSource2;
    @Resource(name = "routingDataSource")
    MyRoutingDataSource myRoutingDataSource;

    @Bean(name = "sqlSessionFactory")
    public SqlSessionFactoryBean setSqlSessionFactory1() throws Exception {
        logger.info("开始创建数据源工厂");
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(myRoutingDataSource);//classpath:com/fairyland/jdp/**/*Mapper.xml
        //org.springframework.core.io.Resource[] resources = new PathMatchingResourcePatternResolver().getResources("classpath:com/mapper/*Mapper.xml");
       /* logger.info("加载资源："+resources);
        logger.info("资源的长度："+resources.length);
        for (int i = 0; i <resources.length ; i++) {
            logger.info("资源{}是"+resources[i],i);
        }
        sqlSessionFactoryBean.setMapperLocations(resources);*/
        //SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBean.getObject();
        logger.info("创建工厂" + sqlSessionFactoryBean);
        logger.info("工厂中使用的数据源是："+myRoutingDataSource);
       // SqlSession sqlSession = sqlSessionFactory.openSession();
        return sqlSessionFactoryBean;
    }

    @Bean(name = "dataSourceTransactionManager")
    public DataSourceTransactionManager setTransactionManagement() throws SQLException {
        DataSourceTransactionManager transactionManager = new DataSourceTransactionManager(dataSource1);
        logger.info("事务管理配置：" + transactionManager);
        //Connection connection = transactionManager.getDataSource().getConnection();
        logger.info("事务中使用的数据源是：" + dataSource1);
        return transactionManager;
    }
}
