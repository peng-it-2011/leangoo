package com.team6.leangoo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@MapperScan(basePackages = "com.team6.leangoo.mapper")
@EnableWebMvc
public class LeangooApplication {

	public static void main(String[] args) {
		SpringApplication.run(LeangooApplication.class, args);
	}
}
