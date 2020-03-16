package com.yx;

import javax.sql.DataSource;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;

import com.alibaba.druid.pool.DruidDataSource;

@SpringBootApplication
@MapperScan("com.yx.mapper.dao")
@PropertySource(encoding = "utf-8", value = { "config/db-pool.properties", "config/redis.properties" })
public class SprinbBootApp {

	@Bean
	@ConfigurationProperties(prefix = "spring.datasource")
	public DataSource getDataSource() {
		DruidDataSource ds = new DruidDataSource();
		return ds;
	}

	public static void main(String[] args) {
		SpringApplication.run(SprinbBootApp.class, args);
	}
}
