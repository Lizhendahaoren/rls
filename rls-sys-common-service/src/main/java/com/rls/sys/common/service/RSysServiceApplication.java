package com.rls.sys.common.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@ServletComponentScan
@ComponentScan(basePackages = {"com.rls.sys.common", "com.rls.sys.common.service"})
@EntityScan(basePackages = {"com.rls.base.common.entity","com.rls.sys.common.entity"})
@EnableJpaRepositories(basePackages = {"com.rls.base.common.dao","com.rls.sys.common.dao"})
public class RSysServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RSysServiceApplication.class, args);
	}
}
