package com.example.catbellrow;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class CatbellrowApplication {

    public static void main(String[] args) {
        SpringApplication.run(CatbellrowApplication.class, args);
    }


//    @Bean
//    public SqlSessionFactory sqlSessionFactory(DataSource dataSource)throws Exception{
//        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
//        sessionFactory.setDataSource(dataSource);
//
//        Resource[] res = new PathMatchingResourcePatternResolver().getResources("classpath:mappers/*Mapper.xml");
//
//        sessionFactory.setMapperLocations(res);
//
//        return sessionFactory.getObject();
//    }


}
