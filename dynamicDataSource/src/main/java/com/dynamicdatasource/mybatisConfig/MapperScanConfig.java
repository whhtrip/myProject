/*
package com.dynamicdatasource.mybatisConfig;

import org.apache.log4j.Logger;
import org.mybatis.spring.mapper.MapperScannerConfigurer;

public class MapperScanConfig {

    public MapperScannerConfigurer mapperScannerConfigurer() {
//        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
//        mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactory");
//        mapperScannerConfigurer.setBasePackage("tk.mybatis.springboot.com.dynamicdatasource.ssm1.mapper");
//        return mapperScannerConfigurer;
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        //mapperScannerConfigurer.setAnnotationClass(com.fairyland.jdp.orm.mybatis.pagination.annotation.MyBatisRepository.class);
        mapperScannerConfigurer.setBasePackage("com.whh.dao");
        mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactory1");
        return mapperScannerConfigurer;
    }
}
*/
