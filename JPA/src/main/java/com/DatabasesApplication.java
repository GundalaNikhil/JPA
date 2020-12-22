package com;

import com.entities.Departments;
import com.entities.Employees;
import com.repo.departments;
import com.repo.employee;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Controller;

@SpringBootApplication
//@EnableConfigurationProperties
//@Controller

public class DatabasesApplication {

	public static void main(String[] args)
	{
		SpringApplication.run(DatabasesApplication.class, args);
	}


}
