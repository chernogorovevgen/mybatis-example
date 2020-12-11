package com.chernogorov.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.flywaydb.core.Flyway;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.ClassPathResource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

@Configuration
@EnableTransactionManagement
@MapperScan(value = "com.chernogorov.repository.mapper")
public class PersistConfig {

    @Bean
    @ConfigurationProperties(prefix = "datasource.postgres")
    DataSourceProperties dataSourceProperties() {
        return new DataSourceProperties();
    }

    @Bean
    @Primary
    DataSource dataSource(DataSourceProperties dp) {

        HikariConfig config = new HikariConfig();
        config.setDriverClassName(dp.getDriverClassName());
        config.setJdbcUrl(dp.getUrl());
        config.setUsername(dp.getUsername());
        config.setPassword(dp.getPassword());
        config.setPoolName(dp.getPoolName());
        config.setConnectionTestQuery(dp.getConnectionTestQuery());
        config.setConnectionTimeout(dp.getConnectionTimeout());
        config.setValidationTimeout(dp.getValidationTimeout());
        config.setIdleTimeout(dp.getIdleTimeout());
        config.setMinimumIdle(dp.getMinimumIdle());
        config.setMaximumPoolSize(dp.getMaximumPoolSize());
        config.setAutoCommit(dp.isAutoCommit());

        return new HikariDataSource(config);
    }

    @Bean(initMethod = "migrate")
    @Primary
    Flyway flyway(DataSource dataSource) {

        Flyway flyway = new Flyway();
        flyway.setDataSource(dataSource);
        flyway.setSchemas("public");
        flyway.setLocations("");
        flyway.setBaselineOnMigrate(false);


        return flyway;
    }


    @Bean
    @Primary
    SqlSessionFactory sqlSessionFactory(DataSource postgresDataSource) throws Exception {

        final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(postgresDataSource);
        sessionFactory.setConfigLocation(new ClassPathResource("mybatis-config.xml"));

        return sessionFactory.getObject();

    }


}
