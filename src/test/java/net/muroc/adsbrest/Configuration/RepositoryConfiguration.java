package net.muroc.adsbrest.Configuration;


import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableAutoConfiguration
@EntityScan(basePackages = {"net.muroc.adsbrest.domain"})
@EnableJpaRepositories(basePackages = {"net.muroc.adsbrest.repositories"})
@EnableTransactionManagement
public class RepositoryConfiguration {
}

