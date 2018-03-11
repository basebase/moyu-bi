package com.moyu.bi.web.configuration;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;


@Configuration
public class ManageMybatisConfig {

    @Bean(name = "manageDataSource")
    @ConfigurationProperties(prefix = "spring.manage.dataSource")
    public DataSource manageDataSource(){
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "manageSqlSessionFactory")
    public SqlSessionFactory manageSqlSessionFactory(@Qualifier("manageDataSource")DataSource dataSource) throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        sqlSessionFactoryBean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:com/moyu/bi/mapper/*.xml"));
        return sqlSessionFactoryBean.getObject();
    }

    @Bean(name = "manageSqlSessionTemplate")
    public SqlSessionTemplate testSqlSessionTemplate(@Qualifier("manageSqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
        return new SqlSessionTemplate(sqlSessionFactory);
    }

    @Bean(name = "manageTransactionManager")
    public DataSourceTransactionManager testTransactionManager(@Qualifier("manageDataSource") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean(name = "manageMapperScannerConfigurer")
    public MapperScannerConfigurer mapperScannerConfigurer() {
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        mapperScannerConfigurer.setSqlSessionFactoryBeanName("manageSqlSessionFactory");
        mapperScannerConfigurer.setBasePackage("com.aixuexi.manage.mapper");
        mapperScannerConfigurer.setAnnotationClass(ManageRepository.class);
        return mapperScannerConfigurer;
    }
}
