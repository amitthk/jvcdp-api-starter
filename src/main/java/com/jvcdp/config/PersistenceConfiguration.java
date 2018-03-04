package com.jvcdp.config;

import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.flyway.FlywayDataSource;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class PersistenceConfiguration {
	@Bean
	@ConfigurationProperties(prefix="spring.datasource")
	@Primary
	public DataSource dataSource() {
		/*  //Follow properties taken from xml config can be overridden
		    <!--<prop key="hibernate.ejb.naming_strategy">org.hibernate.cfg.ImprovedNamingStrategy</prop>-->
            <prop key="hibernate.implicit_naming_strategy">org.hibernate.boot.model.naming.ImplicitNamingStrategyLegacyHbmImpl</prop>
            <prop key="hibernate.naming.physical-strategy">org.hibernate.boot.model.naming.PhysicalNamingStrategyStandardImpl</prop>
            <prop key="hibernate.format_sql">${hibernate.format_sql:false}</prop>
            <prop key="hibernate.hbm2ddl.auto">${hibernate.hbm2ddl.auto:validate}</prop>
            <prop key="hibernate.show_sql">${hibernate.show_sql:false}</prop>
            <prop key="hibernate.use_sql_comments">${hibernate.use_sql_comments:false}</prop>
            <prop key="hibernate.id.new_generator_mappings">${hibernate.id.new_generator_mappings:true}</prop>
            <prop key="hibernate.enable_lazy_load_no_trans">${hibernate.enable_lazy_load_no_trans:true}</prop>
            <prop key="hibernate.max_fetch_depth">${hibernate.max_fetch_depth:1}</prop>
            <prop key="hibernate.default_batch_fetch_size">${hibernate.default_batch_fetch_size:16}</prop>
		 */
		return DataSourceBuilder.create().build();
	}

	@Bean
	@ConfigurationProperties(prefix="datasource.flyway")
	@FlywayDataSource
	public DataSource flywayDataSource() {
		return DataSourceBuilder.create().build();
	}
	
}
