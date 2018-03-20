package com.zxy.whbackstage;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.zxy.whbackstage.repository")
@SpringBootApplication
public class WhBackstageApplication {

	public static void main(String[] args) {
		SpringApplication.run(WhBackstageApplication.class, args);
	}
}
