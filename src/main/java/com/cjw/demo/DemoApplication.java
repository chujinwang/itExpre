package com.cjw.demo;

import lombok.extern.log4j.Log4j;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication()
@MapperScan("com.cjw.demo.mapper")
@Log4j
public class DemoApplication {

	public static void main(String[] args) {
		Logger log = LoggerFactory.getLogger(DemoApplication.class);
		System.out.println("dfadfs");
		SpringApplication.run(DemoApplication.class, args);
	}

}